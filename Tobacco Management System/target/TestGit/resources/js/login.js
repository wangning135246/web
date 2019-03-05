/**
 * 设置重置的方法
 */
function reset(){
    $("#userEmail").val("");
    $("#userPassword").val("");
}

/**
 * 这个是登录的方法
 */
function login(){
    $.ajax({
        url: '/userLogin/login',
        type: 'post',
        cache: false,
        data: {
            "userEmail":$("#userEmail").val(),
            "userPassword":$("#userPassword").val()
        },
        dataType: 'json',
        success: function (data) {
            if(data != null){
                alert("登陆成功！！！！");
                window.location.href="http://localhost:8080/successLogin/getIndex?userName="+data.username;
            }else{
                alert("账号或密码有误，请重新输入！！");
                return;
            }
        },
        error: function (data) {
            alert("服务器异常！！！");
        }
    });
}
