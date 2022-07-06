let tableApp = new Vue({
    el: '#tableApp',
    data:{
        locations:[],
        types:{},
        locationName:"",
        typeName:"",
        Lname:"",
        tablePointData:[],
        tableMainData:[]
    },
    methods: {
        loadLocations: function () {
            $.ajax({
                url: '/portal/location/tableLocation',
                type:'get',
                success:function (r){
                    tableApp.locations = r.data.locationList;
                    tableApp.types = r.data.types;
                }
            })
        },
        selectSubmit: function () {
            $.ajax({
                url: '/portal/location/selectTable',
                type: 'post',
                data: {
                    ln: this.locationName,
                    tn: this.typeName
                },
                success: function (r) {
                    tableApp.tablePointData = r.data.pointDataList;
                    tableApp.tableMainData = r.data.mainDataList;
                }
            });
            let mn = tableApp.locationName;
            let index = mn.indexOf("-");
            let result = mn.substr(index + 1, mn.length);
            tableApp.Lname = result;
        }
    },
    created: function () {
        this.loadLocations();
    }
});