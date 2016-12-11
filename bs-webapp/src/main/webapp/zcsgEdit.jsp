<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016-12-09
  Time: 19:10
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
                <form action="/zcsg/save.do" class="jqtransform"  method="post" >
                    <table class="form_table pt15 pb15" width="100%" border="0" cellpadding="0" cellspacing="0">
                        <tr>
                            <td class="td_right">资产名称：</td>
                            <td class="">
                                <input type="text" name="assetnm" class="input-text lh30" size="40">
                            </td>
                        </tr>
                        <tr>
                            <td class="td_right">申请人：</td>
                            <td><input type="text" name="oper" class="input-text lh30" size="40"></td>
                        </tr>
                        <tr>
                            <td class="td_right">使用人：</td>
                            <td class="">
                                <input  class="input-text lh30" size="40"type="text" name="custos">
                            </td>
                        </tr>
                        <tr>
                            <td class="td_right">部 门：</td>
                            <td class="">
                                <input  class="input-text lh30" size="40"type="text" name="dept">
                            </td>
                        </tr>
                        <tr>
                            <td class="td_right">数 量：</td>
                            <td class="">
                                <input  class="input-text lh30" size="40"type="text" name="ammount">
                            </td>
                        </tr>
                        <tr>
                            <td class="td_right">金 额：</td>
                            <td class="">
                                <input  class="input-text lh30" size="40"type="text" name="money">
                            </td>
                        </tr>
                        <tr>
                            <td class="td_right">申请理由：</td>
                            <td class="">
                                <input  class="input-text lh30" size="40"type="text" name="meno" size="200">
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
