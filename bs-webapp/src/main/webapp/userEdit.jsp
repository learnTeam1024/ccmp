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
        <title>用户管理-用户编辑</title>
    </head>
<body>
<div id="forms" class="mt10">
    <div class="box">
        <div class="box_border">
            <div class="box_top"><b class="pl15">表单</b></div>
            <div class="box_center">
                <form action="<c:url value="/user/save.do"/>" class="jqtransform" method="post">
                    <table class="form_table pt15 pb15" width="100%" border="0" cellpadding="0" cellspacing="0">
                        <tr>
                            <td class="td_right">账 号：</td>
                            <td class="">
                                <input type="text" name="userName" class="input-text lh30" size="40">
                            </td>
                        </tr>
                        <tr>
                            <td class="td_right">姓 名：</td>
                            <td><input type="text" name="realName" class="input-text lh30" size="40"></td>
                        </tr>
                        <tr>
                            <td class="td_right">性 别：</td>
                            <td class="">
                                <input type="radio" name="gender" value="1" checked> 男
                                <input type="radio" name="gender" value="2"> 女
                            </td>
                        </tr>
                        <tr>
                            <td class="td_right">年龄：</td>
                            <td>
                                <input type="text" name="age" class="input-text lh30" size="40">
                            </td>
                        </tr>
                        <tr>
                            <td class="td_right">手 机：</td>
                            <td class="">
                                <input type="text" name="phoneNumber" class="input-text lh30" size="40">
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
