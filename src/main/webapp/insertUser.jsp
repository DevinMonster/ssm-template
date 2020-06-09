<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Devin
  Date: 2020/6/9
  Time: 22:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>插入用户信息</title>
</head>
<body>
<h1>插入用户</h1>
<form action="${pageContext.request.contextPath}/user/insertUser" method="post">
    姓名：<input name="name"/> <br>
    年龄：<input name="age"/> <br>
    生日：<input name="bir"/> <br>
    <input type="submit" value="保存信息">
</form>
</body>
</html>
