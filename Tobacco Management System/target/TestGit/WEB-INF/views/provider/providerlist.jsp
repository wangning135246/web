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
        <span>供应商管理页面</span>
    </div>

    <div class="search">
        <div >
            <span>供应商编码：</span>
            <input placeholder="请输入内容" id="proCode" type="text" value="">

            <span>供应商名称：</span>
            <input placeholder="请输入内容" id="proName" type="text" value="">

            <input onclick="javascript:selectProviderList()" value="查 询" type="submit" id="searchbutton">
            <a onclick="javascript:addProviderUrl()">添加供应商</a>
        </div>
    </div>
    <!--供应商操作表格-->
    <table class="providerTable" cellpadding="0" cellspacing="0">
        <thead>
        <tr class="firstTr">
            <th width="10%">供应商编码</th>
            <th width="20%">供应商名称</th>
            <th width="20%">联系电话</th>
            <th width="20%">创建时间</th>
            <th width="30%">操作</th>
        </tr>
        </thead>
        <tbody id="content">
        </tbody>
    </table>
</div>

</body>
<script type="text/javascript" src="../resources/js/thirdparty/jquery.min.js"></script>
<script type="text/javascript" src="../resources/js/thirdparty/json2.js"></script>
<script type="text/javascript" src="../resources/js/providerjs.js"></script>
</html>