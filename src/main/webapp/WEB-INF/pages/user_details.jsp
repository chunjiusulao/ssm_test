<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ include file="../utilpage/taglibs.jsp"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>用户详情</title>

    <link rel="stylesheet" type="text/css" href="${ctx}/static/assets_admin/css/jquery.treeTable.css">
    <link rel="stylesheet" type="text/css" href="${ctx}/static/assets_admin/css/jquery.treeTable.theme.default.css">
    <link rel="stylesheet" type="text/css" href="${ctx}/static/assets_admin/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="${ctx}/static/assets_admin/css/ace.css">
    <link rel="stylesheet" type="text/css" href="${ctx}/static/assets_admin/css/less/tables.less">




    <script type="text/javascript" src="${ctx}/static/assets_admin/js/jquery.treeTable.js"></script>
    <script type="text/javascript" src="${ctx}/static/assets_admin/js/jquery.js"></script>







</head>

<body>
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
    <tr role="row">
        <th> 名称 </th>
        <th> 描述 </th>
        <th> 操作 </th>
    </tr>
    </thead>
    <tbody >
    <tr ttId="0">
       <td>${user.userName}</td>
    </tr>
        <%--pid为id的父id--%>
        <tr ttId="1" ttParentId="0">
            <td>${user.role.roleName}</td>
        </tr>
        <c:forEach items="${user.role.permissions}" var="temp2">
            <tr ttId="1-1" ttParentId="1">
                <td>${temp2.permissionName}</td>
                <td>${temp2.url}</td>
                <td>
                    <div class="hidden-sm hidden-xs btn-group">
                        <a href="#" class="btn btn-xs btn-danger" style="margin-right: 4px;" onclick="dell('${temp.id}')"><i class="ace-icon fa fa-trash bigger-120" ></i>删除</a>
                    </div>
                </td>
            </tr>
    </c:forEach>
    </tbody>
</table>
        </div>
    </div>
</div>
    </div>
</div>


<script >
    $(function () {
        $("#example-advanced").treeTable({
            expandLevel: 2,
            column: 0,

        });
    });
</script>


</body>

</html>