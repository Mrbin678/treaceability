<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>产品订单</title>
<link rel="icon" href="${pageContext.request.contextPath }/img/favicon.ico" type="image/x-icon" />
<link href="${pageContext.request.contextPath }/css/bootstrap.css" rel="stylesheet" type="text/css"/>
<link href="${pageContext.request.contextPath }/css/order-print.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript">
	function doPrint() {
		bdhtml=window.document.body.innerHTML;
		sprnstr="<!--startprint-->";
		eprnstr="<!--endprint-->";
		prnhtml=bdhtml.substr(bdhtml.indexOf(sprnstr)+17);
		prnhtml=prnhtml.substring(0,prnhtml.indexOf(eprnstr));
		window.document.body.innerHTML=prnhtml;
		window.print();//打印页面
		location.href="javascript:history.go(-1)"//打印完页面后返回上一步，即返回订单管理中的当前所在页
		/* location.href = "${pageContext.request.contextPath}/orders/index?start=${pagehelper.prePage}"//打印页面后请求到后台返回到订单列表 */
	}
</script>
</head>
<body>
	<a class="btn btn-default" href="javascript:;" onclick="doPrint();">打印</a>
	<!--startprint-->
	<div class="header">
		<div class="block" style="width:320px"><img class="logo" alt="" src="${pageContext.request.contextPath }/img/schx.png"/></div>
		<div class="block" style="width:248px;text-align:left;"><h2>产品订单</h2></div>
		<div class="block date"><fmt:formatDate value="${date}" type="date" pattern="yyyy-MM-dd"/></div>
	</div>
	<hr/>
	<div class="order">
		<div class="mes_left">
			<h3>客户信息</h3>
			<br/>
			<p style='font-size: 18px;'>客户名称：</p>
			<div style='font-size: 18px;width: 200px;display:block;word-break: break-all;word-wrap: break-word;'>
				${order.customer}
			</div>
			<br/>
			<p style='font-size: 18px;'>发往地区：</p>
			<div style='font-size: 18px;width: 200px;display:block;word-break: break-all;word-wrap: break-word;'>
				${order.address}
			</div>
			
		</div>
		<div class="mes_right">
			<h3>订单信息</h3>
			<br/>
			<p style="font-size: 18px;">下单日期：<fmt:formatDate value="${order.createdAt}" type="date" pattern="yyyy-MM-dd"/></p>
			<p style="font-size: 18px;">交货日期：<fmt:formatDate value="${order.orderDate}" type="date" pattern="yyyy-MM-dd"/></p>
			<img src="<%=request.getContextPath() %>/barcode?msg=${order.code}&type=code128&fmt=jpeg" height="115px" width="258px" style="margin: 5px 5px 0px 0px"/>
		</div>
		<hr/>
		<div>
			<h3>产品信息</h3>
			<br/>
			<p style="font-size: 18px;">产品名称：${order.meterType}</p>
			<p style="font-size: 18px;">订单数量：${order.meterCount}</p>
			<p style="font-size: 18px;">生产厂家：${order.factory}</p>
			<p style="font-size: 18px;">产品规格：${order.types}</p>
			<p style="font-size: 18px;">阀门信息：${order.valve}</p>
			<p style="font-size: 18px;">订单备注：${order.note==''?'无':order.note}</p>
		</div>
	</div>
	<!--endprint-->
</body>
</html>