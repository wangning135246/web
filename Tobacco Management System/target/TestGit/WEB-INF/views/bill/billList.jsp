<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>烟草管理系统</title>
    <link type="text/css" rel="stylesheet" href="../resources/css/style.css" />
    <link type="text/css" rel="stylesheet" href="../resources/css/public.css" />
</head>


<body style="background-color: #e3f1fa">

<div class="right" style="position:absolute;width:100%;height:100%;">
    <div class="location">
        <strong>你现在所在的位置是:</strong>
        <span>订单管理页面</span>
    </div>
    <div class="search">
            <span>商品名称：</span>
            <input placeholder="请输入内容" id="productName" type="text" value="">
        <span  >是否付款：
        <select id = "isPayment">
            <option value="">--请选择--</option>
            <option value="1">已付款</option>
            <option value="2">未付款</option>
        </select>
        </span>
            <input onclick="javascript:selectBillList()" value="查 询" type="submit" id="searchbutton">
            <a onclick="addGetUrl()">添加订单</a>
    </div>
    <!--账单表格 样式和供应商公用-->
    <table class="providerTable" cellpadding="0" cellspacing="0">
        <thead>
        <tr class="firstTr">
            <th width="10%">订单编码</th>
            <th width="15%">商品名称</th>
            <th width="15%">供应商</th>
            <th width="10%">订单金额</th>
            <th width="10%">是否付款</th>
            <th width="15%">创建时间</th>
            <th width="25%">操作</th>
        </tr>
        </thead>
        <tbody id="content">
        </tbody>
    </table>
</div>

</body>
<script type="text/javascript" src="../resources/js/thirdparty/jquery.min.js"></script>
<script type="text/javascript" src="../resources/js/thirdparty/json2.js"></script>
<script type="text/javascript" src="../resources/js/billlist.js"></script>
</html>
