<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div class="header">
			<h1 class="page-header"></h1>
		</div>
		<div id="page-inner">
			<div class="row" style="margin-top: 130px;">
				<div class="col-md-12">
					<div class="card">
						<div class="card-content">
							<div class="text-center">
								<h2>
									<strong>对不起，未搜到相关内容！</strong>
								</h2>
								<br><br><br>
								<div>
									<a href="${pageContext.request.contextPath}/welcome/index/" class="btn bg-primary">返回首页</a> 
									<a href="javascript:" onclick="self.location=document.referrer;" class="btn btn-default">返回上一页</a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>
