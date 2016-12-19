<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016-12-19
  Time: 12:12
  To change this template use File | Settings | File Templates.
--%>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016-12-18
  Time: 15:40
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

    <title>修改员工</title>
</head>
<script>

    function  back() {
        location.href="/tuser/index.do";
    }


</script>
<body>
<div id="forms" class="mt10">
    <div class="box">
        <div class="box_border">
            <div class="box_top"><b class="pl15">表单</b></div>
            <div class="box_center">
                <form action="/tuser/add.do?" class="jqtransform"   >
                    <table class="form_table pt15 pb15" width="100%" border="0" cellpadding="0" cellspacing="0">
                        <input type="text" name="id" style="display:none" value=${tu.id} />
                        <tr>
                            <td class="td_right">员工工号：</td>
                            <td class="">
                                <input type="text" name="staffId" class="input-text lh30" size="40"value=${tu.staffId}>
                            </td>
                        </tr>
                        <tr>
                            <td class="td_right">真实姓名：</td>
                            <td><input type="text" name="realName" class="input-text lh30" size="40"value=${tu.realName}></td>
                        </tr>
                        <tr>
                            <td class="td_right">所属部门 ：</td>
                            <td class="">
                                <input  class="input-text lh30" size="40"type="text" name="departCd"value=${tu.departCd}>
                            </td>
                        </tr>
                        <tr>
                            <td class="td_right">部门负责人：</td>
                             <c:if test="${tu.isprincipal=='是'}">
                            <td>
                                <select  name="isprincipal" >
                                    <option selected="selected" value="是"> 是</option>
                                    <option  value="否"> 否</option>
                                </select>
                            </td></c:if>
                            <c:if test="${tu.isprincipal=='否'}">
                                <td>
                                    <select  name="isprincipal" >
                                        <option  value="是"> 是</option>
                                        <option selected="selected" value="否"> 否</option>
                                    </select>
                                </td></c:if>
                        </tr>
                        <tr>
                            <td class="td_right">个人手机：</td>
                            <td class="">
                                <input  class="input-text lh30" size="40"type="text" name="mobile"value=${tu.mobile}>
                            </td>
                        </tr>
                        <tr>
                            <td class="td_right">电子邮件：</td>
                            <td class="">
                                <input  class="input-text lh30" size="40"type="text" name="email" size="200"value=${tu.email}>
                            </td>
                        </tr>
                        <tr>
                            <td class="td_right">职务：</td>
                            <td class="">
                                <input  class="input-text lh30" size="40"type="text" name="duty" size="200"value=${tu.duty}>
                            </td>
                        </tr>
                        <tr>
                            <td class="td_right">控制范围：</td>
                             <c:if test="${tu.controlcd=='部门'}">
                            <td class="ts" id="t2">
                                <input type="radio" value="部门" name="controlcd" checked="checked">部门
                                <input type="radio" value="个人" name="controlcd">个人
                            </td>
                             </c:if>
                            <c:if test="${tu.controlcd=='个人'}">
                                <td class="ts" id="t2">
                                    <input type="radio" value="部门" name="controlcd">部门
                                    <input type="radio" value="个人" name="controlcd"  checked="checked">个人
                                </td>
                            </c:if>
                        </tr>
                        <tr>
                            <td class="td_right">公司手机：</td>
                            <td class="">
                                <input  class="input-text lh30" size="40"type="text" name="pubMobile" size="200"value=${tu.pubMobile}>
                            </td>
                        </tr>
                        <tr>
                            <td class="td_right">手机短号：</td>
                            <td class="">
                                <input  class="input-text lh30" size="40"type="text" name="pubCornet" size="200"value=${tu.pubCornet}>
                            </td>
                        </tr>
                        <tr>
                            <td class="td_right">固定电话：</td>
                            <td class="">
                                <input  class="input-text lh30" size="40"type="text" name="tel" size="200"value=${tu.tel}>
                            </td>
                        </tr>
                        <tr>
                            <td class="td_right">固话短号：</td>
                            <td class="">
                                <input  class="input-text lh30" size="40"type="text" name="telCornet" size="200"value=${tu.telCornet}>
                            </td>
                        </tr>
                        <tr>
                            <td class="td_right">备注：</td>
                            <td class="">
                                <input  class="input-text lh30" size="40"type="text" name="memo" size="200"value=${tu.memo}>
                            </td>
                        </tr>
                        <tr>
                            <td class="td_right">&nbsp;</td>
                            <td class="">

                                <input type="submit"  class="btn btn82 btn_save2" value="保存">
                                <input type="button"  class="btn btn82 btn_res" value="返回" onclick="back()">
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
