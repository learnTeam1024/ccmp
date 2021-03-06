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
<div id="load_dpt " >
    <input type="button" onclick="location.href='/deptEdit.jsp'" value="添加">
</div>
<form action="/dept/findBynum.do" class="jqtransform" >
    <div>

        部门编号<input type="text" name="dptNum" >
        <input  type="submit" value="查询">
    </div>
</form>
</div>
<%--<div id="dpt_table">--%>

<%--</div>--%>

<table id="dtpTable" width="100%" border="0" cellpadding="0" cellspacing="0" class="list_dpt">
    <tr>
        <th width="5%">编号</th>
        <th width="10%">部门编号</th>
        <th width="15%">部门名字</th>
        <th width="10%">部门等级</th>
        <th width="10%">上级部门编号</th>
    </tr>

    <c:if test="${list.size() > 0}">
    <c:forEach items="${list}" var="dpt" >
    <tr class="tr">
        <td>${dpt.id}</td>
        <td>${dpt.dptNum}</td>
        <td>${dpt.dptName}</td>
        <td>${dpt.dptPower}</td>
        <td>${dpt.supDptnum}</td>
        <td>
            <a style="cursor: pointer" onclick="updateDpt(${dpt.id})">修改</a>|<a style="cursor: pointer" onclick="deleteDpt(${dpt.id})">删除</a>
        </td>
    </tr>
    </c:forEach>
    </c:if>
</table>



</body>
<br>
<c:if test="${currentPage>1 }">
    <a href="listDepartment.do?currentPage=1" >首页</a>
    <a href="listDepartment.do?currentPage=${currentPage-1 }">上一页</a>
</c:if>
<c:if test="${currentPage <totalPage }">
    <a href="listDepartment.do?currentPage=${currentPage+1 }">下一页</a>
    <a href="listDepartment.do?currentPage=${totalPage }">末页</a>

</c:if>
<form action="listDepartment.do">
    <h4 align="center">共${totalPage}页
        <input type="text" value="${currentPage}" name="currentPage" size="1">页
        <input type="submit" value="到达">
    </h4>
</form>
${allCounts}
</html>
