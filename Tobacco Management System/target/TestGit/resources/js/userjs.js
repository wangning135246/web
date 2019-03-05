function selectSex(sex) {
    if(sex == 0){
        return "男";
    }else{
        return "女";
    }
}

/**
 * 这是查询信息的方法
 */
function selectUserList(){

    $.ajax({
        url: '/userList/selectUser',
        type: 'post',
        cache: false,
        data: {
            "userName":$("#userName").val()
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
        html += "<td>"+item.email+"</td>";
        html += "<td>"+item.username+"</td>";
        html += "<td>"+selectSex(item.sex)+"</td>";
        html += "<td>"+item.userAddress+"</td>";
        html += "<td>"+item.userPhone+"</td>";
        html += "<td>" +
            "<a class=\"modifyBill\" href='http://localhost:8080/modifyUser/index?userName=\""+item.username+"\"&sex=\""+selectSex(item.sex)+"\"&userAddress=\""+item.userAddress+"\"&userPhone=\""+item.userPhone+"\"&id=\""+item.id+"\"'><img src=\"../resources/images/xiugai.png\" alt=\"修改\" title=\"修改\"/></a>"+
            "<a class=\"deleteBill\" href='javascript:removeUser(\""+item.id+"\");'><img src=\"../resources/images/schu.png\" alt=\"删除\" title=\"删除\"/></a>"
            +"</td>"
        html += "</tr>";
    });
    $("#content").html(html);
}

/**
 * 这个是添加页面的跳转
 */
function addUserUrl()
{
    window.location.href="http://localhost:8080/addUser/index"
}

/**
 * 这个是返回按钮的跳转
 */
function jumpon(){
    window.location.href="http://localhost:8080/userList/index";
}

/**
 * 这个是添加订单的方法
 */
function addUser(){
    $.ajax({
        url: '/addUser/insertUser',
        type: 'post',
        cache: false,
        data: {
            "email":$("#email").val(),
            "password":$("#password").val(),
            "userName":$("#userName").val(),
            "userAddress":$("#userAddress").val(),
            "userPhone":$("#userPhone").val(),
            "sex":$("#sex").val(),
            "regIp":$("#regIp").val()
        },
        dataType: 'json',
        success: function (data) {
            if(data.responseCode == 0){

            }
        },
        error: function (data) {
            alert("提交成功！！");
            window.location.href="http://localhost:8080/userList/index";
        }
    });
}

/**
 * 这个是删除订单的方法
 * @param id
 */
function removeUser(id){
    $.ajax({
        url: '/userList/deleteUser',
        type: 'post',
        cache: false,
        data: {
            "id": id
        },
        dataType: 'json',
        success: function (data) {
            alert("删除成功！！");
            selectUserList();
        },
        error: function (data) {
            alert("服务器异常！！！");
        }
    });
}

/**
 * 这个是修改用户的方法
 */
function modifyUser() {
    $.ajax({
        url: '/modifyUser/updateUser',
        type: 'post',
        cache: false,
        data: {
            "id":$("#id").val(),
            "userName":$("#userName").val(),
            "userPhone":$("#userPhone").val(),
            "sex":$("#sex").val(),
            "userAddress":$("#userAddress").val()
        },
        dataType: 'json',
        success: function (data) {
            alert("修改成功！！");
            window.location.href = "http://localhost:8080/userList/index";
        },
        error: function (data) {
            alert("服务器异常！！")
        }
    });
}

/**
 * 这个是修改用户的方法
 */
function pwdModifyUser() {
    var user = $("#userName").val();
    if($("#newpassword").val() != $("#rnewpassword").val()){
        alert("第一次输入的密码和第二次的不同，请重新输入！");
        return
    }
    $.ajax({
        url: '/pwdModify/pwdModifyUser',
        type: 'post',
        cache: false,
        data: {
            "userName":$("#userName").val(),
            "newpassword":$("#newpassword").val(),
            "oldpassword":$("#oldpassword").val()
        },
        dataType: 'json',
        success: function (data) {
            if(data == 1){
                alert("修改成功！！");
                window.location.href="http://localhost:8080/userList/index";
            }else{
                alert("输入的旧密码不对，请重新输入！");
                return
            }
        },
        error: function (data) {
            alert("服务器异常！！")
        }
    });
}