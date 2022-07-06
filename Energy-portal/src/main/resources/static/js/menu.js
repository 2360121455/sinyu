let menusApp = new Vue({
    el: '#menusApp',
    data:{
        menus: [
        ],
        ms:[
        ],
        area: {},
        titleName: ""
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
        skip: function (menuCode,name) {
            $.ajax({
                url: '/portal/menu/menusFacility',
                type:'post',
                data:{
                    menuCode: menuCode
                },
                success:function (r){
                    menusApp.ms = r.data;
                    menusApp.titleName = name;
                }
            })
        }
    },
    /*页面加载的时候就执行*/
    created: function () {
        this.loadMenus();
    }
});