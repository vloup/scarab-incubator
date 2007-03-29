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
     <th><fmt:message key="advanced.settings" /></th>
    </tr>
   </table>
  </div>
  <table border="0" cellspacing="0" cellpadding="4" width="100%" id="main">
   <tr valign="top">
    <td id="leftcol" width="20%">
     <div id="navcolumn">
      <div id="projecttools" class="toolgroup">
       <div class="label">
        <strong><fmt:message key="in.this.page" /></strong>
       </div>
       <div class="body">
        <div>
         <a href="#"><fmt:message key="advanced.database.configuration" /></a>
        </div>
        <div>
         <a href="#"><fmt:message key="storage.configuration" /></a>
        </div>
        <div>
         <a href="#"><fmt:message key="site.decoration" /></a>
        </div>
       </div>
      </div>
      <%@ include file="HelpToolBar.jsp" %>  
     </div>
     <div class="strut">&nbsp;</div>
    </td>
    <td>
     <div id="bodycol">
      <div id="apphead">
       <h2><fmt:message key="scarab.installation" />: <em><fmt:message key="advanced.settings" /></em></h2>
      </div>
      <div id="projecthome" class="app">
      
      <div class="functnbar">
       <form action="RestoreSettings" method="GET">
        <input type="submit" name="restoreSettings" value="<fmt:message key="restore.original.settings" />" />
       </form>
      </div>
       
       <div id="axial" class="h3">
        <h3><fmt:message key="advanced.database.configuration" /></h3>
        <form action="#" method="get">
         <div class="axial">
          <table border="0" cellspacing="2" cellpadding="3">
           <tr>
            <th><fmt:message key="scarab.database.url" /></th>
            <td>
             <input type="text" name="scarab.database.url"
                    value="<%= properties.getProperty("scarab.database.url") %>"
                    size="64" maxlength="128" /> 
            </td>
           </tr>
           <tr>
            <th><fmt:message key="scarab.database.admin.url" /></th>
            <td>
             <input type="text" name="scarab.database.admin.url"
                    value="<%= properties.getProperty("scarab.database.admin.url") %>"
                    size="64" maxlength="128" /> 
            </td>
           </tr>
           <tr>
            <th><fmt:message key="scarab.database.url.extension" /></th>
            <td>
             <input type="text" name="scarab.database.url.extension"
                    value="<%= properties.getProperty("scarab.database.url.extension") %>"
                    size="64" maxlength="128" /> 
            </td>
           </tr>
           <tr>
            <th><fmt:message key="scarab.database.pool.validationQuery" /></th>
            <td>
             <input type="text" name="scarab.database.pool.validationQuery"
                    value="<%= properties.getProperty("scarab.database.pool.validationQuery") %>"
                    size="64" maxlength="128" /> 
            </td>
           </tr>
           <tr>
            <th><fmt:message key="scarab.database.jdbc.driver" /></th>
            <td>
             <input type="text" name="scarab.database.jdbc.driver"
                    value="<%= properties.getProperty("scarab.database.jdbc.driver") %>"
                    size="64" maxlength="128" /> 
            </td>
           </tr>
           <tr>
            <th><fmt:message key="scarab.database.jdbc.driver.jar" /></th>
            <td>
             <input type="text" name="scarab.database.jdbc.driver.jar"
                    value="<%= properties.getProperty("scarab.database.jdbc.driver.jar") %>"
                    size="64" maxlength="64" /> 
            </td>
           </tr>
           <tr>
            <th><fmt:message key="scarab.jdbc.handler.th" /></th>
            <td>
             <input type="text" name="scarab.jdbc.handler"
                    value="<%= properties.getProperty("scarab.jdbc.handler.th") %>"
                    size="64" maxlength="128" /> 
             <p><fmt:message key="advanced.database.configuration.p" /></p>
            </td>
           </tr>
          </table>
         </div>
         <div class="functnbar3">
          <input type="submit" name="f" value="<fmt:message key="submit" />" />  <input type="hidden" name="redirect" value="AdvancedSettings.jsp" />
         </div>
        </form>
       </div>
       
       <div id="axial" class="h3">
        <h3><fmt:message key="storage.configuration" /></h3>
        <form action="SaveSettings" method="POST">
         <div class="axial">
          <table border="0" cellspacing="2" cellpadding="3">
           <tr>
            <th><fmt:message key="scarab.attachments.repository.th" /></th>
            <td>
             <input type="text" name="scarab.attachments.repository" title="scarab.attachments.repository"
                    value="<%= properties.getProperty("scarab.attachments.repository") %>"
                    size="64" maxlength="256" /> 
             <p><fmt:message key="scarab.attachments.repository.p" /></p>
            </td>
           </tr>
           <tr>
            <th><fmt:message key="scarab.attachment.remove.permanent" /></th>
            <td>
             <input type="checkbox" name="scarab.attachment.remove.permanent"
                    title="scarab.attachment.remove.permanent"
                    <% if ("true".equals(properties.getProperty("scarab.attachment.remove.permanent"))) { %>checked="checked"<% } %>
                    value="true" />
             <fmt:message key="scarab.attachment.remove.permanent.p" />
            </td>
           </tr>
           <tr>
            <th><fmt:message key="services.UploadService.repository.th" /></th>
            <td>
             <input type="text" name="services.UploadService.repository" title="services.UploadService.repository"
                    value="<%= properties.getProperty("services.UploadService.repository") %>"
                    size="64" maxlength="256" /> 
             <p><fmt:message key="services.UploadService.repository.p" /></p>
            </td>
           </tr>
           <tr>
            <th><fmt:message key="searchindex.path.th" /></th>
            <td>
             <input type="text" name="searchindex.path" title="searchindex.path"
                    value="<%= properties.getProperty("searchindex.path") %>"
                    size="64" maxlength="256" /> 
             <p><fmt:message key="searchindex.path.p" /></p>
            </td>
           </tr>
          </table>
         </div>
         <div class="functnbar3">
          <input type="submit" name="f" value="<fmt:message key="submit" />" /> <input type="hidden" name="redirect" value="BasicSettings.jsp" />
         </div>
        </form>
       </div>

       <div id="axial" class="h3">
        <h3><fmt:message key="site.decoration" /></h3>
        <form action="SaveSettings" method="POST">
         <div class="axial">
          <table border="0" cellspacing="2" cellpadding="3">
           <tr>
            <th><fmt:message key="scarab.http.domain.th" /></th>
            <td>
             <input type="text" name="scarab.http.domain" title="scarab.http.domain"
                    value="<%= properties.getProperty("scarab.http.domain") %>"
                    size="32" maxlength="64" />
             <p><fmt:message key="scarab.http.domain.p" /></p>
            </td>
           </tr>
           <tr>
            <th><fmt:message key="scarab.site.logo.th" /></th>
            <td>
             <input type="text" name="scarab.site.logo" title="scarab.site.logo"
                    value="<%= properties.getProperty("scarab.site.logo") %>"
                    size="32" maxlength="32" /> 
             <p><fmt:message key="scarab.site.logo.p" />
             </p>
            </td>
           </tr>
          </table>
         </div>
         <div class="functnbar3">
          <input type="submit" name="f" value="<fmt:message key="submit" />" /> <input type="hidden" name="redirect" value="AdvancedSettings.jsp" />
         </div>
        </form>
       </div>

      </div>
      <div class="functnbar2">
       <form action="Build1" method="GET">
        <input type="submit" name="buildScarab" value="<fmt:message key="build.scarab" />" />
       </form>
      </div>
     </div>
    </td>
   </tr>
  </table>
  <%@ include file="Footer.jsp" %>
 </body>
</html>
