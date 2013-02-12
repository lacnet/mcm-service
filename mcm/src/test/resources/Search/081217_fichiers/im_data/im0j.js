Microsoft.Live.Messenger.PresenceStatus.prototype.none=-1;MailIM.PropertyChangeMonitor=function MailIM_PropertyChangeMonitor$(a,b){this._collection=a;this._type=b;this._init()};MailIM.PropertyChangeMonitor.CollectionType=function(){};MailIM.PropertyChangeMonitor.CollectionType.prototype={none:0,contacts:1,conversation:2};MailIM.PropertyChangeMonitor.CollectionType.createEnum("MailIM.PropertyChangeMonitor.CollectionType",false);MailIM.PropertyChangeMonitor.prototype={_collection:null,_type:0,_contactCollectionChangeHandler:null,_imAddressesChangeHandler:null,_propertyChangedHandler:null,__propertyChanged:null,add_propertyChanged:function MailIM_PropertyChangeMonitor$add_propertyChanged(a){this.__propertyChanged=Delegate.combine(this.__propertyChanged,a)},remove_propertyChanged:function MailIM_PropertyChangeMonitor$remove_propertyChanged(a){this.__propertyChanged=Delegate.remove(this.__propertyChanged,a)},_init:function MailIM_PropertyChangeMonitor$_init(){this._propertyChangedHandler=Delegate.create(this,this._propertyChanged);switch(this._type){case MailIM.PropertyChangeMonitor.CollectionType.contacts:this._setupForContacts(this._collection);break;case MailIM.PropertyChangeMonitor.CollectionType.conversation:this._setupForImAddresses(this._collection)}},_setupForContacts:function MailIM_PropertyChangeMonitor$_setupForContacts(b){var a=b.getEnumerator();while(a.moveNext()){var c=a.get_current();this._setupChangeSubscription(c);this._setupForImAddresses(c.get_addresses())}this._contactCollectionChangeHandler=Delegate.create(this,this._contactCollectionChanged);b.add_collectionChanged(this._contactCollectionChangeHandler)},_clearForContacts:function MailIM_PropertyChangeMonitor$_clearForContacts(b){b.remove_collectionChanged(this._contactCollectionChangeHandler);var a=b.getEnumerator();while(a.moveNext()){var c=a.get_current();this._clearChangeSubscription(c);this._clearForImAddresses(c.get_addresses())}},_setupForImAddresses:function MailIM_PropertyChangeMonitor$_setupForImAddresses(a){var c=a.get_count();for(var b=0;b<c;b++)this._setupChangeSubscription(a.get_item(b));this._imAddressesChangeHandler=Delegate.create(this,this._imAddressesChanged);a.add_collectionChanged(this._imAddressesChangeHandler)},_clearForImAddresses:function MailIM_PropertyChangeMonitor$_clearForImAddresses(a){a.remove_collectionChanged(this._imAddressesChangeHandler);var c=a.get_count();for(var b=0;b<c;b++)this._clearChangeSubscription(a.get_item(b))},_setupChangeSubscription:function MailIM_PropertyChangeMonitor$_setupChangeSubscription(a){a.add_propertyChanged(this._propertyChangedHandler)},_clearChangeSubscription:function MailIM_PropertyChangeMonitor$_clearChangeSubscription(a){a.remove_propertyChanged(this._propertyChangedHandler)},_contactCollectionChanged:function MailIM_PropertyChangeMonitor$_contactCollectionChanged(f,e){var d={oldItems:null,newItems:null};this.collectionChangedUtility(e,d);var c=d.oldItems,b=d.newItems,a=0;if(c!=null)for(a=0;a<c.length;a++){this._clearChangeSubscription(c[a]);this._clearForImAddresses(c[a].get_addresses())}if(b!=null)for(a=0;a<b.length;a++){this._setupChangeSubscription(b[a]);this._setupForImAddresses(b[a].get_addresses())}},_imAddressesChanged:function MailIM_PropertyChangeMonitor$_imAddressesChanged(f,e){var d={oldItems:null,newItems:null};this.collectionChangedUtility(e,d);var c=d.oldItems,b=d.newItems,a;if(c!=null)for(a=0;a<c.length;a++)this._clearChangeSubscription(c[a]);if(b!=null)for(a=0;a<b.length;a++)this._setupChangeSubscription(b[a])},_propertyChanged:function MailIM_PropertyChangeMonitor$_propertyChanged(a,b){if(this.__propertyChanged)this.__propertyChanged.invoke(a,b)},collectionChangedUtility:function MailIM_PropertyChangeMonitor$collectionChangedUtility(c,d){var b=null,a=null;if(c!=null){switch(c.get_action()){case Microsoft.Live.Core.NotifyCollectionChangedAction.add:a=c.get_newItems();break;case Microsoft.Live.Core.NotifyCollectionChangedAction.remove:b=c.get_oldItems();break;case Microsoft.Live.Core.NotifyCollectionChangedAction.replaced:case Microsoft.Live.Core.NotifyCollectionChangedAction.reset:b=c.get_oldItems();a=c.get_newItems()}if(b!=null&&b.length<=0)b=null;if(a!=null&&a.length<=0)a=null;d.oldItems=b;d.newItems=a}},dispose:function MailIM_PropertyChangeMonitor$dispose(){switch(this._type){case MailIM.PropertyChangeMonitor.CollectionType.contacts:this._clearForContacts(this._collection);break;case MailIM.PropertyChangeMonitor.CollectionType.conversation:this._clearForImAddresses(this._collection)}this._propertyChangedHandler=null;this._collection=null}};MailIM.PersonalInfo=function MailIM_PersonalInfo$(a,b){this._imAddress=a;this._contact=gWebIM.findByIMAddress(a);this._initialize(b);this._figureMsg()};MailIM.PersonalInfo.prototype={_contact:null,_imAddress:null,_userState:Microsoft.Live.Messenger.PresenceStatus.none,_userHandle:null,_friendlyName:"",_friendlyNameEncoded:"",_blocked:false,_youImageSrc:null,_notInList:false,_isOfflineOrBlocked:false,_personalStatusMessage:"",_personalStatusMessageEncoded:"",_pawnImageSrc:null,_pawnImageTooltip:"",_psmInnerHTML:"",_psmTitleUnencoded:"",_dnInnerHTML:"",_dnInnerHTMLNoEmoticons:"",_displayPictureTooltip:"",_chatTitleUnencoded:"",_msg:null,_isValidUserState:false,_isOffline:false,_isOnline:false,_isFederated:false,_networkIconUrl:null,_initialize:function MailIM_PersonalInfo$_initialize(c){this._userHandle=this._imAddress.get_address();this._notInList=this._contact==null;this._blocked=this._notInList?false:this._contact.get_isBlocked();if(this._imAddress.get_presence()!=null){var a=this._imAddress.get_presence();this._userState=a.get_status();this._friendlyName=localizeFriendlyName(a.get_displayName());if(this._friendlyName==null)this._friendlyName="";this._friendlyNameEncoded=EmoticonReplacedHtml(this._friendlyName);this._personalStatusMessage=a.get_personalMessage();if(this._personalStatusMessage==null)this._personalStatusMessage=c;this._personalStatusMessageEncoded=LinkAndEmoticonReplacedHtml(this._personalStatusMessage);this._youImageSrc=this.getDisplayUrl(this._imAddress);if(this._youImageSrc==null)this._youImageSrc=getImage("buddy_default.png",true);this._isFederated=this._imAddress.get_isFederated();if(this._isFederated)this._networkIconUrl=this._imAddress.get_networkIconUrl()}this._pawnImageSrc=gStatusImageMap.getImageMap(this._userState,this._blocked);this._pawnImageTooltip=this._blocked?gStrings.Buddy_Status_Blocked:gStatusTextMap.getItem(this._userState);var b=String.isNullOrEmpty(this._personalStatusMessage)?"":"&nbsp;";this._psmInnerHTML=String.format("<span title='{0}'>{1}<span/>{2}<span title='{3}'>&lt;{3}&gt;</span>",htmlQuoteEncode(this._personalStatusMessage),this._personalStatusMessageEncoded,b,this._userHandle);this._psmTitleUnencoded=this._friendlyName+" "+this._personalStatusMessage+" <"+this._userHandle+">";this._dnInnerHTML="<b>"+(this._friendlyNameEncoded==""?this._userHandle:this._friendlyNameEncoded)+"</b>&nbsp;("+gStatusTextMap.getItem(this._userState)+")";this._dnInnerHTMLNoEmoticons="<b>"+(this._friendlyName=="")?this._userHandle:htmlEncode(this._friendlyName)+"</b>&nbsp;("+gStatusTextMap.getItem(this._userState)+")";var d=String.isNullOrEmpty(this._friendlyName)?this._userHandle:this._friendlyName;this._displayPictureTooltip=String.format(gStrings.CW_DisplayPicture_Tooltip,d);this._chatTitleUnencoded=this._friendlyName==""?this._userHandle:this._friendlyName},_figureMsg:function MailIM_PersonalInfo$_figureMsg(){if(this._userState!=Microsoft.Live.Messenger.PresenceStatus.none&&this._userHandle!=null){var a=false;this._isValidUserState=true;if(this._blocked)this._msg=gStrings.CW_Infotip_Blocked;else{this._isOnline=false;switch(this._userState){default:case Microsoft.Live.Messenger.PresenceStatus.online:case Microsoft.Live.Messenger.PresenceStatus.none:this._isOffline=false;if(this._notInList){if(this._imAddress.get_type()!=WLM.ContactType.alias){this._msg=gStrings.CW_Infotip_NotInList_Message;a=true}this._isOffline=false}else{this._msg=gStrings.CW_Infotip_BackOnline;this._isOnline=true}break;case Microsoft.Live.Messenger.PresenceStatus.appearOffline:this._msg=gStrings.CW_Infotip_Offline_Message;a=true;this._isOffline=false;break;case Microsoft.Live.Messenger.PresenceStatus.offline:this._msg=gStrings.CW_Infotip_Offline_Message;a=true;this._isOffline=true;break;case Microsoft.Live.Messenger.PresenceStatus.busy:this._msg=gStrings.CW_Infotip_Busy;break;case Microsoft.Live.Messenger.PresenceStatus.idle:case Microsoft.Live.Messenger.PresenceStatus.away:this._msg=gStrings.CW_Infotip_Away;break;case Microsoft.Live.Messenger.PresenceStatus.beRightBack:this._msg=gStrings.CW_Infotip_BeRightBack;break;case Microsoft.Live.Messenger.PresenceStatus.outToLunch:this._msg=gStrings.CW_Infotip_OutToLunch;break;case Microsoft.Live.Messenger.PresenceStatus.inACall:this._msg=gStrings.CW_Infotip_IsInCall}}this._isOfflineOrBlocked=this._blocked||this._isOffline;var d=!this._isOfflineOrBlocked;if(this._msg!=null){var g=String.isNullOrEmpty(this._friendlyName)?this._userHandle:this._friendlyNameEncoded;this._msg=String.format(this._msg,g);var c=null,b=null;if(a)if(this._isOffline){c=gStrings.CW_Infotip_Offline_EmailLink;var e="to="+this._userHandle,f=gCWUtilities.formatHotmailUrl("EditMessageLight.aspx",e);b="UINavigateTo('"+f+"');return false;"}else{c=gStrings.CW_Infotip_NotInList_AddNowLink;var e="email="+this._userHandle,f=gCWUtilities.formatHotmailUrl("ContactEditLight.aspx",e);b="UINavigateTo('"+f+"');return false;";d=false}this._msg=this._formatInfoPane(d,this._msg,c,b)}}},getDisplayUrl:function MailIM_PersonalInfo$getDisplayUrl(b){var a=null;if(b)a=b.get_presence().get_displayPictureUrl();if(a==null)a=getImage("buddy_default.png",true);return a},getNoticeIfSelfTalking:function MailIM_PersonalInfo$getNoticeIfSelfTalking(){var a=null;if(this._imAddress.equals(gWebIM.get_selfAddress()))a=this._formatInfoPane(true,gStrings.CW_Infotip_Self,null,null);return a},getNoticeForAppearingOffline:function MailIM_PersonalInfo$getNoticeForAppearingOffline(c){var a=null,b=gWebIM.get_selfAddress().get_presence().get_state();if(b==Microsoft.Live.Messenger.PresenceStatus.appearOffline&&c!=b)a=this._formatInfoPane(true,gStrings.CW_AppearingOffline,null,null);return a},getNoticeForUnblocking:function MailIM_PersonalInfo$getNoticeForUnblocking(){var b=String.isNullOrEmpty(this._friendlyName)?this._userHandle:this._friendlyNameEncoded,a=String.format(gStrings.CW_Infotip_Unblocked,b);a=this._formatInfoPane(true,a,null,null);return a},_formatInfoPane:function MailIM_PersonalInfo$formatInfoPane(b,d,c,a){var e="<img class='cw_historyicon' src='{0}' alt=''{1}' title='{1}' /><!--<span class='cw_historymsg'>-->&nbsp;{2}<!--</span>-->";if(c&&a){var f=String.format("&nbsp;<a href='javascript:;' onclick=\"{0}\">{1}</a>",a,c);d+=f}var g=String.format(e,getImage(b?"i_info.gif":"i_warn.gif",false),b?gStrings.InfoPane_Info_Tooltip:gStrings.InfoPane_Warning_Tooltip,d);return g},formatGroupMessage:function MailIM_PersonalInfo$formatGroupMessage(e){var a=null;switch(e){case MailIM.GroupInfo.Op.add:a=gStrings.CW_ContactJoined;break;case MailIM.GroupInfo.Op.del:a=gStrings.CW_ContactLeft}if(a){var d=String.isNullOrEmpty(this._friendlyName)?this._userHandle:this._friendlyNameEncoded,c=String.format(a,d),b=this._formatInfoPane(true,c,null,null);return b}return null},dispose:function MailIM_PersonalInfo$dispose(){this._imAddress=null;this._contact=null}};MailIM.GroupInfo=function MailIM_GroupInfo$(a){this._conversation=a;this._initialize()};MailIM.GroupInfo.Op=function(){};MailIM.GroupInfo.Op.prototype={add:0,mod:1,del:2};MailIM.GroupInfo.Op.createEnum("MailIM.GroupInfo.Op",false);MailIM.GroupInfo.prototype={_conversation:null,_friendlyName:"",_friendlyNameEncoded:"",_youImageSrc:null,_personalStatusMessage:"",_personalStatusMessageEncoded:"",_pawnImageSrc:null,_pawnImageTooltip:"",_psmInnerHTML:"",_psmTitleUnencoded:"",_dnInnerHTML:"",_dnInnerHTMLNoEmoticons:"",_displayPictureTooltip:"",_chatTitleUnencoded:"",_addToCommaSeparated:function MailIM_GroupInfo$_addToCommaSeparated(a,b){if(!String.isNullOrEmpty(a))a+=", ";a+=b;return a},_initialize:function MailIM_GroupInfo$_initialize(){var b="",f=this._conversation.numberOfGroupContacts;for(var d=0;d<f;d++){var c;c=this._conversation.getImAddress(d);if(d>0)b+=",";var e=c.get_address();b+="<"+e+">";var a=e;if(c.get_presence()!=null)a=localizeFriendlyName(c.get_presence().get_displayName());if(String.isNullOrEmpty(a))a=e;this._friendlyName=this._addToCommaSeparated(this._friendlyName,a)}this._friendlyNameEncoded=EmoticonReplacedHtml(this._friendlyName);this._youImageSrc=gGroupPDP;this._pawnImageSrc=gGroupPawn;this._personalStatusMessage=String.format(gStrings.CW_ParticipantCount,f+1);this._personalStatusMessageEncoded=htmlEncode(this._personalStatusMessage);this._pawnImageTooltip=this._personalStatusMessage;this._psmInnerHTML="<span title='"+this._personalStatusMessageEncoded+"'>"+this._personalStatusMessageEncoded+"<span/>&nbsp;<span title='"+b+"'>"+htmlEncode(b)+"</span>";this._psmTitleUnencoded=this._friendlyName;this._dnInnerHTML=this._friendlyNameEncoded;this._dnInnerHTMLNoEmoticons=htmlEncode(this._friendlyName);this._displayPictureTooltip=String.format(gStrings.CW_DisplayPicture_Tooltip,this._friendlyName);this._chatTitleUnencoded=this._friendlyName},dispose:function MailIM_GroupInfo$dispose(){this._conversation=null}};var gStatusStampManagerIntervalID=null,gStatusStampManagerDelegate=null;function StampTypeStatusProcessor(){if(gStatusStampManagerDelegate!=null)gStatusStampManagerDelegate.invoke()}MailIM.StatusStampManager=function MailIM_StatusStampManager$(a){this._window=a;this._initStampTypeStatus()};MailIM.StatusStampManager.prototype={_window:null,_stampTypeStatusHandler:null,_lastMessageTimestamp:null,_lastStatusTimestamp:null,_typeIndicatorStamp:null,onSetStatusText:null,_cStampCheckDuration:15000,_cStampCheckInterval:5e3,setLastMessageTimestamp:function MailIM_StatusStampManager$setLastMessageTimestamp(a){this._lastMessageTimestamp=a},setLastStatusTimestamp:function MailIM_StatusStampManager$setLastStatusTimestamp(a){this._lastStatusTimestamp=a},setTypeIndicatorStamp:function MailIM_StatusStampManager$setTypeIndicatorStamp(a){this._typeIndicatorStamp=a},_formatAgoTimestamp:function MailIM_StatusStampManager$_formatAgoTimestamp(m){var n=new Date,l=(n-m)/1e3,j=l%60,c=l/60,e=c/60,h=e/24,g=h/7,d=g/4,i=d/12;j=Math.floor(j);c=Math.floor(c);e=Math.floor(e);h=Math.floor(h);g=Math.floor(g);d=Math.floor(d);i=Math.floor(i);j=j%60;c=c%60;e=e%24;h=h%7;g=g%4;d=d%12;var a="",b="",f=gMarket.toLowerCase()=="ko-kr"?"":" ";if(i>=1){a+=i+f;a+=i>1?gStrings.CW_Status_Years:gStrings.CW_Status_Year;if(d>=1){b+=" "+d+f;b+=d>1?gStrings.CW_Status_Months:gStrings.CW_Status_Month}}else if(d>=1){a+=d+f;a+=d>1?gStrings.CW_Status_Months:gStrings.CW_Status_Month;if(g>=1){b+=" "+g+f;b+=g>1?gStrings.CW_Status_Weeks:gStrings.CW_Status_Week}}else if(g>=1){a+=g+f;a+=g>1?gStrings.CW_Status_Weeks:gStrings.CW_Status_Week;if(h>=1){b+=" "+h+f;b+=h>1?gStrings.CW_Status_Days:gStrings.CW_Status_Day}}else if(h>=1){a+=h+f;a+=h>1?gStrings.CW_Status_Days:gStrings.CW_Status_Day;if(e>=1){b+=" "+e+f;b+=e>1?gStrings.CW_Status_Hours:gStrings.CW_Status_Hour}}else if(e>=1){a+=e+f;a+=e>1?gStrings.CW_Status_Hours:gStrings.CW_Status_Hour;if(c>=1){b+=" "+c+f;b+=c>1?gStrings.CW_Status_Minutes:gStrings.CW_Status_Minute}}else if(c>=1){a+=c+f;a+=c>1?gStrings.CW_Status_Minutes:gStrings.CW_Status_Minute}var k="";if(a!=""||b!="")if(String.isNullOrEmpty(b))k=String.format(gStrings.CW_Status_LastMessageReceivedAgoOnlyOne,a);else k=String.format(gStrings.CW_Status_LastMessageReceivedAgo,a,b);return k},_stampTypeStatus:function MailIM_StatusStampManager$_stampTypeStatus(){var b=new Date,a=null;if(this._lastMessageTimestamp!=null&&(this._lastStatusTimestamp==null||b-this._lastStatusTimestamp>=this._cStampCheckDuration)){a=this._formatAgoTimestamp(this._lastMessageTimestamp);this._lastStatusTimestamp=b}else if(this._typeIndicatorStamp!=null&&b-this._typeIndicatorStamp>=this._cStampCheckDuration){a="";this._typeIndicatorStamp=null}if(a!=null&&this.onSetStatusText!=null)this.onSetStatusText.invoke(a,null)},_initStampTypeStatus:function MailIM_StatusStampManager$initStampTypeStatus(){this._stampTypeStatusHandler=Delegate.create(this,this._stampTypeStatus);gStatusStampManagerDelegate=Delegate.combine(gStatusStampManagerDelegate,this._stampTypeStatusHandler);if(gStatusStampManagerIntervalID==null)gStatusStampManagerIntervalID=this._window.setInterval(StampTypeStatusProcessor,this._cStampCheckInterval)},_unInitStampTypeStatus:function MailIM_StatusStampManager$unInitStampTypeStatus(){gStatusStampManagerDelegate=Delegate.remove(gStatusStampManagerDelegate,this._stampTypeStatusHandler);this._stampTypeStatusHandler=null;if(gStatusStampManagerDelegate==null){this._window.clearInterval(gStatusStampManagerIntervalID);gStatusStampManagerIntervalID=null}},dispose:function MailIM_StatusStampManager$dispose(){this._unInitStampTypeStatus();this._window=null}};MailIM.HistoryUpdater=function MailIM_HistoryUpdater$(b,a,c,d){this._window=b;this._eHistory=a;this._contact=c;this._id=d};MailIM.HistoryUpdater.prototype={_eHistory:null,_contact:null,_id:null,_lastMessageInHistory:null,_window:null,_subscriber:null,_lastUserState:-1,_lastMessageFriendlyName:"",_lastMessageUserHandle:"",wasLastMessageInfoPane:false,lastMessageIsStrangerWarning:false,setSubscriber:function MailIM_HistoryUpdater$setSubscriber(a){this._subscriber=a},clearSubscriber:function MailIM_HistoryUpdater$clearSubscriber(){this._subscriber=null},isYahooContact:function MailIM_HistoryUpdater$isYahooContact(a){return a.get_type()==Microsoft.Live.Messenger.IMAddressType.yahoo},_addNodeTo:function MailIM_HistoryUpdater$_addNodeTo(b,f,d,c){var e=b._window.document,a=e.createElement(f);a.className=d;a.innerHTML=c;a=b._eHistory.appendChild(a);this.setScrollTop(b);b._lastMessageInHistory=a;b.lastMessageIsStrangerWarning=false},_addNodeToMulticast:function MailIM_HistoryUpdater$_addNodeToMulticast(c,b,a){this._addNodeTo(this,c,b,a);if(this._subscriber)this._subscriber._addNodeTo(this._subscriber,c,b,a)},_replaceNodeMulticast:function MailIM_HistoryUpdater$_replaceNodeMulticast(a){this._lastMessageInHistory.innerHTML=a;if(this._subscriber)if(this._subscriber._lastMessageInHistory)this._subscriber._lastMessageInHistory.innerHTML=a},_applyFormat:function MailIM_HistoryUpdater$_applyFormat(c){if(!c)return "";var a='style="';a+="font-family: "+c.get_fontFamily()+";";var b=c.get_fontStyle();if(this._checkStyle(b,Microsoft.Live.Messenger.TextMessageStyle.bold))a+="font-weight:bold; ";if(this._checkStyle(b,Microsoft.Live.Messenger.TextMessageStyle.italic))a+="font-style:italic; ";if(this._checkStyle(b,Microsoft.Live.Messenger.TextMessageStyle.underline)||this._checkStyle(b,Microsoft.Live.Messenger.TextMessageStyle.strikeout)){a+="text-decoration:";if(this._checkStyle(b,Microsoft.Live.Messenger.TextMessageStyle.underline))a+="underline ";if(this._checkStyle(b,Microsoft.Live.Messenger.TextMessageStyle.strikeout))a+="line-through";a+=";"}var d=this._RGBColor(c.get_fontColor());a+=d;a+='"';return a},_checkStyle:function MailIM_HistoryUpdater$_checkStyle(b,a){return (b&a)==a},_RGBColor:function MailIM_HistoryUpdater$_RGBColor(a){var b="color: rgb("+a.get_r()+","+a.get_g()+","+a.get_b()+");";return b},_assignHTML:function MailIM_HistoryUpdater$_assignHTML(a,d){a._eHistory.innerHTML=d;var b=a._eHistory.lastChild;if(b==null){var c=a._eHistory.children;if(c!=null&&c.length>0){b=c[c.length-1];b=a._eHistory.children}}if(b!=null)this.setScrollTop(a);a._lastMessageInHistory=b},setScrollTop:function MailIM_HistoryUpdater$setScrollTop(a){a._eHistory.scrollTop=a._eHistory.scrollHeight+100},bringIntoView:function MailIM_HistoryUpdater$bringIntoView(){if(this._lastMessageInHistory)this.setScrollTop(this);if(this._subscriber)if(this._subscriber._lastMessageInHistory)this.setScrollTop(this._subscriber)},addToHistory:function MailIM_HistoryUpdater$addToHistory(f,a,c,h){var b="cw_historyspan";if(this._lastMessageInHistory!=null)b="cw_historyspan cw_historynontop";var e=this.isYahooContact(this._contact);c=gCWUtilities.prepareMessageTextForDisplay(c,e);var g=this._applyFormat(h),d="";if(this._lastMessageFriendlyName!=a||this._lastMessageUserHandle!=f){b+=" cw_sayschanged";d='<div class="cw_historysays">'+EmoticonReplacedHtml(a,e)+" "+gStrings.CW_History_Says+": </div>";this._lastMessageFriendlyName=a;this._lastMessageUserHandle=f}d+='<div class="cw_historytext" '+g+">"+c+"</div>";this._addNodeToMulticast("span",b,d);this._lastUserState=-1;this.wasLastMessageInfoPane=false},_addinfoPaneMsgToHistory:function MailIM_HistoryUpdater$_addinfoPaneMsgToHistory(e,a,d,f){var b=d?"cw_historyspan":"cw_historyspan cw_historymsgcontainer";if(this._lastMessageInHistory!=null)b+=" cw_historynontop";var c='<span class="cw_historysays"></span><span class="cw_historymsgtext">'+e+"</span>";if(f&&!this.lastMessageIsStrangerWarning)this._replaceNodeMulticast(c);else this._addNodeToMulticast("span",b,c);if(a!=-1)this._lastUserState=a;this._lastMessageFriendlyName="";this._lastMessageUserHandle="";this.wasLastMessageInfoPane=true},addinfoPaneMsgToHistory:function MailIM_HistoryUpdater$addinfoPaneMsgToHistory(b,a){this._addinfoPaneMsgToHistory(b,a,false,false)},replaceInfoPaneMsgToHistory:function MailIM_HistoryUpdater$replaceInfoPaneMsgToHistory(b,a){this._addinfoPaneMsgToHistory(b,a,false,true)},addinfoPaneMsgToHistoryNoMargin:function MailIM_HistoryUpdater$addinfoPaneMsgToHistoryNoMargin(a){this._addinfoPaneMsgToHistory(a,-1,true)},save:function MailIM_HistoryUpdater$save(c,e){var b=$("SavedHistory");if(b){var a=document.createElement("div");a=b.appendChild(a);var d="savedHistory_"+this._id;a.id=d;a.setAttribute("lastUserState",this._lastUserState);a.setAttribute("lastSeenOnline",c);a.setAttribute("lastMessageFriendlyName",this._lastMessageFriendlyName);a.setAttribute("lastMessageUserHandle",this._lastMessageUserHandle);a.setAttribute("lastSelfState",gWebIM.get_user().get_presence().get_status());a.setAttribute("wasBlocked",e);a.innerHTML=this._eHistory.innerHTML}},restore:function MailIM_HistoryUpdater$restore(b){var c=false,d="savedHistory_"+this._id,a=$(d);if(a){this._assignHTML(this,a.innerHTML);this._lastUserState=a.getAttribute("lastUserState");if(b){b.lastSeenOnline=a.getAttribute("lastSeenOnline");b._lastUserState=this._lastUserState;b._lastSelfState=a.getAttribute("lastSelfState");b._wasBlocked=a.getAttribute("wasBlocked")}this._lastMessageFriendlyName=a.getAttribute("lastMessageFriendlyName");this._lastMessageUserHandle=a.getAttribute("lastMessageUserHandle");var e=$("SavedHistory");e.removeChild(a);a=null;c=true}return c},dispose:function MailIM_HistoryUpdater$dispose(){this._eHistory=null;this._contact=null;this._lastMessageInHistory=null;this._window=null;this._subscriber=null}};MailIM.Toolbar=function MailIM_Toolbar$(b){MailIM.Toolbar.constructBase(this,[b]);this.onClickHandler=Delegate.create(this,this._onClick);this.eButtons=b.getElementsByTagName("UL")[0];var d=b.getElementsByTagName("LI");this.menukeys={};for(var c=0;c<d.length;c++){var a=d[c];if(isIE6())addCssClass(a.getElementsByTagName("A")[0].childNodes[0],"FirstChild");this.menukeys[a.getAttribute(MailIM.Toolbar._MENUKEY)]=a}this.Elt.attachEvent("onclick",this.onClickHandler)};MailIM.Toolbar._MENUKEY="menukey";MailIM.Toolbar._DISABLE_CLASS="ToolbarItemDisabled";MailIM.Toolbar.prototype={onClick:null,menukeys:{},eButtons:null,enableAll:function MailIM_Toolbar$enableAll(){for(var a in this.menukeys)this.enable(a)},disableAll:function MailIM_Toolbar$disableAll(){for(var a in this.menukeys)this.disable(a)},enable:function MailIM_Toolbar$enable(a){removeCssClass(this.menukeys[a],MailIM.Toolbar._DISABLE_CLASS)},disable:function MailIM_Toolbar$disable(a){addCssClass(this.menukeys[a],MailIM.Toolbar._DISABLE_CLASS)},getElement:function MailIM_Toolbar$getElement(a){return this.menukeys[a]},add_click:function MailIM_Toolbar$add_click(a){this.__click=Delegate.combine(this.__click,a)},remove_click:function MailIM_Toolbar$remove_click(a){this.__click=Delegate.remove(this.__click,a)},__click:null,_onClick:function MailIM_Toolbar$_onClick(){var a=this.Elt.ownerDocument.parentWindow.event.srcElement,b=a.getAttribute(MailIM.Toolbar._MENUKEY);while(String.isNullOrEmpty(b)&&a!=this.Elt){a=a.parentNode;b=a.getAttribute(MailIM.Toolbar._MENUKEY)}if(a!=this.Elt&&a.className.indexOf(MailIM.Toolbar._DISABLE_CLASS)==-1)if(this.__click)this.__click.invoke(this,{menukey:b,elem:this.menukeys[b]})},dispose:function MailIM_Toolbar$dispose(){for(var a=0;a<this.menukeys.length;a++)this.menukeys[a]=null;this.eButtons=null;this.Elt.detachEvent("onclick",this.onClick);MailIM.Toolbar.callBase(this,"dispose")}};MailIM.Toolbar.createClass("MailIM.Toolbar",Control);MailIM.CWUtilities=function MailIM_CWUtilities$(){this._cDefaultTrimChars=["\r","\n"];this._propertyBag=[]};MailIM.CWUtilities.prototype={_cDefaultTrimChars:null,createWindowForConversation:function MailIM_CWUtilities$createWindowForConversation(e,a,c,b){var d=new MailIM.ConversationWindow(e,a,c,b);return d},trimProperly:function MailIM_CWUtilities$trimProperly(a,c){if(c==null)c=this._cDefaultTrimChars;var b=a.length-1;for(;b>=0;b--){var e=false,f=a.charAt(b);for(var d=0;d<c.length;d++)if(f==c[d]){e=true;break}if(!e)break}b++;if(b<a.length)a=a.substr(0,b);return a},newAnchor:function MailIM_CWUtilities$setupAnchor(b,a,c){return new MailIM.Anchor(b,a,c)},prepareMessageTextForDisplay:function MailIM_CWUtilities$prepareMessageTextForDisplay(a,b){a=LinkAndEmoticonReplacedHtml(a,b);a=a.replace(/\n/g,"<br/>");a=a.replace(/\t/g," &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ");return a},formatHotmailUrl:function MailIM_CWUtilities$formatHotmailUrl(b,a){var c=String.format("http://{0}/mail/{1}{2}n={3}.{4}",location.hostname,b,a?"?"+a+"&":"?",(new Date).valueOf(),Math.random());return c},isUserStatusDoNotDisturb:function MailIM_MailIM_CWUtilities$isUserStatusDoNotDisturb(){var b=gWebIM.get_user(),a=b?b.get_presence().get_status():a===Microsoft.Live.Messenger.PresenceStatus.none;return a===Microsoft.Live.Messenger.PresenceStatus.busy||a===Microsoft.Live.Messenger.PresenceStatus.appearOffline||a===Microsoft.Live.Messenger.PresenceStatus.inACall}};if(getImage===undefined)var getImage=function(){};MailIM.StatusImageMap=function MailIM_StatusImageMap$(){var i=getImage("busy16.png",true),c=getImage("away16.png",true),g=getImage("offline16.png",true),h=getImage("busy_b.png",true),b=getImage("away_b.png",true),e=getImage("offline_b.png",true),f=getImage("busy16_wp.gif",true),a=getImage("away16_wp.gif",true),d=getImage("offline16_wp.gif",true);this._addImageMap(Microsoft.Live.Messenger.PresenceStatus.online,getImage("online16.png",true),0);this._addImageMap(Microsoft.Live.Messenger.PresenceStatus.busy,i,0);this._addImageMap(Microsoft.Live.Messenger.PresenceStatus.inACall,i,0);this._addImageMap(Microsoft.Live.Messenger.PresenceStatus.away,c,0);this._addImageMap(Microsoft.Live.Messenger.PresenceStatus.beRightBack,c,0);this._addImageMap(Microsoft.Live.Messenger.PresenceStatus.outToLunch,c,0);this._addImageMap(Microsoft.Live.Messenger.PresenceStatus.idle,c,0);this._addImageMap(Microsoft.Live.Messenger.PresenceStatus.appearOffline,g,0);this._addImageMap(Microsoft.Live.Messenger.PresenceStatus.offline,g,0);this._addImageMap(Microsoft.Live.Messenger.PresenceStatus.online,getImage("online_b.png",true),1);this._addImageMap(Microsoft.Live.Messenger.PresenceStatus.busy,h,1);this._addImageMap(Microsoft.Live.Messenger.PresenceStatus.inACall,h,1);this._addImageMap(Microsoft.Live.Messenger.PresenceStatus.away,b,1);this._addImageMap(Microsoft.Live.Messenger.PresenceStatus.beRightBack,b,1);this._addImageMap(Microsoft.Live.Messenger.PresenceStatus.outToLunch,b,1);this._addImageMap(Microsoft.Live.Messenger.PresenceStatus.idle,b,1);this._addImageMap(Microsoft.Live.Messenger.PresenceStatus.appearOffline,e,1);this._addImageMap(Microsoft.Live.Messenger.PresenceStatus.offline,e,1);this._addImageMap(Microsoft.Live.Messenger.PresenceStatus.online,getImage("online16_wp.gif",true),2);this._addImageMap(Microsoft.Live.Messenger.PresenceStatus.busy,f,2);this._addImageMap(Microsoft.Live.Messenger.PresenceStatus.inACall,f,2);this._addImageMap(Microsoft.Live.Messenger.PresenceStatus.away,a,2);this._addImageMap(Microsoft.Live.Messenger.PresenceStatus.beRightBack,a,2);this._addImageMap(Microsoft.Live.Messenger.PresenceStatus.outToLunch,a,2);this._addImageMap(Microsoft.Live.Messenger.PresenceStatus.idle,a,2);this._addImageMap(Microsoft.Live.Messenger.PresenceStatus.appearOffline,d,2);this._addImageMap(Microsoft.Live.Messenger.PresenceStatus.offline,d,2)};MailIM.StatusImageMap.prototype={_m_imageMap:[],_m_blockedImageMap:[],_m_imageMapWithPawns:[],_m_contactOnlineBlocked:null,_m_contactOfflineBlocked:null,_addImageMap:function MailIM_StatusImageMap$_addImageMap(a,b,c){if(c==0)this._m_imageMap[a]=b;else if(c==1)this._m_blockedImageMap[a]=b;else this._m_imageMapWithPawns[a]=b},getImageMap:function MailIM_StatusImageMap$getImageMap(a,b){var c=b?this._m_blockedImageMap[a]:this._m_imageMap[a];return c},getImageMapWithPawn:function MailIM_StatusImageMap$getImageMap(a){var b=this._m_imageMapWithPawns[a];return b},fixAlphaForIE6:function MailIM_StatusImageMap$fixAlphaForIE6(a,b){if(isIE6()){a.style.filter="progid:DXImageTransform.Microsoft.AlphaImageLoader(enabled='true',src='"+b+"')";a.style.paddingTop="16px"}}};if(gStrings===undefined)var gStrings={Buddy_Status_Offline:"",Buddy_Status_Offline:"","Buddy_Status_Online)":"",Buddy_Status_Hidden:"",Buddy_Status_Busy:"",Buddy_Status_Idle:"",Buddy_Status_BeRightBack:"",Buddy_Status_Away:"",Buddy_Status_OnThePhone:"",Buddy_Status_OutToLunch:""};MailIM.StatusTextMap=function MailIM_StatusTextMap$(){this._m_map={};this._add(Microsoft.Live.Messenger.PresenceStatus.offline,gStrings.Buddy_Status_Offline);this._add(Microsoft.Live.Messenger.PresenceStatus.online,gStrings.Buddy_Status_Online);this._add(Microsoft.Live.Messenger.PresenceStatus.appearOffline,gStrings.Buddy_Status_Hidden);this._add(Microsoft.Live.Messenger.PresenceStatus.busy,gStrings.Buddy_Status_Busy);this._add(Microsoft.Live.Messenger.PresenceStatus.idle,gStrings.Buddy_Status_Away);this._add(Microsoft.Live.Messenger.PresenceStatus.beRightBack,gStrings.Buddy_Status_Away);this._add(Microsoft.Live.Messenger.PresenceStatus.away,gStrings.Buddy_Status_Away);this._add(Microsoft.Live.Messenger.PresenceStatus.inACall,gStrings.Buddy_Status_Busy);this._add(Microsoft.Live.Messenger.PresenceStatus.outToLunch,gStrings.Buddy_Status_Away)};MailIM.StatusTextMap.prototype={_m_map:null,_add:function MailIM_StatusTextMap$_add(a,b){this._m_map[a]=b},getItem:function MailIM_StatusTextMap$getItem(b){var a=this._m_map[b];if(a==null)a="";return a}};var gCWUtilities=new MailIM.CWUtilities,gStatusImageMap=new MailIM.StatusImageMap,gStatusTextMap=new MailIM.StatusTextMap,gPlayFlash=-1,gSoundOn=true;function detectFlash(){gPlayFlash=0;if(navigator.plugins&&navigator.plugins.length){var a=navigator.plugins["Shockwave Flash"];if(a)if(a.description){var b=a.description,d=b.charAt(b.indexOf(".")-1);if(d>=4)gPlayFlash=1}}else if(navigator.mimeTypes&&navigator.mimeTypes.length){var c=navigator.mimeTypes["application/x-shockwave-flash"];if(c&&c.enabledPlugin)gPlayFlash=1}}function canPlayFlash(){if(gPlayFlash<0)detectFlash();return gPlayFlash==1}function initializeFlashUI_UpdateTitle(){window.document.title=gStrings.PageTitleServiceName}function initializeFlashUI(){if(canPlayFlash()){var a=document.getElementById("flashSoundDiv");if(a!=null)if(a.innerHTML==""||a.innerHTML==null){var b=getSoundDirectory(),c='<object classid="clsid:d27cdb6e-ae6d-11cf-96b8-444553540000" codebase="http://fpdownload.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=4,0,0,0" id="type" width="1" height="1" align="middle"><param name="allowScriptAccess" value="sameDomain" /><param name="movie" value="'+b+'type.swf" /><param name="quality" value="high" /><param name="bgcolor" value="#ffffff" /><embed src="'+b+'type.swf" quality="high" bgcolor="#ffffff" width="1" height="1" swLiveConnect=true id="type" name="type" align="middle" allowScriptAccess="sameDomain" type="application/x-shockwave-flash" pluginspage="http://www.macromedia.com/go/getflashplayer" /></object><object classid="clsid:d27cdb6e-ae6d-11cf-96b8-444553540000" codebase="http://fpdownload.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=4,0,0,0" id="nudge" width="1" height="1" align="middle"><param name="allowScriptAccess" value="sameDomain" /><param name="movie" value="'+b+'nudge.swf" /><param name="quality" value="high" /><param name="bgcolor" value="#ffffff" /><embed src="'+b+'nudge1.swf" quality="high" bgcolor="#ffffff" width="1" height="1" swLiveConnect=true id="nudge" name="nudge" align="middle" allowScriptAccess="sameDomain" type="application/x-shockwave-flash" pluginspage="http://www.macromedia.com/go/getflashplayer" /></object>';a.innerHTML=c;if(isIE())setTimeout(initializeFlashUI_UpdateTitle,500)}}}function createTimer(c,d,e){var a=0;a=setTimeout(b,d);function b(){c(e,a)}return a}function clearSoundSource(a){if(null==a)return;var b=document.getElementById(a);if(null==b)return;b.src=""}function getSWF(a){if(document[a].length!=undefined)return document[a][1];return document[a]}function playFlashSound(b){try{var a=getSWF(b);a.Rewind();a.Play()}catch(c){}}function playBGSound(b){try{var a=document.getElementById("soundPlayIE");if(null!=a)if(!a.src){a.src=b;createTimer(clearSoundSource,1e3,"soundPlayIE")}}catch(c){}}function getSoundDirectory(){return getImage("sounds/",true)}function playSound(a,b){if(gSoundOn&&!b)if(canPlayFlash())playFlashSound(a);else if(isIE()){var c=getSoundDirectory()+a+".wav";playBGSound(c)}}