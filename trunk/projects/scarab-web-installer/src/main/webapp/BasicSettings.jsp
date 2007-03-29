<%@ page language="java" import="java.util.Properties" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>

<fmt:setBundle basename="InstallBundle" />

<% Properties properties = (Properties) session.getAttribute("properties"); %>

<!DOCTYPE html PUBLIC "-//Tigris//DTD XHTML 1.0 Transitional//EN" "http://style.tigris.org/tigris_transitional.dtd">
<html>
 <head>
  <title><fmt:message key="scarab.installation" /></title>
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
     <th><fmt:message key="basic.settings" /></th>
     <td><a href="AdvancedSettings.jsp"><fmt:message key="advanced.settings" /></a></td>
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
         <a href="#"><fmt:message key="database.configuration" /></a>
        </div>
        <div>
         <a href="#"><fmt:message key="email.configuration" /></a>
        </div>
        <div>
         <a href="#"><fmt:message key="scarab.web.application" /></a>
        </div>
        <div>
         <a href="#"><fmt:message key="user.administration" /></a>
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
       <h2><fmt:message key="scarab.installation" />: <em><fmt:message key="basic.settings" /></em></h2>
      </div>
      
      <div class="functnbar">
       <form action="RestoreSettings" method="GET">
        <input type="submit" name="restoreSettings" value="<fmt:message key="restore.original.settings" />" />
       </form>
      </div>
       
      <div id="projecthome" class="app">
       <div id="axial" class="h3">
        <h3><fmt:message key="database.configuration" /></h3>
        <form action="SaveSettings" method="POST">
         <div class="axial">
          <table border="0" cellspacing="2" cellpadding="3">
           <tr>
            <th><fmt:message key="database.server.type" /></th>
            <td>
             <% String databaseType = properties.getProperty("scarab.database.type"); %>
             <select name="scarab.database.type" title="scarab.database.type">
              <option value="mysql" <% if ("mysql".equals(databaseType)) { %>selected="selected"<% } %>>
               <fmt:message key="database.type.mysql" />
              </option>
              <option value="postgresql" <% if ("postgresql".equals(databaseType)) { %>selected="selected"<% } %>>
               <fmt:message key="database.type.postgresql" />
              </option>
              <option value="oracle" <% if ("oracle".equals(databaseType)) { %>selected="selected"<% } %>>
               <fmt:message key="database.type.oracle" />
              </option>
              <option value="hypersonic" <% if ("hypersonic".equals(databaseType)) { %>selected="selected"<% } %>>
               <fmt:message key="database.type.hypersonic" />
              </option>
              <option value="mssql" <% if ("mssql".equals(databaseType)) { %>selected="selected"<% } %>>
               <fmt:message key="database.type.mssql" />
              </option>
              <option value="db2" <% if ("db2".equals(databaseType)) { %>selected="selected"<% } %>>
               <fmt:message key="database.type.db2" />
              </option>
             </select>             
            </td>
           </tr>
           <tr>
            <th><fmt:message key="scarab.database.host.th" /></th>
            <td>
             <input type="text" name="scarab.database.host" title="scarab.database.host"
                    value="<%= properties.getProperty("scarab.database.host") %>"
                    size="32" maxlength="64" /> 
             <p><fmt:message key="scarab.database.host.p" /></p>
            </td>
           </tr>
           <tr>
            <th><fmt:message key="scarab.database.port.th" /></th>
            <td>
             <input type="text" name="scarab.database.port" title="scarab.database.port"
                    value="<%= properties.getProperty("scarab.database.port") %>"
                    size="32" maxlength="64" /> 
             <p><fmt:message key="scarab.database.port.p" /></p>
            </td>
           </tr>
           <tr>
            <th><fmt:message key="scarab.database.name.th" /></th>
            <td>
             <input type="text" name="scarab.database.name" title="scarab.database.name"
                    value="<%= properties.getProperty("scarab.database.name") %>"
                    size="32" maxlength="64" /> 
             <p><fmt:message key="scarab.database.name.p" /></p>
            </td>
           </tr>
           <tr>
            <th><fmt:message key="scarab.database.username.th" /></th>
            <td>
             <input type="text" name="scarab.database.username" title="scarab.database.username"
                    value="<%= properties.getProperty("scarab.database.username") %>"
                    size="32" maxlength="64" /> 
             <p><fmt:message key="scarab.database.username.p" /></p>
            </td>
           </tr>
           <tr>
            <th><fmt:message key="scarab.database.password.th" /></th>
            <td>
             <input type="text" name="scarab.database.password" title="scarab.database.password"
                    value="<%= properties.getProperty("scarab.database.password") %>"
                    size="32" maxlength="64" /> 
             <p><fmt:message key="scarab.database.password.p" /></p>
             <p class="warningmark"><fmt:message key="scarab.database.password.warning" /></p>
            </td>
           </tr>
           <tr>
            <th><fmt:message key="scarab.database.admin.username.th" /></th>
            <td>
             <input type="text" name="scarab.database.admin.username"
                    title="scarab.database.admin.username"
                    value="<%= properties.getProperty("scarab.database.admin.username") %>"
                    size="32" maxlength="64" /> 
             <p><fmt:message key="scarab.database.admin.username.p" /></p>
             <p class="warningmark"><fmt:message key="scarab.database.admin.username.warning" /></p>
            </td>
           </tr>
           <tr>
            <th><fmt:message key="scarab.database.admin.password.th" /></th>
            <td>
             <input type="text" name="scarab.database.admin.password"
                    title="scarab.database.admin.password"
                    value="<%= properties.getProperty("scarab.database.admin.password") %>"
                    size="32" maxlength="64" /> 
             <p><fmt:message key="scarab.database.admin.password.p" /></p>
            </td>
           </tr>
           <tr>
            <th><fmt:message key="skip.seed.data.th" /></th>
            <td>
             <div>
              <input type="radio" name="skip.seed.data"
                     <% if ("false".equals(properties.getProperty("skip.seed.data"))) { %>checked="checked"<% } %> value="false"/>
                     <fmt:message key="skip.seed.data.false" />
             </div>
             <div>
              <input type="radio" name="skip.seed.data"
                     <% if ("true".equals(properties.getProperty("skip.seed.data"))) { %>checked="checked"<% } %>value="true" />
                     <fmt:message key="skip.seed.data.true" />
             </div>
            </td>
           </tr>
           <tr>
            <th><fmt:message key="skip.jira.templates.data.th" /></th>
            <td>
             <div>
              <input type="radio" name="skip.jira.templates.data"
                     <% if ("false".equals(properties.getProperty("skip.jira.templates.data"))) { %>checked="checked"<% } %> value="false"/>
                     <fmt:message key="skip.jira.templates.data.false" />
             </div>
             <div>
              <input type="radio" name="skip.jira.templates.data"
                     <% if ("true".equals(properties.getProperty("skip.jira.templates.data"))) { %>checked="checked"<% } %>value="true" />
                     <fmt:message key="skip.jira.templates.data.true" />
             </div>
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
        <h3><fmt:message key="email.configuration" /></h3>
        <form action="SaveSettings" method="POST">
         <div class="axial">
          <table border="0" cellspacing="2" cellpadding="3">
           <tr>
            <th><fmt:message key="system.mail.host.th" /></th>
            <td>
             <input type="text" name="system.mail.host"
                    value="<%= properties.getProperty("system.mail.host") %>"
                    size="32" maxlength="64" /> 
             <p><fmt:message key="system.mail.host.p" /></p>
            </td>
           </tr>
           <tr>
             <th><fmt:message key="smtp.authentication" /></th>
             <td>
               <p><fmt:message key="smtp.authentication.p" /></p>
               <p>
                 <fmt:message key="system.mail.smtp.user.p" />
                 <input type="text" name="system.mail.smtp.user"
                        value="<%= properties.getProperty("system.mail.smtp.user") %>"
                        size="32" maxlength="64" />
               </p>
               <p>
                 <fmt:message key="system.mail.smtp.pwd.p" />
                 <input type="text" name="system.mail.smtp.pwd"
                        value="<%= properties.getProperty("system.mail.smtp.pwd") %>"
                        size="32" maxlength="64" />
               </p>
             </td>
           </tr>
           <tr>
            <th><fmt:message key="scarab.email.default.fromName.th" /></th>
            <td>
             <input type="text" name="scarab.email.default.fromName"
                    value="<%= properties.getProperty("scarab.email.default.fromName") %>"
                    size="32" maxlength="64" /> 
             <p><fmt:message key="scarab.email.default.fromName.p" /></p>
             <p class="infomark"><fmt:message key="scarab.email.default.fromName.info" /></p>            
            </td>
           </tr>
           <tr>
            <th><fmt:message key="scarab.email.domain.th" /></th>
            <td>
             <input type="text" name="scarab.email.domain"
                    value="<%= properties.getProperty("scarab.email.domain") %>"
                    size="32" maxlength="64" /> 
             <p><fmt:message key="scarab.email.domain.p" /></p>
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
        <h3><fmt:message key="scarab.web.application" /></h3>
        <form action="SaveSettings" method="POST">
         <div class="axial">
          <table border="0" cellspacing="2" cellpadding="3">
           <tr>
            <th><fmt:message key="scarab.http.scheme.th" /></th>
            <td>
             <div>
              <input type="radio" name="scarab.http.scheme"
                     <% if ("http".equals(properties.getProperty("scarab.http.scheme"))) { %>checked="checked"<% } %> value="http"/> http
             </div>
             <div>
              <input type="radio" name="scarab.http.scheme"
                     <% if ("https".equals(properties.getProperty("scarab.http.scheme"))) { %>checked="checked"<% } %>value="https" /> https
             </div>
             <p><fmt:message key="scarab.http.scheme.p" /></p>
            </td>
           </tr>
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
            <th><fmt:message key="scarab.http.port.th" /></th>
            <td>
             <input type="text" name="scarab.http.port" title="scarab.http.port"
                    value="<%= properties.getProperty("scarab.http.port") %>"
                    size="5" maxlength="5" /> 
             <p><fmt:message key="scarab.http.port.p" /></p>
            </td>
           </tr>
           <tr>
            <th><fmt:message key="scarab.context.th" /></th>
            <td>
             <input type="text" name="scarab.context" title="scarab.context"
                    value="<%= properties.getProperty("scarab.context") %>"
                    size="32" maxlength="64" /> 
             <p><fmt:message key="scarab.context.p" /></p>
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
        <h3><fmt:message key="user.administration" /></h3>
        <form action="SaveSettings" method="POST">
         <div class="axial">
          <table border="0" cellspacing="2" cellpadding="3">
           <tr>
            <th><fmt:message key="password.administration" /></th>
            <td>
             <input type="checkbox" name="scarab.admin.password.reset.allowed"
                    title="scarab.admin.password.reset.allowed"
                    <% if ("true".equals(properties.getProperty("scarab.admin.password.reset.allowed"))) { %>checked="checked"<% } %>
                    value="true" />
             <fmt:message key="password.administration.p" />
            </td>
           </tr>
           <tr>
             <th><fmt:message key="scarab.login.password.expire.th" /></th>
             <td>
               <p>
                 <fmt:message key="scarab.login.password.expire.p1" />
                 <input type="text" name="scarab.login.password.expire" title="scarab.login.password.expire"
                        value="<%= properties.getProperty("scarab.login.password.expire") %>"
                        size="3" maxlength="5" /> 
                 <fmt:message key="scarab.login.password.expire.p2" />
               <p>
               <p class="infomark"><fmt:message key="scarab.login.password.expire.p" /></p>            
             <td>
           </tr>
           <tr>
            <th><fmt:message key="scarab.automatic.role.approval" /></th>
            <td>
             <p><fmt:message key="scarab.automatic.role.approval.p" /></p>
             <input type="text" name="scarab.automatic.role.approval" title="scarab.automatic.role.approval"
                    value="<%= properties.getProperty("scarab.automatic.role.approval") %>"
                    size="48" maxlength="128" /> 
            </td>
           </tr>
           <tr>
            <th><fmt:message key="scarab.anonymous.th" /></th>
            <td>
             <input type="checkbox" name="scarab.anonymous.enable"
                    title="scarab.anonymous.enable"
                    <% if ("true".equals(properties.getProperty("scarab.anonymous.enable"))) { %>checked="checked"<% } %>
                    value="true" />
             <fmt:message key="scarab.anonymous.enable.p" />
             <p><fmt:message key="scarab.anonymous.p" /></p>
             <fmt:message key="scarab.anonymous.username" />
             <input type="text" name="scarab.anonymous.username" title="scarab.anonymous.username"
                    value="<%= properties.getProperty("scarab.anonymous.username") %>"
                    size="32" maxlength="96" />
             <br />
             <fmt:message key="scarab.anonymous.rolename" />
             <input type="text" name="scarab.anonymous.rolename" title="scarab.anonymous.rolename"
                    value="<%= properties.getProperty("scarab.anonymous.rolename") %>"
                    size="32" maxlength="96" /> 
            </td>
           </tr>
          </table>
         </div>
         <div class="functnbar3">
          <input type="submit" name="f" value="<fmt:message key="submit" />" /> <input type="hidden" name="redirect" value="BasicSettings.jsp" />
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

