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
        var ss=$('input:radio:checked').parent().next().text();
        location.href="/approve/si.do?ss="+ss;
    }
    function  add() {
        location.href="/zcsgEdit.jsp";
    }
</script>
<body>
<table width="100%" border="0" cellpadding="2" cellspacing="0">
    <tr>
        <td width="100%">
    <tr style="text-align: center; COLOR: #0076C8; BACKGROUND-COLOR: #F4FAFF; font-weight: bold">
    <td align="left">资产列表</td>  <a size="2" onclick="add()" >资产申购</a> <a size="2" onclick="update()">修改</a>
    </tr>
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
                    <c:forEach items="${list}" var="acsg" >
                        <tr class="tr">
                            <td><input type="radio" name="si" value="0"></td>
                            <td  style="display:none"><font size="2">${acsg.id}</font></td>
                            <td  align="center"><font size="2">${acsg.assetnm}</font></td>
                            <td align="center"><font size="2">${acsg.ammount}</font></td>
                            <td align="center"><font size="2">${acsg.money}</font></td>
                            <td align="center"><font size="2">${acsg.oper}</font></td>
                            <td align="center"><font size="2">${acsg.custos}</font></td>
                            <td align="center"><font size="2">${acsg.meno}</font></td>
                            <td align="center"><font size="2">${acsg.dept}</font></td>
                            <td align="center"><font size="2">${acsg.dt}</font></td>
                        </tr>
                    </c:forEach>
                </c:if>
            </table>

        </td>
    </tr>
</table>
</body>
</html>
