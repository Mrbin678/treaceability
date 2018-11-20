<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div class="header">
			<h1 class="page-header">
				<small>流量检测点qmax详情</small>
			</h1>
		</div>
		<div id="page-inner">
			<div class="row">
				<div class="col-md-12">
					<div class="card">
						<div class="card-content">
							<div class="table-resposive">
								<table style="font-size: 11px" class="table table-striped table-condensed table-bordered table-hover">
									<thead>
										<tr>
											<th>标准体积(L)</th>
											<th>被检表体积(	L)</th>
											<th>标准器压力(kPa)</th>
											<th>标准器温度(℃)</th>
											<th>被检表压力(kPa)</th>
											<th>被检表温度(℃)</th>
											<th>基本误差(%)</th>
											<th>平均值(%)</th>
											<th>差值(%)</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>${csfzk.maxbz}</td>
											<td>${csfzk.maxb0}</td>
											<td>${csfzk.maxbzyl0}</td>
											<td>${csfzk.maxbzwd0}</td>
											<td>${csfzk.maxbyl0}</td>
											<td>${csfzk.maxbwd0}</td>
											<td>${csfzk.max0}</td>
											<td rowspan="10" style="text-align:center;vertical-align:middle;">${csfzk.max}</td>
											<td rowspan="10" style="text-align:center;vertical-align:middle;">${csfzk.maxcz}</td>
										</tr>
										<tr>
											<td>${csfzk.maxbz}</td>
											<td>${csfzk.maxb1}</td>
											<td>${csfzk.maxbzyl1}</td>
											<td>${csfzk.maxbzwd1}</td>
											<td>${csfzk.maxbyl1}</td>
											<td>${csfzk.maxbwd1}</td>
											<td>${csfzk.max1}</td>
										</tr>
										<tr>
											<td>${csfzk.maxbz}</td>
											<td>${csfzk.maxb2}</td>
											<td>${csfzk.maxbzyl2}</td>
											<td>${csfzk.maxbzwd2}</td>
											<td>${csfzk.maxbyl2}</td>
											<td>${csfzk.maxbwd2}</td>
											<td>${csfzk.max2}</td>
										</tr>
										<tr>
											<td>${csfzk.maxbz}</td>
											<td>${csfzk.maxb3}</td>
											<td>${csfzk.maxbzyl3}</td>
											<td>${csfzk.maxbzwd3}</td>
											<td>${csfzk.maxbyl3}</td>
											<td>${csfzk.maxbwd3}</td>
											<td>${csfzk.max3}</td>
										</tr>
										<tr>
											<td>${csfzk.maxbz}</td>
											<td>${csfzk.maxb4}</td>
											<td>${csfzk.maxbzyl4}</td>
											<td>${csfzk.maxbzwd4}</td>
											<td>${csfzk.maxbyl4}</td>
											<td>${csfzk.maxbwd4}</td>
											<td>${csfzk.max4}</td>
										</tr>
										<tr>
											<td>${csfzk.maxbz}</td>
											<td>${csfzk.maxb5}</td>
											<td>${csfzk.maxbzyl5}</td>
											<td>${csfzk.maxbzwd5}</td>
											<td>${csfzk.maxbyl5}</td>
											<td>${csfzk.maxbwd5}</td>
											<td>${csfzk.max5}</td>
										</tr>
										<tr>
											<td>${csfzk.maxbz}</td>
											<td>${csfzk.maxb6}</td>
											<td>${csfzk.maxbzyl6}</td>
											<td>${csfzk.maxbzwd6}</td>
											<td>${csfzk.maxbyl6}</td>
											<td>${csfzk.maxbwd6}</td>
											<td>${csfzk.max6}</td>
										</tr>
										<tr>
											<td>${csfzk.maxbz}</td>
											<td>${csfzk.maxb7}</td>
											<td>${csfzk.maxbzyl7}</td>
											<td>${csfzk.maxbzwd7}</td>
											<td>${csfzk.maxbyl7}</td>
											<td>${csfzk.maxbwd7}</td>
											<td>${csfzk.max7}</td>
										</tr>
										<tr>
											<td>${csfzk.maxbz}</td>
											<td>${csfzk.maxb8}</td>
											<td>${csfzk.maxbzyl8}</td>
											<td>${csfzk.maxbzwd8}</td>
											<td>${csfzk.maxbyl8}</td>
											<td>${csfzk.maxbwd8}</td>
											<td>${csfzk.max8}</td>
										</tr>
										<tr>
											<td>${csfzk.maxbz}</td>
											<td>${csfzk.maxb9}</td>
											<td>${csfzk.maxbzyl9}</td>
											<td>${csfzk.maxbzwd9}</td>
											<td>${csfzk.maxbyl9}</td>
											<td>${csfzk.maxbwd9}</td>
											<td>${csfzk.max9}</td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>