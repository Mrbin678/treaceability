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
											<th>编号/条码</th>
											<th>基表数量</th>
											<th>客户简称</th>
											<th>基表类型</th>
											<th>基表厂家</th>
											<th>规格型号</th>
											<th>阀门信息</th>
											<th>发往地</th>
											<th>描述</th>
											<th>创建日期</th>
											<th>交货日期</th>
											<th>状态</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>${order.code}</td>
											<td>${order.meterCount}</td>
											<td>${order.customer}</td>
											<td>${order.meterType}</td>
											<td>${order.factory}</td>
											<td>${order.types}</td>
											<td>${order.valve}</td>
											<td>${order.address}</td>
											<td>${order.note}</td>
											<td><fmt:formatDate type="both"
														value="${order.createdAt}" pattern="yyyy-MM-dd HH:mm"/></td>
											<td><fmt:formatDate type="both"
														value="${order.orderDate}" pattern="yyyy-MM-dd HH:mm"/></td>
											<td>${order.status}</td>
										</tr>
									</tbody>
								</table>
								<table style="font-size: 11px" class="table table-bordered table-hover">
									<caption style="font-size: 14px">整表生产信息</caption>
									<thead>
										<tr>
											<th>出厂编号</th>
											<th>订单编号条码</th>
											<th>上工信息ID</th>
											<th>基表规格型号</th>
											<th>基表类型</th>
											<th>表头板编号条码</th>
											<th>计数器编号条码</th>
											<th>表壳编号</th>
											<th>装配调试结果</th>
											<th>描述</th>
											<th>创建日期</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>${meter.factoryCode}</td>
											<td>${meter.orderCode}</td>
											<td>${meter.workId}</td>
											<td>${meter.types}</td>
											<td>${meter.meterType}</td>
											<td>${meter.headerCode}</td>
											<td>${meter.counterCode}</td>
											<td>${meter.shellCode}</td>
											<td>${meter.installResult}</td>
											<td>${meter.note}</td>
											<td><fmt:formatDate type="both" value="${meter.createdAt}" pattern="yyyy-MM-dd HH:mm" /></td>
										</tr>
									</tbody>
								</table>
								<table style="font-size: 11px" class="table table-bordered table-hover">
									<caption style="font-size: 14px">整表检验信息</caption>
									<thead>
										<tr>
											<th>订单编号</th>
											<th>出厂编号</th>
											<th>基表类型</th>
											<th>检验员ID</th>
											<th>检验员</th>
											<th>开关阀测试</th>
											<th>计数测试</th>
											<th>写读数测试</th>
											<th>写表号测试</th>
											<th>校时测试</th>
										</tr>
										<tr>
											<td>${meterDetection.orderCode}</td>
											<td>${meterDetection.factoryCode}</td>
											<td>${meterDetection.meterType}</td>
											<td>${meterDetection.operatorId}</td>
											<td>${meterDetection.operator}</td>
											<td>${meterDetection.valveTest}</td>
											<td>${meterDetection.countTest}</td>
											<td>${meterDetection.writeTest}</td>
											<td>${meterDetection.codeTest}</td>
											<td>${meterDetection.timeTest}</td>
										</tr>
										<tr>
											<th>电流测试</th>
											<th>掉电测试</th>
											<th>屏显信息</th>
											<th>无线表写频点测试</th>
											<th>无线表通信测试</th>
											<th>无线表恢复出厂设置</th>
											<th>短信表上电信息</th>
											<th>短信表信号强度</th>
											<th>检验结果</th>
											<th>创建日期</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>${meterDetection.electricityTest}</td>
											<td>${meterDetection.nopowerTest}</td>
											<td>${meterDetection.displayTest}</td>
											<td>${meterDetection.channelTest}</td>
											<td>${meterDetection.communicationTest}</td>
											<td>${meterDetection.resetTest}</td>
											<td>${meterDetection.onpowerTest}</td>
											<td>${meterDetection.signalTest}</td>
											<td>${meterDetection.detection}</td>
											<td><fmt:formatDate type="both" value="${meterDetection.createdAt}" pattern="yyyy-MM-dd" /></td>
										</tr>
									</tbody>
								</table>
								<table style="font-size: 11px" class="table table-bordered table-hover">
									<caption style="font-size: 14px">计数器生产信息</caption>
									<thead>
										<tr>
											<th>编号/条码</th>
											<th>订单编号条码</th>
											<th>上工信息ID</th>
											<th>规格型号</th>
											<th>基表类型</th>
											<th>描述</th>
											<th>创建日期</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>${counter.code}</td>
											<td>${counter.orderCode}</td>
											<td>${counter.workId}</td>
											<td>${counter.types}</td>
											<td>${counter.meterType}</td>
											<td>${counter.note}</td>
											<td><fmt:formatDate type="both" value="${counter.createdAt}" pattern="yyyy-MM-dd HH:mm" /></td>
										</tr>
									</tbody>
								</table>
								<table style="font-size: 11px" class="table table-bordered table-hover">
									<caption style="font-size: 14px">计数器检验信息</caption>
									<thead>
										<tr>
											<th>订单编号条码</th>
											<th>检验员ID</th>
											<th>检验员</th>
											<th>计数器条码</th>
											<th>卡齿测试</th>
											<th>计数测试</th>
											<th>检验结果</th>
											<th>描述</th>
											<th>创建日期</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>${counterDetection.orderCode}</td>
											<td>${counterDetection.operatorId}</td>
											<td>${counterDetection.operator}</td>
											<td>${counterDetection.counterCode}</td>
											<td>${counterDetection.lockTest}</td>
											<td>${counterDetection.countTest}</td>
											<td>${counterDetection.detection}</td>
											<td>${counterDetection.note}</td>
											<td><fmt:formatDate type="both" value="${counterDetection.createdAt}" pattern="yyyy-MM-dd HH:mm" /></td>
										</tr>
									</tbody>
								</table>
								<table style="font-size: 11px" class="table table-bordered table-hover">
									<caption style="font-size: 14px">表头板生产信息</caption>
									<thead>
										<tr>
											<th>编号/条码</th>
											<th>订单编号条码</th>
											<th>上工信息ID</th>
											<th>规格型号</th>
											<th>基表类型</th>
											<th>版本信息</th>
											<th>开关阀测试</th>
											<th>电流测试</th>
											<th>写程序测试</th>
											<th>读数测试</th>
											<th>校时测试</th>
											<th>描述</th>
											<th>创建日期</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>${h.code}</td>
											<td>${h.orderCode}</td>
											<td>${h.workId}</td>
											<td>${h.types}</td>
											<td>${h.meterType}</td>
											<td>${h.version}</td>
											<td>${h.valveTest}</td>
											<td>${h.electricityTest}</td>
											<td>${h.programTest}</td>
											<td>${h.readingTest}</td>
											<td>${h.timeTest}</td>
											<td>${h.note}</td>
											<td><fmt:formatDate type="both" value="${h.createdAt}" pattern="yyyy:MM:dd HH:mm" /></td>
										</tr>
									</tbody>
								</table>
								<table style="font-size: 11px" class="table table-bordered table-hover">
									<caption style="font-size: 14px">表头板检验信息</caption>
									<thead>
										<tr>
											<th>订单编号条码</th>
											<th>检验员ID</th>
											<th>检验员</th>
											<th>表头板条码</th>
											<th>电压测试</th>
											<th>高温测试</th>
											<th>检验结果</th>
											<th>描述</th>
											<th>创建日期</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>${headerDetection.orderCode}</td>
											<td>${headerDetection.operatorId}</td>
											<td>${headerDetection.operator}</td>
											<td>${headerDetection.headerCode}</td>
											<td>${headerDetection.voltageTest}</td>
											<td>${headerDetection.highTemperatureTest}</td>
											<td>${headerDetection.detection}</td>
											<td>${headerDetection.note}</td>
											<td><fmt:formatDate type="both" value="${headerDetection.createdAt}" pattern="yyyy-MM-dd HH:mm" /></td>
										</tr>
									</tbody>
								</table>
								<table style="font-size: 11px" class="table table-bordered table-hover">
									<caption style="font-size: 14px">表壳生产信息</caption>
									<thead>
										<tr>
											<th>表壳编号条码</th>
											<th>上工信息ID</th>
											<th>外壳厂家</th>
											<th>阀门厂家</th>
											<th>阀门类型</th>
											<th>规格型号</th>
											<th>描述</th>
											<th>创建日期</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>${shell.code}</td>
											<td>${shell.workId}</td>
											<td>${shell.factory}</td>
											<td>${shell.valveFactory}</td>
											<td>${shell.valveType}</td>
											<td>${shell.types}</td>
											<td>${shell.note}</td>
											<td><fmt:formatDate type="both" value="${shell.createdAt}" pattern="yyyy-MM-dd HH:mm" /></td>
										</tr>
									</tbody>
								</table>
								<table style="font-size: 11px" class="table table-bordered table-hover">
									<caption style="font-size: 14px">表壳检验信息</caption>
									<thead>
										<tr>
											<th>订单编号条码</th>
											<th>检验员ID</th>
											<th>检验员</th>
											<th>表壳条码</th>
											<th>卡齿测试</th>
											<th>水试测试</th>
											<th>检验结果</th>
											<th>描述</th>
											<th>创建日期</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>${shellDetection.orderCode}</td>
											<td>${shellDetection.operatorId}</td>
											<td>${shellDetection.operator}</td>
											<td>${shellDetection.shellCode}</td>
											<td>${shellDetection.leakageTest}</td>
											<td>${shellDetection.waterTest}</td>
											<td>${shellDetection.detection}</td>
											<td>${shellDetection.note}</td>
											<td><fmt:formatDate type="both" value="${shellDetection.createdAt}" pattern="yyyy-MM-dd HH:mm" /></td>
										</tr>
									</tbody>
								</table>
								<table style="font-size: 11px" class="table table-bordered table-hover">
									<caption style="font-size: 14px">流量检验详细信息</caption>
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
		<script>
		</script>
	</tiles:putAttribute>
</tiles:insertDefinition>

