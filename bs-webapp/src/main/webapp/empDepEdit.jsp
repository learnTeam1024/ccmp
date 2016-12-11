<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016-11-21
  Time: 12:57
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
    <html>
    <head>
        <title>角色职位管理</title>
    </head>
    <script type="text/javascript">
        function getVal(id) {
            var userName=document.getElementById(id).value;
            $.ajax({
                url:"/empDep/testName.do",
                type:"post",
                data:{"userName":userName},
                dataType:"json",
                async:false,
                success:function(result){
                    $("#res").text("");
                    $("#res").text(result.message);
                },
                error:function(result){
                    alert(result.message)
                }
            });
        }
        function getVale(id) {
            var depNum=document.getElementById(id).value;
            $.ajax({
                url:"/empDep/testNum.do",
                type:"post",
                data:{"depNum":depNum},
                dataType:"json",
                async:false,
                success:function(result){
                    $("#ree").text("");
                    $("#ree").text(result.message);
                },
                error:function(result){
                    alert(result.message)
                }
            });

        }
        function saveEmp() {
            if( $("#res").text()=="符合条件"& $("#ree").text()=="符合条件" ){
                var userName=$("#dep").val();
                var depNum=$("#dep_num").val();
                location.href="/empDep/save.do?userName="+userName+"&depNum="+depNum;
            }else {
                alert("false");
            }
        }
    </script>
<body>
<div id="forms" class="mt10">
    <div class="box">
        <div class="box_border">
            <div class="box_top"><b class="pl15">表单</b></div>
            <div class="box_center">
                    <table class="form_table pt15 pb15" width="100%" border="0" cellpadding="0" cellspacing="0">
                        <input type="hidden" name="id" value="${id}">
                        <tr>
                            <td class="td_right" >角色  姓名 ：</td>
                            <td class="">
                                <input type="text" name="userName" class="input-text lh30" size="40" id="dep"
                                       onblur="getVal(this.id)">
                                <td id="res"></td>
                            </td>
                        </tr>
                        <tr>
                            <td class="td_right">部门  编号：</td>
                            <td><input type="text" name="depNum" class="input-text lh30" size="40"id="dep_num"
                                       onblur="getVale(this.id)"></td>
                            <td id="ree"></td>
                        </tr>
                        <tr>
                            <td class="td_right">&nbsp;</td>
                            <td class="">
                                <a style="cursor: pointer" onclick="saveEmp()">保存</a>
                            </td>
                        </tr>
                    </table>
            </div>
        </div>
    </div>
</div>
</body>
</html>

