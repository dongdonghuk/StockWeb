var tDate;

// $(document).ready(function() {
//     tables.showData();
// });

var tables = {
    draw : 0,
    dataSets : [],
    render : function() {
        $('#stock_target_table').DataTable({
            searching : false,
            paging: true,
            autoWidth : false,
            info: true,
            data: tables.dataSets,
            columns: [
                {
                    data: 'stockKey'
                },
                {
                    data: 'stockName'
                },
                {
                    data: 'marketDt'
                },
                {
                    data: 'dailyRate'
                },
                {
                    data: 'openPrice'
                },
                {
                    data: 'closePrice'
                },
                {
                    data: 'highPrice'
                },
                {
                    data: 'lowPrice'
                },
                {
                    data: 'tradingVolume'
                }
            ]
        });
    },
    showData : function(){
        dataSets = [];
        $.ajax({
            type : 'GET',
            url : 'getTagetDatas',
            data : {marketDt : tDate},
            contentType: 'application/json',
            //dataType 정의
            dataType: 'json',
            success : function(data) {
                $.each(data, function(index,obj){
                    tables.dataSets.push(obj);
                });
                tables.render();
            },
            error : function(xhr, status, error){
            }
        });
    }
};

function cofirmStockTargetDate(){
    tDate = $("#inputStockTargetDate").val();
    tables.showData();
}

$("#confirm_stock_target_date").on("click",cofirmStockTargetDate);