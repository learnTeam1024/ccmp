<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016-12-18
  Time: 14:13
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
    <title>员工信息表</title>
</head>
<script>
    function update() {
        var id=$('input:radio:checked').parent().next().text();
        if(id>0){
            location.href="/tuser/find.do?id="+id;
        }else{
            alert("没有选中信息");
        }

    }
    function  add() {
        location.href="/user/tuserEdit.jsp";
    }
    function  deletee() {
        var id=$('input:radio:checked').parent().next().text();
        $.ajax({
            url:"/tuser/delete.do",
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
        <td align="left">员工列表</td>  <a size="2" onclick="add()" >添加员工</a>　　　<a size="2" onclick="update()">修改</a>　　　<a size="2" onclick="deletee()">删除</a>
    </tr>
    <div>
        <form action="/tuser/finds.do" class="jqtransform">
            <tr>
                员工工号<input type="text" name="staffId">
            </tr>
            <input type="submit" value="查询">
        </form>
    </div>

    <table border="0" cellpadding="3" cellspacing="1" width="100%" align="center" style="background-color: #b9d8f3;">
        <tr style="text-align: center; COLOR: #0076C8; BACKGROUND-COLOR: #F4FAFF; font-weight: bold">
            <td><font size="2"></font></td>
            <td><font size="2">工号</font></td>
            <td><font size="2">员工名字</font></td>
            <td><font size="2">职务</font></td>
            <td><font size="2">所属部门</font></td>
            <td><font size="2">控制范围</font></td>
            <td><font size="2">是否负责人</font></td>
            <td><font size="2">公司手机</font></td>
            <td><font size="2">手机短号</font></td>
            <td><font size="2">公司固话</font></td>
            <td><font size="2">固话短号</font></td>
            <td><font size="2">个人手机</font></td>
            <td><font size="2">电子邮箱</font></td>

        </tr>

        <c:if test="${list.size() > 0}">
            <c:forEach items="${list}" var="tuser" >
                <tr class="tr">
                    <td><input type="radio" name="si" value="0"></td>
                    <td  style="display:none"><font size="2">${tuser.id}</font></td>
                    <td  align="center"><font size="2">${tuser.staffId}</font></td>
                    <td  align="center"><font size="2">${tuser.realName}</font></td>
                    <td align="center"><font size="2">${tuser.duty}</font></td>
                    <td align="center"><font size="2">${tuser.departCd}</font></td>
                    <td align="center"><font size="2">${tuser.controlcd}</font></td>
                    <td align="center"><font size="2">${tuser.isprincipal}</font></td>
                    <td align="center"><font size="2">${tuser.pubMobile}</font></td>
                    <td align="center"><font size="2">${tuser.pubCornet}</font></td>
                    <td align="center"><font size="2">${tuser.mobile}</font></td>
                    <td align="center"><font size="2">${tuser.telCornet}</font></td>
                    <td align="center"><font size="2">${tuser.mobile}</font></td>
                    <td align="center"><font size="2">${tuser.email}</font></td>


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
