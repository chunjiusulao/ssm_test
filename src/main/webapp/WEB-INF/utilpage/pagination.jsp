<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="taglibs.jsp"%>
<div class="modal-content">
	<div class="modal-footer no-margin-top">
	<!-- 
	pages.totalCount : ${pages.totalCount }
	pages.currentPage : ${pages.currentPage}
	pages.lastIndex : ${pages.lastIndex}
	pages.nextIndex : ${pages.nextIndex }
	pages.startIndex  : ${pages.startIndex }
	pages.previousIndex : ${pages.previousIndex }

	 -->
		<div class="pull-left">
			共 <span class="text-success"><b>${pages.totalCount }</b></span> 条记录
		</div>
		<ul class="pagination pull-right no-margin">
			<c:if test="${pages.currentPage == 1 }">
				<li class="prev disabled">
					<a href="javascript:void(0);">
						<i class="ace-icon fa fa-angle-double-left"></i>
					</a>
				</li>
			</c:if>
			<c:if test="${pages.currentPage != 1 }">
				<li class="prev">
					<a href="${ctx }/${pages.currentUrl }?page=${pages.currentPage - 1}">
						<i class="ace-icon fa fa-angle-double-left"></i>
					</a>
				</li>
			</c:if>
			<c:forEach items="${pages.indexes }" varStatus ="stat">
				<c:if test="${pages.currentPage==stat.count }">
					<li class="active">
						<a href="javascript:void(0);">${stat.count }</a>
					</li>
				</c:if>
				<c:if test="${pages.currentPage!=stat.count }">
					<li >
						<a href="${ctx }/${pages.currentUrl }?page=${stat.count }">${stat.count }</a>
					</li>
				</c:if>
			</c:forEach>
			<c:if test="${pages.currentPage !=  pages.lastPage}">
			<li class="next">
					<a href="${ctx }/${pages.currentUrl }?page=${pages.currentPage + 1 }">
						<i class="ace-icon fa fa-angle-double-right"></i>
					</a>
			</li>
			</c:if>
			<c:if test="${pages.currentPage ==  pages.lastPage}">
			<li class="next disabled">
					<a href="javascript:void(0);">
						<i class="ace-icon fa fa-angle-double-right"></i>
					</a>
			</li>
			</c:if>
		</ul>
	</div>
</div>