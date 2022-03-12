//**************************************
// RC PLATFORM WIDGET v1r (eHow rebuild)
//
// @modified  4/07/2011
// @version   1.21r
//**************************************
 
(function () {
 
  // create related content object
  if (!window.hlRelated && typeof (window.hlRelated) !== "object") {
    window.hlRelated = {};
  }
 
  // create aliases
  var rc = window.hlRelated,
      head = document.getElementsByTagName('head')[0];
 
  //**************************************
  // Interface callback function
  //**************************************
 
  rc.createRelated = function (data) {
    var script = document.getElementById('relatedScript'),
        content = data.ParkingInterface.ContentSet.Content,
        ul = createElem('ul', { cssClass: 'UnorderedTitleList' }),
        lnks = [],
        i,
        li,
        list,
        waitForParent = function (list) {
          if (script.parentNode) {
            script.parentNode.appendChild(list);
          } else {
            setTimeout(function () {
              waitForParent(list);
            }, 10);
          }
        };
 
    // store raw data for testing
    rc.rawData = data;
 
    // store global IDs
    rc.sourceID = data.ParkingInterface.ContentSet.SourceID;
    rc.setID = data.ParkingInterface.ContentSet.SetID;
    rc.weightConfigName = data.ParkingInterface.ContentSet.WeightConfigName;
 
    // loop through links to render as ul
    for (i = 0; i < content.length; i++) {
      li = createElem('li', {
        content: createElem('a', {
          cssClass: 'title',
          href: content[i].URL,
          content: html_entity_decode(content[i].Title),
          'data:index': i
        })
      });
      lnks.push(content[i].URL + ';' + 'L' + i); // TODO - where is this used?
      ul.appendChild(li);
    }
 
    // create wrapper for ul
    list = createElem('section', {
      cssClass: ['RCModule', 'BrowseList'],
      id: 'ArticleBrowseList',
      content: [
        createElem('header', {
          content: createElem('h3', {
            cssClass: 'Heading5',
            content: HL_RELATED_OPTIONS.widgetTitle || "Related Content"
          })
        }),
        createElem('section', {
          cssClass: 'FLC',
          content: ul
        })
      ]
    });
 
    // append wrapper to DOM
    setTimeout(function () {
      waitForParent(list);
    }, 10);
 
    // append tracking
    setTimeout(function () {
      hlRelated._addTracking(document.getElementById('relatedScript').parentNode, 'PLATFORM_TL');
    }, 500);
  };
 
  //***********************
  // Private Functions
  //***********************
 
  // pull meta attributes from page head
  rc._getMeta = function () {
    var metas = document.getElementsByTagName('meta'),
        Meta = {},
        i;
    for (i = 0; i < metas.length; i++) {
      if (metas[i].getAttribute('scheme') === "DMINSTR2") {
        Meta[metas[i].getAttribute('name')] = metas[i].getAttribute('content');
      }
    }
    return Meta;
  };
 
  // dynamically load and execute script
  rc._callScript = function (url) {
    var script = createElem('script', {
      type: 'text/javascript',
      src: url,
      async: true
    });
    head.insertBefore(script, head.firstChild);
  };
 
  // initialization call to app for interface callback function
  rc._createURL = function () {
    var Meta = rc._getMeta(),
        call = "http://js.hotkeys.com/interface/6?mode=rc&contentOwner=1&studioID=" + encodeURIComponent(Meta.studioid) +
               "&url=" + encodeURIComponent(document.location.href.split('?')[0]) +
               "&category=" + encodeURIComponent(Meta.category) +
               "&subCategory=" + encodeURIComponent(Meta.subcategory) +
               "&subSubCategory=" + encodeURIComponent(Meta.subsubcat) +
               "&outputType=json&jsonWrapper=hlRelated.createRelated";
 
    return call;
  };
 
  // add click tracking event handlers and log impression tracking
  rc._addTracking = function (element, location) {
 
    var impressionData = {},
        wa_page = window.location.href.split('?')[0],
        wa_lst = rc.setID,
        wa_wot = "PLATFORM",
        wa_mp = location.replace("PLATFORM_", ""),
        linkTags = element.getElementsByTagName('a'),
        urls = [],
        meta = rc._getMeta(),
        i,
        waitForImage = function (href) {
          if (document.getElementById('omniClick')) {
 
            // continue to page after half second to ensure image script loaded
            setTimeout(function () {
              window.location.href = href;
            }, 500);
          } else {
            setTimeout(function () {
              waitForImage(href);
            }, 10);
          }
        };
 
    var wa_page_click = window.location.href.split('?')[0],
        wa_lst_click = wa_lst,
        wa_mp_click = wa_mp;
 
    for (i = 0; i < linkTags.length; i++) {
      urls.push(linkTags[i].href + ";" + i);
      if (typeof (linkTags[i].addEventListener) !== "undefined") {
        // if not IE
        linkTags[i].addEventListener('click', function (e) {
 
          // prevent default link behavior to allow tracking image appension before hrefload
          e.preventDefault();
 
          var href = e.currentTarget.href,
              index = this.getAttribute('data:index'),
              wa_l_click = href + ";" + index,
              clickUrl = 'http://' + _omnitureLinkSetDomain +
                         '/images/zig.gif?Log=1&v=JT01.02&ev=lnkimpression_click' +
                         '&wa_page_click=' + wa_page_click +
                         '&wa_lst_click=' + wa_lst_click +
                         '&wa_wot=' + wa_wot +
                         '&wa_mp_click=' + wa_mp_click +
                         '&wa_l_click=' + wa_l_click +
                         '&category=' + encodeURIComponent(meta.category.replace(/[^\'\-\w]+/g, '_')) +
                         '&subcategory=' + encodeURIComponent(meta.subcategory.replace(/[^\'\-\w]+/g, '_')) +
                         '&subsubcat=' + encodeURIComponent(meta.subsubcat.replace(/[^\'\-\w]+/g, '_')) +
                         '&wa_user1=' + rc.sourceID +
                         '&wa_user2=' + encodeURIComponent(rc.weightConfigName.replace(/[^\'\-\w]+/g, '_')) +
                         '&vid=' + getRandomNumber(),
              img = createElem('img', {
                src: clickUrl,
                id: 'omniClick'
              });
 
          element.appendChild(img);
 
          // poll for image appension
          setTimeout(function () {
            waitForImage(href);
          }, 10);
        }, false);
      } else {
        // if IE
        linkTags[i].attachEvent('onclick', function (e) {
 
          // prevent default link behavior to allow tracking image appending before hrefload
          e.returnValue = false;
 
          var href = e.srcElement.href,
              index = e.srcElement.getAttribute('data:index'),
              wa_l_click = href + ";" + index,
 
          // IE6 & 7 handle array join significantly faster than string concat
              clickUrl = ['http://', _omnitureLinkSetDomain,
                         '/images/zig.gif?Log=1&v=JT01.02&ev=lnkimpression_click',
                         '&wa_page_click=', wa_page_click,
                         '&wa_lst_click=', wa_lst_click,
                         '&wa_wot=', wa_wot,
                         '&wa_mp_click=', wa_mp_click,
                         '&wa_l_click=', wa_l_click,
                         '&category=', encodeURIComponent(meta.category.replace(/[^\'\-\w]+/g, '_')),
                         '&subcategory=', encodeURIComponent(meta.subcategory.replace(/[^\'\-\w]+/g, '_')),
                         '&subsubcat=', encodeURIComponent(meta.subsubcat.replace(/[^\'\-\w]+/g, '_')),
                         '&wa_user1=', rc.sourceID,
                         '&wa_user2=', encodeURIComponent(rc.weightConfigName.replace(/[^\'\-\w]+/g, '_')),
                         '&vid=', getRandomNumber()].join(""),
              img = createElem('img', {
                src: clickUrl,
                id: 'omniClick'
              });
 
          element.appendChild(img);
 
          // poll for image appension
          setTimeout(function () {
            waitForImage(href);
          }, 10);
 
          return false;
        });
      }
    }
 
    var wa_l = urls.join('|'),
        trackUrl = "http://" + _omnitureLinkSetDomain +
                   "/images/zig.gif?Log=1&v=JT01.02&ev=lnkimpression" +
                   "&wa_page=" + wa_page +
                   "&wa_lst=" + wa_lst +
                   "&wa_wot=" + wa_wot +
                   "&wa_mp=" + wa_mp +
                   "&wa_l=" + wa_l +
                   "&category=" + encodeURIComponent(meta.category.replace(/[^\'\-\w]+/g, '_')) +
                   "&subcategory=" + encodeURIComponent(meta.subcategory.replace(/[^\'\-\w]+/g, '_')) +
                   "&subsubcat=" + encodeURIComponent(meta.subsubcat.replace(/[^\'\-\w]+/g, '_')) +
                   "&wa_user1=" + rc.sourceID +
                   "&wa_user2=" + encodeURIComponent(rc.weightConfigName.replace(/[^\'\-\w]+/g, '_')) +
                   "&vid=" + getRandomNumber(),
        img = createElem('img', {
          src: trackUrl,
          id: 'omniTrack'
        });
 
    element.appendChild(img);
  };
 
  //**************************************
  // Utilities
  //**************************************
 
  // Function created by David Zuch to easily create Elements.
  function createElem(elem, options) {
    var property, i, j;
 
    if (!document.createElement) { return false; }
    if (typeof options !== "object") { return false; }
 
    elem = document.createElement(elem);
 
    for (property in options) {
      if (property === "content") {
        if (typeof options.content === "object") {
          if (options.content.length) {
            for (i = 0; i < options.content.length; i++) {
              var content = options.content[i];
              if (typeof content === "string") {
                elem.appendChild(document.createTextNode(content));
              } else if (typeof content === "object") {
                elem.appendChild(content);
              }
            }
          } else {
            elem.appendChild(options.content);
          }
        } else {
          elem.appendChild(document.createTextNode(options.content));
        }
      } else if (property === "cssClass") {
        if (typeof options.cssClass === "object") {
          for (j = 0; j < options.cssClass.length; j++) {
            var className = options.cssClass[j];
            addClass(elem, className);
          }
        } else {
          addClass(elem, options.cssClass);
        }
      } else {
        elem.setAttribute(property, options[property]);
      }
    }
    return (elem);
  }
 
  // Functions to add, remove, and find out if an element contains a certain class
  function addClass(element, className) {
    if (!hasClass(element, className)) {
      if (element.className) {
        element.className += " " + className;
      } else {
        element.className = className;
      }
    }
  }
 
  function removeClass(element, className) {
    var regexp = new RegExp("(^|\\s)" + className + "(\\s|$)");
    element.className = element.className.replace(regexp, "$2");
  }
 
  function hasClass(element, className) {
    var regexp = new RegExp("(^|\\s)" + className + "(\\s|$)");
    return regexp.test(element.className);
  }
 
  function html_entity_decode(str) {
    var ta = document.createElement("textarea");
    ta.innerHTML = str.replace(/</g, "<").replace(/>/g, ">");
    toReturn = ta.value;
    ta = null;
    return toReturn;
  }
 
  function getRandomNumber() {
    return Math.floor(Math.random() * 9999999);
  }
 
  //**************************************
  // Initialization
  //**************************************
 
  rc._callScript(rc._createURL());
} ());