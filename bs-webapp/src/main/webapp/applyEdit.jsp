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
<div id="forms" class="mt10">
    <div class="box">
        <div class="box_border">
            <div class="box_top"><b class="pl15">表单</b></div>
            <div class="box_center">
                <form action="/approve/save.do" class="jqtransform"  method="post" >
                    <table class="form_table pt15 pb15" width="100%" border="0" cellpadding="0" cellspacing="0">
                        <tr>
                            <td class="td_right">名 字：</td>
                            <td class="">
                                <input type="text" name="approveName" class="input-text lh30" size="40">
                            </td>
                        </tr>
                        <tr>
                            <td class="td_right">品 牌：</td>
                            <td><input type="text" name="approveBrand" class="input-text lh30" size="40"></td>
                        </tr>
                        <tr>
                            <td class="td_right">价 格：</td>
                            <td class="">
                                <input  class="input-text lh30" size="40"type="text" name="approvePrice">
                            </td>
                        </tr>
                        <tr>
                            <td class="td_right">数 量：</td>
                            <td class="">
                                <input  class="input-text lh30" size="40"type="text" name="approveNum">
                            </td>
                        </tr>

                        <tr>
                            <td class="td_right">&nbsp;</td>
                            <td class="">

                                <input type="submit"  class="btn btn82 btn_save2" value="保存">
                                <input type="reset"  class="btn btn82 btn_res" value="重置">
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
