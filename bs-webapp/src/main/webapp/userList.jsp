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
        $(function () {
            loadUser();
        });

        /**
         * 加载用户列表
         */
        function loadUser() {
            //姓名
            var realName = $('#realName').val();
            //要查询的页码
            var pageNo = $('#pageNo').val();

            //查询的参数
            var param = {'realName': realName, 'pageNo': pageNo};
            $("#data_div").load('/user/list.do',param);
        }

        /**
         *删除用户
         */
        function deleteUser(empId) {
            $.post('/user/delete.do',{'empId':empId},function (result) {
                if(result == undefined || !result.success){
                    alert("请求异常");
                }

                if(result.data){
                    //删除成功重新加载页面
                    loadUser();
                    return;
                }

                alert("删除失败")
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
                    <table class="form_table" border="0" cellpadding="0" cellspacing="0">
                        <tr>
                            <td>姓名</td>
                            <td><input id="realName" type="text" name="realName" class="input-text lh25" size="10"></td>
                            <td>性别</td>
                            <td>
                                <input type="radio" name="gender" value="0" checked> all
                                <input type="radio" name="gender" value="1"> 男
                                <input type="radio" name="gender" value="2"> 女
                            </td>
                        </tr>
                    </table>
                </div>
                <div class="box_bottom pb5 pt5 pr10" style="border-top:1px solid #dadada;">
                    <div class="search_bar_btn" style="text-align:right;">
                        <input type="button" onclick="location.href = '/user/goFormPage.do' " class="ext_btn ext_btn_success" value="添 加">
                        <input type="button" onclick="loadUser()" value="查 询" class="ext_btn ext_btn_submit">

                    </div>
                </div>
            </div>
        </div>
    </div>

    <div id="table" class="mt10">
        <div id="data_div" class="box span10 oh">
            <%--此处load数据--%>
        </div>
    </div>
</body>
</html>
