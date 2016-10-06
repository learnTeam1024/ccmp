<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script type="text/javascript">
    function setPageNo(pageNo){
        if(pageNo < 0){
            pageNo = 0;
        }
        $("#pageNo").val(pageNo);
    }
</script>

<table id="dataTable" width="100%" border="0" cellpadding="0" cellspacing="0" class="list_table">
    <tr>
        <th width="5%">编号</th>
        <th width="10%">账号</th>
        <th width="15%">姓名</th>
        <th width="10%">性别</th>
        <th width="10%">年龄</th>
        <th width="15%">手机</th>
        <th width="15%">创建时间</th>
        <th width="20%">操作</th>
    </tr>

    <c:if test="${pageResult.success && pageResult.data.size() > 0}">
        <c:forEach items="${pageResult.data}" var="employ" >
            <tr class="tr">
                <td>${employ.empId}</td>
                <td>${employ.userName}</td>
                <td>${employ.realName}</td>
                <td>${employ.gender}</td>
                <td>${employ.age}</td>
                <td>${employ.phoneNumber}</td>
                <td>${employ.createTime}</td>
                <td>
                    <a style="cursor: pointer" onclick="updateUser(${employ.empId})">修改</a>|<a style="cursor: pointer" onclick="deleteUser(${employ.empId})">删除</a>
                </td>
            </tr>
        </c:forEach>
    </c:if>

</table>
<div class="page mt10">
    <div class="pagination">
        <ul>
            <li><a href="javascript:setPageNo(1)">首页</a></li>
            <li><a href="javascript:setPageNo(${pageResult.currentPage}-1)">上一页</a></li>
            <li><a href="javascript:setPageNo(${pageResult.currentPage}+1)">下一页</a></li>
            <li><a href="javascript:setPageNo(${pageResult.totalPage})">末页</a></li>
        </ul>
    </div>
    <input type="hidden" id="pageNo" value="${pageResult.currentPage}">
    共 ${pageResult.totalItem} 条记录, 共 ${pageResult.totalPage} 页, 当前第${pageResult.currentPage}页
</div>
