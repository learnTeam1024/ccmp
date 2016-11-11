<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/11/3
  Time: 15:18
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

    <title>角色管理-角色列表</title>

</head>
<script>
function updaterole(id) {
    location.href="/role/judge.do?id="+id;
}
</script>
<body id="dep">
<div id="load_dpt "  class="search_bar_btn" style="text-align:left;">
    <input type="button" onclick="location.href='/roleEdit.jsp'"class="ext_btn ext_btn_success"  value="添加">
</div>
<table id="dtpTable" width="100%" border="0" cellpadding="0" cellspacing="0" class="list_role">
    <tr>
        <th width="5%">id</th>
        <th width="10%">角色姓名</th>
        <th width="15%">角色权利</th>
        <th width="10%">权利等级</th>
        <th width="10%">创建时间</th>
    </tr>

    <c:if test="${list.size() > 0}">
    <c:forEach items="${list}" var="role" >
    <tr class="tr">
        <td>${role.id}</td>
        <td>${role.roleName}</td>
        <td>${role.rolePower}</td>
        <td>${role.roleRank}</td>
        <td>${role.createTime}</td>
        <td>
            <a style="cursor: pointer" onclick="updaterole(${role.id})">修改</a>|<a style="cursor: pointer" onclick="deleterole(${role.id})">删除</a>
        </td>
    </tr>
    </c:forEach>
    </c:if>





</table>

</body>
</html>
