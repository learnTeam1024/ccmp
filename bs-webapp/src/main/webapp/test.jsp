<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016-12-06
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
    String path = request.getContextPath(); %>
<html>
<style>
    div {
        padding: 20px;
    }
</style>
<head>
    <link rel="stylesheet" href="<%=path%>/css/common.css">
    <link rel="stylesheet" href="<%=path%>/css/main.css">
    <script type="text/javascript" src="<%=path%>/js/jquery.min.js"></script>
    <script type="text/javascript" src="<%=path%>/js/colResizable-1.3.min.js"></script>
    <script type="text/javascript" src="<%=path%>/js/common.js"></script>

    <title>test</title>

</head>
<script>
    function ssss() {
        var ss=$('input:radio:checked').parent().text();
        location.href="/approve/si.do?ss="+ss;
    }
</script>

<body id="add_role">
<tr>
    <input type="radio" name="si" value="0">a
    <input type="radio" name="si" value="1" checked>b
    <input type="radio" name="si" value="2">c
    <input type="radio" name="si" value="3">d
    <a  onclick="ssss()">11</a>
</tr>
<div id="aa">
    前面一条河，岸边几只鹅
    嘻声赶落河..
</div>
</body>
</html>
