<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016-11-28
  Time: 13:57
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

    <title>审批列表</title>

</head>
<script>
    function agree(id) {
        $.ajax({
            url:"/approve/agree.do",
            type:"post",
            data:{"id":id},
            dataType:"json",
            async:false,
            success:function(result) {
                alert(result.message);
                $(document).click(function (e) {
                            $(e.target).parent().parent().empty()});
                location.href="/menu.jsp";
            },
            error:function(result){
                alert(result.message);
            }
        });
    }
    function refuse(id) {
        $.ajax({
            url:"/approve/refuse.do",
            type:"post",
            data:{"id":id},
            dataType:"json",
            async:false,
            success:function(result) {
                alert(result.message);
                $(document).click(function (e) {
                    $(e.target).parent().parent().empty()})
            },
            error:function(result){
                alert(result.message);
            }
        });
        
    }
</script>

<body id="add_appro">
<table id="dtpTable" width="100%" border="0" cellpadding="0" cellspacing="0" class="list_appro">
    <tr>
        <th >申请名字</th>
        <th >物品名称</th>
        <th >物品种类</th>
        <th >物品价格</th>
        <th >物品数量</th>
        <th >创建时间</th>

    </tr>

    <c:if test="${lltt.size() > 0}">
        <c:forEach items="${lltt}" var="appro" >
            <tr class="tr">
                <td>${appro.peopleName}</td>
                <td>${appro.approveName}</td>
                <td>${appro.approveBrand}</td>
                <td>${appro.approvePrice}</td>
                <td>${appro.approveNum}</td>
                <td>${appro.createTime}</td>
                <td>
                    <a style="cursor: pointer" onclick="agree(${appro.id})">同意</a>|<a style="cursor: pointer" onclick="refuse(${appro.id})">不同意</a>
                </td>
            </tr>
        </c:forEach>
    </c:if>



</table>
</body>
</html>
