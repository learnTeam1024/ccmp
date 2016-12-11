<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="css/common.css">
    <link rel="stylesheet" href="css/style.css">
    <script type="text/javascript" src  ="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/jquery.SuperSlide.js"></script>
    <script type="text/javascript">
        $(function(){
            //菜单的选中状态
            $("#navigate").find("li").click(function () {
                $("#navigate").find("li").attr("class","off");
                $(this).attr("class","on");

                //菜单地址
                var liUrl = $(this).attr("url");
                $("#rightMain").attr("src", liUrl);
            });

            $(".sideMenu").slide({
                titCell:"h3",
                targetCell:"ul",
                defaultIndex:0,
                effect:'slideDown',
                delayTime:'500' ,
                trigger:'click',
                triggerTime:'150',
                defaultPlay:true,
                returnDefault:false,
                easing:'easeInQuint',
                endFun:function(){
                    scrollWW();
                }
            });
            $(window).resize(function() {
                scrollWW();
            });
        });


        function scrollWW(){
            if($(".side").height()<$(".sideMenu").height()){
                $(".scroll").show();
                var pos = $(".sideMenu ul:visible").position().top-38;
                $('.sideMenu').animate({top:-pos});
            }else{
                $(".scroll").hide();
                $('.sideMenu').animate({top:0});
                n=1;
            }
        }

        var n=1;
        function menuScroll(num){
            var Scroll = $('.sideMenu');
            var ScrollP = $('.sideMenu').position();
            /*alert(n);
             alert(ScrollP.top);*/
            if(num==1){
                Scroll.animate({top:ScrollP.top-38});
                n = n+1;
            }else{
                if (ScrollP.top > -38 && ScrollP.top != 0) { ScrollP.top = -38; }
                if (ScrollP.top<0) {
                    Scroll.animate({top:38+ScrollP.top});
                }else{
                    n=1;
                }
                if(n>1){
                    n = n-1;
                }
            }
        }
    </script>
    <title>后台首页</title>
</head>
<body>
<div class="top">
    <div id="top_t">
        <div id="logo" class="fl"></div>
        <div id="photo_info" class="fr">
            <div id="photo" class="fl">
                <a href="#"><img src="images/a.png" alt="" width="60" height="60"></a>
            </div>
            <div id="base_info" class="fr">
                <div class="help_info">
                    <a href="1" id="hp">&nbsp;</a>
                    <a href="2" id="gy">&nbsp;</a>
                    <a href="3" id="out">&nbsp;</a>
                </div>
                <div class="info_center">
                    ${name}
                    <span id="nt">通知</span><span><a href="#" id="notice">3</a></span>
                </div>
            </div>
        </div>
    </div>
    <div id="side_here">
        <div id="side_here_l" class="fl"></div>
        <div id="here_area" class="fl">当前位置：</div>
    </div>
</div>
<div class="side">
    <div id="navigate" class="sideMenu" style="margin:0 auto">
        <h3>系统管理</h3>
        <ul>
            <li url="/user/index.do">    用户管理</li>
            <li url="/dept/index.do">    部门管理</li>
            <li url="/approve/index.do"> 菜单管理</li>
            <li url="/function.jsp">     功能管理</li>
            <li url="/role/index.do">    角色管理</li>
            <li url="/empDep/index.do">  职位管理</li>
        </ul>
        <h3>仓库管理</h3>
        <ul>
            <li url="/test.jsp">固定资产</li>
        </ul>
    </div>
</div>
<div class="main">
    <iframe name="right" id="rightMain" src="main.html" frameborder="no" scrolling="auto" width="100%" height="auto" allowtransparency="true"></iframe>
</div>
<div class="bottom">
    <div id="bottom_bg">版权</div>
</div>
<div class="scroll">
    <a href="javascript:;" class="per" title="使用鼠标滚轴滚动侧栏" onclick="menuScroll(1);"></a>
    <a href="javascript:;" class="next" title="使用鼠标滚轴滚动侧栏" onclick="menuScroll(2);"></a>
</div>
</body>

</html>


