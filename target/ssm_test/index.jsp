<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta charset="utf-8" />
    <title><%--<%= Const.ADMIN_TITLE%>--%> - 登录</title>

    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

    <link rel="SHORTCUT ICON" href="${ctx }/static/assets_admin/img/icon.png"/>
    <!-- bootstrap & fontawesome -->
    <!--
		<link rel="stylesheet" href="${ctx }${urls.getForLookupPath('/static/assets_admin/css/bootstrap.css') }" />
		-->
    <link rel="stylesheet" href="${ctx }/static/assets_admin/css/bootstrap.css" />
    <link rel="stylesheet" href="${ctx }/static/assets_admin/css/font-awesome.css" />

    <!-- text fonts -->
    <link rel="stylesheet" href="${ctx }/static/assets_admin/css/ace-fonts.css" />

    <!-- ace styles -->
    <link rel="stylesheet" href="${ctx }/static/assets_admin/css/ace.css" />

    <!--[if lte IE 9]>
    <link rel="stylesheet" href="${ctx }/static/assets_admin/css/ace-part2.css" />
    <![endif]-->
    <link rel="stylesheet" href="${ctx }/static/assets_admin/css/ace-rtl.css" />

    <!--[if lte IE 9]>
    <link rel="stylesheet" href="${ctx }/static/assets_admin/css/ace-ie.css" />
    <![endif]-->

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->

    <!--[if lt IE 9]>
    <script src="${ctx }/static/assets_admin/js/html5shiv.js"></script>
    <script src="${ctx }/static/assets_admin/js/respond.js"></script>
    <![endif]-->
    <script type="text/javascript">
        function gotoTop(){
            if (self != top) {
                parent.window.location.replace(window.location.href);
            }
        }
    </script>
</head>

<body onload="gotoTop()" class="login-layout light-login">
<div class="main-container">
    <div class="main-content">
        <div class="row">
            <div class="col-sm-10 col-sm-offset-1">
                <div class="login-container">
                    <div class="center" style="margin-top: 50px;">
                        <img src="${ctx }/static/assets_admin/img/logo.png" />
                    </div>

                    <div class="space-6"></div>

                    <div class="position-relative">
                        <div id="login-box" class="login-box visible widget-box no-border">
                            <div class="widget-body">
                                <div class="widget-main">
                                    <h4 class="header blue lighter bigger">
                                        <i class="ace-icon fa fa-leaf green"></i>
                                        <%--<%= Const.ADMIN_TITLE%> --%>登录
                                    </h4>

                                    <div class="space-6"></div>

                                    <form action="${ctx}/user/login" method="post">
                                        <fieldset>
                                            <label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input name="userName" type="text" class="form-control" placeholder="用户名" required="required" />
															<i class="ace-icon fa fa-user"></i>
														</span>
                                            </label>

                                            <label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input name="password" type="password" class="form-control" placeholder="密码" required="required" />
															<i class="ace-icon fa fa-lock"></i>
														</span>
                                            </label>

                                                <button type="submit" class=" pull-right btn btn-sm btn-primary">
                                                    <i class="ace-icon fa fa-key"></i>
                                                    <span class="bigger-110">登 录</span>
                                                </button>
                                            </div>

                                            <div class="space-4"></div>
                                        </fieldset>
                                    </form>
                                </div><!-- /.widget-main -->
                                <c:if test="${not empty errorText }">
                                    <div class="toolbar clearfix col-sm-12 align-center" style="width: 100%;">
                                        <div>
                                                ${errorText }
                                        </div>
                                    </div>
                                </c:if>

                                <div class="toolbar clearfix col-sm-12 align-center" style="width: 100%;">
                                    <div>
                                        <a href="javascript:void(0);" class="forgot-password-link">
                                            MagicalRainbow Technology Co.Ltd.
                                        </a>
                                    </div>
                                </div>
                            </div><!-- /.widget-body -->
                        </div><!-- /.login-box -->
                    </div><!-- /.position-relative -->

                    <!-- 							<div class="navbar-fixed-top align-right"> -->
                    <!-- 								<br /> -->
                    <!-- 								&nbsp; -->
                    <!-- 								<a href="http://www.mimidai.com" target="_blank">米米贷主页</a> -->
                    <!-- 								&nbsp; -->
                    <!-- 							</div> -->
                </div>
            </div><!-- /.col -->
        </div><!-- /.row -->
    </div><!-- /.main-content -->
</div><!-- /.main-container -->

<!-- basic scripts -->

<!--[if !IE]> -->
<script type="text/javascript">
    window.jQuery || document.write("<script src='${ctx }/static/assets_admin/js/jquery.js'>"+"<"+"/script>");
</script>

<!-- <![endif]-->

<!--[if IE]>
<script type="text/javascript">
    window.jQuery || document.write("<script src='${ctx }/static/assets_admin/js/jquery1x.js'>"+"<"+"/script>");
</script>
<![endif]-->
<script type="text/javascript">
    if('ontouchstart' in document.documentElement) document.write("<script src='${ctx }/static/assets_admin/js/jquery.mobile.custom.js'>"+"<"+"/script>");
</script>

<!-- inline scripts related to this page -->
<script type="text/javascript">
    jQuery(function($) {
        $(document).on('click', '.toolbar a[data-target]', function(e) {
            e.preventDefault();
            var target = $(this).data('target');
            $('.widget-box.visible').removeClass('visible');//hide others
            $(target).addClass('visible');//show target
        });
    });



    //you don't need this, just used for changing background
    jQuery(function($) {
        $('#btn-login-dark').on('click', function(e) {
            $('body').attr('class', 'login-layout');
            $('#id-text2').attr('class', 'white');
            $('#id-company-text').attr('class', 'blue');

            e.preventDefault();
        });
        $('#btn-login-light').on('click', function(e) {
            $('body').attr('class', 'login-layout light-login');
            $('#id-text2').attr('class', 'grey');
            $('#id-company-text').attr('class', 'blue');

            e.preventDefault();
        });
        $('#btn-login-blur').on('click', function(e) {
            $('body').attr('class', 'login-layout blur-login');
            $('#id-text2').attr('class', 'white');
            $('#id-company-text').attr('class', 'light-blue');

            e.preventDefault();
        });

    });
</script>
</body>
</html>
