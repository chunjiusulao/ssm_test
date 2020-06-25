<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" %>
<%@ include file="../utilpage/taglibs.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="SHORTCUT ICON" href="${ctx }/static/assets_admin/img/icon.png"/>
<title><%--<%= Const.ADMIN_TITLE%>--%></title>
</head>

<frameset rows="45,*" cols="*" frameborder="no" border="0" framespacing="0">
  <frame src="${ctx}/admin/top?userName=${userName}" name="top" scrolling="no" noresize="noresize" id="top" title="top" />
  <frameset cols="190,*" frameborder="no" border="0" framespacing="0">
    <frame src="${ctx}/admin/menu" name="menu" scrolling="auto" noresize="noresize" id="menu" title="menu" />
    <frame src="${ctx}/admin/main" name="main" id="main" title="main" />
  </frameset>
</frameset>
<noframes>
<body>
您的浏览器不支持HTML框架，请升级浏览器。
</body>
</noframes>
</html>
