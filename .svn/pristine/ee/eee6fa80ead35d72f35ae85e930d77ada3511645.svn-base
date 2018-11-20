<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/materialize.min.css"/>
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/morris-0.4.3.min.css"/>
<script src="${pageContext.request.contextPath }/js/jquery-3.2.1.min.js"></script>
<script src="${pageContext.request.contextPath }/js/morris/morris.js"></script>
<script src="${pageContext.request.contextPath }/js/morris/raphael-2.1.0.min.js"></script>
<script src="${pageContext.request.contextPath }/js/materialize.min.js"></script>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div class="header">
			<h1 class="page-header">
			</h1>
		</div>
		<div id="page-inner">
			<div class="row">
				<div class="col-xs-12 col-sm-6 col-md-3">
					<div class="card horizontal cardIcon waves-effect waves-dark">
						<div class="card-image red">
							<i class="fa fa-eye fa-5x"></i>
						</div>
						<div class="card-stacked">
							<div class="card-content">
								<h3>${meterCount}</h3>
							</div>
							<div class="card-action">
								<strong> 基表数量</strong>
							</div>
						</div>
					</div>
				</div>
				<div class="col-xs-12 col-sm-6 col-md-3">
					<div class="card horizontal cardIcon waves-effect waves-dark">
						<div class="card-image orange">
							<i class="fa fa-shopping-cart fa-5x"></i>
						</div>
						<div class="card-stacked">
							<div class="card-content">
								<h3>${orderCount}</h3>
							</div>
							<div class="card-action">
								<strong> 总订单数量</strong>
							</div>
						</div>
					</div>
				</div>
				<div class="col-xs-12 col-sm-6 col-md-3">
					<div class="card horizontal cardIcon waves-effect waves-dark">
						<div class="card-image blue">
							<i class="fa fa-comments fa-5x"></i>
						</div>
						<div class="card-stacked">
							<div class="card-content">
								<h3>0</h3>
							</div>
							<div class="card-action">
								<strong> 待办任务</strong>
							</div>
						</div>
					</div>
				</div>
				<div class="col-xs-12 col-sm-6 col-md-3">
					<div class="card horizontal cardIcon waves-effect waves-dark">
						<div class="card-image">
							<i class="fa fa-users fa-5x"></i>
						</div>
						<div class="card-stacked">
							<div class="card-content">
								<h3>${userCount}</h3>
							</div>
							<div class="card-action">
								<strong> 用户数量</strong>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-9 col-sm-12 col-xs-12">
					<div class="card">
						<div class="card-image">
							<div id="morris-area-chart"></div>
						</div>
						<div class="card-action">
							<b>销售数据线状图</b>
						</div>
					</div>
				</div>
				<div class="col-md-3 col-sm-12 col-xs-12">
					<div class="card">
						<div class="card-image">
							<div id="morris-donut-chart"></div>
						</div>
						<div class="card-action">
							<b>部门人员分布</b>
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12"></div>
			</div>
		</div>
		<script>
			$(document).ready(function(){
				//线状图
				$.ajax({
					url:"${pageContext.request.contextPath}/welcome/order_chart",
					type:"GET",
					dataType:"text",
					success:function(data){	
						var chat_data=eval('(' + data + ')');
						var order_config = {
								data : chat_data,
								xkey : 'label',
								ykeys : [ 'value' ],
								labels : [ '订单基表数量' ],
								lineWidth : 2,
								fillOpacity : 0.6,
								hideHover : 'auto',
								behaveLikeLine : true,
								resize : true,
								pointFillColors : [ '#ffffff' ],
								pointStrokeColors : [ 'black' ],
								lineColors : [ 'red' ],
								parseTime:false
							};
						order_config.element = 'morris-area-chart';
						Morris.Line(order_config);
					}
				});
				//圆状图
				$.ajax({
					url:"${pageContext.request.contextPath}/welcome/user_chart",
					type:"GET",
					dataType:"text",
					success:function(data){	
						var user_data=eval('(' + data + ')');
						console.log(user_data);
						var user_config = {
							data : user_data,
							colors : [ '#A6A6A6', '#8ceab9', '#8ceab9' ],
							resize : true
						};
						user_config.element='morris-donut-chart';
						Morris.Donut(user_config);
					}
				});
			});
		</script>
	</tiles:putAttribute>
</tiles:insertDefinition>
