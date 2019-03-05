<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>烟草管理系统</title>
    <link type="text/css" rel="stylesheet" href="../resources/css/style.css" />
    <link type="text/css" rel="stylesheet" href="../resources/css/public.css" />
    <script type="text/javascript" src="../resources/js/thirdparty/jquery.min.js"></script>
    <script type="text/javascript" src="../resources/js/billlist.js"></script>
</head>
<body>
<!--头部-->
<div class="publicHeader">
    <h1>烟草管理系统</h1>
    <div class="publicHeaderR">
        尊敬的管理员：<span style="color: #fff21b" id="userName">${userName}</span> , 欢迎您！
        <a href="http://localhost:8080/userLogin/index">退出</a>
    </div>
</div>
<!--主体内容-->
<div class="publicMian ">
    <div class="left">
        <h2 class="leftH2"><span class="span1"></span>功能列表 <span></span></h2>
        <nav>
            <ul class="list">
                <li ><a onclick="GetUrl(1)">订单管理</a></li>
                <li><a onclick="GetUrl(2)">供应商管理</a></li>
                <li><a onclick="GetUrl(3)">用户管理</a></li>
                <li><a onclick="javascript:GetUrl(4)">密码修改</a></li>
                <li><a href="http://localhost:8080/userLogin/index">退出系统</a></li>
            </ul>
        </nav>
    </div>

    <iframe type = "hidden" width="1500" height="700" id="Box" frameborder="1" scrolling="0"></iframe>

</div>

</body>

</html>