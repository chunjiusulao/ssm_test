<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" %>
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
		<h3 align="center">主页</h3><br />
		<script type="text/javascript">
			window.jQuery || document.write("<script src='${ctx }/static/assets_admin/js/jquery.js'>"+"<"+"/script>");
		</script>
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

			</body>
</html>
