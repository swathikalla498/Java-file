<!DOCTYPE html>
<!-- saved from url=(0066)https://www.w3schools.com/java/tryjava.asp?filename=demo_try_catch -->
<html lang="en-US"><head><meta http-equiv="Content-Type" content="text/html; charset=windows-1252"><script async="" src="./exception_files/wrap.js.download"></script><script type="text/javascript" async="" src="./exception_files/localstore.js.download"></script>
<title>W3Schools Tryit Editor</title>
<meta name="viewport" content="width=device-width">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta property="og:image" content="https://www.w3schools.com/images/w3schools_logo_436_2.png">
<meta property="og:image:type" content="image/png">
<meta property="og:image:width" content="436">
<meta property="og:image:height" content="228">
<meta property="og:title" content="W3Schools online JAVA editor">
<meta property="og:description" content="The W3Schools online code editor allows you to edit code and view the result in your browser">
<link rel="stylesheet" href="./exception_files/w3schools31.css">
<link rel="icon" href="https://www.w3schools.com/favicon.ico">
<link rel="apple-touch-icon" sizes="180x180" href="https://www.w3schools.com/apple-touch-icon.png">
<link rel="icon" type="image/png" sizes="32x32" href="https://www.w3schools.com/favicon-32x32.png">
<link rel="icon" type="image/png" sizes="16x16" href="https://www.w3schools.com/favicon-16x16.png">
<link rel="manifest" href="https://www.w3schools.com/site.webmanifest">
<link rel="mask-icon" href="https://www.w3schools.com/safari-pinned-tab.svg" color="#04aa6d">
<meta name="msapplication-TileColor" content="#00a300">
<meta name="theme-color" content="#ffffff">
<link rel="stylesheet" href="./exception_files/codemirror_multi.css">
<script type="text/javascript" src="./exception_files/config.js.download" async=""></script><script type="text/javascript" async="" src="./exception_files/js"></script><script async="" src="./exception_files/gtm.js.download"></script><script src="./exception_files/codemirror_multi.js.download"></script>
<script src="./exception_files/codemirror_clike.js.download"></script>

<!-- Google Tag Manager -->
<script>
(function(w,d,s,l,i){w[l]=w[l]||[];w[l].push({'gtm.start':
new Date().getTime(),event:'gtm.js'});var f=d.getElementsByTagName(s)[0],
j=d.createElement(s),dl=l!='dataLayer'?'&l='+l:'';j.async=true;j.src=
'https://www.googletagmanager.com/gtm.js?id='+i+dl;f.parentNode.insertBefore(j,f);
})(window,document,'script','dataLayer','GTM-KTCFC3S');

var subjectFolder = location.pathname;
subjectFolder = subjectFolder.replace("/", "");
if (subjectFolder.startsWith("python/") == true ) {
  if (subjectFolder.includes("/numpy/") == true ) {
    subjectFolder = "numpy/"
  } else if (subjectFolder.includes("/pandas/") == true ) {
      subjectFolder = "pandas/"
  } else if (subjectFolder.includes("/scipy/") == true ) {
      subjectFolder = "scipy/"
  }
}
subjectFolder = subjectFolder.substr(0, subjectFolder.indexOf("/"));
</script>
<!-- End Google Tag Manager -->

<script src="./exception_files/uic.js.download"></script>
<script data-cfasync="false" type="text/javascript">
var k42 = false;
// GPT slots
var gptAdSlots = [];
window.googletag = window.googletag || { cmd: [] };
googletag.cmd.push(function() {
  googletag.pubads().setTargeting("page_section", subjectFolder);

});
k42 = true;

</script>
<script data-cfasync="false" type="text/javascript">
    window.snigelPubConf = {
    "adengine": {

      "activeAdUnits": ["try_it_leaderboard"]

  }
}
uic_r_a()
</script>
<script async="" data-cfasync="false" src="./exception_files/loader.js.download" type="text/javascript"></script>
<script>
if (window.addEventListener) {              
    window.addEventListener("resize", browserResize);
} else if (window.attachEvent) {                 
    window.attachEvent("onresize", browserResize);
}
var xbeforeResize = window.innerWidth;

function browserResize() {
    var afterResize = window.innerWidth;
    if ((xbeforeResize < (970) && afterResize >= (970)) || (xbeforeResize >= (970) && afterResize < (970)) ||
        (xbeforeResize < (728) && afterResize >= (728)) || (xbeforeResize >= (728) && afterResize < (728)) ||
        (xbeforeResize < (468) && afterResize >= (468)) ||(xbeforeResize >= (468) && afterResize < (468))) {
        xbeforeResize = afterResize;
        
        if (document.getElementById("adngin-try_it_leaderboard-0")) {
                adngin.queue.push(function(){  adngin.cmd.startAuction(["try_it_leaderboard"]); });
              }
         
    }
    if (window.screen.availWidth <= 768) {
      restack(window.innerHeight > window.innerWidth);
    }
    fixDragBtn();
    showFrameSize();  
  
      
}
var fileID = "";
</script>
<style>
* {
  -webkit-box-sizing: border-box;
  -moz-box-sizing: border-box;
  box-sizing: border-box;
}
body {
  color:#000000;
  margin:0px;
  font-size:100%;
}
.trytopnav {
  height:48px;
  overflow:hidden;
  min-width:380px;
  position:absolute;
  width:100%;
  top:99px;

  background-color:#E7E9EB;
}
.topnav-icons {
  margin-right:8px;
}
.trytopnav a,.trytopnav button {
  color:#999999;
}
.w3-bar .w3-bar-item:hover {
  color:#757575 !important;
}
a.w3schoolslink {
  padding:0 !important;
  display:inline !important;
}
a.w3schoolslink:hover,a.w3schoolslink:active {
  text-decoration:underline !important;
  background-color:transparent !important;
}
#dragbar{
  position:absolute;
  cursor: col-resize;
  z-index:3;
  padding:5px;
}
#shield {
  display:none;
  top:0;
  left:0;
  width:100%;
  position:absolute;
  height:100%;
  z-index:4;
}
#framesize {
  font-family: 'Montserrat', 'Source Sans Pro', sans-serif;
  font-size: 14px;
}
#container {
  background-color:#E7E9EB;
  width:100%;
  overflow:auto;
  position:absolute;
  top:144px;

  bottom:0;
  height:auto;
}
#textareacontainer, #iframecontainer {
  float:left;
  height:100%;
  width:50%;
}

#textarea, #textarea2, #iframe {
  height:100%;
  width:100%;
  padding-bottom:10px;
  padding-top:1px;
}
#textarea {
  padding-left:10px;
  padding-right:5px;  
}
#iframe {
  padding-left:5px;
  padding-right:10px;  
  position:relative;  
    
    color:#ffffff;
    font-family: consolas,"courier new",monospace;    
  
}
#textareawrapper {
  width:100%;
  height:100%;
  
  overflow:auto;
  
  background-color: #ffffff;
  position:relative;
  
    box-shadow:0 1px 3px rgba(0,0,0,0.12), 0 1px 2px rgba(0,0,0,0.24);
  
}
#iframewrapper {
  width:100%;
  height:100%;
  -webkit-overflow-scrolling: touch;
  background-color: #ffffff;
  
    box-shadow:0 1px 3px rgba(0,0,0,0.12), 0 1px 2px rgba(0,0,0,0.24);
  
    color:#ffffff;
    font-family: consolas,"courier new",monospace;  
  
}
#textareaCode, #textareaCode2 {
  background-color: #ffffff;
  font-family: consolas,Menlo,"courier new",monospace;
  font-size:15px;
  height:100%;
  width:100%;
  padding:8px;
  resize: none;
  border:none;
  line-height:normal;    
}
/*
  .localhostcontainer {
    position:absolute;
    width:auto;
    right:0;
    left:0;
    z-index:2;
    padding:4px 12px;
    border-bottom:1px solid #d9d9d9;
    background-color:#E7E9EB;
  }
  .localhostdiv {
    overflow:hidden;
    font-family:arial;
    border:1px solid #d9d9d9;
    background-color:#fff;
    font-size:14px;
    padding-left:10px;
  }
*/

.localhostoutercontainer {
  position: absolute;
  width: auto;
  left:5px;
  right:10px;
  background-color: #E7E9EB;
  height: 30px;
  z-index: 9;
}
.localhostoutercontainer.horizontal {
  left:10px;
}
.localhostcontainer {
  position:relative;
  width:auto;
  right:0;
  left:0;
  z-index:2;
  xpadding:6px 12px;
  xxborder-bottom:1px solid #d9d9d9;
  background-color:#F1F1F1;
  background-color:#38444d;
  border-top-right-radius:10px;
  border-top-left-radius:10px;
  overflow:hidden;
  padding-top:4px;
}
.localhostdiv {
  overflow:hidden;
  font-family:arial;
  color:#000;
  background-color:#fff;
  font-size:15px;
  padding-left:10px;
  border-radius:20px;
  width:60%;
  float:left;
  font-family: consolas,Menlo,"courier new",monospace;  
}
.localhostbuttoncontainer {
  width:20%;
  min-width:100px;
  color:#ffc107;
  float:left;  
  font-size:16px;
  overflow:auto;
}
div.localhostbuttoncontainer span{
  display:inline-block;
  color:#ffc107;
  position:relative;
  padding-bottom:4px;
  padding-left:2px;  
}

div.localhostbuttoncontainer span:first-child{
  color:#dc3545;
  padding-left:12px;

}
div.localhostbuttoncontainer span:last-child{
  color:#04AA6D;
  padding-left:2px;    
}

body.darktheme .localhostoutercontainer {
  background-color: #38444d;
}
body.darktheme .localhostcontainer {
  background-color:rgb(21,32,43)
}

body.darktheme .localhostdiv {
  border:1px solid #595959;
  background-color:#ffffff;
}

/**/


  #filenamecontainer {
    position:absolute;
    text-align:center;
    z-index:4;
    width:100%;
  }
  #filenamecontainer span {
    opacity:0.9;
    padding:1px 6px;
    font-family:Consolas;
    background-color:#E7E9EB;
    font-size:16px;
  }
  body.darktheme #filenamecontainer span {
    background-color:#555555;
    color:#E7E9EB;
  }

.CodeMirror.cm-s-default {
  line-height:normal;
  padding: 4px;
  
  height:100%;
  width:100%;
}

#iframeResult, #iframeSource {
  background-color: #ffffff;
  
    background-color: #000000;
    color:#ffffff;
    font-family: consolas,"courier new",monospace!important;      
    padding:8px;    
  
  
  height:100%;
  width:100%;  
}

  #iframeResult * {
    font-family: consolas,"courier new",monospace!important;  
  }

#stackV {background-color:#999999;}
#stackV:hover {background-color:#BBBBBB !important;}
#stackV.horizontal {background-color:transparent;}
#stackV.horizontal:hover {background-color:#BBBBBB !important;}
#stackH.horizontal {background-color:#999999;}
#stackH.horizontal:hover {background-color:#999999 !important;}
#textareacontainer.horizontal,#iframecontainer.horizontal{
  height:50%;
  float:none;
  width:100%;
}


#textarea.horizontal{
  height:100%;
  padding-left:10px;
  padding-right:10px;
}
#iframe.horizontal{
  height:100%;
  padding-right:10px;
  padding-bottom:10px;
  padding-left:10px;  
}
#container.horizontal{
  min-height:200px;
  margin-left:0;
}
#tryitLeaderboard {
  overflow:hidden;
  text-align:center;
  margin-top:5px;
  height:90px;
}
.w3-dropdown-content {width:350px}

#breadcrumb ul {
  font-family:'Montserrat', 'Source Sans Pro', sans-serif;
  list-style: none;
  display: inline-table;
  padding-inline-start: 1px;
  font-size: 12px;
  margin-block-start: 6px;
  margin-block-end: 6px;	
}
#breadcrumb li {
  display: inline;
}
#breadcrumb a {
  float: left;
  background: #E7E9EB;
  padding: 3px 10px 3px 20px;
  position: relative;
  margin: 0 5px 0 0; 
  text-decoration: none;
  color: #555;
}
#breadcrumb a:after {
  content: "";  
  border-top: 12px solid transparent;
  border-bottom: 12px solid transparent;
  border-left: 12px solid #E7E9EB;
  position: absolute; 
  right: -12px;
  top: 0;
  z-index: 1;
}
#breadcrumb a:before {
  content: "";  
  border-top: 12px solid transparent;
  border-bottom: 12px solid transparent;
  border-left: 12px solid #fff;
  position: absolute; 
  left: 0; 
  top: 0;
}
#breadcrumb ul li:first-child a:before {
  display: none; 
}
#breadcrumb ul:last-child li{
  padding-right: 5px;
}
#breadcrumb ul li a:hover {
  background: #04AA6D;
  color:#fff;
}
#breadcrumb ul li a:hover:after {
  border-left-color: #04AA6D;
  color:#fff;
}
#breadcrumb li:last-child {
  display: inline-block!important;
  margin-top: 3px!important;
}
#runbtn {
  background-color:#04AA6D;
  color:white;
  font-family: 'Source Sans Pro', sans-serif;
  font-size:18px;
  padding:6px 25px;
  margin-top:4px;
  border-radius:5px;
  word-spacing:10px;
}
#runbtn:hover {
  background-color: #059862 !important;
  color:white!important;
}
#getwebsitebtn {
  background-color:#04AA6D;
  font-family: 'Source Sans Pro', sans-serif;  
  color: white;
  font-size: 18px;
  padding:6px 15px;
  margin-top:4px;
  margin-right: 10px;
  display: block;
  float: right;
  border-radius: 5px;
}
#getwebsitebtn:hover {
  background-color: #059862 !important;
  color:white!important;
}

@media screen and (max-width: 727px) {
  .trytopnav {top:70px;}
  #container {top:116px;}
  #breadcrumb {display:none;}
  #tryhome  {display:block;}
}
@media screen and (max-width: 467px) {
  .trytopnav {top:60px;}
  #container {top:106px;}
  .w3-dropdown-content {width:100%}
}
@media only screen and (max-device-width: 768px) {
  #iframewrapper {overflow: auto;}
  #container     {min-width:310px;}
  .stack         {display:none;}
  #tryhome       {display:block;}
  .trytopnav     {min-width:310px;}  
}

  #runloadercontainer{
    display:none;
    position:absolute;
    background-color:#000;
    z-index:9;
  }
  #runloader{
    margin:auto;
    border: 10px solid #333;
    border-top: 10px solid #04AA6D;
    border-radius: 50%;
    max-width: 150px;
    max-height: 150px;
    animation: spin 2s linear infinite;
    position:relative;
  }
  @keyframes spin {
      0% { transform: rotate(0deg); }
      100% { transform: rotate(360deg); }
  }

#iframewrapper {
	
}

/*
  .tabs-container {
  height:100%;
  overflow:auto;
  }
  .tabs {
    list-style-type: none;
    padding: 0;
    margin: 0;
    background-color:#E7E9EB;
    
  }
  .tab {
    padding: 5px 10px;
    background: #ddd;
    width: fit-content;
    display: inline-block;
    border-top-left-radius: 10px;
    border-top-right-radius: 10px;            
  
    }
  .tab.active {
    background: #fff;
  }
  
  .tab-pane {
    display: none;
  }
  .tab-pane.active { 
    display: block;
  }
*/

.tabitem, #resttab {
  position:absolute;
  z-index:2;
  font-family:arial;
  padding:4px 12px;
  width:70px;
  cursor:pointer;
}

/*  
#progqcstab {
  width:120px;
  left:0;
}
#prog2qcstab {
  width:100px;
  left:120px;
}
#childtemplatetab {
  width:150px;
  left:220px;
}
*/
.tabitem {
  background-color:#38444d;
  color:#ddd;
  border-top-left-radius:10px;
  border-top-right-radius:10px;
  opacity:0.5;
}
#resttab {
  cursor:default;

  z-index:1;
  background-color:#E7E9EB;
  width:100%;
  left:0px;
}


.tabitem.tabselected{
  opacity:1;
}

.darktheme .tabitem {
  background-color:rgb(21,32,43)
}
.darktheme #resttab {
  background-color:#38444d;
}

/**/
.fa {
  padding: 10px 10px!important;
}
a.topnav-icons, a.topnav-icons.fa-home, a.topnav-icons.fa-menu, button.topnav-icons.fa-adjust {
    font-size: 28px!important;
}
.darktheme #breadcrumb li {
  color:#fff;
}
.darktheme #breadcrumb a {
  background:#616161;
  background-color:#38444d;  
  color: #ddd;
}	
.darktheme #breadcrumb a:after {
  border-left: 12px solid #616161;
  border-left: 12px solid #38444d; 
}
.darktheme #breadcrumb a:before {
  border-left: 12px solid rgb(40, 44, 52);
  border-left: 12px solid #1d2a35;  
}
.darktheme .currentcrumb {
  color:#ddd;
}

body.darktheme {
  background-color:rgb(40, 44, 52);
  background-color:#1d2a35;
}
body.darktheme #tryitLeaderboard{
  background-color:rgb(40, 44, 52);
  background-color:#1d2a35;  
}
body.darktheme .trytopnav{
  background-color:#616161;
  background-color:#38444d;
  color:#dddddd;
}
body.darktheme #container {
  background-color:#616161;
  background-color:#38444d;
}
body.darktheme .trytopnav a {
  color:#dddddd;
}
body.darktheme #textareaCode {
  background-color:rgb(40, 44, 52);
  color:#fff;
}

body.darktheme #textareawrapper {
  background-color:rgb(21,32,43);
}
body.darktheme .tabs {
    background-color:#38444d;
  }
body.darktheme .tab {
    background: rgb(21,32,43);
    color:#fff;
    opacity:0.5;
    }
body.darktheme .tab.active {
    background: rgb(21,32,43);
    color:#fff;    
    opacity:1;
  }

body.darktheme ::-webkit-scrollbar {width:12px;height:3px;}
body.darktheme ::-webkit-scrollbar-track-piece {background-color:#000;}
body.darktheme ::-webkit-scrollbar-thumb {height:50px;background-color: #616161; background-color:#38444d;}
body.darktheme ::-webkit-scrollbar-thumb:hover {background-color: #aaaaaa;background-color: #4b5b68}


/*
#file1filetab, #resttab {
  position:absolute;
  z-index:2;
  font-family:arial;
  padding:4px 12px;
}
#file1filetab {
  width:auto;
  left:0;
  border-top-left-radius: 10px;
  border-top-right-radius: 10px;            
}
#resttab {
  z-index:1;
  background-color:#E7E9EB;
  width:100%;
  left:0px;
}
.tabitem {
  background-color:#eaeaea;
}
.tabitem.tabselected{ 
  background-color:#fff;
}
.darktheme .tabitem {
  background-color:#444;
}
.darktheme .tabitem.tabselected{
  background-color:rgb(21,32,43);
}
.darktheme #resttab {
  background-color:#38444d;
}
*/
.darktheme #file1filetab {
  border-right:1px solid rgb(21,32,43);
}

</style>
<!--[if lt IE 8]>
<style>
#textareacontainer, #iframecontainer {width:48%;}
#container {height:500px;}
#textarea, #iframe {width:90%;height:450px;}
#textareaCode, #textareaCode2, #iframeResult, .codewindow {height:450px;}
.stack {display:none;}
</style>
<![endif]-->
<script type="text/javascript" async="" src="./exception_files/prebid.js.download"></script><script type="text/javascript" async="" src="./exception_files/apstag.js.download"></script><script type="text/javascript" async="" src="./exception_files/f.txt"></script><script type="text/javascript" async="" src="./exception_files/adngin.js.download"></script><script type="text/javascript" async="" src="./exception_files/argus.js.download"></script><argprec0></argprec0><argprec1></argprec1><meta http-equiv="origin-trial" content="As0hBNJ8h++fNYlkq8cTye2qDLyom8NddByiVytXGGD0YVE+2CEuTCpqXMDxdhOMILKoaiaYifwEvCRlJ/9GcQ8AAAB8eyJvcmlnaW4iOiJodHRwczovL2RvdWJsZWNsaWNrLm5ldDo0NDMiLCJmZWF0dXJlIjoiV2ViVmlld1hSZXF1ZXN0ZWRXaXRoRGVwcmVjYXRpb24iLCJleHBpcnkiOjE3MTk1MzI3OTksImlzU3ViZG9tYWluIjp0cnVlfQ=="><meta http-equiv="origin-trial" content="AgRYsXo24ypxC89CJanC+JgEmraCCBebKl8ZmG7Tj5oJNx0cmH0NtNRZs3NB5ubhpbX/bIt7l2zJOSyO64NGmwMAAACCeyJvcmlnaW4iOiJodHRwczovL2dvb2dsZXN5bmRpY2F0aW9uLmNvbTo0NDMiLCJmZWF0dXJlIjoiV2ViVmlld1hSZXF1ZXN0ZWRXaXRoRGVwcmVjYXRpb24iLCJleHBpcnkiOjE3MTk1MzI3OTksImlzU3ViZG9tYWluIjp0cnVlfQ=="><script src="./exception_files/f(1).txt" async=""></script><style type="text/css">.snigel-cmp-framework .sn-inner {background-color:#fffefe!important;}.snigel-cmp-framework .sn-b-def {border-color:#04aa6d!important;color:#04aa6d!important;}.snigel-cmp-framework .sn-b-def.sn-blue {color:#ffffff!important;background-color:#04aa6d!important;border-color:#04aa6d!important;}.snigel-cmp-framework .sn-selector ul li {color:#04aa6d!important;}.snigel-cmp-framework .sn-selector ul li:after {background-color:#04aa6d!important;}.snigel-cmp-framework .sn-footer-tab .sn-privacy a {color:#04aa6d!important;}.snigel-cmp-framework .sn-arrow:after,.snigel-cmp-framework .sn-arrow:before {background-color:#04aa6d!important;}.snigel-cmp-framework .sn-switch input:checked + span::before {background-color:#04aa6d!important;}#adconsent-usp-link {border: 1px solid #04aa6d!important;color:#04aa6d!important;}#adconsent-usp-banner-optout input:checked + .adconsent-usp-slider {background-color:#04aa6d!important;}#adconsent-usp-banner-btn {color:#ffffff;border: solid 1px #04aa6d!important;background-color:#04aa6d!important; }</style><style type="text/css">.sn_ad_label{height:unset !important}</style><script src="./exception_files/pubcid.min.js.download"></script><script src="./exception_files/id5-api.js.download"></script><style type="text/css">
        #dse-quicksearchdiv * {
            box-sizing: content-box;
        }

        #dse-quicksearchdiv svg {
            box-sizing: content-box;
        }

        #dse-disabledpopup * {
            box-sizing: content-box;
        }

        #dse-search:before {
            left: -4px !important;
            top: 38% !important;
            height: 6px !important;
            width: 6px !important;
            border: 1px solid #484644 !important;
            border-right: none !important;
            border-top: none !important;
            content: ' ' !important;
            background: #484644 !important;
            position: absolute !important;
            transform: rotate(45deg) !important;
        }

        #dse-disabledpopup:before {
            left: -4px !important;
            top: 38% !important;
            height: 6px !important;
            width: 6px !important;
            border: 1px solid #484644 !important;
            border-right: none !important;
            border-top: none !important;
            content: ' ' !important;
            background: #484644 !important;
            position: absolute !important;
            transform: rotate(45deg) !important;
        }

        .topArrow #dse-search:before {
            left: 50% !important;
            top: -4px !important;
            height: 6px !important;
            width: 6px !important;
            border: 1px solid #484644 !important;
            border-top: none !important;
            border-left: none !important;
            content: ' ' !important;
            background: #484644 !important;
            position: absolute !important;
            transform: rotate(225deg) !important;
        }

        .topArrow #dse-disabledpopup:before {
            left: 50% !important;
            top: -4px !important;
            height: 6px !important;
            width: 6px !important;
            border: 1px solid #484644 !important;
            border-top: none !important;
            border-left: none !important;
            content: ' ' !important;
            background: #484644 !important;
            position: absolute !important;
            transform: rotate(225deg) !important;
        }

        #dse-disabledpopup:hover:before,
        #dse-search:hover:before,
        #dse-moreoptions:hover,
        #dse-search:hover,
        #dse-copy:hover,
        #dse-disabledpopup:hover,
        #dse-lookup:hover,
        #dse-disableFeature:hover {
            background-color: #666 !important;
        }

        #dse-disabledpopup:active:before,
        #dse-search:active:before,
        #dse-moreoptions:active,
        #dse-search:active,
        #dse-copy:active,
        #dse-disabledpopup:active,
        #dse-lookup:active,
        #dse-disableFeature:active {
            background-color: #666 !important;
        }
    </style></head>
<body>
<!-- Google Tag Manager (noscript) -->
<noscript><iframe src="https://www.googletagmanager.com/ns.html?id=GTM-KTCFC3S"
height="0" width="0" style="display:none;visibility:hidden"></iframe></noscript>
<!-- End Google Tag Manager (noscript) -->

<div id="tryitLeaderboard">
<!-- TryitLeaderboard -->

  <!--<pre>try_it_leaderboard, all: [320,50][728,90][468,60]</pre>-->
  <div id="adngin-try_it_leaderboard-0" data-google-query-id="CNGKr82Po4IDFYpZnQkdf-8O4Q"><div id="google_ads_iframe_/22152718,16833175/sws-hb//w3schools.com//try_it_leaderboard_0__container__" style="border: 0pt none;"><iframe id="google_ads_iframe_/22152718,16833175/sws-hb//w3schools.com//try_it_leaderboard_0" name="google_ads_iframe_/22152718,16833175/sws-hb//w3schools.com//try_it_leaderboard_0" title="3rd party ad content" width="728" height="90" scrolling="no" marginwidth="0" marginheight="0" frameborder="0" role="region" aria-label="Advertisement" tabindex="0" allow="attribution-reporting" style="border: 0px; vertical-align: bottom;" data-load-complete="true" data-google-container-id="1" src="./exception_files/saved_resource.html"></iframe></div></div>
  <!-- adspace tryit-->
 
</div>

<div class="trytopnav">
<div class="w3-bar" style="overflow:auto">
  <a id="tryhome" href="https://www.w3schools.com/" target="_blank" title="w3schools.com Home" class="w3-button w3-bar-item topnav-icons fa fa-home ga-tryit" style="margin-top:-2px;"></a>
  <a href="javascript:void(0);" onclick="openMenu()" id="menuButton" title="Open Menu" class="w3-dropdown-click w3-button w3-bar-item topnav-icons fa fa-menu ga-tryit" style="margin-top:-2px;"></a>

  <a href="javascript:void(0);" onclick="restack(currentStack)" title="Change Orientation" class="w3-button w3-bar-item w3-hide-small topnav-icons fa fa-rotate ga-tryit" style="margin-top:-2px;"></a>
  <a href="javascript:void(0);" onclick="retheme()" title="Change Theme" class="w3-button w3-bar-item topnav-icons fa fa-adjust ga-tryit" style="margin-top:-2px;"></a>

  <button id="runbtn" class="w3-button w3-bar-item w3-hover-white w3-hover-text-green ga-tryit" onclick="submitTryit(1);uic_r_p();">Run &#10095;</button>

  <a id="getwebsitebtn" class="w3-button w3-bar-item w3-hover-white w3-hover-text-green w3-hide-small ga-tryit" href="https://www.w3schools.com/spaces/" target="_blank">Get your <span class="w3-hide-medium"> own Java</span> server</a>
  <!--<span class="w3-right w3-hide-small xxw3-hide-medium" style="padding:8px 8px 8px 8px;display:block"></span>-->
  <span class="w3-right w3-hide-small" style="padding:8px 16px 8px 0;display:block;float:right;font-size:16px;margin-top:4px"><span id="framesize">Result Size: <span>753 x 584</span></span></span>
</div>

</div>

<div id="shield" style="display: none;"></div>

<a href="javascript:void(0)" id="dragbar" style="width: 5px; top: 144px; left: 763px; height: 584.2px; cursor: col-resize;"></a>
<div id="container">
  <div id="navbarDropMenu" class="w3-dropdown-content w3-bar-block w3-border" style="z-index:5">
    <span onclick="openMenu()" class="w3-button w3-display-topright w3-transparent ws-hover-black" title="Close Menu" style="font-weight:bold;padding-top:10px;padding-bottom:11px;">�</span>
    <div class="w3-bar-block">
      <a class="w3-bar-item w3-button ga-tryit" href="javascript:void(0);" title="Change Orientaton" onclick="openMenu();restack(currentStack)"><i class="fa fa-rotate" style="font-size:26px;margin-left:-4px;margin-right:8px"></i><span style="position:relative;top:-4px;left:2px;">Change Orientation</span></a>
      
      <a class="w3-bar-item w3-button ga-tryit" href="javascript:void(0);" title="Change Theme" onclick="openMenu();retheme()"><i class="fa fa-adjust" style="font-size:26px;margin-right:8px"></i><span style="position:relative;top:-4px;left:2px;">Change Theme, Dark/Light</span></a>
      <a class="w3-bar-item w3-button ga-tryit" style="height: 62px;padding-top: 18px;" href="https://spaces.w3schools.com/" target="_blank" title="Go to Spaces"><img style="margin-left:9px;margin-right:15px;margin-bottom: 8px;" src="./exception_files/spaces-icon-tryit.svg"><span style="position:relative;top:-4px;left:2px;">Go to Spaces</span></a>    
    </div>
    <footer class="w3-container w3-small ws-grey">
      <p>
        <a style="display:inline;padding:0;" href="https://www.w3schools.com/about/about_privacy.asp" target="_blank" onclick="openMenu();" class="w3-hover-none ws-hover-text-green ga-tryit">Privacy policy</a> and 
        <a style="display:inline;padding:0;" href="https://www.w3schools.com/about/about_copyright.asp" target="_blank" onclick="openMenu();" class="w3-hover-none ws-hover-text-green ga-tryit">Copyright 1999-2023</a>
      </p>
    </footer>
  </div>
  <div id="menuOverlay" class="w3-overlay w3-transparent" style="cursor:pointer;z-index:4"></div>
  <div id="textareacontainer">
    <div id="textarea">
      <div id="textareawrapper">
        
            <textarea autocomplete="off" id="textareaCode" wrap="logical" spellcheck="false" style="display: none;">public class Main {
  public static void main(String[] args) {
    try {
      int[] myNumbers = {1, 2, 3};
      System.out.println(myNumbers[10]);
    } catch (Exception e) {
      System.out.println("Something went wrong.");
    }
  }
}
</textarea><div class="CodeMirror cm-s-default CodeMirror-wrap"><div style="overflow: hidden; position: relative; width: 3px; height: 0px; top: 113.6px; left: 346.175px;"><textarea autocorrect="off" autocapitalize="off" spellcheck="false" tabindex="0" style="position: absolute; bottom: -1em; padding: 0px; width: 1000px; height: 1em; outline: none;"></textarea></div><div class="CodeMirror-vscrollbar" tabindex="-1" cm-not-content="true"><div style="min-width: 1px; height: 0px;"></div></div><div class="CodeMirror-hscrollbar" tabindex="-1" cm-not-content="true"><div style="height: 100%; min-height: 1px; width: 0px;"></div></div><div class="CodeMirror-scrollbar-filler" cm-not-content="true"></div><div class="CodeMirror-gutter-filler" cm-not-content="true"></div><div class="CodeMirror-scroll" tabindex="-1" draggable="false"><div class="CodeMirror-sizer" style="margin-left: 0px; margin-bottom: -17px; border-right-width: 33px; min-height: 202px; padding-right: 0px; padding-bottom: 0px;"><div style="position: relative; top: 0px;"><div class="CodeMirror-lines" role="presentation"><div role="presentation" style="position: relative; outline: none;"><div class="CodeMirror-measure"><pre class="CodeMirror-line-like"><span>xxxxxxxxxx</span></pre></div><div class="CodeMirror-measure"></div><div style="position: relative; z-index: 1;"></div><div class="CodeMirror-cursors" style=""><div class="CodeMirror-cursor" style="left: 342.175px; top: 105.6px; height: 17.6px;">&nbsp;</div></div><div class="CodeMirror-code" role="presentation" style=""><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span class="cm-m-clike cm-keyword">public</span><span class="cm-m-clike"> </span><span class="cm-m-clike cm-keyword">class</span><span class="cm-m-clike"> </span><span class="cm-m-clike cm-def">Main</span><span class="cm-m-clike"> {</span></span></pre><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span class="cm-m-clike"> &nbsp;</span><span class="cm-m-clike cm-keyword">public</span><span class="cm-m-clike"> </span><span class="cm-m-clike cm-keyword">static</span><span class="cm-m-clike"> </span><span class="cm-m-clike cm-type">void</span><span class="cm-m-clike"> </span><span class="cm-m-clike cm-variable">main</span><span class="cm-m-clike">(</span><span class="cm-m-clike cm-type">String</span><span class="cm-m-clike">[] </span><span class="cm-m-clike cm-variable">args</span><span class="cm-m-clike">) {</span></span></pre><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span class="cm-m-clike"> &nbsp; &nbsp;</span><span class="cm-m-clike cm-keyword">try</span><span class="cm-m-clike"> {</span></span></pre><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span class="cm-m-clike"> &nbsp; &nbsp; </span><span class="cm-m-clike cm-type">int</span><span class="cm-m-clike"> </span><span class="cm-m-clike cm-variable">x</span><span class="cm-m-clike cm-operator">=</span><span class="cm-m-clike cm-number">10</span><span class="cm-m-clike">;</span></span></pre><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span class="cm-m-clike"> &nbsp; &nbsp; </span><span class="cm-m-clike cm-variable">System</span><span class="cm-m-clike">.</span><span class="cm-m-clike cm-variable">out</span><span class="cm-m-clike">.</span><span class="cm-m-clike cm-variable">println</span><span class="cm-m-clike">(</span><span class="cm-m-clike cm-variable">x</span><span class="cm-m-clike cm-operator">/</span><span class="cm-m-clike cm-number">0</span><span class="cm-m-clike">);</span></span></pre><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span class="cm-m-clike"> &nbsp;  } </span><span class="cm-m-clike cm-keyword">catch</span><span class="cm-m-clike"> (</span><span class="cm-m-clike cm-variable">Exception</span><span class="cm-m-clike"> </span><span class="cm-m-clike cm-variable">e</span><span class="cm-m-clike">) {</span></span></pre><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span class="cm-m-clike"> &nbsp; &nbsp; &nbsp;</span><span class="cm-m-clike cm-variable">System</span><span class="cm-m-clike">.</span><span class="cm-m-clike cm-variable">out</span><span class="cm-m-clike">.</span><span class="cm-m-clike cm-variable">println</span><span class="cm-m-clike">(</span><span class="cm-m-clike cm-string">"Exception occured."</span><span class="cm-m-clike">);</span></span></pre><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span class="cm-m-clike"> &nbsp;  }</span></span></pre><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span class="cm-m-clike">  }</span></span></pre><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span class="cm-m-clike">}</span></span></pre><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span cm-text="">&#8203;</span></span></pre></div></div></div></div></div><div style="position: absolute; height: 33px; width: 1px; border-bottom: 0px solid transparent; top: 202px;"></div><div class="CodeMirror-gutters" style="display: none; height: 235px;"></div></div></div>
            <form id="codeForm" autocomplete="off" style="margin:0px;display:none;" action="https://try.w3schools.com/try_java.php?x=0.5461790485361455" method="post" accept-charset="utf-8" target="iframeResult">
              <input type="hidden" name="code" id="code" value="public class Main {
  public static void main(String[] args) {
    try {
     int xw3equalsign10;
     System.out.println(x/0);
    } catch (Exception e) {
      System.out.println(&quot;Something went wrong.&quot;);
    }
  }
}
">
            </form>
                  
       </div>
    </div>
  </div>
  <div id="iframecontainer">
    <div id="iframe">
      
        <div id="runloadercontainer" style="width: 753px; height: 584.2px; display: none;"><div id="runloader" style="width: 150.6px; height: 150.6px; top: 217.1px;"></div></div>
      
      
      <div id="iframewrapper"><iframe frameborder="0" id="iframeResult" name="iframeResult" src="./exception_files/saved_resource(2).html"></iframe></div>
    </div>
  </div>
  
</div>
<script>

function submitTryit(n) {
  
    if (window.editor) {
      window.editor.save();
    }
  
  var text = document.getElementById("textareaCode").value;

  var ifr = document.createElement("iframe");
  ifr.setAttribute("frameborder", "0");
  ifr.setAttribute("id", "iframeResult");
  ifr.setAttribute("name", "iframeResult");  

  document.getElementById("iframewrapper").innerHTML = "";
  document.getElementById("iframewrapper").appendChild(ifr);

  document.getElementById("iframeResult").addEventListener("load", hideSpinner);
  displaySpinner();
  var t=text;
  t=t.replace(/=/gi,"w3equalsign");
  t=t.replace(/\+/gi,"w3plussign");    
  var pos=t.search(/script/i)
  while (pos>0) {
    t=t.substring(0,pos) + "w3" + t.substr(pos,3) + "w3" + t.substr(pos+3,3) + "tag" + t.substr(pos+6);
    pos=t.search(/script/i);
  }
    
  document.getElementById("code").value=t;
  
    document.getElementById("codeForm").action = "https://try.w3schools.com/try_java.php?x=" + Math.random();  
  
  document.getElementById('codeForm').method = "post";
  document.getElementById('codeForm').acceptCharset = "utf-8";
  document.getElementById('codeForm').target = "iframeResult";
  document.getElementById("codeForm").submit();
    
}

function hideSpinner() {
  document.getElementById("runloadercontainer").style.display = "none";
}
function displaySpinner() {
  var i, c, w, h, r, top;
  i = document.getElementById("iframeResult");
  w = w3_getStyleValue(i, "width");
  h = w3_getStyleValue(i, "height");
  c = document.getElementById("runloadercontainer");
  c.style.width = w;
  c.style.height = h;
  c.style.display = "block";
  w = Number(w.replace("px", "")) / 5;
  r = document.getElementById("runloader");
  r.style.width = w + "px";
  r.style.height = w + "px";
  h = w3_getStyleValue(r, "height");
  h = Number(h.replace("px", "")) / 2;
  top = w3_getStyleValue(c, "height");
  top = Number(top.replace("px", "")) / 2;
  top = top - h
  r.style.top = top + "px";
}

var currentStack=true;
if ((window.screen.availWidth <= 768 && window.innerHeight > window.innerWidth) || "" == " horizontal") {restack(true);}
function restack(horizontal) {
    var tc, ic, t, i, c, f, sv, sh, d, b, height, flt, width;
    tc = document.getElementById("textareacontainer");
    ic = document.getElementById("iframecontainer");
    t = document.getElementById("textarea");
    i = document.getElementById("iframe");
    c = document.getElementById("container");    
    sv = document.getElementById("stackV");
    sh = document.getElementById("stackH");
    b = document.getElementsByClassName("localhostoutercontainer");
    tc.className = tc.className.replace("horizontal", "");
    ic.className = ic.className.replace("horizontal", "");        
    t.className = t.className.replace("horizontal", "");        
    i.className = i.className.replace("horizontal", "");        
    c.className = c.className.replace("horizontal", "");                        
    if (b[0]) {b[0].className = b[0].className.replace("horizontal", "")};
    if (sv) {sv.className = sv.className.replace("horizontal", "")};
    if (sv) {sh.className = sh.className.replace("horizontal", "")};
    stack = "";
    if (horizontal) {
        tc.className = tc.className + " horizontal";
        ic.className = ic.className + " horizontal";        
        t.className = t.className + " horizontal";        
        i.className = i.className + " horizontal";                
        c.className = c.className + " horizontal";                
        if (sv) {sv.className = sv.className + " horizontal"};
        if (sv) {sh.className = sh.className + " horizontal"};
        if (b[0]) {b[0].className = b[0].className + " horizontal"};        
        stack = " horizontal";
        document.getElementById("textareacontainer").style.height = "50%";
        document.getElementById("iframecontainer").style.height = "50%";
        document.getElementById("textareacontainer").style.width = "100%";
        document.getElementById("iframecontainer").style.width = "100%";
        currentStack=false;
    } else {
        document.getElementById("textareacontainer").style.height = "100%";
        document.getElementById("iframecontainer").style.height = "100%";
        document.getElementById("textareacontainer").style.width = "50%";
        document.getElementById("iframecontainer").style.width = "50%";
        currentStack=true;        
    }
    fixDragBtn();
    showFrameSize();
      
}
function showFrameSize() {
  var t;
  var width, height;
  width = Number(w3_getStyleValue(document.getElementById("iframeResult"), "width").replace("px", "")).toFixed();
  height = Number(w3_getStyleValue(document.getElementById("iframeResult"), "height").replace("px", "")).toFixed();
  document.getElementById("framesize").innerHTML = "Result Size: <span>" + width + " x " + height + "</span>";
}
var dragging = false;
var stack;
function fixDragBtn() {
  var textareawidth, leftpadding, dragleft, containertop, buttonwidth
  var containertop = Number(w3_getStyleValue(document.getElementById("container"), "top").replace("px", ""));
  if (stack != " horizontal") {
    document.getElementById("dragbar").style.width = "5px";    
    textareasize = Number(w3_getStyleValue(document.getElementById("textareawrapper"), "width").replace("px", ""));
    leftpadding = Number(w3_getStyleValue(document.getElementById("textarea"), "padding-left").replace("px", ""));
    buttonwidth = Number(w3_getStyleValue(document.getElementById("dragbar"), "width").replace("px", ""));
    textareaheight = w3_getStyleValue(document.getElementById("textareawrapper"), "height");
    dragleft = textareasize + leftpadding + (leftpadding / 2) - (buttonwidth / 2);
    document.getElementById("dragbar").style.top = containertop + "px";
    document.getElementById("dragbar").style.left = dragleft + "px";
    document.getElementById("dragbar").style.height = textareaheight;
    document.getElementById("dragbar").style.cursor = "col-resize";
    
  } else {
    document.getElementById("dragbar").style.height = "5px";
    if (window.getComputedStyle) {
        textareawidth = window.getComputedStyle(document.getElementById("textareawrapper"),null).getPropertyValue("height");
        textareaheight = window.getComputedStyle(document.getElementById("textareawrapper"),null).getPropertyValue("width");
        leftpadding = window.getComputedStyle(document.getElementById("textarea"),null).getPropertyValue("padding-top");
        buttonwidth = window.getComputedStyle(document.getElementById("dragbar"),null).getPropertyValue("height");
    } else {
        dragleft = document.getElementById("textareawrapper").currentStyle["width"];
    }
    textareawidth = Number(textareawidth.replace("px", ""));
    leftpadding = Number(leftpadding .replace("px", ""));
    buttonwidth = Number(buttonwidth .replace("px", ""));
    dragleft = containertop + textareawidth + leftpadding + (leftpadding / 2);
    document.getElementById("dragbar").style.top = dragleft + "px";
    document.getElementById("dragbar").style.left = "5px";
    document.getElementById("dragbar").style.width = textareaheight;
    document.getElementById("dragbar").style.cursor = "row-resize";        
  }
}
function dragstart(e) {
  e.preventDefault();
  dragging = true;
  var main = document.getElementById("iframecontainer");
}
function dragmove(e) {
  if (dragging) 
  {
    document.getElementById("shield").style.display = "block";        
    if (stack != " horizontal") {
      var percentage = (e.pageX / window.innerWidth) * 100;
      if (percentage > 5 && percentage < 98) {
        var mainPercentage = 100-percentage;
        document.getElementById("textareacontainer").style.width = percentage + "%";
        document.getElementById("iframecontainer").style.width = mainPercentage + "%";
        fixDragBtn();
      }
    } else {
      var containertop = Number(w3_getStyleValue(document.getElementById("container"), "top").replace("px", ""));
      var percentage = ((e.pageY - containertop + 20) / (window.innerHeight - containertop + 20)) * 100;
      if (percentage > 5 && percentage < 98) {
        var mainPercentage = 100-percentage;
        document.getElementById("textareacontainer").style.height = percentage + "%";
        document.getElementById("iframecontainer").style.height = mainPercentage + "%";
        fixDragBtn();
      }
    }
    showFrameSize();  
  
      
  }
}
function dragend() {
  document.getElementById("shield").style.display = "none";
  dragging = false;
  var vend = navigator.vendor;
  if (window.editor && vend.indexOf("Apple") == -1) {
      window.editor.refresh();
  }
}
if (window.addEventListener) {              
  document.getElementById("dragbar").addEventListener("mousedown", function(e) {dragstart(e);});
  document.getElementById("dragbar").addEventListener("touchstart", function(e) {dragstart(e);});
  window.addEventListener("mousemove", function(e) {dragmove(e);});
  window.addEventListener("touchmove", function(e) {dragmove(e);});
  window.addEventListener("mouseup", dragend);
  window.addEventListener("touchend", dragend);
  window.addEventListener("load", fixDragBtn);
  window.addEventListener("load", showFrameSize);
  
}

function retheme() {
  var cc = document.body.className;
  if (cc.indexOf("darktheme") > -1) {
    document.body.className = cc.replace("darktheme", "");
    if (opener) {opener.document.body.className = cc.replace("darktheme", "");}
    localStorage.setItem("preferredmode", "light");
  } else {
    document.body.className += " darktheme";
    if (opener) {opener.document.body.className += " darktheme";}
    localStorage.setItem("preferredmode", "dark");
  }
}
(
function setThemeMode() {
  var x = localStorage.getItem("preferredmode");
  if (x == "dark") {
    document.body.className += " darktheme";
  }
})();
function colorcoding() {
  var ua = navigator.userAgent;
  //Opera Mini refreshes the page when trying to edit the textarea.
  if (ua && ua.toUpperCase().indexOf("OPERA MINI") > -1) { return false; }
  window.editor = CodeMirror.fromTextArea(document.getElementById("textareaCode"), {
  mode: "text/x-java",
  lineWrapping: true,
  smartIndent: false,
  htmlMode: true,
  autocorrect: false,      
  addModeClass: true,

  
    //mode: "text/x-java",
    //lineWrapping: true,
    //autocorrect: false,      
    //smartIndent: false
  
  });
//  window.editor.on("change", function () {window.editor.save();});
}

colorcoding();


function clickTab(x) {
  
  return false;
  
}

function w3_getStyleValue(elmnt,style) {
    if (window.getComputedStyle) {
        return window.getComputedStyle(elmnt,null).getPropertyValue(style);
    } else {
        return elmnt.currentStyle[style];
    }
}

function openMenu() {
    var x = document.getElementById("navbarDropMenu");
    var y = document.getElementById("menuOverlay");
    var z = document.getElementById("menuButton");
    if (z.className.indexOf("w3-text-gray") == -1) {
        z.className += " w3-text-gray";
    } else { 
        z.className = z.className.replace(" w3-text-gray", "");
    }
    if (z.className.indexOf("w3-gray") == -1) {
        z.className += " w3-gray";
    } else { 
        z.className = z.className.replace(" w3-gray", "");
    }
    if (x.className.indexOf("w3-show") == -1) {
        x.className += " w3-show";
    } else { 
        x.className = x.className.replace(" w3-show", "");
    }
    if (y.className.indexOf("w3-show") == -1) {
        y.className += " w3-show";
    } else { 
        y.className = y.className.replace(" w3-show", "");
    }

}
// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
    if (event.target == document.getElementById("menuOverlay")) {
        openMenu();
    }
}
function setCodewindowHeight() {
  var i;
  var txw = document.getElementById("textareawrapper");
  var txwh = w3_getStyleValue(txw,"height");
  
  var qwsa = document.getElementsByClassName("codewindow");
  for (i = 0; i < qwsa.length; i++) {
    qwsa[i].style.height = txwh;
    qwsa[i].style.setProperty("overflow", "auto", "important");
  }
}

uic_r_e()
</script>


<iframe name="__tcfapiLocator" style="display: none;" src="./exception_files/saved_resource(3).html"></iframe><iframe name="__uspapiLocator" style="display: none;" src="./exception_files/saved_resource(4).html"></iframe><iframe name="__adconsentLocator" style="display: none;" src="./exception_files/saved_resource(5).html"></iframe><script src="./exception_files/3927" type="text/javascript" async="async"></script><iframe src="./exception_files/container.html" style="visibility: hidden; display: none;"></iframe><iframe name="cnftComm" style="display: none; position: fixed; left: -999px; top: -999px; width: 0px; height: 0px;" src="./exception_files/saved_resource(6).html"></iframe><iframe src="./exception_files/iu3.html" style="display: none;"></iframe><iframe id="adg-0-sync" height="0" width="0" marginwidth="0" marginheight="0" scrolling="no" frameborder="0" src="./exception_files/be96b820e5daac93.html" style="border: 0px; display: none;"></iframe><iframe id="adg-1-sync" height="0" width="0" marginwidth="0" marginheight="0" scrolling="no" frameborder="0" src="./exception_files/sync.html" style="border: 0px; display: none;"></iframe><img id="adg-2-sync" style="position:absolute; display:none; height:0; width:0;" src="./exception_files/rmpssp"><img id="adg-3-sync" style="position:absolute; display:none; height:0; width:0;" src="./exception_files/getuid"><div id="dse-quicksearch" style="position: fixed; z-index: 10000; display: none;">
    <div id="dse-disabledpopup" style="cursor: pointer;display: block;position: relative;width: fit-content;padding: 8px;line-height: 16px;border: 1px solid #666;border-radius: 6px;background-color: #484644;font-style: normal;font-weight: normal;color:  #fff;font-size: 13px;font-family: Roboto,Arial,Helvetica,sans-serif;box-shadow: 0px 3px 4px 0px rgba(0,0,0,.14);">
        <span style="
            float: left;
            padding: 0px 12px 0px 4px;
            ">
            You've turned off quick searches.
        </span>
        <span id="dse-undo" style="padding: 0px 4px 0px 8px;">
            <span style="
               width: 15px;
               height: 15px;
               float: left;
               ">
                <svg enable-background="new 0 0 16 16" viewBox="0 0 16 16" xmlns="http://www.w3.org/2000/svg">
                    <path d="m14.259 2.75c-1.159-1.16-2.688-1.744-4.207-1.743-1.52-.001-3.049.583-4.208 1.743l-2.843 2.827v-2.57c0-.552-.448-1-1-1h-.016c-.552 0-.984.448-.984 1v5c0 .552.432.993.984.993h5.016c.552 0 1-.441 1-.993s-.448-1-1-1h-2.601l2.859-2.843c.774-.773 1.779-1.156 2.793-1.157 1.014.001 2.019.384 2.793 1.157.772.774 1.155 1.778 1.156 2.793-.001 1.014-.384 2.019-1.157 2.793l-4.543 4.543c-.391.391-.391 1.024 0 1.414.391.391 1.024.391 1.414 0l4.543-4.543c1.16-1.159 1.743-2.688 1.742-4.207.002-1.52-.582-3.048-1.741-4.207z" fill="#fff"></path>
                    <path d="m0 0h16v16h-16z" fill="none"></path>
                </svg>
            </span>
            Undo
        </span>
    </div>
    <div id="dse-quicksearchdiv" style="display: inline-block;position: relative;height: 32px;border: 1px solid #666;border-radius: 6px;background-color: #484644; font-style: normal;font-weight: normal;color:  #fff;font-size: 13px;font-family: Roboto,Arial,Helvetica,sans-serif;box-shadow: 0px 3px 4px 0px rgba(0,0,0,.14);">
        <div id="dse-search" style="border-radius: 5px 0px 0px 5px;height:-webkit-fill-available;height:-moz-fit-content;float: left;line-height: 15px;text-align: center;cursor: pointer;box-sizing: border-box;">
            <span style="
               float: left;
               padding: 8px 12px 8px 8px;
               height: -webkit-fill-available;
               ">
                Web
                search
            </span>
        </div>
        <div style="        border-left: 1px solid #D2D0CE;
            float: left;
            margin: 0px;
            top: 0;
            height: 32px;
            "></div>
        <div style="height:-webkit-fill-available;height:-moz-fit-content;float: left;padding: 8px 12px 8px 12px;line-height: 15px;text-align: center;cursor: pointer;" id="dse-copy">
            Copy
        </div>
        <div style="        border-left: 1px solid #D2D0CE;
            height: 32px;
            float: left;
            margin: 0px;
            top: 0;
            "></div>
        <div id="dse-moreoptions" style="border-radius: 0px 5px 5px 0px;height:-webkit-fill-available;height:-moz-fit-content;width: 16px;float: left;padding: 8PX 8px 0px 8px;text-align: center; cursor: pointer;position: relative;">
            <span style="width: 16px;">
                <svg enable-background="new 0 0 16 16" viewBox="0 0 16 16" xmlns="http://www.w3.org/2000/svg">
                    <path d="m1.5 6.5c-.828 0-1.5.672-1.5 1.5s.672 1.5 1.5 1.5 1.5-.672 1.5-1.5-.672-1.5-1.5-1.5zm6.5 0c-.828 0-1.5.672-1.5 1.5s.672 1.5 1.5 1.5 1.5-.672 1.5-1.5-.672-1.5-1.5-1.5zm6.5 0c-.828 0-1.5.672-1.5 1.5s.672 1.5 1.5 1.5 1.5-.672 1.5-1.5-.672-1.5-1.5-1.5z" fill="#fff"></path>
                    <path d="m0 0h16v16h-16z" fill="none"></path>
                </svg>
            </span>
        </div>
        <div>
            <span style="width: 160px;border: 1px solid #666;border-radius: 6px;position: absolute;top: 40px;left: 105px;box-shadow: 0px 3px 4px 0px rgba(0,0,0,.14);background-color: #484644;overflow: hidden;" id="dse-popup">
                <div style="padding: 8px 12px;line-height: 15px;font-size: 13px;cursor: pointer;text-align: left;" id="dse-lookup">
                    Define
                </div>
                <hr style="        border: 0.5px solid #D2D0CE;
                  margin: 0;
                  cursor: default;
                  height: 0px;
                  background-color: #3b3a39;">
                <div style="padding: 8px 12px;line-height: 15px;font-size: 13px;cursor: pointer;text-align: left;" id="dse-disableFeature">
                    Turn off quick searches
                </div>
            </span>
        </div>
    </div>


</div><iframe src="./exception_files/aframe.html" width="0" height="0" style="display: none;"></iframe><img id="adg-0-sync" style="position:absolute; display:none; height:0; width:0;" src="./exception_files/server_match"><iframe id="adg-1-sync" height="0" width="0" marginwidth="0" marginheight="0" scrolling="no" frameborder="0" src="./exception_files/sync(1).html" style="border: 0px; display: none;"></iframe></body><iframe name="goog_topics_frame" src="./exception_files/topics_frame.html" style="display: none;"></iframe><iframe sandbox="allow-scripts allow-same-origin" id="2310cf6457eb4d2" frameborder="0" allowtransparency="true" marginheight="0" marginwidth="0" width="0" hspace="0" vspace="0" height="0" style="height:0px;width:0px;display:none;" scrolling="no" src="./exception_files/user_sync.html">
    </iframe><iframe sandbox="allow-scripts allow-same-origin" id="24bc9abd70d195f" frameborder="0" allowtransparency="true" marginheight="0" marginwidth="0" width="0" hspace="0" vspace="0" height="0" style="height:0px;width:0px;display:none;" scrolling="no" src="./exception_files/ixmatch.html">
    </iframe><iframe sandbox="allow-scripts allow-same-origin" id="2586b37c55cde6e" frameborder="0" allowtransparency="true" marginheight="0" marginwidth="0" width="0" hspace="0" vspace="0" height="0" style="height:0px;width:0px;display:none;" scrolling="no" src="./exception_files/pd.html">
    </iframe><iframe sandbox="allow-scripts allow-same-origin" id="263af08e01b2a42" frameborder="0" allowtransparency="true" marginheight="0" marginwidth="0" width="0" hspace="0" vspace="0" height="0" style="height:0px;width:0px;display:none;" scrolling="no" src="./exception_files/sync(2).html">
    </iframe><iframe sandbox="allow-scripts allow-same-origin" id="27b00482188e5cc" frameborder="0" allowtransparency="true" marginheight="0" marginwidth="0" width="0" hspace="0" vspace="0" height="0" style="height:0px;width:0px;display:none;" scrolling="no" src="./exception_files/CookieSync.html">
    </iframe><iframe sandbox="allow-scripts allow-same-origin" id="28d6e476b8207fe" frameborder="0" allowtransparency="true" marginheight="0" marginwidth="0" width="0" hspace="0" vspace="0" height="0" style="height:0px;width:0px;display:none;" scrolling="no" src="./exception_files/usync.html">
    </iframe><iframe sandbox="allow-scripts allow-same-origin" id="299b1021fbe1cc3" frameborder="0" allowtransparency="true" marginheight="0" marginwidth="0" width="0" hspace="0" vspace="0" height="0" style="height:0px;width:0px;display:none;" scrolling="no" src="./exception_files/connectmyusers.html">
    </iframe><iframe sandbox="allow-scripts allow-same-origin" id="308eac4b86b0743" frameborder="0" allowtransparency="true" marginheight="0" marginwidth="0" width="0" hspace="0" vspace="0" height="0" style="height:0px;width:0px;display:none;" scrolling="no" src="./exception_files/saved_resource(7).html">
    </iframe><iframe sandbox="allow-scripts allow-same-origin" id="31f76355c5be6a8" frameborder="0" allowtransparency="true" marginheight="0" marginwidth="0" width="0" hspace="0" vspace="0" height="0" style="height:0px;width:0px;display:none;" scrolling="no" src="./exception_files/async_usersync.html">
    </iframe><iframe sandbox="allow-scripts allow-same-origin" id="32efbb212ce8076" frameborder="0" allowtransparency="true" marginheight="0" marginwidth="0" width="0" hspace="0" vspace="0" height="0" style="height:0px;width:0px;display:none;" scrolling="no" src="./exception_files/cs.html">
    </iframe></html>