/**
 * 这是查询信息的方法
 */
function selectProviderList(){

    $.ajax({
        url: '/providerList/selectProvider',
        type: 'post',
        cache: false,
        data: {
            "proCode":$("#proCode").val(),
            "proName":$("#proName").val()
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
        html += "<td>"+item.proCode+"</td>";
        html += "<td>"+item.proName+"</td>";
        html += "<td>"+item.proPhone+"</td>";
        html += "<td>"+item.createDate+"</td>";
        html += "<td>" +
            "<a class=\"modifyBill\" href='http://localhost:8080/modifyprovider/index?id=\""+item.id+"\"&proCode=\""+item.proCode+"\"&proName=\""+item.proName+"\"&proPhone=\""+item.proPhone+"\"&proAddress=\""+item.proAddress+"\"'><img src=\"../resources/images/xiugai.png\" alt=\"修改\" title=\"修改\"/></a>"+
            "<a class=\"deleteBill\" href='javascript:removeProvider(\""+item.id+"\");'><img src=\"../resources/images/schu.png\" alt=\"删除\" title=\"删除\"/></a>"
            +"</td>"
        html += "</tr>";
    });
    $("#content").html(html);
}

/**
 * 这个是添加页面的跳转
 */
function addProviderUrl()
{
    window.location.href="http://localhost:8080/addProvider/index"
}

/**
 * 这个是返回按钮的跳转
 */
function jumpon(){
    window.location.href="http://localhost:8080/providerList/index";
}

/**
 * 这个是添加订单的方法
 */
function addProvider(){
    $.ajax({
        url: '/addProvider/insertProvider',
        type: 'post',
        cache: false,
        data: {
            "proCode":$("#proCode").val(),
            "proName":$("#proName").val(),
            "proPhone":$("#proPhone").val(),
            "proAddress":$("#proAddress").val()
        },
        dataType: 'json',
        success: function (data) {
            if(data.responseCode == 0){

            }
        },
        error: function (data) {
            alert("提交成功！！");
            window.location.href="http://localhost:8080/providerList/index";
        }
    });
}

/**
 * 这个是删除订单的方法
 * @param id
 */
function removeProvider(id){
    $.ajax({
        url: '/providerList/deleteProvider',
        type: 'post',
        cache: false,
        data: {
            "id": id
        },
        dataType: 'json',
        success: function (data) {
            alert("删除成功！！");
            selectProviderList();
        },
        error: function (data) {
            alert("服务器异常！！！");
        }
    });
}

/**
 * 这个是修改订单的方法
 */
function modifyProvider() {
    $.ajax({
        url: '/modifyprovider/providerModify',
        type: 'post',
        cache: false,
        data: {
            "id":$("#id").val(),
            "proCode":$("#proCode").val(),
            "proName":$("#proName").val(),
            "proPhone":$("#proPhone").val(),
            "proAddress":$("#proAddress").val()
        },
        dataType: 'json',
        success: function (data) {
            alert("修改成功！！");
            window.location.href="http://localhost:8080/providerList/index";
        },
        error: function (data) {
            alert("服务器异常！！")
        }
    });
}