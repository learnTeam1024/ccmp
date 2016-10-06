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

    <title>用户管理-用户列表</title>


    <script type="text/javascript">
        function searchUser() {

        }

        /**
         *删除用户
         */
        function deleteUser(empId) {
            $.post('/user/delete.do',{'empId':empId},function (data) {

            });
        }

        /**
         * 修改用户
         * @param empId
         */
        function updateUser(empId) {
            location.href="/user/goFormPage.do?empId="+empId;
        }
    </script>
</head>
<body>
    <div id="search_bar" class="mt10">
        <div class="box">
            <div class="box_border">
                <div class="box_top"><b class="pl15">搜索</b></div>
                <div class="box_center pt10 pb10">
                    <form id="searchForm">
                    <table class="form_table" border="0" cellpadding="0" cellspacing="0">
                        <tr>
                            <td>姓名</td>
                            <td><input type="text" name="realName" class="input-text lh25" size="10"></td>
                            <td>性别</td>
                            <td>
                                <input type="radio" name="gender" value="0" checked> all
                                <input type="radio" name="gender" value="1"> 男
                                <input type="radio" name="gender" value="2"> 女
                            </td>
                        </tr>
                    </table>
                    </form>
                </div>
                <div class="box_bottom pb5 pt5 pr10" style="border-top:1px solid #dadada;">
                    <div class="search_bar_btn" style="text-align:right;">
                        <input type="button" onclick="location.href = '/user/goFormPage.do' " class="ext_btn ext_btn_success" value="添 加">
                        <input type="submit" value="查 询" class="ext_btn ext_btn_submit">
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div id="table" class="mt10">
        <div class="box span10 oh">
            <table width="100%" border="0" cellpadding="0" cellspacing="0" class="list_table">
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

                <tr class="tr">
                    <td>1</td>
                    <td>aad</td>
                    <td>aad</td>
                    <td>aad</td>
                    <td>aad</td>
                    <td>aad</td>
                    <td>aad</td>
                    <td>
                        <a style="cursor: pointer" onclick="updateUser()">修改</a>|<a style="cursor: pointer" onclick="deleteUser()">删除</a>
                    </td>
                </tr>

            </table>
            <div class="page mt10">
                <div class="pagination">
                    <ul>
                        <li class="first-child"><a href="#">首页</a></li>
                        <li class="disabled"><span>上一页</span></li>
                        <li class="active"><span>1</span></li>
                        <li><a href="#">2</a></li>
                        <li><a href="#">下一页</a></li>
                        <li class="last-child"><a href="#">末页</a></li>
                    </ul>
                </div>

            </div>
        </div>
    </div>
</body>
</html>
