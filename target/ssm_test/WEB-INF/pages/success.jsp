<%--
  Created by IntelliJ IDEA.
  User: 靳明
  Date: 2020/5/6
  Time: 17:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>查询成功</h1>
<c:forEach items="${list}" var="account">
    <h3>${account.id}</h3>
    <h3>${account.name}</h3>
    <h3>${account.money}</h3>
</c:forEach>
</body>
</html>
