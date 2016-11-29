<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/10/20
  Time: 13:17
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
        <title>部门管理-部门编辑</title>
    </head>
<body>
<div id="forms" class="mt10">
    <div class="box">
        <div class="box_border">
            <div class="box_top"><b class="pl15">表单</b></div>
            <div class="box_center">
                <form action="/dept/save.do" class="jqtransform" >
                    <table class="form_table pt15 pb15" width="100%" border="0" cellpadding="0" cellspacing="0">
                       <input type="hidden" name="id" value="${id}">
                        <tr>
                            <td class="td_right">部门 编号：</td>
                            <td class="">
                                <input type="text" name="dptNum" class="input-text lh30" size="40">
                            </td>
                        </tr>
                        <tr>
                            <td class="td_right">部门 名字：</td>
                            <td><input type="text" name="dptName" class="input-text lh30" size="40"></td>
                        </tr>
                        <tr>
                            <td class="td_right">部门 等级：</td>
                            <td><input type="text" name="dptPower" class="input-text lh30" size="40"></td>
                        </tr>
                        <tr>
                            <td class="td_right">上级部门编号</td>
                            <td class="">
                                <input  class="input-text lh30" size="40"type="text" name="supDptnum">
                            </td>
                        </tr>

                        <tr>
                            <td class="td_right">&nbsp;</td>
                            <td class="">

                                <input type="submit" name="button" class="btn btn82 btn_save2" value="保存">
                                <input type="reset" name="button" class="btn btn82 btn_res" value="重置">
                            </td>
                        </tr>
                    </table>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>

