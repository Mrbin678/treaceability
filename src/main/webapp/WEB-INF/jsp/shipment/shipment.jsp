<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div class="header">
			<h1 class="page-header">
				发货信息<small> 所有发货信息</small>
			</h1>
		</div>
		<div id="page-inner">
			<div class="row">
				<div class="col-md-3 pull-right">
					<form class="form" action="${pageContext.request.contextPath}/shipment/index" method="post">
						<input class="form-control" type="text" id="code" name="code" value="${requestScope.search_name}" placeholder="Search....">
					</form>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<div class="card">
						<div class="card-content">
							<div class="table-resposive">
								<table style="font-size: 11px" class="table table-striped table-condensed table-bordered table-hover">
									<thead>
										<tr>
											<th>发货批号</th>
											<th>发货员工姓名</th>
											<th>货运信息</th>
											<th>基表数量</th>
											<th>创建日期</th>
											<th>操作</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach var="s" items="${requestScope.shipments}">
											<tr>
												<td>${s.shipCode}</td>
												<td>${s.operator}</td>
												<td>${s.goodsInfo}</td>
												<td>${s.meterCount}</td>
												<td><fmt:formatDate type="both"
														value="${s.createdAt}" pattern="yyyy-MM-dd HH:mm" /></td>
												<td><a class="edit_s" id="${s.id}">编辑</a> 
												<a class="del_s" id="${s.id}">删除</a></td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
								<ul class="pagination pull-right">
									<c:if test="${!pagehelper.isFirstPage}">
										<li><a
											href="${pageContext.request.contextPath}/shipment/index?start=${pagehelper.firstPage}">首页</a></li>
										<li><a
											href="${pageContext.request.contextPath}/shipment/index?start=${pagehelper.prePage}">上一页</a></li>
									</c:if>
									<c:forEach items="${pagehelper.navigatepageNums}" var="navigatepageNum">
										<c:if test="${navigatepageNum==pagehelper.pageNum}">
											<li class="active"><a
												href="${pageContext.request.contextPath}/shipment/index?start=${navigatepageNum}">${navigatepageNum}</a></li>
										</c:if>
										<c:if test="${navigatepageNum!=pagehelper.pageNum}">
											<li><a
												href="${pageContext.request.contextPath}/shipment/index?start=${navigatepageNum}">${navigatepageNum}</a></li>
										</c:if>
									</c:forEach>
									<c:if test="${!pagehelper.isLastPage}">
										<li><a
											href="${pageContext.request.contextPath}/shipment/index?start=${pagehelper.nextPage}">下一页</a></li>
										<li><a
											href="${pageContext.request.contextPath}/shipment/index?start=${pagehelper.lastPage}">最后一页</a></li>
									</c:if>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- 模态框（Modal） 编辑包装箱信息-->
		<div class="modal fade" id="edit">
			<div class="modal-dialog">
		    	<div class="modal-content">
					<div class="modal-header">
					    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					    <h4 class="modal-title" id="myModalLabel">编辑发货信息</h4>
				    </div>
					<div class="modal-body">
						<form id = "editFrom" action="${pageContext.request.contextPath}/shipment/update" method="post">
							<input type="hidden" id="id" name="id" />
							<div class="row form-group">
								<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">发货批号:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="shipCode" name="shipCode" type="text" value="" placeholder="请输入发货批号">
									</div>
								</div>
							</div>
							<div class="row form-group">
								<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">发货员工:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="operator" name="operator" type="text" value="" placeholder="请输入发货员工姓名">
									</div>
								</div>
							</div>
							<div class="row form-group">
								<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">货物信息:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="goodsInfo" name="goodsInfo" type="text" value="" placeholder="货物信息	">
									</div>
								</div>
							</div>
							<div class="row form-group">
								<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">基表数量:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="meterCount" name="meterCount" type="number" value="" placeholder="请输入基表数量">
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
				//修改发货表单校验,fields验证对应的输入框的name属性
		   		$('#editFrom').bootstrapValidator({
		            message: '请填写该字段!',
		            feedbackIcons: {
		                valid: 'glyphicon glyphicon-ok',
		                invalid: 'glyphicon glyphicon-remove',
		                validating: 'glyphicon glyphicon-refresh'
		            },
		            fields: {
		            	shipCode: {
		                    validators: {
		                        notEmpty: {
		                            message: '请填写发货批号'
		                        },
		                        regexp: {
		                            regexp: /^[^ ]+$/,
		                            message: '不能有空格.'
		                        },
		                        remote: {
		                            type: 'POST',
		                            url: '${pageContext.request.contextPath}/shipment/checkCode',
		                            data:{
		                            	id:function(){return $("input#id").val();}
		                            },
		                            message: '发货批号重复',
		                            delay: 1000
		                        }
		                    }
		                },
		                operator: {
		                    validators: {
		                        notEmpty: {
		                            message: '请填写发货员工姓名'
		                        }, 
		                        regexp: {
		                            regexp: /^[^ ]+$/,
		                            message: '不能有空格.'
		                        }
		                    }
		                },
		                goodsInfo: {
		                    validators: {
		                        notEmpty: {
		                            message: '请填写货物信息'
		                        },
		                        regexp: {
		                        	regexp: /^[^ ]+$/,
		                            message: '不能有空格.'
		                        }
		                    }
		                },
		                meterCount: {
		                    validators: {
		                        notEmpty: {
		                            message: '请填写基表数量'
		                        },
		                        regexp: {
		                            regexp: /^\d+$/,
		                            message: '不能有空格.'
		                        }
		                    }
		          		}
		            }		                
		       });
			});
			//修改信息
			$('.table tbody').on("click",'.edit_s', function() {
			    var id = this.id;//获取对应发货id
				$("#edit").modal("show");
   				$('#edit').on('shown.bs.modal', function () {});
				$.ajax({
					url : "${pageContext.request.contextPath}/shipment/find",
					type : "POST",
					data : {
						id : id
					},
					dataType : "text",
					success : function(data) {
						var jData = eval('(' + data + ')').results;
						$("input#id").val(id);
						$("input#shipCode").val(jData.shipCode);
						$("input#operator").val(jData.operator);
						$("input#goodsInfo").val(jData.goodsInfo);
						$("input#meterCount").val(jData.meterCount);
					}
				});
			});
			
			//删除发货信息
			$('.table tbody').on("click", '.del_s',function() {
				var id =this.id;
				layer.confirm('是否确认删除该记录？', {
					btn : [ '确认', '取消' ]
				}, function() {
					location.href = "${pageContext.request.contextPath}/shipment/delete?id="+id;
				}, function() {
					layer.msg('取消');
				});
			});
		</script>
	</tiles:putAttribute>
</tiles:insertDefinition>
