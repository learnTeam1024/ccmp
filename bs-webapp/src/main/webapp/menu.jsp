<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016-11-26
  Time: 10:14
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath(); %>
<html>
<head>
    <link rel="stylesheet" href="<%=path%>/css/common.css">
    <link rel="stylesheet" href="<%=path%>/css/main.css">
    <script type="text/javascript" src="<%=path%>/js/jquery.min.js"></script>
    <script type="text/javascript" src="<%=path%>/js/colResizable-1.3.min.js"></script>
    <script type="text/javascript" src="<%=path%>/js/common.js"></script>
    <title>申购表单</title>
</head>
<body>
<div class="box_center">
    <form action="/applyEdit.jsp" class="jqtransform" >
        <table class="form_table pt15 pb15" width="100%" border="0" cellpadding="0" cellspacing="0">
            <tr>
                <td class="td_right"></td>
                <td class="">
                    <input type="submit" value="申购物品"  class="input-text lh30" size="40">
                </td>
            </tr>
            </table>
        </form>

    <form action="/approve/seeks.do" class="jqtransform" >
        <table class="form_table pt15 pb15" width="100%" border="0" cellpadding="0" cellspacing="0">
            <tr>
                <td class="td_right"></td>
                <td class="">
                    <input type="submit" value="申购进度"  class="input-text lh30" size="40">
                </td>
            </tr>
        </table>
    </form>

    <form action="/hello.jsp" class="jqtransform" >
        <table class="form_table pt15 pb15" width="100%" border="0" cellpadding="0" cellspacing="0">
            <tr>
                <td class="td_right"></td>
                <td class="">
                    <input type="submit" value="保修物品"  class="input-text lh30" size="40">
                </td>
            </tr>
        </table>
    </form>

    <form action="/hello.jsp" class="jqtransform" >
        <table class="form_table pt15 pb15" width="100%" border="0" cellpadding="0" cellspacing="0">
            <tr>
                <td class="td_right"></td>
                <td class="">
                    <input type="submit" value="保修进度"  class="input-text lh30" size="40">
                </td>
            </tr>
        </table>
    </form>
    <c:if test="${dptPower<3}">
        <form action="/approve/findOne.do" class="jqtransform" >
            <table class="form_table pt15 pb15" width="100%" border="0" cellpadding="0" cellspacing="0">
                <tr>
                    <td class="td_right"></td>
                    <td class="">
                        <input type="submit" value="审批申领"  class="input-text lh30" size="40">
                    </td>
                </tr>
            </table>
        </form>
    </c:if>
</div>
</body>
</html>
