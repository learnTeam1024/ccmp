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
                            <td><input type="text" name="name" class="input-text lh25" size="10"></td>
                            <td>性别</td>
                            <td>
                        <span class="fl">
                          <div class="select_border">
                            <div class="select_containers ">
                            <select name="" class="select">
                            <option>男</option>
                            <option>女</option>
                            </select>
                            </div>
                          </div>
                        </span>
                            </td>
                            <td>姓名</td>
                            <td><input type="text" name="name" class="input-text lh25" size="10"></td>
                            <td>性别</td>
                            <td>
                        <span class="fl">
                          <div class="select_border">
                            <div class="select_containers ">
                            <select name="" class="select">
                            <option>男</option>
                            <option>女</option>
                            </select>
                            </div>
                          </div>
                        </span>
                            </td>
                            <td>姓名</td>
                            <td><input type="text" name="name" class="input-text lh25" size="10"></td>
                            <td>性别</td>
                            <td>
                        <span class="fl">
                          <div class="select_border">
                            <div class="select_containers ">
                            <select name="" class="select">
                            <option>男</option>
                            <option>女</option>
                            </select>
                            </div>
                          </div>
                        </span>
                            </td>
                        </tr>
                    </table>
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
                    <th width="10">编号</th>
                    <th width="100">账号</th>
                    <th width="100">姓名</th>
                    <th width="100">性别</th>
                    <th width="100">年龄</th>
                    <th width="100">手机</th>
                    <th width="100">创建时间</th>
                    <th >操作</th>
                </tr>
                <tr class="tr">
                    <td>1</td>
                    <td>aad</td>
                    <td>aad</td>
                    <td>aad</td>
                    <td>aad</td>
                    <td>aad</td>
                    <td>aad</td>
                    <td>修改|删除</td>
                </tr>
                <tr class="tr">
                    <td>1</td>
                    <td>aad</td>
                    <td>aad</td>
                    <td>aad</td>
                    <td>aad</td>
                    <td>aad</td>
                    <td>aad</td>
                    <td>修改|删除</td>
                </tr>
                <tr class="tr">
                    <td>1</td>
                    <td>aad</td>
                    <td>aad</td>
                    <td>aad</td>
                    <td>aad</td>
                    <td>aad</td>
                    <td>aad</td>
                    <td>修改|删除</td>
                </tr>
                <tr class="tr">
                    <td>1</td>
                    <td>aad</td>
                    <td>aad</td>
                    <td>aad</td>
                    <td>aad</td>
                    <td>aad</td>
                    <td>aad</td>
                    <td>修改|删除</td>
                </tr>
                <tr class="tr">
                    <td>1</td>
                    <td>aad</td>
                    <td>aad</td>
                    <td>aad</td>
                    <td>aad</td>
                    <td>aad</td>
                    <td>aad</td>
                    <td>修改|删除</td>
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
