<%@ page language="java" contentType="text/html; charset=utf-8"   pageEncoding="utf-8"  %>
<%@ include file="../utilpage/taglibs.jsp"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta charset="utf-8" />
		<title>CWCMS</title>

		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

		<!-- bootstrap & fontawesome -->
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
		<![endif]-->
	</head>

	<body class="no-skin">

		<div class="main-container" id="main-container">

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
							</li>

							<li>
								<a href="#">系统管理</a>
							</li>
							<li class="active">角色管理</li>
						</ul><!-- /.breadcrumb -->

						<!-- /section:basics/content.searchbox -->
					</div>

					<!-- /section:basics/content.breadcrumbs -->
					<div class="page-content">
						<!-- /.page-header -->
						<!--横向虚线分隔符-->
						<!--<div class="hr hr-18 dotted hr-double"></div>-->
						<div class="row">
							<div class="col-xs-12">
								<!-- PAGE CONTENT BEGINS -->								
								<div class="row">
									<div class="col-xs-12">
										<table id="simple-table" class="table table-striped table-bordered table-hover">
											<thead>
												<tr>
													<th>角色名称</th>
													<th>角色描述</th>
													<th>操作</th>
												</tr>
											</thead>

											<tbody>
												<c:forEach items="${list}" var="temp">
													<tr>
													<input type="hidden" name="id" value="${temp.id }">
														<td>${temp.roleName}</td>
														<td>${temp.roleId}</td>

														<td>
															<div class="hidden-sm hidden-xs btn-group">
																<a href="${ctx}/role/permission_assign/${temp.id}" class="btn btn-xs btn-info" style="margin-right: 4px;"><i class="ace-icon fa fa-unlock-alt  bigger-120"></i>配权</a>
																<a href="${ctx}/role/role_update?id=${temp.id}" class="btn btn-xs btn-primary" style="margin-right: 4px;"><i class="ace-icon fa fa-wrench bigger-120"></i>修改</a>

																<a href="#" class="btn btn-xs btn-danger" style="margin-right: 4px;" onclick="deleteRole('${temp.id}')">
																	<i class="ace-icon fa fa-trash bigger-120" ></i>删除</a>
															
															</div>
														</td>
													</tr>
												</c:forEach>												
											</tbody>
										</table>
									</div><!-- /.span -->
								</div><!-- /.row -->

								<jsp:include page="../utilpage/pagination.jsp" />
								<!-- /.modal-content -->	
								<!--横向虚线分隔符-->
								<!--<div class="hr hr-18 dotted hr-double"></div>-->

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
		<script type="text/javascript">
			if('ontouchstart' in document.documentElement) document.write("<script src='${ctx }/assets_admin/js/jquery.mobile.custom.js'>"+"<"+"/script>");
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
		function deleteRole(id){
			bootbox.confirm("<span class='text-primary'>" + "你确认删除该角色？" + "</span>", function(result) {
				if(result) {
					//
				
					$.ajax({
					    url:'${ctx}/role/delete/'+id,
					    type:'POST', //GET
					    contentType : 'application/json', 
					    async:false,    //或false,是否异步
					    dataType:'json', 
					    success:function(data){
					    	if(data && data.success == "true"){
					    		bootbox.alert("<span class='text-success'>" + data.msg + "</span>", function(){
						    		location.reload();
						    	});
					    	}
					    	if(data && data.success=="false"){
					    		bootbox.alert("<span class='text-danger'>" + data.msg + "</span>", function(){
						    	});
					    	}
					    },
					    error:function(){
					    	bootbox.alert("<span class='text-danger'>操作失败，请检查网络连接。</span>", function(){
					    	});
					    }
					})
				}
			});
		}
		function refresh(){
			location.reload();
		}
		
		function dataInit(args) {
		 /* 分页 */
        $('#pageToolbar').Paging({
            pagesize: 1,
            count: 1,
            current : 1,
            toolbar: true,
            callback: function (page, size, count) {
            	window.location.replace("${ctx}${paging.url}" + page);
            }
        });
	}
		
		
		</script>
	</body>
</html>
