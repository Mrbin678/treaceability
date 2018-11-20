<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div class="header">
			<h1 class="page-header">
				搜索结果 <small> 以下为搜索结果</small>
			</h1>
		</div>
		<div id="page-inner">
			<div class="row">
				<div class="col-md-12">
					<div class="card">
						<div class="card-content">
							<div class="table-resposive">
								<table style="font-size: 11px" class="table table-bordered table-hover">
									<caption style="font-size: 14px">订单信息</caption>
									<thead>
										<tr>
											<th>订单条码</th>
											<th>基表数量</th>
											<th>客户简称</th>
											<th>基表厂家</th>
											<th>规格型号</th>
											<th>阀门信息</th>
											<th>发往地</th>
											<th>描述</th>
											<th>状态</th>
											<th>创建日期</th>
											<th>交货日期</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>${order.code}</td>
											<td>${order.meterCount}</td>
											<td>${order.customer}</td>
											<td>${order.factory}</td>
											<td>${order.types}</td>
											<td>${order.valve}</td>
											<td>${order.address}</td>
											<td>${order.note}</td>
											<td>${order.status}</td>
											<td><fmt:formatDate type="both" value="${order.createdAt}" pattern="yyyy-MM-dd HH:mm" /></td>
											<td><fmt:formatDate type="both" value="${order.orderDate}" pattern="yyyy-MM-dd HH:mm" /></td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<script>
		</script>
	</tiles:putAttribute>
</tiles:insertDefinition>

