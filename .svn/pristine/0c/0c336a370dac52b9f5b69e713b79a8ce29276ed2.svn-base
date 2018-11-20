<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div class="header">
			<h1 class="page-header">
				流量检验<small> 全部流量检验信息.</small>
			</h1>
		</div>
		<div id="page-inner">
			<div class="row">
				<div class="col-md-3 pull-right">
					<form class="form" action="${pageContext.request.contextPath}/flowDetection/index" method="post">
						<input class="form-control" type="text" id="code" name="code" value="${requestScope.search_name}" placeholder="Search....">
					</form>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<div class="card">
						<div class="card-content">
							<div class="table-resposive">
								<table
									style="font-size: 11px"
									class="table table-striped table-condensed table-bordered table-hover"
									id="flowDetection_table">
									<thead>
										<tr>
											<th>表位</th>
											<th>表号</th>
											<th>qmax</th>
											<th>0.2qmax</th>
											<th>qmin</th>
											<th>线性</th>
											<th>重复性</th>
											<th>密封性</th>
											<th>压损</th>
											<th>结论</th>
											<th>检验时间</th>
											<th>操作</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach var="item" items="${requestScope.csfzk_list}">
											<tr>
												<td>${item.bw}</td>
												<td>${item.zch}</td>
												<td><a class="sel_max" id="${item.id}">${item.max}</a></td>
												<td><a class="sel_max02" id="${item.id}">${item.max02}</a></td>
												<td><a class="sel_min" id="${item.id}">${item.min}</a></td>
												<td>${item.xx}</td>
												<td>${item.cfx}</td>
												<td>${item.mfx}</td>
												<td>${item.ysys}</td>
												<td>${item.jl}</td>
												<td><fmt:formatDate type="both"
														value="${item.jysj}" pattern="yyyy-MM-dd HH:mm" /></td>
												<td><a class="sel_flowDetection" id="${item.id}">检验详情</a>
												</td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
								<ul class="pagination pull-right">
									<c:if test="${!pagehelper.isFirstPage}">
										<li><a
											href="${pageContext.request.contextPath}/flowDetection/index?start=${pagehelper.firstPage}">首页</a></li>
										<li><a
											href="${pageContext.request.contextPath}/flowDetection/index?start=${pagehelper.prePage}">上一页</a></li>
									</c:if>
									<c:forEach items="${pagehelper.navigatepageNums}" var="navigatepageNum">
										<c:if test="${navigatepageNum==pagehelper.pageNum}">
											<li class="active"><a
												href="${pageContext.request.contextPath}/flowDetection/index?start=${navigatepageNum}">${navigatepageNum}</a></li>
										</c:if>
										<c:if test="${navigatepageNum!=pagehelper.pageNum}">
											<li><a
												href="${pageContext.request.contextPath}/flowDetection/index?start=${navigatepageNum}">${navigatepageNum}</a></li>
										</c:if>
									</c:forEach>
									<c:if test="${!pagehelper.isLastPage}">
										<li><a
											href="${pageContext.request.contextPath}/flowDetection/index?start=${pagehelper.nextPage}">下一页</a></li>
										<li><a
											href="${pageContext.request.contextPath}/flowDetection/index?start=${pagehelper.lastPage}">最后一页</a></li>
									</c:if>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- 模态框（Modal） 查询流量检验详情-->
		<div class="modal fade" id="selectFlowDetection" tabindex="-1"
			role="dialog" aria-labelledby="selectModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
						<h4 class="modal-title" id="myModalLabel">流量检验详情</h4>
					</div>
					<div class="modal-body">
						<div class="table-resposive">
							<table
								class="table table-striped table-condensed table-bordered table-hover"
								id="flowDetection_table2">
								<thead>
									<tr>
										<th>表位</th>
										<th>表号</th>
										<th>qmax</th>
										<th>0.2qmax</th>
										<th>qmin</th>
										<th>线性</th>
										<th>重复性</th>
										<th>密封性</th>
										<th>压损</th>
										<th>结论</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>${csfzk.bw}</td>
										<td>${csfzk.zch}</td>
										<td>${csfzk.max}</td>
										<td>${csfzk.max02}</td>
										<td>${csfzk.min}</td>
										<td>${csfzk.xx}</td>
										<td>${csfzk.cfx}</td>
										<td>${csfzk.mfx}</td>
										<td>${csfzk.ysys}</td>
										<td>${csfzk.jl}</td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
				</div>
				<!-- /.modal-content -->
			</div>
			<!-- /.modal -->
		</div>
		<script>
			$(document).ready(function() {
				$('#meterDetection_table').dataTable();
				//修改基表检验表单校验,fields验证对应的输入框的name属性
				$('#editMeterDetectionFrom').bootstrapValidator({
					message : '请填写该字段!',
					feedbackIcons : {
						valid : 'glyphicon glyphicon-ok',
						invalid : 'glyphicon glyphicon-remove',
						validating : 'glyphicon glyphicon-refresh'
					},
					fields : {
						orderCode : {
							validators : {
								notEmpty : {
									message : '请填写订单编号'
								},
								regexp : {
									regexp : /^[^ ]+$/,
									message : '不能有空格.'
								}
							}
						},
						factoryCode : {
							validators : {
								notEmpty : {
									message : '请填写基表出厂编号'
								},
								regexp : {
									regexp : /^[^ ]+$/,
									message : '不能有空格.'
								},
								remote : {
									type : 'GET',
									url : '${pageContext.request.contextPath}/meterDetection/checkCode',
									data : {
										id : function() {
											return $("input#id").val();
										}
									},
									message : '基表出厂编号重复',
									delay : 1000
								}
							}
						},
						operator : {
							validators : {
								notEmpty : {
									message : '请填写检验员'
								},
								regexp : {
									regexp : /^[^ ]+$/,
									message : '不能有空格.'
								}
							}
						},
						detection : {
							validators : {
								notEmpty : {
									message : '请填写检验结果'
								},
								regexp : {
									regexp : /^[^ ]+$/,
									message : '不能有空格.'
								}
							}
						}
					}
				});
			});
		
			/* $('#flowDetection_table').dataTable({
				"bLengthChange" : false,
				"oLanguage" : {
					"sLengthMenu" : "显示_MENU_条",
					"sZeroRecords" : "抱歉， 没有找到",
					"sInfo" : "从 _START_ 到 _END_ /共 _TOTAL_ 条数据",
					"sInfoEmpty" : "没有数据",
					"sInfoFiltered" : "(从 _MAX_ 条数据中检索)",
					"oPaginate" : {
						"sFirst" : "首页",
						"sPrevious" : "前一页",
						"sNext" : "后一页",
						"sLast" : "尾页"
					},
					"sZeroRecords" : "没有检索到数据",
					"autoWidth" : 'true'
				}
			}); */
		
			$.ajax({
				url : "${pageContext.request.contextPath}/system_param/findAll",
				type : "POST",
				data : {
				},
				dataType : "text",
				success : function(data) {
					jData = eval('(' + data + ')').results; //拿到参数表集合（基表类型、生产厂家）					
					//给所有系统参数下拉框赋值
					for (var i = 0; i < jData.length; i++) {
						if (jData[i].paramTypes == '基表类型') {
							$("select#meterType").append("<option value='" + jData[i].name + "'>" + jData[i].name + "</option>");
						}
					}
					$("select#meterType option:first").prop("selected", 'selected');
				}
			});
		
			var id = null;
			var jData = null;
			//查询单条流量检测详细信息
			$('.table tbody').on("click", '.sel_flowDetection', function() {
				id = this.id; //获取对应基表信息检验id
				window.location.href = "${pageContext.request.contextPath}/flowDetection/find?id=" + id;
			});
			//查询单条流量检测信息流量点qmax的详细信息
			$('.table tbody').on("click", '.sel_max', function() {
				id = this.id; //获取对应基表信息检验id
				window.location.href = "${pageContext.request.contextPath}/flowDetection/findMax?id=" + id;
			});
			
			//查询单条流量检测信息流量点0.2qmax的详细信息
			$('.table tbody').on("click", '.sel_max02', function() {
				id = this.id; //获取对应基表信息检验id
				window.location.href = "${pageContext.request.contextPath}/flowDetection/findMax02?id=" + id;
			});
			
			//查询单条流量检测信息流量点qmin的详细信息
			$('.table tbody').on("click", '.sel_min', function() {
				id = this.id; //获取对应基表信息检验id
				window.location.href = "${pageContext.request.contextPath}/flowDetection/findMin?id=" + id;
			});
		
			//删除基表信息
			$('.table tbody').on("click", '.del_meterDetection', function() {
				var id = this.id;
				console.log(id);
				/*  alert(id);  */
				layer.confirm('是否确认删除该基表检验记录？', {
					btn : [ '确认', '取消' ]
				//按钮
				}, function() {
					location.href = "${pageContext.request.contextPath}/meterDetection/delete?id=" + id;
				}, function() {
					layer.msg('取消');
				});
			});
		</script>
	</tiles:putAttribute>
</tiles:insertDefinition>