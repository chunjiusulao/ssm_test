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
    <link rel="stylesheet" href="${ctx }/static/assets_admin/css/bootstrap.css" />
    <link rel="stylesheet" href="${ctx }/static/assets_admin/css/font-awesome.css" />

    <!-- page specific plugin styles -->
    <link rel="stylesheet" href="${ctx }/static/assets_admin/css/jquery-ui.custom.css" />
    <link rel="stylesheet" href="${ctx }/static/assets_admin/css/jquery.gritter.css" />


    <!-- text fonts -->
    <link rel="stylesheet" href="${ctx }/static/assets_admin/css/ace-fonts.css" />

    <!-- ace styles -->
    <link rel="stylesheet" href="${ctx }/static/assets_admin/css/ace.css" class="ace-main-stylesheet" id="main-ace-style" />

    <!--[if lte IE 9]>
    <link rel="stylesheet" href="${ctx }/static/assets_admin/css/ace-part2.css" class="ace-main-stylesheet" />
    <![endif]-->

    <!--[if lte IE 9]>
    <link rel="stylesheet" href="${ctx }/static/assets_admin/css/ace-ie.css" />
    <![endif]-->

    <!-- inline styles related to this page -->


    <!-- ace settings handler -->
    <script src="${ctx }/static/assets_admin/js/ace-extra.js"></script>

    <!-- HTML5shiv and Respond.js for IE8 to support HTML5 elements and media queries -->

    <!--[if lte IE 8]>
		<script src="${ctx }/static/assets_admin/js/html5shiv.js"></script>
		<script src="${ctx }/static/assets_admin/js/respond.js"></script>

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

                                    <form action="" method="post">
                                        <fieldset>
                                            <label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input name="userName" type="text" class="form-control" placeholder="用户名" />
															<i class="ace-icon fa fa-user"></i>
														</span>
                                            </label>

                                            <label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input name="password" type="password" class="form-control" placeholder="密码" />
															<i class="ace-icon fa fa-lock"></i>
														</span>
                                            </label>

                                            <div style="text-align: center">
                                                <button type="submit" style="width: 100px;" onclick="javascript:this.form.action='${ctx}/admin/register';" class=" btn btn-sm btn-primary">
                                                    <i class="ace-icon fa fa-key"></i>
                                                    <span class="bigger-110">注册</span>
                                                </button>
                                                <button type="submit" style="width: 100px;" onclick="javascript:this.form.action='${ctx}/user/login';" class=" btn btn-sm btn-primary">
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
<script src="${ctx }/static/assets_admin/js/bootstrap.js"></script>

<!-- page specific plugin scripts -->
<script src="${ctx }/static/assets_admin/js/dataTables/jquery.dataTables.js"></script>
<script src="${ctx }/static/assets_admin/js/dataTables/jquery.dataTables.bootstrap.js"></script>
<script src="${ctx }/static/assets_admin/js/dataTables/extensions/TableTools/js/dataTables.tableTools.js"></script>
<script src="${ctx }/static/assets_admin/js/dataTables/extensions/ColVis/js/dataTables.colVis.js"></script>
<script src="${ctx }/static/assets_admin/js/jquery-ui.custom.js"></script>
<script src="${ctx }/static/assets_admin/js/jquery.ui.touch-punch.js"></script>
<script src="${ctx }/static/assets_admin/js/chosen.jquery.js"></script>
<script src="${ctx }/static/assets_admin/js/bootbox.js"></script>
<script src="${ctx }/static/assets_admin/js/jquery.easypiechart.js"></script>
<script src="${ctx }/static/assets_admin/js/jquery.gritter.js"></script>
<script src="${ctx }/static/assets_admin/js/spin.js"></script>
<script src="${ctx }/static/assets_admin/js/bootstrap-colorpicker.js"></script>
<script src="${ctx }/static/assets_admin/js/jquery.knob.js"></script>
<script src="${ctx }/static/assets_admin/js/jquery.autosize.js"></script>
<script src="${ctx }/static/assets_admin/js/jquery.inputlimiter.1.3.1.js"></script>
<script src="${ctx }/static/assets_admin/js/jquery.maskedinput.js"></script>
<script src="${ctx }/static/assets_admin/js/bootstrap-tag.js"></script>
<script src="${ctx }/static/assets_admin/js/selectchoose.js"></script>
<script language="javascript" type="text/javascript" src="${ctx }/static/assets_admin/My97DatePicker/WdatePicker.js"></script>


<!-- ace scripts -->
<script src="${ctx }/static/assets_admin/js/ace/elements.scroller.js"></script>
<script src="${ctx }/static/assets_admin/js/ace/elements.colorpicker.js"></script>
<script src="${ctx }/static/assets_admin/js/ace/elements.fileinput.js"></script>
<script src="${ctx }/static/assets_admin/js/ace/elements.typeahead.js"></script>
<script src="${ctx }/static/assets_admin/js/ace/elements.wysiwyg.js"></script>
<script src="${ctx }/static/assets_admin/js/ace/elements.spinner.js"></script>
<script src="${ctx }/static/assets_admin/js/ace/elements.treeview.js"></script>
<script src="${ctx }/static/assets_admin/js/ace/elements.wizard.js"></script>
<script src="${ctx }/static/assets_admin/js/ace/elements.aside.js"></script>
<script src="${ctx }/static/assets_admin/js/ace/ace.js"></script>
<script src="${ctx }/static/assets_admin/js/ace/ace.ajax-content.js"></script>
<script src="${ctx }/static/assets_admin/js/ace/ace.touch-drag.js"></script>
<script src="${ctx }/static/assets_admin/js/ace/ace.sidebar.js"></script>
<script src="${ctx }/static/assets_admin/js/ace/ace.sidebar-scroll-1.js"></script>
<script src="${ctx }/static/assets_admin/js/ace/ace.submenu-hover.js"></script>
<script src="${ctx }/static/assets_admin/js/ace/ace.widget-box.js"></script>
<script src="${ctx }/static/assets_admin/js/ace/ace.settings.js"></script>
<script src="${ctx }/static/assets_admin/js/ace/ace.settings-rtl.js"></script>
<script src="${ctx }/static/assets_admin/js/ace/ace.settings-skin.js"></script>
<script src="${ctx }/static/assets_admin/js/ace/ace.widget-on-reload.js"></script>
<script src="${ctx }/static/assets_admin/js/ace/ace.searchbox-autocomplete.js"></script>

<!-- inline scripts related to this page -->
<script type="text/javascript">
    jQuery(function($) {
        <c:if test="${msg.messageName == 'errorText'}">
        $.gritter.add({
            title: '操作反馈',
            text: '${msg.messageValue}',
            class_name: 'gritter-error gritter-center'
        });
        </c:if>
        <c:if test="${msg.messageName == 'successText'}">
        $.gritter.add({
            title: '操作反馈',
            text: '${msg.messageValue}',
            class_name: 'gritter-info gritter-center'
        });
        </c:if>

    });
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
