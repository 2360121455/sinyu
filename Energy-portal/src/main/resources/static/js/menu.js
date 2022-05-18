let menusApp = new Vue({
    el: '#menusApp',
    data:{
        menus: [
        ],
        ms:[
        ],
        area: {}
    },
    methods: {
        loadMenus: function (menuCode) {
            $.ajax({
                url: '/portal/menu/menus',
                type:'post',
                data:{
                    menuCode: menuCode
                },
                success:function (r){
                    menusApp.menus = r.data;
                }
            })
        },
        skip: function (menuCode) {
            $.ajax({
                url: '/portal/menu/menusFacility',
                type:'post',
                data:{
                    menuCode: menuCode
                },
                success:function (r){
                    menusApp.ms = r.data;
                }
            })
        }
    },
    created: function () {
        this.loadMenus();
    }
});