<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div class="header">
			<h1 class="page-header">
				订单管理 <small> 全部订单信息.</small>
				<button id="add" class="button pull-right" data-toggle="modal" data-target="#addOrder">+ 新建订单</button>
			</h1>
		</div>
		<div id="page-inner">
			<div class="row">
				<div class="col-md-3 pull-right">
					<form class="form" action="${pageContext.request.contextPath}/orders/index" method="post">
						<input class="form-control" type="text" id="code" name="code" value="${requestScope.search_name}" placeholder="Search....">
					</form>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<div class="card">
						<div class="card-content">
							<div class="table-resposive">
								<table style="font-size: 11px" class="table table-striped table-condensed table-bordered table-hover" id="orders_table">
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
											<th>操作</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach var="order" items="${requestScope.order_list}">
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
												<td><a class="edit_order" id="${order.id}">编辑</a> 
													<a class="del_order" id="${order.id}">删除</a>
													<a class="print_order" id="${order.id}">打印</a>
												</td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
								<ul class="pagination pull-right">
									<c:if test="${!pagehelper.isFirstPage}">
										<li><a
											href="${pageContext.request.contextPath}/orders/index?start=${pagehelper.firstPage}">首页</a></li>
										<li><a
											href="${pageContext.request.contextPath}/orders/index?start=${pagehelper.prePage}">上一页</a></li>
									</c:if>
									<c:forEach items="${pagehelper.navigatepageNums}" var="navigatepageNum">
										<c:if test="${navigatepageNum==pagehelper.pageNum}">
											<li class="active"><a
												href="${pageContext.request.contextPath}/orders/index?start=${navigatepageNum}">${navigatepageNum}</a></li>
										</c:if>
										<c:if test="${navigatepageNum!=pagehelper.pageNum}">
											<li><a
												href="${pageContext.request.contextPath}/orders/index?start=${navigatepageNum}">${navigatepageNum}</a></li>
										</c:if>
									</c:forEach>
									<c:if test="${!pagehelper.isLastPage}">
										<li><a
											href="${pageContext.request.contextPath}/orders/index?start=${pagehelper.nextPage}">下一页</a></li>
										<li><a
											href="${pageContext.request.contextPath}/orders/index?start=${pagehelper.lastPage}">最后一页</a></li>
									</c:if>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="modal fade" id="editOrder">
			<div class="modal-dialog">
		        <div class="modal-content">
		            <div class="modal-header">
		                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
		                <h4 class="modal-title" id="myModalLabel">编辑订单信息</h4>
		            </div>
					<div class="modal-body">
						<form id="editOrderFrom" action="${pageContext.request.contextPath}/orders/update" method="post">
							<input type="hidden" id="id" name="id" />
							<div class="form-group row">
								<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">订单编号</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="code" name="code" type="text" value="" placeholder="请输入订单编号">
									</div>
								</div>
							</div>
							<div class="form-group row">
								<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">基表数量</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="meterCount" name="meterCount" type="text" value="" placeholder="请输入基表数量">
									</div>
								</div>
							</div>
							<div class="form-group row">
								<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">客户简称</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="customer" name="customer" type="text" value="" placeholder="请输入客户简称">
									</div>
								</div>
							</div>
							<div class="form-group row">
								<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">基表类型</div>
									<div class="col-8 col-sm-8">
										<select class="select form-control" name="meterType"id="selectMeterType" onchange="getMeterValue(this.options[this.options.selectedIndex].value)">
											
										</select>
									</div>
								</div>
							</div>
							<div class="form-group row">
								<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">基表厂家</div>
									<div class="col-8 col-sm-8">
										<select class="select form-control" name="factory" id="selectFactory" onchange="getFactoryValue(this.options[this.options.selectedIndex].value)">
										
										</select>
									</div>
								</div>
							</div>
							<div class="form-group row">
								<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">规格型号</div>
									<div class="col-8 col-sm-8">
										<select class="select form-control" name="types" id="selectType" onchange="getTypesValue(this.options[this.options.selectedIndex].value)">
										
										</select>
									</div>
								</div>
							</div>
							<div class="form-group row">
								<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">阀门信息</div>
									<div class="col-8 col-sm-8">
										<select class="select form-control" name="valve" id="selectValve" onchange="getValveValue(this.options[this.options.selectedIndex].value)">
										
										</select>
									</div>
								</div>
							</div>
							<div class="form-group row">
								<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">发货地址</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="address" name="address" type="text" value="" placeholder="请输入发货地址">
									</div>
								</div>
							</div>
							<div class="form-group row">
								<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">交货日期</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="orderDate" name="orderDate" type="date">
									</div>
								</div>
							</div>
							<div class="form-group row">
								<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">备注</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="note" name="note" type="text" value="" placeholder="备注选填">
									</div>
								</div>
							</div>
							<div class="form-group row">
								<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">订单状态</div>
									<div class="col-8 col-sm-8">
										<select class="select form-control" name="selectStatus" id="selectStatus" onchange="getStatusValue(this.options[this.options.selectedIndex].value)">
											<option value="新建">新建</option>
											<option value="生产中">生产中</option>
											<option value="已发货">已发货</option>
											<option value="已作废">已作废</option>
										</select>
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
		<!-- 新建订单 -->
		<div class="modal fade" id="addOrder" tabindex="-1" role="dialog" aria-labelledby="orderModalLabel" aria-hidden="true">
		    <div class="modal-dialog">
		        <div class="modal-content">
		            <div class="modal-header">
		                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
		                <h4 class="modal-title" id="myModalLabel">添加订单</h4>
		            </div>
		            <div class="modal-body">
		            	<form id="addOrderForm" action="${pageContext.request.contextPath}/orders/create" method="post" autocomplete="off">
							<div class="row form-group">
      							<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">订单编号:</div>
									<div class="col-8 col-sm-8">
										<input type="text" class="form-control" id="code" name="code" placeholder="请输入订单编号" />
									</div>
								</div>
							</div>
							<div class="row form-group">
      							<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">基表数量:</div>
									<div class="col-8 col-sm-8">
										<input type="text" class="form-control" id="meterCount" name="meterCount" placeholder="请输入基表数量" />
									</div>
								</div>
							</div>
							<div class="row form-group">
      							<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">客户简称:</div>
									<div class="col-8 col-sm-8">
										<input type="text" class="form-control" id="customer" name="customer" placeholder="请输入客户简称" />
									</div>
								</div>
							</div>
							<div class="row form-group">
      							<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">基表类型:</div>
									<div class="col-8 col-sm-8">
										<select class="select form-control" name="meterType" id="selectMeterType">
										
										</select>
									</div>
								</div>
							</div>
							<div class="row form-group">
      							<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">基表厂家:</div>
									<div class="col-8 col-sm-8">
										<select class="select form-control" name="factory" id="selectFactory">
										
										</select>
									</div>
								</div>
							</div>
							<div class="row form-group">
      							<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">规格型号:</div>
									<div class="col-8 col-sm-8">
										<select class="select form-control" name="types" id="selectType">
											
										</select>
									</div>
								</div>
							</div>
							<div class="row form-group">
      							<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">阀门信息:</div>
									<div class="col-8 col-sm-8">
										<select class="select form-control" name="valve" id="selectValve">
											
										</select>
									</div>
								</div>
							</div>
							<div class="row form-group">
      							<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">发往地:</div>
									<div class="col-8 col-sm-8">
										<input type="text" class="form-control" id="address" name="address" placeholder="请输入发往地" />
									</div>
								</div>
							</div>
							<div class="row form-group">
      							<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">描述:</div>
									<div class="col-8 col-sm-8">
										<input type="text" class="form-control" id="note" name="note" placeholder="请输入描述" />
									</div>
								</div>
							</div>
							<div class="row form-group">
      							<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">交货日期:</div>
									<div class="col-8 col-sm-8">
										<input type="date" class="form-control" id="orderDate" name="orderDate"/>
									</div>
								</div>
							</div>
				            <div class="modal-footer">
				                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
				                <button type="submit" class="btn btn-primary">提交</button>
				            </div>
						</form>
		            </div>
		        </div><!-- /.modal-content -->
		    </div><!-- /.modal -->
		</div>
		<script>
			$(document).ready(function() {
				//修改订单表单校验,fields验证对应的输入框的name属性
		       	$('#editOrderFrom').bootstrapValidator({
		            message: '请填写该字段!',
		            feedbackIcons: {
		                valid: 'glyphicon glyphicon-ok',
		                invalid: 'glyphicon glyphicon-remove',
		                validating: 'glyphicon glyphicon-refresh'
		            },
		            fields: {
		            	code: {
		                    validators: {
		                        notEmpty: {
		                            message: '请填写订单编号'
		                        },
		                        regexp: {
		                            regexp: /^[^ ]+$/,
		                            message: '不能有空格.'
		                        },
		                        remote: {
		                            type: 'GET',
		                            url: '${pageContext.request.contextPath}/orders/checkCode',
		                            data:{
		                            	id:function(){return $("input#id").val();}
		                            },
		                            message: '订单编号重复',
		                            delay: 1000
		                        }
		                    }
		                },
		                meterCount: {
		                    validators: {
		                        notEmpty: {
		                            message: '请填写基表数量'
		                        },
		                        regexp: {/* 只需加此键值对，包含正则表达式，和提示 */
		                        	regexp: /^\d+$/,
		                            message: '基表数量只能是正整数.'
		                        }
		                      
		                    }
		                },
		                customer: {
		                    validators: {
		                        notEmpty: {
		                            message: '请填写客户简称'
		                        },
		                        regexp: {
		                            regexp: /^[^ ]+$/,
		                            message: '不能有空格.'
		                        }
		                    }
		                },
		                address: {
		                    validators: {
		                        notEmpty: {
		                            message: '请填写发货地址'
		                        },
		                        regexp: {
		                            regexp: /^[^ ]+$/,
		                            message: '不能有空格.'
		                        }
		                    }
		                }
		          	}
		       	});
		    	$('#addOrderForm').bootstrapValidator({
		            message: '请填写该字段!',
		            feedbackIcons: {
		                valid: 'glyphicon glyphicon-ok',
		                invalid: 'glyphicon glyphicon-remove',
		                validating: 'glyphicon glyphicon-refresh'
		            },
		            fields: {
		            	code: {
		                    validators: {
		                        notEmpty: {
		                            message: '请填写订单编号'
		                        },
		                        regexp: {
		                            regexp: /^[^ ]+$/,
		                            message: '不能有空格.'
		                        },
		                        remote: {
		                            type: 'GET',
		                            url: '${pageContext.request.contextPath}/orders/addcheck',
		                            message: '订单编号重复',
		                            delay: 1000
		                        }
		                    }
		                },
		                meterCount: {
		                    validators: {
		                        notEmpty: {
		                            message: '请填写基表数量'
		                        },
		                        regexp: {/* 只需加此键值对，包含正则表达式，和提示 */
		                        	regexp: /^\d+$/,
		                            message: '基表数量只能是正整数.'
		                        }
		                      
		                    }
		                },
		                customer: {
		                    validators: {
		                        notEmpty: {
		                            message: '请填写客户简称'
		                        },
		                        regexp: {
		                            regexp: /^[^ ]+$/,
		                            message: '不能有空格.'
		                        }
		                    }
		                },
		                address: {
		                    validators: {
		                        notEmpty: {
		                            message: '请填写发货地址'
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
			
			//提前加载下拉框
			$.ajax({
				url : "${pageContext.request.contextPath}/system_param/findAll",
				type : "POST",
				data : {
				},
				dataType : "text",
				success : function(data) {
					jData = eval('(' + data + ')').results;//拿到参数表集合（基表类型、生产厂家）
					//给所有系统参数下拉框赋值
					for(var i=0; i<jData.length;i++){
						if(jData[i].paramTypes == '基表类型'){
							$("select#selectMeterType").append("<option value='"+jData[i].name+"'>"+jData[i].name+"</option>");	
						}
						if(jData[i].paramTypes == '基表厂家'){
							$("select#selectFactory").append("<option value='"+jData[i].name+"'>"+jData[i].name+"</option>");
						}
						if(jData[i].paramTypes == '规格型号'){
							$("select#selectType").append("<option value='"+jData[i].name+"'>"+jData[i].name+"</option>");
						}
						if(jData[i].paramTypes == '阀门信息'){
							$("select#selectValve").append("<option value='"+jData[i].name+"'>"+jData[i].name+"</option>");
						}
					} 
					//默认下拉框第一个option被选中
					$("select#selectMeterType option:first").prop("selected", 'selected');
					$("select#selectFactory option:first").prop("selected", 'selected');
					$("select#selectType option:first").prop("selected", 'selected');
					$("select#selectValve option:first").prop("selected", 'selected');	
					$("select#selectStatus option:first").prop("selected", 'selected');
				}	
			});
			var id = null;
			var jData = null; 
			var meterType =  null;
			var factory = null;
			var types = null;
			var valve = null;
			var status1 = null;
			//修改订单
			$('.table tbody').on("click",'.edit_order', function() {
			    id = this.id;//获取对应订单id
			    $("#editOrder").modal("show");
   				$('#editOrder').on('shown.bs.modal', function () {
      			});
				//加载模态框	
				$.ajax({
					url : "${pageContext.request.contextPath}/orders/find",
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
						var date1 = new Date(jData.orderDate);
						var dates = date.getFullYear() + '-' + (date.getMonth() + 1) + '-' + date.getDate();//拼接自己想要的格式
						var dates1 = date1.getFullYear() + '-' + (date1.getMonth() + 1) + '-' + date1.getDate();//拼接自己想要的格式
						$("input#id").val(id);
						$("input#code").val(jData.code);
						$("input#meterCount").val(jData.meterCount);
						$("input#customer").val(jData.customer);
						$("input#address").val(jData.address); 
						$("input#note").val(jData.note);
					    $("input#createdAt").val(dates);
					    $("input#orderDate").val(dates1);
						//给下拉框赋值默认选中行的值
					    $("select#selectMeterType").val(jData.meterType);
					    $("select#selectFactory").val(jData.factory);
					    $("select#selectType").val(jData.types); 
					    $("select#selectValve").val(jData.valve);
					    $("select#selectStatus").val(jData.status);
					    meterType =  jData.meterType;
						factory = jData.factory;
						types = jData.types;
						valve = jData.valve;
						status1 = jData.status;
						/* alert(types); */
					}
				});
			});
		
			//删除订单
			$('.table tbody').on("click",'.del_order', function() {
				var id =this.id;
				console.log(id);	
				/*  alert(id);  */
				layer.confirm('是否确认删除该订单？', {
					btn : [ '确认', '取消' ]
				//按钮
				}, function() {
					location.href = "${pageContext.request.contextPath}/orders/delete?id="+id;
				}, function() {

					layer.msg('取消');
				});
			});
			
			//打印订单
			$('.table tbody').on("click", '.print_order',function() {
				var id =this.id;
				console.log(id);	
				/*  alert(id);  */
				layer.confirm('是否确认打印该订单？', {
					btn : [ '确认', '取消' ]
				//按钮
				}, function() {
					location.href = "${pageContext.request.contextPath}/orders/print?id="+id;
					layer.msg('准备打印', {
						icon : 1
					});
				}, function() {

					layer.msg('取消');
				});
			});
			$('#addOrder').on('show.bs.modal', function () {
   				$("input").val("");
   				$("input").css("-webkit-box-shadow","0 0 0px 1000px white inset");
			})
		</script>
	</tiles:putAttribute>
</tiles:insertDefinition>
