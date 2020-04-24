$(function () {
    $.post({
        url:'putao/getAll',
        success:function (data) {
            for(var i=0;i<data.length;i++){
                var text = "<tr>\n" +
                    "                    <th>"+data[i].id+"</th>\n" +
                    "                    <th>"+data[i].name+"</th>\n" +
                    "                    <th>"+data[i].bieming+"</th>\n" +
                    "                    <th>"+data[i].characters+"</th>\n" +
                    "                    <th>"+data[i].forms+"</th>\n" +
                    "                    <th>"+data[i].projects+"</th>\n" +
                    "                    <td>\n" +
                    "                        <a href=\"putao/delById?id="+data[i].id+"\" class=\"btn btn-danger\">删除</a>\n" +
                    "                        <a href=\"#\" class=\"btn btn-success\">修改</a>\n" +
                    "                    </td>\n" +
                    "                </tr>"
                var obj = $(".pool");
                obj.append(text);


            }
        }
    });
});