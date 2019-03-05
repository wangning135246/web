<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>修改页面</title>
    <link type="text/css" rel="stylesheet" href="../resources/css/style.css" />
    <link type="text/css" rel="stylesheet" href="../resources/css/public.css" />
</head>
<body style="background-color: #e3f1fa">
<div class="right">
    <div class="location">
        <strong>你现在所在的位置是:</strong>
        <span>订单管理页面 >> 订单修改页面</span>
    </div>
    <div class="providerAdd">
        <div >
            <input type="hidden" id="id" value=${id }>
            <!--div的class 为error是验证错误，ok是验证成功-->
            <div >
                <label for="billCode">订单编码：</label>
                <input type="text" name="billCode" id="billCode" value=${billCode} readonly="readonly">
            </div>
            <div>
                <label for="productName">商品名称：</label>
                <input type="text" name="productName" id="productName" value=${productName}>
                <font color="red"></font>
            </div>
            <div>
                <label for="productCount">商品数量：</label>
                <input type="text" name="productCount" id="productCount" value=${productCount}>
                <font color="red"></font>
            </div>
            <div>
                <label for="totalPrice">总金额：</label>
                <input type="text" name="totalPrice" id="totalPrice" value=${totalPrice}>
                <font color="red"></font>
            </div>
            <div>
                <label >供应商：</label>
                <input  type="text" name="providerName" id="providerName" value=${proName}>
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
                <input onclick="javascript:modifyBill();" type="button" name="save" id="save" value="保存">
                <input onclick="javascript:jumpon();" type="button" id="back" name="back" value="返回" >
            </div>
        </div>
    </div>
</div>
</body>
<script type="text/javascript" src="../resources/js/thirdparty/jquery.min.js"></script>
<script type="text/javascript" src="../resources/js/thirdparty/json2.js"></script>
<script type="text/javascript" src="../resources/js/billlist.js"></script>

</html>