<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016-12-09
  Time: 13:39
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
    <title>资产申购页面</title>
</head>
<script>
    function update() {
        var id=$('input:radio:checked').parent().next().text();
        location.href="/zcsg/findOne.do?id="+id;
    }
    function  add() {
        location.href="/zcsgEdit.jsp";
    }
    function  deletee() {
        var id=$('input:radio:checked').parent().next().text();
        $.ajax({
            url:"/zcsg/delete.do",
            type:"post",
            data:{"id":id},
            dataType:"json",
            async:false,
            success:function(result) {
                alert(result.message);
                    $('input:radio:checked').parent().parent().empty();
            },
            error:function (result) {
                alert(result.message);
            }
        })
    }
</script>
<body>
<table width="100%" border="0" cellpadding="2" cellspacing="0">
    <tr>
        <td width="100%">
    <tr style="text-align: center; COLOR: #0076C8; BACKGROUND-COLOR: #F4FAFF; font-weight: bold">
    <td align="left">资产列表</td>  <a size="2" onclick="add()" >资产申购</a>--<a size="2" onclick="update()">修改</a>--<a size="2" onclick="deletee()">删除</a>
    </tr>
    <div>
        <form action="/zcsg/findByAss.do" class="jqtransform">
            <tr>
                资产名称<input type="text" name="assetnm">
            </tr>
            <input type="submit" value="查询">
        </form>
    </div>

            <table border="0" cellpadding="3" cellspacing="1" width="100%" align="center" style="background-color: #b9d8f3;">
                <tr style="text-align: center; COLOR: #0076C8; BACKGROUND-COLOR: #F4FAFF; font-weight: bold">
                    <td><font size="2"></font></td>
                    <td><font size="2">资产名称</font></td>
                    <td><font size="2">申请数量</font></td>
                    <td><font size="2">金额</font></td>
                    <td><font size="2">申请人</font></td>
                    <td><font size="2">使用人</font></td>
                    <td><font size="2">申请理由</font></td>
                    <td><font size="2">所属部门</font></td>
                    <td><font size="2">最后审批时间</font></td>

                </tr>

                <c:if test="${list.size() > 0}">
                    <c:forEach items="${list}" var="zcsg" >
                        <tr class="tr">
                            <td><input type="radio" name="si" value="0"></td>
                            <td  style="display:none"><font size="2">${zcsg.id}</font></td>
                            <td  align="center"><font size="2">${zcsg.assetnm}</font></td>
                            <td align="center"><font size="2">${zcsg.ammount}</font></td>
                            <td align="center"><font size="2">${zcsg.money}</font></td>
                            <td align="center"><font size="2">${zcsg.oper}</font></td>
                            <td align="center"><font size="2">${zcsg.custos}</font></td>
                            <td align="center"><font size="2">${zcsg.meno}</font></td>
                            <td align="center"><font size="2">${zcsg.dept}</font></td>
                            <td align="center"><font size="2">${zcsg.dt}</font></td>
                        </tr>
                    </c:forEach>
                </c:if>
            </table>
    <c:if test="${list.size() <=0}">
        没有此信息
    </c:if>

        </td>
    </tr>
</table>
</body>
</html>
