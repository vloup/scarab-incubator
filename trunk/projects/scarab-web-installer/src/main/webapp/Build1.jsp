<%@ page language="java" import="java.util.Properties" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>

<fmt:setBundle basename="InstallBundle" />

<% Properties properties = (Properties) session.getAttribute("properties"); %>

<!DOCTYPE html PUBLIC "-//Tigris//DTD XHTML 1.0 Transitional//EN" "http://style.tigris.org/tigris_transitional.dtd">
<html>
 <head>
  <title>Scarab installation</title>
  <meta http-equiv="Content-type" content="text/html; charset=UTF-8" />
  <link rel="shortcut icon" href="images/favicon.ico" type="image/x-icon" />
  <link rel="icon" type="image/x-icon" href="images/favicon.ico" />
    <style type="text/css">
  @import url(css/tigris.css);
  @import url(css/inst.css);
  @import url(css/scarab.css);
  </style>
  <link rel="stylesheet" type="text/css" href="css/print.css" media="print" />
 </head>
 <body onload="focus()" marginwidth="0" marginheight="0" class="composite">
  <div id="banner">
   <table border="0" cellspacing="0" cellpadding="8" width="100%">
    <tr>
     <td>
      <img src="images/logo.gif" alt="Scarab" width="118" height="23" border="0" />
     </td>
    </tr>
   </table>
  </div>
  <div class="tabs" id="toptabs">
   <table cellpadding="4" cellspacing="0" border="0">
    <tr>
     <td><a href="BasicSettings.jsp"><fmt:message key="basic.settings" /></a></td>
     <td><a href="AdvancedSettings.jsp"><fmt:message key="advanced.settings" /></a></td>
     <th><fmt:message key="building.scarab" /></th>
    </tr>
   </table>
  </div>
  <table border="0" cellspacing="0" cellpadding="4" width="100%" id="main">
   <tr valign="top">
    <td id="leftcol" width="20%">
     <div id="navcolumn">
      <%@ include file="HelpToolBar.jsp" %>  
     </div>
     <div class="strut">&nbsp;</div>
    </td>
    <td>
     <div id="bodycol">
      <div id="apphead">
       <h2><fmt:message key="building.scarab" /></h2>
      </div>
      <div id="projecthome" class="app">
       <c:import url="/BuildScarabServlet" />
      </div>
      
      <div class="functnbar2">
       <form action="Build2" method="GET">
        <input type="submit" name="buildDatabase" value="<fmt:message key="build.scarab.database" />" />
       </form>
      </div>
     </div>
    </td>
   </tr>
  </table>
  <%@ include file="Footer.jsp" %>
 </body>
</html>
