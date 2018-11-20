<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div class="header">
			<h1 class="page-header">
				计数器检验<small> 全部计数器检验信息.</small>
			</h1>
		</div>
		<div id="page-inner">
			<div class="row">
				<div class="col-md-3 pull-right">
					<form class="form" action="${pageContext.request.contextPath}/counterDetection/index" method="post">
						<input class="form-control" type="text" id="code" name="code" value="${requestScope.search_name}" placeholder="Search....">
					</form>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<div class="card">
						<div class="card-content">
							<div class="table-resposive">
								<table style="font-size: 11px" class="table table-striped table-condensed table-bordered table-hover" id="counterDetection_table">
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
											<th>操作</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach var="item" items="${requestScope.counterDetection_list}">
											<tr>
												<td>${item.orderCode}</td>
												<td>${item.operatorId}</td>
												<td>${item.operator}</td>
												<td>${item.counterCode}</td>
												<td>${item.lockTest}</td>
												<td>${item.countTest}</td>
												<td>${item.detection}</td>
												<td>${item.note}</td>
												<td><fmt:formatDate type="both"
														value="${item.createdAt}" pattern="yyyy-MM-dd HH:mm" /></td>
												<td><a class="edit_counterDetection" id="${item.id}">编辑</a> 
												<a class="del_counterDetection" id="${item.id}">删除</a></td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
								<ul class="pagination pull-right">
									<c:if test="${!pagehelper.isFirstPage}">
										<li><a
											href="${pageContext.request.contextPath}/counterDetection/index?start=${pagehelper.firstPage}">首页</a></li>
										<li><a
											href="${pageContext.request.contextPath}/counterDetection/index?start=${pagehelper.prePage}">上一页</a></li>
									</c:if>
									<c:forEach items="${pagehelper.navigatepageNums}" var="navigatepageNum">
										<c:if test="${navigatepageNum==pagehelper.pageNum}">
											<li class="active"><a
												href="${pageContext.request.contextPath}/counterDetection/index?start=${navigatepageNum}">${navigatepageNum}</a></li>
										</c:if>
										<c:if test="${navigatepageNum!=pagehelper.pageNum}">
											<li><a
												href="${pageContext.request.contextPath}/counterDetection/index?start=${navigatepageNum}">${navigatepageNum}</a></li>
										</c:if>
									</c:forEach>
									<c:if test="${!pagehelper.isLastPage}">
										<li><a
											href="${pageContext.request.contextPath}/counterDetection/index?start=${pagehelper.nextPage}">下一页</a></li>
										<li><a
											href="${pageContext.request.contextPath}/counterDetection/index?start=${pagehelper.lastPage}">最后一页</a></li>
									</c:if>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- 模态框（Modal） 编辑计数器检验信息-->
		<div class="modal fade" id="editCounterDetection" tabindex="-1" role="dialog" aria-labelledby="editModalLabel" aria-hidden="true">
		    <div class="modal-dialog">
		        <div class="modal-content">
		            <div class="modal-header">
		                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
		                <h4 class="modal-title" id="myModalLabel">编辑计数器检验信息</h4>
		            </div>
		            <div class="modal-body">
		            	<form id="editCounterDetectionFrom" action="${pageContext.request.contextPath}/counterDetection/update" method="post" onsubmit="return check()">
							<input type="hidden" id="id" name="id" />
							<div class="row form-group">
      							<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">订单编号:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="orderCode" name="orderCode" type="text" value="" placeholder="请输入订单编号">
									</div>
								</div>
							</div>
							<div class="row form-group">
      							<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">检验员:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="operator" name="operator" type="text" value="" placeholder="请输入检验员">
									</div>
								</div>
							</div>
							<div class="row form-group">
      							<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">计数器条码:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="counterCode" name="counterCode" type="text" value="" placeholder="请输入计数器条码">
									</div>
								</div>
							</div>
							<div class="row form-group">
      							<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">卡齿测试:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="lockTest" name="lockTest" type="text" value="" placeholder="请输入卡齿测试">
									</div>
								</div>
							</div>
							<div class="row form-group">
      							<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">计数测试:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="countTest" name="countTest" type="text" value="" placeholder="请输入计数测试">
									</div>
								</div>
							</div>
							<div class="row form-group">
      							<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">检验结果:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="detection" name="detection" type="text" value="" placeholder="请输入检验结果">
									</div>
								</div>
							</div>
							<div class="row form-group">
      							<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">描述:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="note" name="note" type="text" value="" placeholder="描述 (选填)">
									</div>
								</div>
							</div>
							<div class="modal-footer">
				                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
				                <button type="submit" class="btn btn-primary">更新</button>
				            </div>
						</form>
		            </div>    
		        </div><!-- /.modal-content -->
		    </div><!-- /.modal -->
		</div>
		<script>
			$(document).ready(function() {
				//修改计数器检验表单校验,fields验证对应的输入框的name属性
		       	$('#editCounterDetectionFrom').bootstrapValidator({
		            message: '请填写该字段!',
		            feedbackIcons: {
		                valid: 'glyphicon glyphicon-ok',
		                invalid: 'glyphicon glyphicon-remove',
		                validating: 'glyphicon glyphicon-refresh'
		            },
		            fields: {
		            	orderCode: {
		                    validators: {
		                        notEmpty: {
		                            message: '请填写订单编号'
		                        },
		                        regexp: {
		                            regexp: /^[^ ]+$/,
		                            message: '不能有空格.'
		                        }
		                    }
		                },
		                operator: {
		                    validators: {
		                        notEmpty: {
		                            message: '请填写检验员'
		                        },
		                        regexp: {
		                            regexp: /^[^ ]+$/,
		                            message: '不能有空格.'
		                        }
		                    }
		                },
		                counterCode: {
		                    validators: {
		                        notEmpty: {
		                            message: '请填写计数器编号'
		                        },
		                        regexp: {
		                            regexp: /^[^ ]+$/,
		                            message: '不能有空格.'
		                        },
		                        remote: {
		                            type: 'GET',
		                            url: '${pageContext.request.contextPath}/counterDetection/checkCode',
		                            data:{
		                            	id:function(){return $("input#id").val();}
		                            },
		                            message: '计数器编号重复',
		                            delay: 1000
		                        }
		                    }
		                },
		                lockTest: {
		                    validators: {
		                        notEmpty: {
		                            message: '请填写卡齿测试'
		                        },
		                        regexp: {
		                            regexp: /^[^ ]+$/,
		                            message: '不能有空格.'
		                        }
		                    }
		                },
		                countTest: {
		                    validators: {
		                        notEmpty: {
		                            message: '请填写计数测试'
		                        },
		                        regexp: {
		                            regexp: /^[^ ]+$/,
		                            message: '不能有空格.'
		                        }
		                    }
		                },
		                detection: {
		                    validators: {
		                        notEmpty: {
		                            message: '请填写检验结果'
		                        },
		                        regexp: {
		                            regexp: /^[^ ]+$/,
		                            message: '不能有空格.'
		                        }
		                    }
		                }
		        	}
		       	});
			});
			var id = null;
			var jData = null; 
			//修改计数器信息
			$('.table tbody').on("click",'.edit_counterDetection', function() {
			    id = this.id;//获取对应计数器信息检验id
				$("#editCounterDetection").modal("show");
   				$('#editCounterDetection').on('shown.bs.modal', function () {
      			});
				$.ajax({
					url : "${pageContext.request.contextPath}/counterDetection/find",
					type : "POST",
					data : {
						id : id
					},
					dataType : "text",
					success : function(data) {
						//alert(data);
						jData = eval('(' + data + ')').results;
						//alert(jData.createdAt);//时间戳
						var date = new Date(jData.createdAt);//格式过的时间
						var dates = date.getFullYear() + '-' + (date.getMonth() + 1) + '-' + date.getDate();//拼接自己想要的格式
						$("input#id").val(id);
						$("input#orderCode").val(jData.orderCode);
						$("input#operatorId").val(jData.operatorId);
						$("input#operator").val(jData.operator);
						$("input#counterCode").val(jData.counterCode);
						$("input#lockTest").val(jData.lockTest);
						$("input#countTest").val(jData.countTest);
						$("input#detection").val(jData.detection);
						$("input#note").val(jData.note);
					    $("input#createdAt").val(dates);	    					   
					}
				});
			});
			
			//删除计数器信息
			$('.table tbody').on("click", '.del_counterDetection',function() {
				var id =this.id;
				console.log(id);	
				/*  alert(id);  */
				layer.confirm('是否确认删除该计数器检验记录？', {
					btn : [ '确认', '取消' ]
				//按钮
				}, function() {
					location.href = "${pageContext.request.contextPath}/counterDetection/delete?id="+id;
				}, function() {
					layer.msg('取消');
				});
			});
			
			//通过select的onChange事件获取选中的option的值
			var meterType = null;
			function getMeterValue(value){ 
				meterType = value;	
			}
			//表单验证
			function check() {
				return true;
			}
		
		</script>
	</tiles:putAttribute>
</tiles:insertDefinition>