<%--
  Created by IntelliJ IDEA.
  User: lab
  Date: 16-1-15
  Time: 下午9:24
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Home</title>
</head>
<body>
<div align="center">
    <h1>Contact List</h1>
    <table border="1">
        <th>No</th>
        <th>Username</th>
        <th>Email</th>

        <c:forEach var="user" items="${userList}" varStatus="status">
            <tr>
                <td>${status.index + 1}</td>
                <td>${user.name}</td>
                <td>${user.grade}</td>

            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>