<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String path = request.getContextPath(); %>

<html>
<head>
    <link rel="stylesheet" href="<%=path%>/css/common.css">
    <link rel="stylesheet" href="<%=path%>/css/main.css">
    <script type="text/javascript" src="<%=path%>/js/jquery.min.js"></script>
    <script type="text/javascript" src="<%=path%>/js/colResizable-1.3.min.js"></script>
    <script type="text/javascript" src="<%=path%>/js/common.js"></script>

    <title>部门管理-部门列表</title>
    <script>
        /**
         * 删除部门
         * @param id
         */
        function deleteDpt(id) {

            $.ajax({
                url:"/dept/delete.do",
                type:"post",
                data:{"id":id},
                dataType:"json",
                async:false,
                success:function(result) {

                    alert(result.message);
                    $("#dep").empty();
                    $("#dep").load('/dept/index.do');

                },
                error:function(result){
                    alert(result.message);
                }
            });
        }
        /**
         * 修改部门
         */
        function updateDpt(id) {
            location.href="/dept/aaa.do?id="+id;
        }
    </script>
</head>
<body id="dep">
<table id="dtpTable" width="100%" border="0" cellpadding="0" cellspacing="0" class="list_dpt">
    <tr>
        <th width="5%">编号 ${departmentModel.id}</th>
        <th width="10%">部门编号</th>
        <th width="15%">部门名字</th>
        <th width="10%">上级部门编号</th>
    </tr>


    <tr class="tr">
        <td>${departmentModel.id}</td>
        <td>${departmentModel.dptNum}</td>
        <td>${departmentModel.dptName}</td>
        <td>${departmentModel.supDptnum}</td>
        <td>
            <a style="cursor: pointer" onclick="updateDpt(${departmentModel.id})">修改</a>|<a style="cursor: pointer" onclick="deleteDpt(${departmentModel.id})">删除</a>
        </td>
    </tr>

</body>
<body>
<%--<div id="search_dpt">--%>
<%--<tr>`--%>
<%--<td>部门名字</td>--%>
<%--<td input id="dptName" type="text" name="dptName" class="input_dptName"></td>--%>
<%--<td>部门编号</td>--%>
<%--<td id="dptNum" type="text" name="dptNum" class="input_dptNum"></td>--%>
<%--</tr>--%>
<div id="load_dpt " >
    <input type="button" onclick="location.href='/deptEdit.jsp'" value="添加">
</div>
<div>
    部门编号<input type="text" name="dptNum">
    <input type="button" onclick="location.href='/findBynum.do'" value="查询">
</div>
</div>
<div id="dpt_table">

</div>
</body>
</html>
