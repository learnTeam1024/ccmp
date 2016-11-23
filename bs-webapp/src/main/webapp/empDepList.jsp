<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/11/16
  Time: 13:39
  To change this template use File | Settings | File Templates.
--%>
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

    <title>用户-部门列表</title>

</head>
<script >
    function promotion(id) {
        $.ajax({
            url:"/empDep/promo.do",
            type:"post",
            data:{"id":id},
            dataType:"json",
            async:false,
            success:function(result){
                alert(result.message);
                location.href="/empDep/index.do";
            },
            error:function(result){
                alert(result.message);
            }
        });
        
    }
//    function  demotion(id) {
//
//    }
</script>

<body id="emp_dep">

<div class="box_bottom pb5 pt5 pr10" style="border-top:1px solid #dadada;">
    <div class="search_bar_btn" style="text-align:left;">
        <input type="button" onclick="location.href = '/empDep/among.do' " class="ext_btn ext_btn_success" value="添 加">
        <%--<input type="button" onclick="loadUser()" value="查 询" class="ext_btn ext_btn_submit">--%>

    </div>
</div>
</div>

<table id="dtpTable" width="100%" border="0" cellpadding="0" cellspacing="0" class="list_dpt">
    <tr>
        <th width="5%">id</th>
        <th width="10%">员工名字</th>
        <th width="15%">所属部门编号</th>
        <th width="10%">创建时间</th>
    </tr>

    <c:if test="${list.size() > 0}">
        <c:forEach items="${list}" var="empDep" >
            <tr class="tr">
                <td>${empDep.id}</td>
                <td>${empDep.userName}</td>
                <td>${empDep.depNum}</td>
                <td>${empDep.createTime}</td>
                <td>
                    <a style="cursor: pointer" onclick="promotion(${empDep.id})">升职</a>--<a style="cursor: pointer"
                         onclick="demotion(${empDep.id})">降职</a>--<a style="cursor: pointer" onclick="deleteDpt(${empDep.id})">删除</a>
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
