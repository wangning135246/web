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
		<span>用户管理页面</span>
	</div>
            <div class="search">
					 <span>用户名：</span>
					 <input id="userName" class="input-text"	type="text" >
					 <input  onclick="javascript:selectUserList()" 	value="查 询" type="submit" id="searchbutton">
					 <a onclick="javascript:addUserUrl()" >添加用户</a>
				</form>
            </div>
            <!--用户-->
            <table class="providerTable" cellpadding="0" cellspacing="0">
                <tr class="firstTr">
                    <th width="15%">用户账号</th>
                    <th width="15%">用户名称</th>
                    <th width="15%">性别</th>
					 <th width="20%">用户地址</th>
                    <th width="15%">电话</th>
                    <th width="20%">操作</th>
                </tr>
				<tbody id="content">

				</tbody>
			</table>
        </div>
</body>
<script type="text/javascript" src="../resources/js/thirdparty/jquery.min.js"></script>
<script type="text/javascript" src="../resources/js/thirdparty/json2.js"></script>
<script type="text/javascript" src="../resources/js/userjs.js"></script>
</html>
