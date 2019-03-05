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
            <span>用户管理页面 >> 用户修改页面</span>
        </div>
        <div class="providerAdd">
			<input type="hidden" id="id" value=${id }>
			 <div>
                    <label for="userName">用户名称：</label>
                    <input type="text" name="userName" id="userName" value=${userName }>
					<font color="red"></font>
             </div>
		       <div>
                    <label for="userphone">用户电话：</label>
                    <input type="text" name="phone" id="userPhone" value=${userPhone }>
                    <font color="red"></font>
               </div>
            <div>
                <label >用户性别：</label>
                <select name="gender" id="sex">
                    <option value="0" selected="selected">男</option>
                    <option value="1">女</option>
                </select>
            </div>
                <div>
                    <label for="userAddress">用户地址：</label>
                    <input type="text" name="address" id="userAddress" value=${userAddress }>
                </div>
			 <div class="providerAddBtn">
                 <input  onclick="javascript:modifyUser()" type="button" name="add" id="add" value="保存" >
                 <input onclick="javascript:jumpon()" type="button" id="back" name="back" value="返回" >
                </div>
        </div>
    </div>
</body>
<script type="text/javascript" src="../resources/js/thirdparty/jquery.min.js"></script>
<script type="text/javascript" src="../resources/js/thirdparty/json2.js"></script>
<script type="text/javascript" src="../resources/js/userjs.js"></script>
</html>
