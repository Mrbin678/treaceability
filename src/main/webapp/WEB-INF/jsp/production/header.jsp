<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div class="header">
			<h1 class="page-header">
				表头板 <small> 全部表头板信息.</small>
			</h1>
		</div>
		<div id="page-inner">
			<div class="row">
				<div class="col-md-3 pull-right">
					<form class="form" action="${pageContext.request.contextPath}/header/index" method="post">
						<input class="form-control" type="text" id="code" name="code" value="${requestScope.search_name}" placeholder="Search....">
					</form>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<div class="card">
						<div class="card-content">
							<div class="table-resposive">
								<table style="font-size: 11px" class="table table-striped table-condensed table-bordered table-hover" id="header_table">
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
											<th>操作</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach var="iterm" items="${requestScope.header_list}">
											<tr>
												<td>${iterm.code}</td>
												<td>${iterm.orderCode}</td>
												<td>${iterm.workId}</td>
												<td>${iterm.types}</td>
												<td>${iterm.meterType}</td>
												<td>${iterm.version}</td>
												<td>${iterm.valveTest}</td>
												<td>${iterm.electricityTest}</td>
												<td>${iterm.programTest}</td>
												<td>${iterm.readingTest}</td>
												<td>${iterm.timeTest}</td>
												<td>${iterm.note}</td>
												<td><fmt:formatDate type="both"
														value="${iterm.createdAt}" pattern="yyyy:MM:dd HH:mm" /></td>
												<td><a class="edit_header" id="${iterm.id}">编辑</a> 
												<a class="del_header" id="${iterm.id}">删除</a></td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
								<ul class="pagination pull-right">
									<c:if test="${!pagehelper.isFirstPage}">
										<li><a
											href="${pageContext.request.contextPath}/header/index?start=${pagehelper.firstPage}">首页</a></li>
										<li><a
											href="${pageContext.request.contextPath}/header/index?start=${pagehelper.prePage}">上一页</a></li>
									</c:if>
									<c:forEach items="${pagehelper.navigatepageNums}" var="navigatepageNum">
										<c:if test="${navigatepageNum==pagehelper.pageNum}">
											<li class="active"><a
												href="${pageContext.request.contextPath}/header/index?start=${navigatepageNum}">${navigatepageNum}</a></li>
										</c:if>
										<c:if test="${navigatepageNum!=pagehelper.pageNum}">
											<li><a
												href="${pageContext.request.contextPath}/header/index?start=${navigatepageNum}">${navigatepageNum}</a></li>
										</c:if>
									</c:forEach>
									<c:if test="${!pagehelper.isLastPage}">
										<li><a
											href="${pageContext.request.contextPath}/header/index?start=${pagehelper.nextPage}">下一页</a></li>
										<li><a
											href="${pageContext.request.contextPath}/header/index?start=${pagehelper.lastPage}">最后一页</a></li>
									</c:if>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="modal fade" id="editHeader">
			<div class="modal-dialog">
		    	<div class="modal-content">
					<div class="modal-header">
					    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					    <h4 class="modal-title" id="myModalLabel">编辑表头板信息</h4>
				    </div>
					<div class="modal-body">
						<form id = "editHeaderFrom" action="${pageContext.request.contextPath}/header/update" method="post" onsubmit="return check()">
							<input type="hidden" id="id" name="id" />
							<div class="row form-group">
								<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">表头板编号:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="code" name="code" type="text" value="" placeholder="请输入表头版编号">
									</div>
								</div>
							</div>
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
									<div class="col-4 col-sm-4 st">规格型号:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="types" name="types" type="text" value="" placeholder="请输入规格型号">
									</div>
								</div>
							</div>
							<div class="row form-group">
								<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">基表类型:</div>
									<div class="col-8 col-sm-8">
										<select class="select form-control" name="meterType" id="selectMeterType" onchange="getMeterValue(this.options[this.options.selectedIndex].value)">
										</select>
									</div>
								</div>
							</div>
							<div class="row form-group">
								<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">版本信息:</div>
									<div class="col-8 col-sm-8">
										<select class="select form-control" name="version" id="selectVersion"  onchange="getVersionValue(this.options[this.options.selectedIndex].value)" >
										</select>
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
									<div class="col-4 col-sm-4 st">电流测试:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="electricityTest" name="electricityTest" type="text" value="" placeholder="请输入电流测试">
									</div>
								</div>
							</div>
							<div class="row form-group">
								<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">写程序测试:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="programTest" name="programTest" type="text" value="" placeholder="请输入写程序测试">
									</div>
								</div>
							</div>
							<div class="row form-group">
								<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">读数测试:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="readingTest" name="readingTest" type="text" value="" placeholder="请输入读数测试">
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
				//修改表头板表单校验,fields验证对应的输入框的name属性
				$('#editHeaderFrom').bootstrapValidator({
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
	                            	message: '请填写表头板编号'
	                        	},
		                        regexp: {
		                            regexp: /^[^ ]+$/,
		                            message: '不能有空格.'
		                        },
		                        remote: {
		                            type: 'GET',
		                            url: '${pageContext.request.contextPath}/header/checkCode',
		                            data:{
		                            	id:function(){return $("input#id").val();}
		                            },
		                            message: '表头板编号重复',
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
		                types: {
		                    validators: {
		                        notEmpty: {
		                            message: '请填写表头板规格型号'
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
			//加载下拉框
			$.ajax({
				url : "${pageContext.request.contextPath}/system_param/findAll",
				type : "POST",
				data : {},
				dataType : "text",
				success : function(data) {
					jData = eval('(' + data + ')').results;//拿到参数表集合（基表类型、生产厂家）
					//给所有系统参数下拉框赋值
					for(var i=0; i<jData.length;i++){
						if(jData[i].paramTypes == '基表类型'){
							$("select#selectMeterType").append("<option value='"+jData[i].name+"'>"+jData[i].name+"</option>");	
						}
						
						if(jData[i].paramTypes == '短信表程序版本'){
							$("select#selectVersion").append("<option value='"+jData[i].name+"'>"+jData[i].name+"</option>");
						}
					} 
					$("select#selectMeterType option:first").prop("selected", 'selected');
					$("select#selectVersion option:first").prop("selected", 'selected');
				}	
			});
			var id = null;
			var jData = null; 
			var meterType = null;
			var version = null;
			//修改表头板信息
			$('.table tbody').on("click", '.edit_header',function() {
			    id = this.id;//获取对应订单id
			    $("#editHeader").modal("show");
				$('#editHeader').on('shown.bs.modal', function () {
	  			});
				//模态框赋值
				$.ajax({
					url : "${pageContext.request.contextPath}/header/find",
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
						$("input#code").val(jData.code);
						$("input#orderCode").val(jData.orderCode);
						$("input#work").val(jData.workId);
						$("input#types").val(jData.types);
						$("input#note").val(jData.note);
					    $("input#createdAt").val(dates);
					    $("input#valveTest").val(jData.valveTest);
					    $("input#electricityTest").val(jData.electricityTest);
					    $("input#programTest").val(jData.programTest);
					    $("input#readingTest").val(jData.readingTest);
					    $("input#timeTest").val(jData.timeTest);
					  	//给下拉框赋值
					    $("select#selectMeterType").val(jData.meterType);
						$("select#selectTypes").val(jData.types);
						$("select#selectVersion").val(jData.version);
						 meterType = jData.meterType;
						 version = jData.version;
					}
				});
			});
			
			//删除表头板信息
			$('.table tbody').on("click",'.del_header', function() {
				var id =this.id;
				console.log(id);	
				/*  alert(id);  */
				layer.confirm('是否确认删除该表头板记录？', {
					btn : [ '确认', '取消' ]
				//按钮
				}, function() {
					location.href = "${pageContext.request.contextPath}/header/delete?id="+id;
				}, function() {
					layer.msg('取消');
				});
			});
	
			//通过select的onChange事件获取选中的option的值
			function getMeterValue(value){ 
				meterType = value;	
			}
			function getVersionValue(value){
				version = value;
			}
			//表单验证
			function check() {
				if( meterType == null||meterType == ""){
					alert("请选择基表类型！");
					return false;
				}else if(version==null||version == ""){
					alert("请选择版本信息！");
					return false;
				}
				return true;
			}	
		</script>
	</tiles:putAttribute>
</tiles:insertDefinition>