<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div class="header">
			<h1 class="page-header">
				维修管理<small> 全部维修信息.</small>
			</h1>
		</div>
		<div id="page-inner">
			<div class="row">
				<div class="col-md-12">
					<div class="card">
						<div class="card-content">
							<div class="table-resposive">
								<table class="table table-striped table-condensed table-bordered table-hover" id="repair_table">
									<thead>
										<tr>
											<th>维修件编号</th>
											<th>维修员ID</th>
											<th>维修员</th>
											<th>维修件类型</th>
											<th>维修来源</th>
											<th>维修结果</th>
											<th>创建日期</th>
											<th>操作</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach var="item" items="${requestScope.repair_list}">
											<tr>
												<td>${item.deviceCode}</td>
												<td>${item.operatorId}</td>
												<td>${item.operator}</td>
												<td>${item.types}</td>
												<td>${item.source}</td>
												<td>${item.content}</td>
												<td><fmt:formatDate type="both"
														value="${item.createdAt}" pattern="yyyy-MM-dd HH:mm" /></td>
												<td><a class="edit_repair" id="${item.id}">编辑</a> 
												<a class="del_repair" id="${item.id}">删除</a></td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- 模态框（Modal） 编辑维修信息-->
		<div class="modal fade" id="editRepair" tabindex="-1" role="dialog" aria-labelledby="editModalLabel" aria-hidden="true">
		    <div class="modal-dialog">
		        <div class="modal-content">
		            <div class="modal-header">
		                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
		                <h4 class="modal-title" id="myModalLabel">编辑维修信息</h4>
		            </div>
		            <div class="modal-body">
		            	<form id="editRepairFrom" action="${pageContext.request.contextPath}/repair/update" method="post" onsubmit="return check()">
							<input type="hidden" id="id" name="id" />
							<div class="row form-group">
      							<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">维修件编号:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="deviceCode" name="deviceCode" type="text" value="" placeholder="请输入维修件编号">
									</div>
								</div>
							</div>
							<div class="row form-group">
      							<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">维修员ID:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="operatorId" name="operatorId" type="text" value="" placeholder="请输入维修员ID">
									</div>
								</div>
							</div>
							<div class="row form-group">
      							<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">维修员:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="operator" name="operator" type="text" value="" placeholder="请输入维修员">
									</div>
								</div>
							</div>
							<div class="row form-group">
      							<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">维修件类型:</div>
									<div class="col-8 col-sm-8">
										<select class="select form-control" id="types" name="types" onchange="getTypesValue(this.options[this.options.selectedIndex].value)"></select>
									</div>
								</div>
							</div>
							<div class="row form-group">
      							<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">维修来源:</div>
									<div class="col-8 col-sm-8">
										<select class="select form-control" id="source" name="source" onchange="getSourceValue(this.options[this.options.selectedIndex].value)" ></select>
									</div>
								</div>
							</div>
							<div class="row form-group">
      							<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">维修结果:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="content" name="content" type="text" value="" placeholder="请输入维修结果">
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
				$('#repair_table').dataTable();
				//修改维修信息表单校验,fields验证对应的输入框的name属性
			       $('#editRepairFrom').bootstrapValidator({
			            message: '请填写该字段!',
			            feedbackIcons: {
			                valid: 'glyphicon glyphicon-ok',
			                invalid: 'glyphicon glyphicon-remove',
			                validating: 'glyphicon glyphicon-refresh'
			            },
			            fields: {
			            	deviceCode: {
			                    validators: {
			                        notEmpty: {
			                            message: '请填写维修件编号'
			                        },
			                        regexp: {
			                            regexp: /^[^ ]+$/,
			                            message: '不能有空格.'
			                        },
			                        remote: {
			                            type: 'GET',
			                            url: '${pageContext.request.contextPath}/repair/checkCode',
			                            data:{
			                            	id:function(){return $("input#id").val();}
			                            },
			                            message: '维修件编号重复',
			                            delay: 1000
			                        }
			                    }
			                },
			                operatorId: {
			                    validators: {
			                        notEmpty: {
			                            message: '请填写维修员ID'
			                        },regexp: {
			                            regexp: /^[^ ]+$/,
			                            message: '不能有空格.'
			                        }
			                    }
			                },
			                operator: {
			                    validators: {
			                        notEmpty: {
			                            message: '请填写维修员'
			                        },
			                        regexp: {
			                            regexp: /^[^ ]+$/,
			                            message: '不能有空格.'
			                        }
			                    }
			                },
			                source: {
			                    validators: {
			                        notEmpty: {
			                            message: '请填写维修来源'
			                        },
			                        regexp: {
			                            regexp: /^[^ ]+$/,
			                            message: '不能有空格.'
			                        }
			                    }
			                },
			                content: {
			                    validators: {
			                        notEmpty: {
			                            message: '请填写维修结果'
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

			$('#repair_table').dataTable({
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
						if(jData[i].paramTypes == '维修类型'){
							$("select#types").append("<option value='"+jData[i].name+"'>"+jData[i].name+"</option>");
						}
						if(jData[i].paramTypes == '维修来源'){
							$("select#source").append("<option value='"+jData[i].name+"'>"+jData[i].name+"</option>");
						}
						
					} 
					//默认下拉框第一个option被选中
					$("select#types option:first").prop("selected", 'selected');
					$("select#source option:first").prop("selected", 'selected');
				}	
			});
			
				var id = null;
				var jData = null; 
				var repairType = null;
				var repairSource = null;
			//修改基表信息
			$('.table tbody').on("click",'.edit_repair', function() {
			    id = this.id;//获取对应基表信息检验id
				$("#editRepair").modal("show");
   				$('#editRepair').on('shown.bs.modal', function () {
      			});
				$.ajax({
					url : "${pageContext.request.contextPath}/repair/find",
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
						$("input#deviceCode").val(jData.deviceCode);
						$("input#operatorId").val(jData.operatorId);
						$("input#operator").val(jData.operator);
						$("input#content").val(jData.content);
					    $("input#createdAt").val(dates);	    					   
					   	//给默认选中的下拉框赋值
					    $("select#types").val(jData.types);
						$("select#source").val(jData.source);
						
						repairType = jData.types;
						repairSource = jData.source;
					}
					
				});
			});
			
			//删除基表信息
			$('.table tbody').on("click", '.del_repair',function() {
				var id =this.id;
				console.log(id);	
				/*  alert(id);  */
				layer.confirm('是否确认删除该维修记录？', {
					btn : [ '确认', '取消' ]
				//按钮
				}, function() {
					location.href = "${pageContext.request.contextPath}/repair/delete?id="+id;
				}, function() {
					layer.msg('取消');
				});
			});
			
			//通过select的onChange事件获取选中的option的值
			
			function getTypesValue(value){ 
				repairType = value;	
			}
			function getSourceValue(value){
				repairSource = value;
			}
			//表单验证
			function check() {
				
				if(repairType == null||repairType == ""){
					alert("请选择维修类型！");
					return false;
				}else if(repairSource == null||repairSource == ""){
					alert("请选择维修来源！");
					return false;
				}
				return true;
			}
		
		</script>
	</tiles:putAttribute>
</tiles:insertDefinition>