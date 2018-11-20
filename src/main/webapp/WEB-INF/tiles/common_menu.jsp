<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<nav class="navbar-default navbar-side" role="navigation" style="left: 0px;">
	<div class="sidebar-collapse">
		<ul class="nav" id="main-menu">
			<li><a href="${pageContext.request.contextPath}/welcome/index" class="waves-effect waves-dark"><i class="fa fa-dashboard"></i> 首页</a></li>
			<li><a href="${pageContext.request.contextPath}/orders/index" class="waves-effect waves-dark"><i class="fa fa-bar-chart-o"></i> 订单管理</a></li>
			<li><a href="#" class="waves-effect waves-dark"><i class="fa fa-cogs"></i>生产管理<span class="fa arrow"></span></a>
				<ul class="nav nav-second-level collapse">
					<li><a href="${pageContext.request.contextPath}/counter/index"><i class="fa fa-tag"></i>计数器生产记录</a></li>
					<li><a href="${pageContext.request.contextPath}/header/index"><i class="fa fa-tag"></i>表头板生产记录</a></li>
					<li><a href="${pageContext.request.contextPath}/shell/index"><i class="fa fa-tag"></i>表壳生产记录</a></li>
					<li><a href="${pageContext.request.contextPath}/meter/index"><i class="fa fa-tag"></i>基表生产记录</a></li>
					<li><a href="${pageContext.request.contextPath}/work/index"><i class="fa fa-tag"></i>上工信息记录</a></li>
				</ul>
			</li>
			<li><a href="#" class="waves-effect waves-dark"><i class="fa fa-check-square-o"></i>质检管理<span class="fa arrow"></span></a>
				<ul class="nav nav-second-level collapse">
					<li><a href="${pageContext.request.contextPath}/meterDetection/index"><i class="fa fa-tag"></i>基表检验记录</a></li>
					<li><a href="${pageContext.request.contextPath}/counterDetection/index"><i class="fa fa-tag"></i>计数器检验记录</a></li>
					<li><a href="${pageContext.request.contextPath}/headerDetection/index"><i class="fa fa-tag"></i>表头板检验记录</a></li>
					<li><a href="${pageContext.request.contextPath}/shellDetection/index"><i class="fa fa-tag"></i>表壳检验记录</a></li>
					<li><a href="${pageContext.request.contextPath}/flowDetection/index"><i class="fa fa-tag"></i>流量检验记录</a></li>
				</ul>
			</li>
			<%-- <li><a href="${pageContext.request.contextPath}/repair/index" class="waves-effect waves-dark"><i class="fa fa-wrench"></i>维修管理</a></li>--%>
			<li><a href="${pageContext.request.contextPath}/package/index" class="waves-effect waves-dark"><i class="fa fa-archive"></i>包装管理</a></li>
			<li><a href="${pageContext.request.contextPath}/shipment/index" class="waves-effect waves-dark"><i class="fa fa-truck"></i>发货管理</a></li>
			<li><a href="#" class="waves-effect waves-dark"><i class="fa fa-desktop"></i>系统管理<span class="fa arrow"></span></a>
				<ul class="nav nav-second-level collapse">
					<li><a href="${pageContext.request.contextPath}/users/index"><i class="fa fa-tag"></i>用户管理</a></li>
					<li><a href="${pageContext.request.contextPath}/department/index"><i class="fa fa-tag"></i>部门管理</a></li>
					<li><a href="${pageContext.request.contextPath}/rr/right"><i class="fa fa-tag"></i>权限管理</a></li>
					<li><a href="${pageContext.request.contextPath}/rr/role"><i class="fa fa-tag"></i>角色管理</a></li>
					<li><a href="${pageContext.request.contextPath}/system_param/index"><i class="fa fa-tag"></i>系统参数</a></li>
					<li><a href="${pageContext.request.contextPath}/barcode/index"><i class="fa fa-tag"></i>条码规则</a></li>
				</ul>
			</li>
		</ul>
	</div>
</nav>
<!-- <script type="text/javascript">
	$(document).ready(function(){
		$(".waves-effect").on("click",function(){
			$(this).addClass("active-menu");
		})
	})
</script> -->
