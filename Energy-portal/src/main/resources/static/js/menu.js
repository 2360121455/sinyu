let menusApp = new Vue({
    el: '#menusApp',
    data:{
        menus: [
            {id: 1,name:'spring'},
            {id: 2,name:'springMVC'},
            {id: 3,name:'mybatis'},
            {id: 4,name:'springboot'}
        ]
    },
    methods: {
        loadMenus: function () {
            $.ajax({
                url: '/portal/menus',
                success:function (r){
                    menusApp.menus = r.data
                }
            })
        }
    },
    created: function () {
        this.loadMenus();
    }
});