<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/6/9
  Time: 22:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>展示所有用户信息</title>
</head>
<body>
<h1>展示用户列表</h1>
<c:forEach items="${requestScope.users}" var="user">
    ${user.id} == ${user.name} == ${user.age} == ${user.bir} <br>
</c:forEach>

<a href="${pageContext.request.contextPath}/insertUser.jsp">
    点我插入一个用户
</a>
</body>
</html>
