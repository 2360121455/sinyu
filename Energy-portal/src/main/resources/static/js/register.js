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
                    password: $('#password').val(),
                    pwtrue: $('#pwtrue').val()
                },
                success:function (r){
                    if (r.state == 2000){
                        alert('注册成功');
                        var index = parent.layer.getFrameIndex(window.name);
                        parent.layer.close(index);
                    }else {
                        alert(r.message);
                    }
                },
            });
        }
    }
});