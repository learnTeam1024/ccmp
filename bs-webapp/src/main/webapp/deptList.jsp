<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String path = request.getContextPath(); %>

<html>
<head>
    <link rel="stylesheet" href="<%=path%>/css/common.css">
    <link rel="stylesheet" href="<%=path%>/css/main.css">
    <script type="text/javascript" src="<%=path%>/js/jquery.min.js"></script>
    <script type="text/javascript" src="<%=path%>/js/colResizable-1.3.min.js"></script>
    <script type="text/javascript" src="<%=path%>/js/common.js"></script>

    <title>员工发管理-用户列表</title>

</head>
<body>
<div id="search_dpt">
  <tr>
      <td>部门名字</td>
      <td input id="dptName" type="text" name="dptName" class="input_dptName"></td>
      <td>部门编号</td>
      <td id="dptNum" type="text" name="dptNum" class="input_dptNum"></td>
  </tr>
    <div id="load_dpt " >
        <input type="button" onclick="location.href='/deptEdit.jsp'" value="添加">
        <input type="button" onclick="loadDpt()"value="查询">

    </div>
</div>
   <div id="dpt_table">

   </div>
</body>
</html>
