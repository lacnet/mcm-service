// Copyright (c) Microsoft Corporation. All rights reserved.

Type.createNamespace('MSI');MSI._I$0=function(configuration,callback){this.$2=configuration;this.$3=[];this.$3.add(callback);}
MSI._I$0.prototype={$2:null,$3:null,$4:null,$5:null,$6:null,$7:0,$8:false,add_$9:function($p0){this.$A=Delegate.combine(this.$A,$p0);},remove_$9:function($p0){this.$A=Delegate.remove(this.$A,$p0);},$A:null,$B:function(){this.$7=window.setTimeout(Delegate.create(this,this.$10),10000);this.$4=document.createElement('img');this.$4.attachEvent('onload',Delegate.create(this,this.$E));this.$4.attachEvent('onerror',Delegate.create(this,this.$E));this.$4.src=this.$2.silentReauthDetectionUrl;},$C:function($p0){this.$3.add($p0);},$D:function(){window.____ReauthenticationCompleted = Delegate.create(this,this.$F);},$E:function(){if(this.$4.width===1){this.$D();var $0=this.$2.silentReauthUrlFormat.replace('ReauthCompletedUrl',encodeURIComponent(MSCo.Configuration.get_reauthCompletedPageUrl()));this.$5=document.createElement('iframe');this.$5.style.display='none';this.$5.src=$0;document.body.appendChild(this.$5);}else{this.$11(1);}},$F:function(){window.clearTimeout(this.$7);this.$12();},$10:function(){this.$11(1);},$11:function($p0){if(this.$8){return;}this.$8=true;if(this.$5){document.body.removeChild(this.$5);this.$5=null;}var $enum1=this.$3.getEnumerator();while($enum1.moveNext()){var $0=$enum1.get_current();$0.invoke($p0);}if(this.$A){this.$A.invoke(this,EventArgs.Empty);}},$12:function(){this.$6=document.createElement('iframe');this.$6.style.visibility='hidden';this.$6.attachEvent('onload',Delegate.create(this,this.$13));this.$6.src=this.$2.storageAuthUrl;document.body.appendChild(this.$6);},$13:function(){if(this.$6){var $0=this.$6;this.$6.detachEvent('onload',Delegate.create(this,this.$13));this.$6=null;document.body.removeChild($0);}this.$11(0);}}
MSI.IdentityService=function(){this.$0=MC.$create_IdentityConfigurationInfo();}
MSI.IdentityService.prototype={$1:null,reauthenticate:function(callback){if(!this.$1){this.$1=new MSI._I$0(this.$0,callback);this.$1.add_$9(Delegate.create(this,this.$2));this.$1.$B();}else{this.$1.$C(callback);}},updateConfiguration:function(configuration){this.$0=configuration;},$2:function($p0,$p1){this.$1=null;}}
MSI._I$0.createClass('MSI._I$0');MSI.IdentityService.createClass('MSI.IdentityService',null,MC.IIdentityService);
// ---- Do not remove this footer ----
// Generated using Script# v0.5.1.0 (http://projects.nikhilk.net)
// -----------------------------------