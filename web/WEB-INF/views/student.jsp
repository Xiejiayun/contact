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
    <title>通讯录主界面</title>
    <link rel="stylesheet" href="resources/css/bootstrap.css" />
</head>
<body>
<div align="center">
    <h1>Contact List</h1>
    <table border="1">
        <th>序号</th>
        <th>名字</th>
        <th>年级</th>
        <c:forEach var="user" items="${userList}" varStatus="status">
            <tr>
                <td>${status.index + 1}</td>
                <td>${user.name}</td>
                <td>${user.grade}</td>

            </tr>
        </c:forEach>
    </table>
</div>
<script type="text/javascript" src="resources/js/bootstrap.js" />
<script type="text/javascript" src="resources/js/jquery-1.12.0.js" />
</body>
</html>
