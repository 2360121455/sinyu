let registerApp = new Vue({
    el: '#registerApp',
    methods: {
        register: function () {
            $.ajax({
                url:'/portal/userlist/register',
                type:'post',
                data:{
                    username: $('#username').val(),
                    account: $('#account').val(),
                    password: $('#password').val()
                },
                success:function (r){
                    if (r.state == 1001){
                        alert('注册成功');
                    }else {
                        alert(r.message);
                    }
                },
            });
        }
    }
});