<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div class="header">
			<h1 class="page-header">
				基表检验<small> 全部基表检验信息.</small>
			</h1>
		</div>
		<div id="page-inner">
			<div class="row">
				<div class="col-md-3 pull-right">
					<form class="form" action="${pageContext.request.contextPath}/meterDetection/index" method="post">
						<input class="form-control" type="text" id="code" name="code" value="${requestScope.search_name}" placeholder="Search....">
					</form>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<div class="card">
						<div class="card-content">
							<div class="table-resposive">
								<table style="font-size: 11px" class="table table-striped table-condensed table-bordered table-hover" id="meterDetection_table">
									<thead>
										<colgroup>
										    <col></col>
										    <col></col>
										    <col></col>
										    <col></col>
										    <col></col>
										    <col></col>
										    <col></col>
										    <col></col>
										    <col></col>
										    <col></col>
										    <col></col>
										    <col></col>
										    <col></col>
										    <col></col>
										    <col></col>
										    <col></col>
										    <col></col>
										    <col></col>
										    <col></col>
										    <col></col>
										    <col></col>
										    <col></col>
										  </colgroup>
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
											<th>电流测试</th>
											<th>掉电测试</th>
											<th>屏显信息</th>
											<th>无线表写频点测试</th>
											<th>无线表通信测试</th>
											<th>无线表恢复出厂设置</th>
											<th>短信表上电信息</th>
											<th>短信表信号强度</th>
											<th>检验结果</th>
											<th>描述</th>
											<th>创建日期</th>
											<th>操作</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach var="item" items="${requestScope.meterDetection_list}">
											<tr>
												<td>${item.orderCode}</td>
												<td>${item.factoryCode}</td>
												<td>${item.meterType}</td>
												<td>${item.operatorId}</td>
												<td>${item.operator}</td>
												<td>${item.valveTest}</td>
												<td>${item.countTest}</td>
												<td>${item.writeTest}</td>
												<td>${item.codeTest}</td>
												<td>${item.timeTest}</td>
												<td>${item.electricityTest}</td>
												<td>${item.nopowerTest}</td>
												<td>${item.displayTest}</td>
												<td>${item.channelTest}</td>
												<td>${item.communicationTest}</td>
												<td>${item.resetTest}</td>
												<td>${item.onpowerTest}</td>
												<td>${item.signalTest}</td>
												<td>${item.detection}</td>
												<td>${item.note}</td>
												<td><fmt:formatDate type="both"
														value="${item.createdAt}" pattern="yyyy-MM-dd HH:mm" /></td>
												<td><a class="edit_meterDetection" id="${item.id}">编辑</a> 
												<a class="del_meterDetection" id="${item.id}">删除</a></td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
								<ul class="pagination pull-right">
									<c:if test="${!pagehelper.isFirstPage}">
										<li><a
											href="${pageContext.request.contextPath}/meterDetection/index?start=${pagehelper.firstPage}">首页</a></li>
										<li><a
											href="${pageContext.request.contextPath}/meterDetection/index?start=${pagehelper.prePage}">上一页</a></li>
									</c:if>
									<c:forEach items="${pagehelper.navigatepageNums}" var="navigatepageNum">
										<c:if test="${navigatepageNum==pagehelper.pageNum}">
											<li class="active"><a
												href="${pageContext.request.contextPath}/meterDetection/index?start=${navigatepageNum}">${navigatepageNum}</a></li>
										</c:if>
										<c:if test="${navigatepageNum!=pagehelper.pageNum}">
											<li><a
												href="${pageContext.request.contextPath}/meterDetection/index?start=${navigatepageNum}">${navigatepageNum}</a></li>
										</c:if>
									</c:forEach>
									<c:if test="${!pagehelper.isLastPage}">
										<li><a
											href="${pageContext.request.contextPath}/meterDetection/index?start=${pagehelper.nextPage}">下一页</a></li>
										<li><a
											href="${pageContext.request.contextPath}/meterDetection/index?start=${pagehelper.lastPage}">最后一页</a></li>
									</c:if>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- 模态框（Modal） 编辑基表检验信息-->
		<div class="modal fade" id="editMeterDetection" tabindex="-1" role="dialog" aria-labelledby="editModalLabel" aria-hidden="true">
		    <div class="modal-dialog">
		        <div class="modal-content">
		            <div class="modal-header">
		                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
		                <h4 class="modal-title" id="myModalLabel">编辑基表检验信息</h4>
		            </div>
		            <div class="modal-body">
		            	<form id="editMeterDetectionFrom" action="${pageContext.request.contextPath}/meterDetection/update" method="post" >
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
									<div class="col-4 col-sm-4 st">出厂编号:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="factoryCode" name="factoryCode" type="text" value="" placeholder="请输入基表出厂编号">
									</div>
								</div>
							</div>
							<div class="row form-group">
      							<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">基表类型:</div>
									<div class="col-8 col-sm-8">
										<select class="select form-control" name="meterType" id="meterType"></select>
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
									<div class="col-4 col-sm-4 st">开关阀测试:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="valveTest" name="valveTest" type="text" value="" placeholder="请输入开关阀测试">
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
									<div class="col-4 col-sm-4 st">写读数测试:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="writeTest" name="writeTest" type="text" value="" placeholder="请输入写读数测试">
									</div>
								</div>
							</div>
							<div class="row form-group">
      							<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">写表号测试:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="codeTest" name="codeTest" type="text" value="" placeholder="请输入写表号测试">
									</div>
								</div>
							</div>
							<div class="row form-group">
      							<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">校时测试:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="timeTest" name="timeTest" type="text" value="" placeholder="请输入校时测试">
									</div>
								</div>
							</div>
							<div class="row form-group">
      							<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">电流测试:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="electricityTest" name="electricityTest" type="text" value="" placeholder="请输入电流测试">
									</div>
								</div>
							</div>
							<div class="row form-group">
      							<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">掉电测试:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="nopowerTest" name="nopowerTest" type="text" value="" placeholder="请输入掉电测试">
									</div>
								</div>
							</div>
							<div class="row form-group">
      							<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">屏显信息:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="displayTest" name="displayTest" type="text" value="" placeholder="请输入屏显信息">
									</div>
								</div>
							</div>
							<div class="row form-group">
      							<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">无线表写频点测试:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="channelTest" name="channelTest" type="text" value="" placeholder="请输入无线表写频点测试">
									</div>
								</div>
							</div>
							<div class="row form-group">
      							<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">无线表通信测试:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="communicationTest" name="communicationTest" type="text" value="" placeholder="请输入无线表通信测试">
									</div>
								</div>
							</div>
							<div class="row form-group">
      							<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">无线表恢复出厂设置:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="resetTest" name="resetTest" type="text" value="" placeholder="请输入无线表恢复出厂设置">
									</div>
								</div>
							</div>
							<div class="row form-group">
      							<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">短信表上电信息:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="onpowerTest" name="onpowerTest" type="text" value="" placeholder="请输入短信表上电信息">
									</div>
								</div>
							</div>
							<div class="row form-group">
      							<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">短信表信号强度:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="signalTest" name="signalTest" type="text" value="" placeholder="请输入短信表信号强度">
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
				//修改基表检验表单校验,fields验证对应的输入框的name属性
		       	$('#editMeterDetectionFrom').bootstrapValidator({
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
		                            url: '${pageContext.request.contextPath}/meterDetection/checkCode',
		                            data:{
		                            	id:function(){return $("input#id").val();}
		                            },
		                            message: '基表出厂编号重复',
		                            delay: 1000
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
		                valveTest: {
		                    validators: {
		                        notEmpty: {
		                            message: '请填写开关阀测试'
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
		                writeTest: {
		                    validators: {
		                        notEmpty: {
		                            message: '请填写写读数测试'
		                        },
		                        regexp: {
		                            regexp: /^[^ ]+$/,
		                            message: '不能有空格.'
		                        }
		                    }
		                },
		                codeTest: {
		                    validators: {
		                        notEmpty: {
		                            message: '请填写写表号测试'
		                        },
		                        regexp: {
		                            regexp: /^[^ ]+$/,
		                            message: '不能有空格.'
		                        }
		                    }
		                },
		                timeTest: {
		                    validators: {
		                        notEmpty: {
		                            message: '请填写校时测试'
		                        },
		                        regexp: {
		                            regexp: /^[^ ]+$/,
		                            message: '不能有空格.'
		                        }
		                    }
		                },
		                electricityTest: {
		                    validators: {
		                        notEmpty: {
		                            message: '请填写电流测试'
		                        },
		                        regexp: {
		                            regexp: /^[^ ]+$/,
		                            message: '不能有空格.'
		                        }
		                    }
		                },
		                nopowerTest: {
		                    validators: {
		                        notEmpty: {
		                            message: '请填写掉电测试'
		                        },
		                        regexp: {
		                            regexp: /^[^ ]+$/,
		                            message: '不能有空格.'
		                        }
		                    }
		                },
		                displayTest: {
		                    validators: {
		                        notEmpty: {
		                            message: '请填写屏显信息'
		                        },
		                        regexp: {
		                            regexp: /^[^ ]+$/,
		                            message: '不能有空格.'
		                        }
		                    }
		                },
		                channelTest: {
		                    validators: {
		                        notEmpty: {
		                            message: '请填写无线表写频点测试'
		                        },
		                        regexp: {
		                            regexp: /^[^ ]+$/,
		                            message: '不能有空格.'
		                        }
		                    }
		                },
		                communicationTest: {
		                    validators: {
		                        notEmpty: {
		                            message: '请填写无线表通信测试'
		                        },
		                        regexp: {
		                            regexp: /^[^ ]+$/,
		                            message: '不能有空格.'
		                        }
		                    }
		                },
		                resetTest: {
		                    validators: {
		                        notEmpty: {
		                            message: '请填写无线表恢复出厂设置'
		                        },
		                        regexp: {
		                            regexp: /^[^ ]+$/,
		                            message: '不能有空格.'
		                        }
		                    }
		                },
		                onpowerTest: {
		                    validators: {
		                        notEmpty: {
		                            message: '请填写短信表上电信息'
		                        },
		                        regexp: {
		                            regexp: /^[^ ]+$/,
		                            message: '不能有空格.'
		                        }
		                    }
		                },
		                signalTest: {
		                    validators: {
		                        notEmpty: {
		                            message: '请填写短信表信号强度'
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
							$("select#meterType").append("<option value='"+jData[i].name+"'>"+jData[i].name+"</option>");	
						}
					} 
					$("select#meterType option:first").prop("selected", 'selected');
				}	
			});
			
			var id = null;
			var jData = null; 
			//修改基表信息
			$('.table tbody').on("click",'.edit_meterDetection', function() {
			    id = this.id;//获取对应基表信息检验id
				$("#editMeterDetection").modal("show");
   				$('#editMeterDetection').on('shown.bs.modal', function () {
      			});
				$.ajax({
					url : "${pageContext.request.contextPath}/meterDetection/find",
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
						$("input#factoryCode").val(jData.factoryCode);
						$("input#operatorId").val(jData.operatorId);
						$("input#operator").val(jData.operator);
						$("input#detection").val(jData.detection);
						$("input#note").val(jData.note);
					    $("input#createdAt").val(dates);	
					    $("select#meterType").val(jData.meterType);
					    $("input#valveTest").val(jData.valveTest);	
					    $("input#countTest").val(jData.countTest);	
					    $("input#writeTest").val(jData.writeTest);	
					    $("input#codeTest").val(jData.codeTest);	
					    $("input#timeTest").val(jData.timeTest);	
					    $("input#electricityTest").val(jData.electricityTest);	
					    $("input#nopowerTest").val(jData.nopowerTest);	
					    $("input#displayTest").val(jData.displayTest);	
					    $("input#channelTest").val(jData.channelTest);	
					    $("input#channelTest").val(jData.channelTest);	
					    $("input#communicationTest").val(jData.communicationTest);	
					    $("input#resetTest").val(jData.resetTest);	
					    $("input#onpowerTest").val(jData.onpowerTest);	
					    $("input#signalTest").val(jData.signalTest);
					}
				});
			});
			
			//删除基表信息
			$('.table tbody').on("click", '.del_meterDetection',function() {
				var id =this.id;
				console.log(id);	
				/*  alert(id);  */
				layer.confirm('是否确认删除该基表检验记录？', {
					btn : [ '确认', '取消' ]
				//按钮
				}, function() {
					location.href = "${pageContext.request.contextPath}/meterDetection/delete?id="+id;
				}, function() {
					layer.msg('取消');
				});
			});
		
		</script>
	</tiles:putAttribute>
</tiles:insertDefinition>