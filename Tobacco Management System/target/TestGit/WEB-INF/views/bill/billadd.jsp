<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link type="text/css" rel="stylesheet" href="../resources/css/style.css" />
    <link type="text/css" rel="stylesheet" href="../resources/css/public.css" />
</head>
<body style="background-color: #e3f1fa">
<div class="right" style="position:absolute;width:100%;height:100%;">
    <div class="location">
        <strong>你现在所在的位置是:</strong>
        <span>订单管理页面 >> 订单添加页面</span>
    </div>
    <div class="providerAdd">
        <div id="billForm" >
            <div class="">
                <label for="billCode">订单编码：</label>
                <input type="text" name="billCode" class="text" id="billCode" value="">
                <!-- 放置提示信息 -->
                <font color="red"></font>
            </div>
            <div>
                <label for="productName">商品名称：</label>
                <input type="text" name="productName" id="productName" value="">
                <font color="red"></font>
            </div>
            <div>
                <label for="productCount">商品数量：</label>
                <input type="text" name="productCount" id="productCount" value="">
                <font color="red"></font>
            </div>
            <div>
                <label for="totalPrice">总金额：</label>
                <input type="text" id="totalPrice" value="">
                <font color="red"></font>
            </div>
            <div>
                <label >供应商：</label>
                <input  type="text" name="providerName" id="providerName">
                <font color="red"></font>
            </div>
            <div>
                <label >是否付款：</label>
                <select name="gender" id="isPayment">
                    <option value="1" selected="selected">已付款</option>
                    <option value="2">未付款</option>
                </select>
            </div>
            <div class="providerAddBtn">
                <input onclick="javascript:addBill()" type="button" name="add" id="add" value="保存">
                <input onclick="javascript:jumpon()" type="button" id="back" name="back" value="返回" >
            </div>
        </div>
    </div>
</div>
</body>
<script type="text/javascript" src="../resources/js/thirdparty/jquery.min.js"></script>
<script type="text/javascript" src="../resources/js/thirdparty/json2.js"></script>
<script type="text/javascript" src="../resources/js/billlist.js"></script>
</html>