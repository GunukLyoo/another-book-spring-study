<%--
  Created by IntelliJ IDEA.
  User: Gunuk R Lyoo
  Date: 2023-09-18
  Time: 오후 11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Todo List</title>
</head>
<body>
<h1>Todo List</h1>

<ul>
    <c:forEach items="${dtoList}" var="dto">
        <li>${dto}</li>
    </c:forEach>
</ul>

</body>
</html>
