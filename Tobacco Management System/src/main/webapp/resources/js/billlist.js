/**
 * 这是查询信息的方法
 */
function selectBillList(){
    var dom = document.getElementById("isPayment");
    var isPayment = dom.selectedIndex;
    $.ajax({
        url: '/billList/selectBillList',
        type: 'post',
        cache: false,
        data: {
            "productName":$("#productName").val(),
            "isPayment":isPayment
        },
        dataType: 'json',
        success: function (data) {
            insertHtml(data.data);
        },
        error: function (data) {
            alert("服务器异常！！！");
        }
    });
}
/**
 * 填充时间的页面信息
 * @param data
 * @returns
 */
function insertHtml(data){
    $("#content").html("");
    if(data == null || data.length == 0){
        return ;
    }
    var html = "";
    $.each(data, function(index, item){
        html += "<tr>";
        html += "<td>"+item.billCode+"</td>";
        html += "<td>"+item.productName+"</td>";
        html += "<td>"+item.proName+"</td>";
        html += "<td>"+item.totalPrice+"</td>";
        html += "<td>"+item.isPayment+"</td>";
        html += "<td>"+item.createTime+"</td>";
        html += "<td>" +
            "<a class=\"modifyBill\" href='http://localhost:8080/modifyBill/index?id=\""+item.id+"\"&billCode=\""+item.billCode+"\"&productName=\""+item.productName+"\"&productCount=\""+item.productCount+"\"&proName=\""+item.proName+"\"&totalPrice=\""+item.totalPrice+"\"&isPayment=\""+item.isPayment+"\"'><img src=\"../resources/images/xiugai.png\" alt=\"修改\" title=\"修改\"/></a>"+
            "<a class=\"deleteBill\" href='javascript:removeBill(\""+item.id+"\");'><img src=\"../resources/images/schu.png\" alt=\"删除\" title=\"删除\"/></a>"
        +"</td>"
        html += "</tr>";
    });
    $("#content").html(html);
}

/**
 * 这个是添加页面的跳转
 */
function addGetUrl()
{
    window.location.href="http://localhost:8080/addBill/index"
}

/**
 * 这个是主页面的跳转
 * @param address
 * @constructor
 */
function GetUrl(address)
{
    var box = $("#Box");
    try
    {
        if(address == 1){
            box.attr("src","http://localhost:8080/billList/index");
        }else if(address == 2){
            box.attr("src","http://localhost:8080/providerList/index");
        }else if(address == 3){
            $("#Box").attr("src","http://localhost:8080/userList/index");
        }else{
            $("#Box").attr("src","http://localhost:8080/pwdModify/index?userName="+$("#userName").html());
        }
    }
    catch(e)
    {
        window.location.reload();
    }
}

/**
 * 这个是返回按钮的跳转
 */
 function jumpon(){
    window.location.href="http://localhost:8080/billList/index";
}

/**
 * 这个是添加订单的方法
 */
function addBill(){
    $.ajax({
        url: '/addBill/insertBill',
        type: 'post',
        cache: false,
        data: {
            "billCode":$("#billCode").val(),
            "productName":$("#productName").val(),
            "productCount":$("#productCount").val(),
            "totalPrice":$("#totalPrice").val(),
            "providerName":$("#providerName").val(),
            "isPayment": $("#isPayment").val()
        },
        dataType: 'json',
        success: function (data) {
            if(data.responseCode == 0){

            }
        },
        error: function (data) {
            alert("提交成功！！");
            window.location.href="http://localhost:8080/billList/index";
        }
    });
}

/**
 * 这个是删除订单的方法
 * @param id
 */
function removeBill(id){
    $.ajax({
        url: '/billList/deleteBill',
        type: 'post',
        cache: false,
        data: {
            "id": id
        },
        dataType: 'json',
        success: function (data) {
                alert("删除成功！！");
                selectBillList();
        },
        error: function (data) {
            alert("服务器异常！！！");
        }
    });
}

/**
 * 这个是修改订单的方法
 */
function modifyBill() {
    var isPayment = $("#isPayment").val()
    var test = $("#id").val();
    if(isPayment == "已支付"){
        isPayment = 1;
    }else{
        isPayment = 2;
    }
    $.ajax({
        url: '/modifyBill/updateBill',
        type: 'post',
        cache: false,
        data: {
            "id":$("#id").val(),
            "billCode":$("#billCode").val(),
            "productName":$("#productName").val(),
            "productCount":$("#productCount").val(),
            "totalPrice":$("#totalPrice").val(),
            "providerName":$("#providerName").val(),
            "isPayment": isPayment
        },
        dataType: 'json',
        success: function (data) {
            alert("修改成功！！");
            window.location.href="http://localhost:8080/billList/index";
        },
        error: function (data) {
            alert("服务器异常！！")
        }
    });
}