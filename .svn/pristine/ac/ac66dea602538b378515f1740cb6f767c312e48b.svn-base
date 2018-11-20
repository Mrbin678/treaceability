<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div class="header">
			<h1 class="page-header">
				基表 <small> 全部基表信息.</small>
			</h1>
		</div>
		<div id="page-inner">
			<div class="row">
				<div class="col-md-3 pull-right">
					<form class="form" action="${pageContext.request.contextPath}/meter/index" method="post">
						<input class="form-control" type="text" id="code" name="code" value="${requestScope.search_name}" placeholder="Search....">
					</form>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<div class="card">
						<div class="card-content">
							<div class="table-resposive">
								<table style="font-size: 11px" class="table table-striped table-condensed table-bordered table-hover" id="meter_table">
									<thead>
										<tr>
											<th>基表出厂编号</th>
											<th>订单编号条码</th>
											<th>上工信息ID</th>
											<th>基表规格型号</th>
											<th>基表类型</th>
											<th>表头板编号</th>
											<th>计数器编号</th>
											<th>表壳编号</th>
											<th>装配调试结果</th>
											<th>描述</th>
											<th>创建日期</th>
											<th>操作</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach var="iterm" items="${requestScope.meter_list}">
											<tr>
												<td>${iterm.factoryCode}</td>
												<td>${iterm.orderCode}</td>
												<td>${iterm.workId}</td>
												<td>${iterm.types}</td>
												<td>${iterm.meterType}</td>
												<td>${iterm.headerCode}</td>
												<td>${iterm.counterCode}</td>
												<td>${iterm.shellCode}</td>
												<td>${iterm.installResult}</td>
												<td>${iterm.note}</td>
												<td><fmt:formatDate type="both"
														value="${iterm.createdAt}" pattern="yyyy-MM-dd HH:mm" /></td>
												<td><a class="edit_meter" id="${iterm.id}">编辑</a> 
												<a class="del_meter" id="${iterm.id}">删除</a></td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
								<ul class="pagination pull-right">
									<c:if test="${!pagehelper.isFirstPage}">
										<li><a
											href="${pageContext.request.contextPath}/meter/index?start=${pagehelper.firstPage}">首页</a></li>
										<li><a
											href="${pageContext.request.contextPath}/meter/index?start=${pagehelper.prePage}">上一页</a></li>
									</c:if>
									<c:forEach items="${pagehelper.navigatepageNums}" var="navigatepageNum">
										<c:if test="${navigatepageNum==pagehelper.pageNum}">
											<li class="active"><a
												href="${pageContext.request.contextPath}/meter/index?start=${navigatepageNum}">${navigatepageNum}</a></li>
										</c:if>
										<c:if test="${navigatepageNum!=pagehelper.pageNum}">
											<li><a
												href="${pageContext.request.contextPath}/meter/index?start=${navigatepageNum}">${navigatepageNum}</a></li>
										</c:if>
									</c:forEach>
									<c:if test="${!pagehelper.isLastPage}">
										<li><a
											href="${pageContext.request.contextPath}/meter/index?start=${pagehelper.nextPage}">下一页</a></li>
										<li><a
											href="${pageContext.request.contextPath}/meter/index?start=${pagehelper.lastPage}">最后一页</a></li>
									</c:if>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="modal fade" id="editMeter">
			<div class="modal-dialog">
		    	<div class="modal-content">
					<div class="modal-header">
					    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					    <h4 class="modal-title" id="myModalLabel">编辑基表信息</h4>
				    </div>
					<div class="modal-body">
						<form id="editMeterFrom" action="${pageContext.request.contextPath}/meter/update" method="post" onsubmit="return check()">
							<input type="hidden" id="id" name="id" />
							<div class="row form-group">
								<div class="col-sm-10">
									<div class="col-4 col-sm-4 st">基表出厂编号:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="factoryCode" name="factoryCode" type="text" value="" placeholder="请输入基表出厂编号">
									</div>
								</div>
							</div>
							<div class="row form-group">
								<div class="col-sm-10">
									<div class="col-4 col-sm-4 st">订单编号条码:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="orderCode" name="orderCode" type="text" value="" placeholder="请输入订单编号">
									</div>
								</div>
							</div>
							<div class="row form-group">
								<div class="col-sm-10">
									<div class="col-4 col-sm-4 st">基表规格型号:</div>
									<div class="col-8 col-sm-8">
										<select class="select form-control" name="types" id="selectTypes" onchange="getTypesValue(this.options[this.options.selectedIndex].value)">
										</select>
									</div>
								</div>
							</div>
							<div class="row form-group">
								<div class="col-sm-10">
									<div class="col-4 col-sm-4 st">基表类型:</div>
									<div class="col-8 col-sm-8">
										<select class="select form-control" name="meterType" id="selectMeterType" onchange="getMeterValue(this.options[this.options.selectedIndex].value)">
										</select>
									</div>
								</div>
							</div>
							<div class="row form-group">
								<div class="col-sm-10">
									<div class="col-4 col-sm-4 st">表头板编号:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="headerCode" name="headerCode" type="text" value="" placeholder="请输入表头板编号条码">
									</div>
								</div>
							</div>
							<div class="row form-group">
								<div class="col-sm-10">
									<div class="col-4 col-sm-4 st">计数器编号:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="counterCode" name="counterCode" type="text" value="" placeholder="请输入计数器编号条码">
									</div>
								</div>
							</div>
							<div class="row form-group">
								<div class="col-sm-10">
									<div class="col-4 col-sm-4 st">表壳编号:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="shellCode" name="shellCode" type="text" value="" placeholder="请输入表壳编号条码">
									</div>
								</div>
							</div>
							<div class="row form-group">
								<div class="col-sm-10">
									<div class="col-4 col-sm-4 st">装配调试结果:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="installResult" name="installResult" type="text" value="" placeholder="请输入装配调试结果">
									</div>
								</div>
							</div>
							<div class="row form-group">
								<div class="col-sm-10">
									<div class="col-4 col-sm-4 st">备注:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="note" name="note" type="text" value="" placeholder="请输入备注(选填)">
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
				//修改基表表单校验,fields验证对应的输入框的name属性
		       	$('#editMeterFrom').bootstrapValidator({
		            message: '请填写该字段!',
		            feedbackIcons: {
		                valid: 'glyphicon glyphicon-ok',
		                invalid: 'glyphicon glyphicon-remove',
		                validating: 'glyphicon glyphicon-refresh'
		            },
		            fields: {
		            	factoryCode: {
		                    validators: {
		                        notEmpty: {
		                            message: '请填写基表出厂编号'
		                        },
		                        regexp: {
		                            regexp: /^[^ ]+$/,
		                            message: '不能有空格.'
		                        },
		                        remote: {
		                            type: 'GET',
		                            url: '${pageContext.request.contextPath}/meter/checkCode',
		                            data:{
		                            	id:function(){return $("input#id").val();}
		                            },
		                            message: '基表出厂编号重复',
		                            delay: 1000
		                        }
		                    }
		                },
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
		                headerCode: {
		                    validators: {
		                        notEmpty: {
		                            message: '请填写表头板编号'
		                        },
		                        regexp: {
		                            regexp: /^[^ ]+$/,
		                            message: '不能有空格.'
		                        },
		                        remote: {
		                            type: 'GET',
		                            url: '${pageContext.request.contextPath}/meter/checkHeaderCode',
		                            data:{
		                            	id:function(){return $("input#id").val();}
		                            },
		                            message: '表头板编号重复',
		                            delay: 1000
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
		                            url: '${pageContext.request.contextPath}/meter/checkCounterCode',
		                            data:{
		                            	id:function(){return $("input#id").val();}
		                            },
		                            message: '计数器编号重复',
		                            delay: 1000
		                        }
		                    }
		                },
		                shellCode: {
		                    validators: {
		                        notEmpty: {
		                            message: '请填写表壳编号'
		                        },
		                        regexp: {
		                            regexp: /^[^ ]+$/,
		                            message: '不能有空格.'
		                        },
		                        remote: {
		                            type: 'GET',
		                            url: '${pageContext.request.contextPath}/meter/checkShellCode',
		                            data:{
		                            	id:function(){return $("input#id").val();}
		                            },
		                            message: '表壳编号重复',
		                            delay: 1000
		                        }
		                    }
		                },
		                installResult: {
		                    validators: {
		                        notEmpty: {
		                            message: '请填写装配调试结果'
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
						
						if(jData[i].paramTypes == '规格型号'){
							$("select#selectTypes").append("<option value='"+jData[i].name+"'>"+jData[i].name+"</option>");
						}
					} 
					$("select#selectMeterType option:first").prop("selected", 'selected');
					$("select#selectTypes option:first").prop("selected", 'selected');
				}	
			});
			var id = null;
			var jData = null; 
			var meterType = null;
			var types = null;
			//修改基表信息
			$('.table tbody').on("click",'.edit_meter', function() {
			    id = this.id;//获取对应订单id
			    $("#editMeter").modal("show");
				$('#editMeter').on('shown.bs.modal', function () {
	  			});
				$.ajax({
					url : "${pageContext.request.contextPath}/meter/find",
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
						$("input#factoryCode").val(jData.factoryCode);
						$("input#orderCode").val(jData.orderCode);
						$("input#work").val(jData.workId);
						$("input#headerCode").val(jData.headerCode);
						$("input#counterCode").val(jData.counterCode);
						$("input#shellCode").val(jData.shellCode);
						$("input#installResult").val(jData.installResult);
						$("input#note").val(jData.note);
					    $("input#createdAt").val(dates);	    
					   	//给下拉框赋值
					    $("select#selectMeterType").val(jData.meterType);
						$("select#selectTypes").val(jData.types);
						meterType = jData.meterType;
						types = jData.types;
					}
				});
			});
			
			//删除基表信息
			$('.table tbody').on("click",'.del_meter', function() {
				var id =this.id;
				console.log(id);	
				/*   alert(id); //测试代码 */
				layer.confirm('是否确认删除该基表记录？', {
					btn : [ '确认', '取消' ]
				//按钮
				}, function() {
					location.href = "${pageContext.request.contextPath}/meter/delete?id="+id;
				}, function() {
					layer.msg('取消');
				});
			});
			
			//通过select的onChange事件获取选中的option的值
			function getMeterValue(value){ 
				meterType = value;	
			}
			function getTypesValue(value){
				types = value;
			}
			//表单验证
			function check() {
				//获取下拉框的值
				if(types == null||types==""){
					alert("请选择基表规格型号！");
					return false;
				}else if(meterType == null||meterType==""){
					alert("请选择基表类型！");
					return false;
				}	
				return true;
			}
		</script>
	</tiles:putAttribute>
</tiles:insertDefinition>