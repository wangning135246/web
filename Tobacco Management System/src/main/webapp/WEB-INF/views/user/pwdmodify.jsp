<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>供应商查看页</title>
    <link type="text/css" rel="stylesheet" href="../resources/css/style.css" />
    <link type="text/css" rel="stylesheet" href="../resources/css/public.css" />
</head>
<body style="background-color: #e3f1fa">

<div class="right" style="position:absolute;width:100%;height:100%;">
            <div class="location">
                <strong>你现在所在的位置是:</strong>
                <span>密码修改页面</span>
            </div>
    <input id = "userName" type="hidden" value=${userName}>
            <div class="providerAdd">

                    <div class="">
                        <label for="oldPassword">旧密码：</label>
                        <input type="password" name="oldpassword" id="oldpassword" value=""> 
						<font color="red"></font>
                    </div>
                    <div>
                        <label for="newPassword">新密码：</label>
                        <input type="password" name="newpassword" id="newpassword" value=""> 
						<font color="red"></font>
                    </div>
                    <div>
                        <label >确认新密码：</label>
                        <input type="password" name="rnewpassword" id="rnewpassword" value=""> 
						<font color="red"></font>
                    </div>
                    <div class="providerAddBtn">
                        <!--<a href="#">保存</a>-->
                        <input onclick="javascript:pwdModifyUser()" type="button" name="save" id="save" value="保存" class="input-button">
                    </div>
            </div>
        </div>
</body>
<script type="text/javascript" src="../resources/js/thirdparty/jquery.min.js"></script>
<script type="text/javascript" src="../resources/js/thirdparty/json2.js"></script>
<script type="text/javascript" src="../resources/js/userjs.js"></script>
</html>