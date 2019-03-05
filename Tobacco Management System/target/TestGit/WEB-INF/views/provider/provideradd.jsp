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
            <span>供应商管理页面 >> 供应商添加页面</span>
        </div>
        <div class="providerAdd">
                <!--div的class 为error是验证错误，ok是验证成功-->
                <div class="">
                    <label for="proCode">供应商编码：</label>
                    <input type="text" name="proCode" id="proCode" value=""> 
					<!-- 放置提示信息 -->
					<font color="red"></font>
                </div>
                <div>
                    <label for="proName">供应商名称：</label>
                   <input type="text" name="proName" id="proName" value=""> 
					<font color="red"></font>
                </div>
                <div>
                    <label for="proPhone">联系电话：</label>
                    <input type="text" name="proPhone" id="proPhone" value=""> 
					<font color="red"></font>
                </div>
                <div>
                    <label for="proAddress">联系地址：</label>
                    <input type="text" name="proAddress" id="proAddress" value=""> 
                </div>
                <div class="providerAddBtn">
                    <input onclick="javascript:addProvider()" type="button" name="add" id="add" value="保存">
                    <input onclick="javascript:jumpon()" type="button" id="back" name="back" value="返回" >
                </div>
     </div>
</div>
</body>
<script type="text/javascript" src="../resources/js/thirdparty/jquery.min.js"></script>
<script type="text/javascript" src="../resources/js/thirdparty/json2.js"></script>
<script type="text/javascript" src="../resources/js/providerjs.js"></script>
</html>
