<%--
  Created by IntelliJ IDEA.
  User: lab
  Date: 16-1-15
  Time: 下午9:24
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>通讯录主界面</title>
    <link rel="stylesheet" href="resources/css/bootstrap.css"/>
    <link rel="stylesheet" href="resources/css/base.css"/>
</head>
<body>
<nav class="navbar navbar-inverse">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                    aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">简易通讯录</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li><a href="base.do">主页</a></li>
                <li class="active"><a href="student.do">通讯录</a></li>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</nav>
<div class="container">
    <div class="panel panel-primary">
        <!-- Default panel contents -->
        <div class="panel-heading">新增联系人<span class="glyphicon glyphicon-plus" aria-hidden="true"
                                              style="float: right"></span></div>
        <div class="panel-body addcontact">
            <table>
                <div class="input-group">
                    <span class="input-group-addon">姓名</span>
                    <input type="text" class="form-control" name="username" placeholder="Username">
                </div>
                <div class="input-group">
                    <span class="input-group-addon">性别</span>
                    <input type="text" class="form-control" name="gender" placeholder="Gender">
                </div>
                <div class="input-group">
                    <span class="input-group-addon">年级</span>
                    <input type="text" class="form-control" name="grade" placeholder="Grade">
                </div>
                <div class="input-group">
                    <span class="input-group-addon">电话</span>
                    <input type="text" class="form-control" name="phone" placeholder="Phone">
                </div>
                <button type="button" class="btn btn-default" id="savecontact">保存</button>
                <div id="alert"></div>
            </table>

        </div>
    </div>
    <div class="panel panel-primary">
        <!-- Default panel contents -->
        <div class="panel-heading">查看联系人</div>
        <div class="panel-body">
            <!-- Table -->
            <table class="table">
                <th>序号</th>
                <th>名字</th>
                <th>年级</th>
                <th>操作</th>
                <c:forEach var="user" items="${userList}" varStatus="status">
                    <tr class="datarow" data-stuid="${user.stuid}">
                        <td>${status.index + 1}</td>
                        <td>${user.name}</td>
                        <td>${user.grade}</td>
                        <td><a class= "modify" data-stuid="${user.stuid}" href="javascript:void(0)">修改</a><a class= "delete" data-stuid="${user.stuid}" href="javascript:void(0)">删除</a></td>
                    </tr>
                </c:forEach>
            </table>
        </div>

    </div>
</div>
<div class="alert alert-warning alert-dismissible" role="alert">
    <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
    <strong>Warning!</strong> Better check yourself, you're not looking too good.
</div>
</body>
<script type="text/javascript" src="resources/js/jquery-1.12.0.js"></script>
<script type="text/javascript" src="resources/js/bootstrap.js"></script>
<script type="text/javascript" src="resources/js/base.js"></script>
</html>
