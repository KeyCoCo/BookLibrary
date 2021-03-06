<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/22
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html class="x-admin-sm">
    <%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<head>
    <base href="<%=basePath%>">
    <meta charset="UTF-8">
    <title>欢迎页面-X-admin2.2</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="stylesheet" href="./X-admin/css/font.css">
    <link rel="stylesheet" href="./X-admin/css/xadmin.css">
    <script src="./X-admin/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="./X-admin/js/xadmin.js"></script>
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
<div class="x-nav">
            <span class="layui-breadcrumb">
                <a href="">首页</a>
                <a href="">演示</a>
                <a>
                    <cite>导航元素</cite></a>
            </span>
    <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" onclick="location.reload()" title="刷新">
        <i class="layui-icon layui-icon-refresh" style="line-height:30px"></i>
    </a>
</div>
<div class="layui-fluid">
    <div class="layui-row layui-col-space15">
        <div class="layui-col-md12">
            <div class="layui-card">
                <div class="layui-card-body ">
                    <form class="layui-form layui-col-space5">
                        <div class="layui-inline layui-show-xs-block">
                            <input class="layui-input" autocomplete="off" placeholder="开始日" name="start" id="start"></div>
                        <div class="layui-inline layui-show-xs-block">
                            <input class="layui-input" autocomplete="off" placeholder="截止日" name="end" id="end"></div>
                        <div class="layui-inline layui-show-xs-block">
                            <input type="text" name="username" placeholder="请输入用户名" autocomplete="off" class="layui-input"></div>
                        <div class="layui-inline layui-show-xs-block">
                            <button class="layui-btn" lay-submit="" lay-filter="sreach">
                                <i class="layui-icon">&#xe615;</i></button>
                        </div>
                    </form>
                </div>
                <div class="layui-card-body ">
                    <table class="layui-table" lay-data="{
                    id:'_table',
                    url:'book/queryBookList',
                    method:'get',
                    page:true,
                    toolbar: '#toolbarDemo',
                    limits:[10,20,30,40,50],
                    limits:10}" lay-filter="test">
                        <thead>
                        <tr>
                            <th lay-data="{type:'checkbox'}">ID</th>
                            <th lay-data="{field:'bookId', width:60, sort: true}">id</th>
                            <th lay-data="{field:'bookTypeName', width:120, sort: true}">类型</th>
                            <th lay-data="{field:'bookTitle', edit: 'text', width: 100}">标题</th>
                            <th lay-data="{field:'bookAuthor', width:100,edit: 'text'}">作者</th>
                            <th lay-data="{field:'bookDate', width: 100,edit:'text',sort:true}">发布时间</th>
                            <th lay-data="{field:'bookTxt', width:910, edit: 'text'}">内容</th>
                            <th lay-data="{field:'bookImg',width: 140, align:'center',templet:'#imgtmp'}"> 封面</th>
                        </tr>
                        </thead>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
<script type="text/html" id="toolbarDemo">
    <div class = "layui-btn-container" >
        <button class = "layui-btn layui-btn-sm" lay-event = "getCheckData" > 删除选中行数据 </button>
        <button class="layui-btn layui-btn-sm" lay-event="addBook" onclick="xadmin.open('添加书籍','book/toAddBook',500,700)">添加书籍</button >
        <button class = "layui-btn layui-btn-sm" lay-event = "isAll" > 验证是否全选</button>
    </div >

</script>
<script type="text/html" id="switchTpl">
    <!-- 这里的checked的状态只是演示 -->
<%--    <input type = "checkbox" name = "sex" value = "{{d.id}}" lay-skin = "switch"lay-text = "女|男" lay-filter = "sexDemo" {{ d.id == 10003 ? 'checked': ''}} >--%>
</script>
<script type="text/html" id="imgtmp">
    <img src="{{ d.bookImg}}" style="height: 100%;width: 100%"/>
</script>
<script>layui.use('laydate',
    function() {
        var laydate = layui.laydate;

        //执行一个laydate实例
        laydate.render({
            elem: '#start' //指定元素
        });

        //执行一个laydate实例
        laydate.render({
            elem: '#end' //指定元素
        });

    });</script>
<script>layui.use('table',
    function() {
        var table = layui.table;

        //监听单元格编辑
        table.on('edit(test)',
            function(obj) {
                var value = obj.value //得到修改后的值
                    ,
                    data = obj.data //得到所在行所有键值
                    ,
                    field = obj.field; //得到字段
                layer.msg('[ID: ' + data.bookId + '] ' + field + ' 字段更改为：' + value);
                $.ajax({
                    url:"book/updateBook",
                    type:"post",
                    data:{"bookId":data.bookId,"field":field,"value":value},
                    dataType:"json",
                    success:function (data) {
                        if(data.code!=0){
                            layer.msg("修改成功")
                        }else{
                            layer.msg("修改失败")
                        }
                        table.reload("_table");
                        console.log(data);

                    }})
            });

        //头工具栏事件
        table.on('toolbar(test)',
            function(obj) {
                var checkStatus = table.checkStatus(obj.config.id);
                switch (obj.event) {
                    case 'getCheckData':
                        var data = checkStatus.data;
                        var arr=[];
                        for(i in data){
                            arr[i]=data[i].bookId;
                        }
                        $.ajax({
                           url:"book/delBookList",
                           type:"post",
                           data:"arr="+arr,
                           dataType:"json",
                           success:function (data) {
                               if(data.msg!=="NONULL"){
                                   if(data.msg==="OK"){
                                       layer.msg("删除成功");
                                       table.reload("_table");
                                   }else{
                                       layer.msg("删除失败");
                                       table.reload("_table");
                                   }
                               }else{
                                   layer.msg("选择不能为空");
                               }

                           }
                        });
                        break;
                    case 'addBook':
                        layer.msg("添加");

                        break;
                    case 'isAll':
                        layer.msg(checkStatus.isAll ? '全选': '未全选');
                        break;
                };
            });
    });</script>
<script>var _hmt = _hmt || []; (function() {
    var hm = document.createElement("script");
    hm.src = "https://hm.baidu.com/hm.js?b393d153aeb26b46e9431fabaf0f6190";
    var s = document.getElementsByTagName("script")[0];
    s.parentNode.insertBefore(hm, s);
})();</script>


