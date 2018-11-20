<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div class="header">
			<h1 class="page-header">
				<small> 流量检验详情</small>
			</h1>
		</div>
		<div id="page-inner">
			<div class="row">
				<div class="col-md-12">
					<div class="card">
						<div class="card-content">
							<div class="table-resposive">
								<table style="font-size: 12px" class="table table-striped table-bordered table-hover">
										<tr>
											<th>表位</th>
											<th>表号</th>
											<th>qmax</th>
											<th>0.2qmax</th>
											<th>qmin</th>
										</tr>
										<tr>
											<td>${csfzk.bw}</td>
											<td>${csfzk.zch}</td>
											<td>${csfzk.max}</td>
											<td>${csfzk.max02}</td>
											<td>${csfzk.min}</td>
										</tr>
										<tr>
											<th>线性</th>
											<th>重复性</th>
											<th>密封性</th>
											<th>压损</th>
											<th>结论</th>
										</tr>
										<tr>
											<td>${csfzk.xx}</td>
											<td>${csfzk.cfx}</td>
											<td>${csfzk.mfx}</td>
											<td>${csfzk.ysys}</td>
											<td>${csfzk.jl}</td>
										</tr>
										<tr>
											<th>总压力损失值(Pa)</th>
											<th>大气压力(kPa)</th>
											<th>检定日期</th>
											<th>有效日期</th>
											<th>型号</th>
										</tr>
										<tr>
											<td>${csfzk.zyls}</td>
											<td>${csfzk.dqyl}</td>
											<td><fmt:formatDate type="both"
											value="${csfzk.jyrq}" pattern="yyyy-MM-dd" /></td>
											<td><fmt:formatDate type="both"
											value="${csfzk.yxrq}" pattern="yyyy-MM-dd" /></td>
											<td>${csfzk.xh}</td>
										</tr>
										<tr>
											<th>附加装置功能</th>
											<th>室温(℃)</th>
											<th>相对湿度(%)</th>
											<th>检定员</th>
											<th>装置编号</th>
										</tr>
										<tr>
											<td>${csfzk.zzfj}</td>
											<td>${csfzk.wd}</td>
											<td>${csfzk.sd}</td>
											<td>${csfzk.jyry}</td>
											<td>${csfzk.zzbh}</td>
										</tr>
										<tr>
											<th>证书编号</th>
											<th>制造厂家</th>
											<th>客户名称</th>
											<th>客户地址</th>
											<th>备注</th>
										</tr>
										<tr>
											<td>${csfzk.zsh}</td>
											<td>${csfzk.sccj}</td>
											<td>${csfzk.wtdw}</td>
											<td>${csfzk.wtdwdz}</td>
											<td>${csfzk.bz}</td>
										</tr>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>