<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016-11-28
  Time: 12:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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

<body id="add_appro">
<table id="dtpTable" width="100%" border="0" cellpadding="0" cellspacing="0" class="list_appro">
    <tr>
        <th >id</th>
        <th >物品名称</th>
        <th >物品种类</th>
        <th >物品价格</th>
        <th >物品数量</th>
        <th >部门领导审批</th>
        <th >财务专员审批</th>
        <th >财务主管审批</th>
        <th >创建时间</th>

    </tr>

    <c:if test="${list.size() > 0}">
        <c:forEach items="${list}" var="appro" >
            <tr class="tr">
                <td>${appro.id}</td>
                <td>${appro.approveName}</td>
                <td>${appro.approveBrand}</td>
                <td>${appro.approvePrice}</td>
                <td>${appro.approveNum}</td>
                <td>${appro.firstCheck}</td>
                <td>${appro.secondCheck}</td>
                <c:if test="${appro.approvePrice*appro.approveNum>1000}">
                    <td>${appro.threeCheck}</td>
                </c:if>
                <c:if test="${appro.approvePrice*appro.approveNum<=1000}">
                    <td>审批通过</td>
                </c:if>
                <td>${appro.createTime}</td>
                <td>
                    <a style="cursor: pointer" onclick="updateappro(${appro.id})">修改</a>|<a style="cursor: pointer" onclick="deleteappro(${appro.id})">删除</a>
                </td>
            </tr>
        </c:forEach>
    </c:if>


</table>
</body>
</html>
