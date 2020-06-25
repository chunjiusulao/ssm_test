<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" %>
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ include file="../utilpage/taglibs.jsp"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta charset="utf-8" />
		<title><%--<%= Const.ADMIN_TITLE%>--%>aaa</title>

		<meta name="description" content="overview &amp; stats" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

		<!-- bootstrap & fontawesome -->
		<link rel="stylesheet" href="${ctx }/static/assets_admin/css/bootstrap.css" />
		<link rel="stylesheet" href="${ctx }/static/assets_admin/css/font-awesome.css" />

		<!-- page specific plugin styles -->

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
		<![endif]-->
	</head>

	<body class="no-skin">
		<!-- #section:basics/navbar.layout -->
		<div id="navbar" class="navbar navbar-default">
			<script type="text/javascript">
				try{ace.settings.check('navbar' , 'fixed')}catch(e){}
			</script>

			<div class="navbar-container" id="navbar-container">
				<!-- #section:basics/sidebar.mobile.toggle -->
				<button type="button" class="navbar-toggle menu-toggler pull-left" id="menu-toggler" data-target="#sidebar">
					<span class="sr-only">Toggle sidebar</span>

					<span class="icon-bar"></span>

					<span class="icon-bar"></span>

					<span class="icon-bar"></span>
				</button>

				<!-- /section:basics/sidebar.mobile.toggle -->
				<div class="navbar-header pull-left">
					<!-- #section:basics/navbar.layout.brand -->
					<a href="#" class="navbar-brand">
						<small>
							<i class="fa fa-soccer-ball-o"></i>
							<%--<%= Const.ADMIN_TITLE%>--%>
						</small>
					</a>

					<!-- /section:basics/navbar.layout.brand -->

					<!-- #section:basics/navbar.toggle -->

					<!-- /section:basics/navbar.toggle -->
				</div>

				<!-- #section:basics/navbar.dropdown -->
				<div class="navbar-buttons navbar-header pull-right" role="navigation">
					<ul class="nav ace-nav">
						<c:if test="${newMsgCount != 0 && newMsgCount < 100}">
						<li class="purple">
							<a class="dropdown-toggle" href="#" onclick="gotoMsg()" target="main">
								<i class="ace-icon fa fa-bell icon-animated-bell"></i>
								<span class="badge badge-important">${newMsgCount}</span>
							</a>
						</li>
						</c:if>
						<c:if test="${newMsgCount > 100}">
						<li class="purple">
							<a class="dropdown-toggle" href="#">
								<i class="ace-icon fa fa-bell icon-animated-bell"></i>
								<span class="badge badge-important">..</span>
							</a>
						</li>
						</c:if>
						<li class="green">
							<a data-toggle="dropdown" class="dropdown-toggle" href="#">
								<i class="ace-icon fa fa-user"></i>
								<span class=""><small>欢迎，${userName}</small>
								</span>
							</a>	
						</li>						
						<li class="grey">
							<a target="main" class="dropdown-toggle" href="${ctx}/admin/password_update?userName=${userName}">
								<i class="ace-icon fa fa-key"></i>
								<span class="">修改密码</span>
							</a>
						</li>
						<li class="light-blue">
							<a href="/admin/logout" target="_parent">
								<i class="ace-icon fa fa-outdent"></i>
								<span class="">退出系统</span>
							</a>
						</li>
						


					</ul>
				</div>

				<!-- /section:basics/navbar.dropdown -->
			</div><!-- /.navbar-container -->
		</div>



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
			function gotoMsg(){
				$.ajax({
					    url:'${ctx}/admin/task/new_task_message_delete',
					    type:'POST', //GET
					    contentType : 'application/json', 
					    async:false,    //或false,是否异步
					    dataType:'json', 
					    success:function(data){
					    	if(data && data.success == "true"){
					    		location.reload();
					    	}
					    }
				});
			}
		</script>
		<script src="${ctx }/static/assets_admin/js/bootstrap.js"></script>

		<!-- page specific plugin scripts -->

		<!--[if lte IE 8]>
		  <script src="${ctx }/static/assets_admin/js/excanvas.js"></script>
		<![endif]-->

		<!-- ace scripts -->

		<!-- inline scripts related to this page -->

	</body>
</html>
