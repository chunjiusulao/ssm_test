<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../utilpage/taglibs.jsp"%>
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta charset="utf-8" />
		<title>CWCMS</title>

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

		<!-- inline styles related to this page  -->

		<!-- ace settings handler -->
		<script src="${ctx }/static/assets_admin/js/ace-extra.js"></script>

		<!-- HTML5shiv and Respond.js for IE8 to support HTML5 elements and media queries -->

		<!--[if lte IE 8]>
		<script src="${ctx }/static/assets_admin/js/html5shiv.js"></script>
		<script src="${ctx }/static/assets_admin/js/respond.js"></script>
		<![endif]-->
	</head>

	<body class="no-skin">
<table width="100%">
	<tr>
		<td>
		<div class="main-container" id="main-container">
			<!-- #section:basics/sidebar -->
			<div id="sidebar" class="sidebar">
				<ul class="nav nav-list">
					<!-- Menu Level 1 Begin -->
					<li class="">
						<a href="#" target="main">
							<i class="menu-icon fa fa-home"></i>
							<span class="menu-text"> 首页 </span>
						</a>
						<b class="arrow"></b>
					</li>
					<!-- Menu Level 1 end -->
					<!-- Menu Level 1 Begin -->
					<li class="">
						<a href="#" class="dropdown-toggle">
							<i class="menu-icon fa fa-file-word-o"></i>
							<span class="menu-text">
								数据管理
							</span>

							<b class="arrow fa fa-angle-down"></b>
						</a>

						<b class="arrow"></b>

						<ul class="submenu">
							<!-- Menu Level 2 Begin -->
							<li class="">								
								<a href="#" class="dropdown-toggle">
									<i class="menu-icon fa fa-caret-right"></i>
									产品管理
									<b class="arrow fa fa-angle-down"></b>
								</a>								
								<b class="arrow"></b>
								<ul class="submenu">
									<security:authorize access="hasRole('ROLE_ADMIN')">
									<li class="">
										<a href="${ctx}/admin/product_add" target="main">
											<i class="menu-icon fa fa-caret-right"></i>
											发布产品
										</a>
										<b class="arrow"></b>
									</li>
									<li class="">
										<a href="${ctx}/admin/product_list?page=1" target="main">
											<i class="menu-icon fa fa-caret-right"></i>
											未审核产品
										</a>
										<b class="arrow"></b>
									</li>
									</security:authorize>
									<li class="">
										<a href="${ctx}/admin/product_inspect_list?page=1" target="main">
											<i class="menu-icon fa fa-caret-right"></i>
											产品列表
										</a>
										<b class="arrow"></b>
									</li>

								</ul>								
							</li>
							<!-- Menu Level 2 end -->
							<!-- Menu Level 2 Begin -->
							<security:authorize access="hasRole('ROLE_USER')">
							<li class="">								
								<a href="#" class="dropdown-toggle">
									<i class="menu-icon fa fa-caret-right"></i>
									订单管理
									<b class="arrow fa fa-angle-down"></b>
								</a>								
								<b class="arrow"></b>
								<ul class="submenu">
									<li class="">
										<a href="${ctx}/admin/order_list?page=1" target="main">
											<i class="menu-icon fa fa-caret-right"></i>
											订单列表
										</a>
										<b class="arrow"></b>
									</li>
								</ul>								
							</li>
							</security:authorize>
							<!-- Menu Level 2 end -->							
						</ul>
					</li>
					<!-- Menu Level 1 end -->
					<!-- Menu Level 1 Begin -->

					<security:authorize access="hasRole('ROLE_ADMIN')">

					<!-- Menu Level 1 Begin -->
					<li class="">
						<a href="#" class="dropdown-toggle">
							<i class="menu-icon fa fa-gears"></i>
							<span class="menu-text"> 系统管理 </span>
							<b class="arrow fa fa-angle-down"></b>
						</a>
						<b class="arrow"></b>
						<ul class="submenu">
							<li class="">
								<a href="#" class="dropdown-toggle">
									<i class="menu-icon fa fa-caret-right"></i>
									账号管理
									<b class="arrow fa fa-angle-down"></b>
								</a>
								<b class="arrow"></b>
								<ul class="submenu">
									<li class="">
										<a href="${ctx}/admin/user_add"  target="main">
											<i class="menu-icon fa fa-caret-right"></i>
											添加账号
										</a>
										<b class="arrow"></b>
									</li>
									<li class="">
										<a href="${ctx}/admin/user_list?page=1"  target="main">
											<i class="menu-icon fa fa-caret-right"></i>
											账号列表
										</a>
										<b class="arrow"></b>
									</li>
									<%--<li class="">
										<a href="${ctx}/admin/role_list?page=1"  target="main">
											<i class="menu-icon fa fa-caret-right"></i>
											角色列表
										</a>
										<b class="arrow"></b>
									</li>--%>
								</ul>								
							</li>
								<li class="">
									<a href="#" class="dropdown-toggle">
										<i class="menu-icon fa fa-caret-right"></i>
										日志管理
										<b class="arrow fa fa-angle-down"></b>
									</a>
									<b class="arrow"></b>
									<ul class="submenu">
										<li class="">
											<a href="${ctx}/admin/log_list?page=1" target="main">
												<i class="menu-icon fa fa-caret-right"></i>
												日志列表
											</a>
											<b class="arrow"></b>
										</li>

									</ul>
								</li>
							</security:authorize>
						</ul>
					<!-- /.nav-list -->

				<script type="text/javascript">
					try{ace.settings.check('sidebar' , 'collapsed')}catch(e){}
				</script>
					</li>
				</ul>
			</div>
		</div>
			</div>

			<!-- /section:basics/sidebar -->
		</div>

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

		<!--[if lte IE 8]>
		  <script src="${ctx }/static/assets_admin/js/excanvas.js"></script>
		<![endif]-->
		<script src="${ctx }/static/assets_admin/js/jquery-ui.custom.js"></script>

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

			
			})
		</script>
		</td>
	</tr>
</table>
	</body>

		

</html>
