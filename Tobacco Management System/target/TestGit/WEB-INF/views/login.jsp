
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head >
    <meta charset="UTF-8">
    <title>登录页</title>
    <link  rel="stylesheet" href="../resources/css/style.css" />
    <link rel="stylesheet" href="../resources/css/public.css" />
</head>

<body class="login_bg">
<div class="loginBox" >
    <header class="loginHeader">
        <h1>烟草管理系统</h1>
    </header>
    <div class="loginCont">
        <div class="loginForm">
            <div class="inputbox">
                <span >账号：</span>
                <input type="text" class="input-text" id="userEmail" name="userCode" placeholder="请输入用户名" required/>
            </div>
            <div class="inputbox">
                <span >密码：</span>
                <input type="password" id="userPassword" name="password" placeholder="请输入密码" required/>
            </div>
            <div class="subBtn">
                <a href="javascript:login();" >
                    <input type = "submit" value = "登录"/>
                </a>
                <input onclick="javascript:reset()" type="reset" value="重置"/>
            </div>
        </div>
    </div>
</div>
</body>
<script type="text/javascript" src="../resources/js/thirdparty/jquery.min.js"></script>
<script type="text/javascript" src="../resources/js/login.js"></script>
</html>
