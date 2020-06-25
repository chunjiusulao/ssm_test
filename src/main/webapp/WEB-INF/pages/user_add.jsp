<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" %>
<%@ include file="../utilpage/taglibs.jsp"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta charset="utf-8" />
		<title>CWCMS</title>

		<meta name="description" content="" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
				<!-- bootstrap & fontawesome -->
		<link rel="stylesheet" href="${ctx }/static/assets_admin/css/bootstrap.css" />
		<link rel="stylesheet" href="${ctx }/static/assets_admin/css/font-awesome.css" />

		<!-- page specific plugin styles -->
		<link rel="stylesheet" href="${ctx }/static/assets_admin/css/jquery-ui.custom.css" />
		<link rel="stylesheet" href="${ctx }/static/assets_admin/css/jquery.gritter.css" />
		<link rel="stylesheet" href="${ctx }/static/assets_admin/css/select2.css" />
		<link rel="stylesheet" href="${ctx }/static/assets_admin/css/datepicker.css" />
		<link rel="stylesheet" href="${ctx }/static/assets_admin/css/bootstrap-editable.css" />

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
		<div class="main-container" id="main-container">
			<script type="text/javascript">
				try{ace.settings.check('main-container' , 'fixed')}catch(e){}
			</script>


			<div class="main-content">
				<div class="main-content-inner">
					<!-- #section:basics/content.breadcrumbs -->
					<div class="breadcrumbs" id="breadcrumbs">
						<script type="text/javascript">
							try{ace.settings.check('breadcrumbs' , 'fixed')}catch(e){}
						</script>

						<ul class="breadcrumb">
							<li>
								<i class="ace-icon fa fa-home home-icon"></i>
								<a href="#"></a>
							</li>

							<li>
								<a href="#">系统管理</a>
							</li>
							<li class="active">添加新账号</li>
						</ul><!-- /.breadcrumb -->
					</div>
					
					<!-- /section:basics/content.breadcrumbs -->
					<div class="page-content">
						<div class="row" id="myimg">
							<div class="col-xs-12">
                                <div class="col-sm-12">
										<div class="widget-box">
											<div class="widget-header widget-header-flat">
												<h4 class="widget-title">添加新账号</h4>
											</div>
											<div class="widget-body">
												<div class="widget-main">

													<form action="${ctx}/user/user_add" class="form-horizontal" method="post" role="form">
													<div class="row">
														<div class="col-xs-12">
															
															<div class="form-group">
																	
																</div>
																<div class="form-group">
																	<label class="col-sm-2 control-label no-padding-left"  >
																		用户账号 
																		<span class="badge badge-transparent tooltip-error" title="必填项">
																			<i class="ace-icon fa fa-exclamation-triangle red bigger-130"></i>
																		</span>
																	</label>							
																	<div class="col-sm-6">
																		<input type="text" class="ace form-control" name="userName" placeholder="输入账号" required="required">
																	</div>
																</div>

																<div class="form-group">
																	<label class="col-sm-2 control-label no-padding-left"  >
																		初始密码
																	</label>							
																	<div class="col-sm-6">
																		<input type="password" class="ace form-control" name="password" placeholder="输入密码" required="required" >
																	</div>
																</div>



																<div class="form-group">
																	<label class="col-sm-2 control-label no-padding-left"  >
																		电话/手机 
																	</label>							
																	<div class="col-sm-6">
																		<input type="text" class="ace form-control" name="phoneNum" placeholder="输入手机号">
																	</div>
																</div>
																<div class="form-group">
																	<label class="col-sm-2 control-label no-padding-left"  >
																		电子邮箱
																	</label>
																	<div class="col-sm-6">
																		<input type="text" class="ace form-control" name="email" placeholder="输入电子邮箱地址">
																	</div>
																</div>
															<div class="form-group">
																<label class="col-sm-2 control-label no-padding-left"  >
																	用户角色
																</label>
																<div class="col-sm-6">
																	<select class="form-control" id="form-field-select-1" name="roleId">
																		<option  value="1">管理员</option>
																		<option  value="2">普通用户</option>
																	</select>
																</div>
															</div>
                                                            <input type="hidden" name="status" value="1">

																
														</div>
													</div>
													<div class="row">
														<div class="col-xs-12 align-center">
													
															<input type="submit" value="添加新账号" class="btn btn-sm btn-primary" style="height: 30px;" />
														</div>
													</div>
													</form>
													
												</div>
											</div>
										</div>
									</div>


								<!-- PAGE CONTENT ENDS -->
							</div><!-- /.col -->
						</div><!-- /.row -->
					</div><!-- /.page-content -->
				</div>
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
		
		
		
		<script src="${ctx }/static/assets_admin/js/bootstrap.js"></script>

		<!-- page specific plugin scripts -->
		<script src="${ctx }/static/assets_admin/js/jquery-ui.custom.js"></script>
		<script src="${ctx }/static/assets_admin/js/jquery.gritter.js"></script>

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

	</body>
</html>