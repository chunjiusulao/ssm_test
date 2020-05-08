<%--
  Created by IntelliJ IDEA.
  User: 靳明
  Date: 2020/5/6
  Time: 17:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/account/findAll">测试查询</a>
<h1>测试保存</h1>
<form action="/account/save" method="post">
    <input type="text" name="name">
    <input type="text" name="money">
    <input type="submit" value="提交">
</form>
</body>
</html>
