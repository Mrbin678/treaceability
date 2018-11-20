<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<nav class="navbar navbar-default top-navbar" role="navigation">
	<div class="navbar-header">
		<button type="button" class="navbar-toggle waves-effect waves-dark" data-toggle="collapse" data-target=".sidebar-collapse">
			<span class="sr-only">Toggle navigation</span> 
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
		</button>
		<a class="navbar-brand waves-effect waves-dark" href="#">
			<i class="large material-icons">insert_chart</i> <strong>恒芯科技</strong>
		</a>
		<div id="sideNav"  class="">
			<i class="material-icons dp48">toc</i>
		</div>
		<div class="input-group form" style="width:280px;padding-left: 50px;padding-top:13px">
			<form action="" id="sform">
				<input id="keyword" name="keyword" type="text" class="form-control" placeholder="Search...">
			</form>
		</div>
	</div>
	<ul class="nav navbar-bar navbar-right">
		<li class="dropdown">
			<a href="#" class="dropdown-toggle" data-toggle="dropdown">
				<i class="fa fa-user fa-fw"></i> 
				<b>${sessionScope.user.name}</b> 
				<b class="caret"></b>
			</a>
			<ul class="dropdown-menu">
				<li><a href="${pageContext.request.contextPath}/welcome/${sessionScope.user.id}/change_password"><i class="fa fa-edit fa-fw"></i> 密码修改</a></li>
				<li class="divider"></li>
				<li><a href="${pageContext.request.contextPath}/welcome/logout"><i class="fa fa-sign-out fa-fw"></i> 退出登录</a></li>
			</ul>
		</li>
	</ul>
</nav>
<script>
	$("#keyword").keydown(function(e){
		if (e.keyCode == 13) {  
			var keyword = $("#keyword").val();
			if (keyword != ""){
				if (keyword.length==8){
					document.getElementById("sform").action="${pageContext.request.contextPath}/search/meter_code";
					$("#sform").submit();
				}else if(keyword.length==12){
					if (keyword.indexOf("1")==0){
						document.getElementById("sform").action="${pageContext.request.contextPath}/search/counter_code";
						$("#sform").submit();
					}else if (keyword.indexOf("2")==0){
						document.getElementById("sform").action="${pageContext.request.contextPath}/search/header_code";
						$("#sform").submit();
					}else if (keyword.indexOf("3")==0){
						document.getElementById("sform").action="${pageContext.request.contextPath}/search/shell_code";
						$("#sform").submit();
					}else if(keyword.indexOf("5")==0){
						document.getElementById("sform").action="${pageContext.request.contextPath}/search/order";
						$("#sform").submit();
					}else{
						alert("请输入正确格式条码!")
					}
				}else{
					alert("请输入完整条码!")
				}
			}else{
				alert("搜索不能为空!")
			}
     	}  
	})
</script>