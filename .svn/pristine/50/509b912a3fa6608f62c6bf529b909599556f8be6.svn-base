<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div class="header">
			<h1 class="page-header">
				表壳 <small> 全部表壳信息.</small>
			</h1>
		</div>
		<div id="page-inner">
			<div class="row">
				<div class="col-md-3 pull-right">
					<form class="form" action="${pageContext.request.contextPath}/shell/index" method="post">
						<input class="form-control" type="text" id="code" name="code" value="${requestScope.search_name}" placeholder="Search....">
					</form>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<div class="card">
						<div class="card-content">
							<div class="table-resposive">
								<table style="font-size: 11px" class="table table-striped table-condensed table-bordered table-hover" id="shell_table">
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
											<th>操作</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach var="iterm" items="${requestScope.shells}">
											<tr>
												<td>${iterm.code}</td>
												<td>${iterm.workId}</td>
												<td>${iterm.factory}</td>
												<td>${iterm.valveFactory}</td>
												<td>${iterm.valveType}</td>
												<td>${iterm.types}</td>
												<td>${iterm.note}</td>
												<td><fmt:formatDate type="both" 
													value="${iterm.createdAt}" pattern="yyyy-MM-dd HH:mm" /></td>
												<td><a class="edit_shell" id="${iterm.id}">编辑</a> 
												<a class="del_shell" id="${iterm.id}">删除</a></td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
								<ul class="pagination pull-right">
									<c:if test="${!pagehelper.isFirstPage}">
										<li><a
											href="${pageContext.request.contextPath}/shell/index?start=${pagehelper.firstPage}">首页</a></li>
										<li><a
											href="${pageContext.request.contextPath}/shell/index?start=${pagehelper.prePage}">上一页</a></li>
									</c:if>
									<c:forEach items="${pagehelper.navigatepageNums}" var="navigatepageNum">
										<c:if test="${navigatepageNum==pagehelper.pageNum}">
											<li class="active"><a
												href="${pageContext.request.contextPath}/shell/index?start=${navigatepageNum}">${navigatepageNum}</a></li>
										</c:if>
										<c:if test="${navigatepageNum!=pagehelper.pageNum}">
											<li><a
												href="${pageContext.request.contextPath}/shell/index?start=${navigatepageNum}">${navigatepageNum}</a></li>
										</c:if>
									</c:forEach>
									<c:if test="${!pagehelper.isLastPage}">
										<li><a
											href="${pageContext.request.contextPath}/shell/index?start=${pagehelper.nextPage}">下一页</a></li>
										<li><a
											href="${pageContext.request.contextPath}/shell/index?start=${pagehelper.lastPage}">最后一页</a></li>
									</c:if>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="modal fade" id="editShell">
			<div class="modal-dialog">
		    	<div class="modal-content">
					<div class="modal-header">
					    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					    <h4 class="modal-title" id="myModalLabel">编辑表壳信息</h4>
				    </div>
					<div class="modal-body">
						<form id="editShellFrom" action="${pageContext.request.contextPath}/shell/update" method="post" onsubmit="return check()">
							<input type="hidden" id="id" name="id" />
							<div class="row form-group">
								<div class="col-sm-10">
									<div class="col-4 col-sm-4 st">表壳编号条码:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="code" name="code" type="text" value="" placeholder="请输入表壳编号条码">
									</div>
								</div>
							</div>
							<div class="row form-group">
								<div class="col-sm-10">
									<div class="col-4 col-sm-4 st">外壳厂家:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="factory" name="factory" type="text" value="" placeholder="请输入外壳厂家">
									</div>
								</div>
							</div>
							<div class="row form-group">
								<div class="col-sm-10">
									<div class="col-4 col-sm-4 st">阀门厂家:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="valveFactory" name="valveFactory" type="text" value="" placeholder="请输入阀门厂家">
									</div>
								</div>
							</div>
							<div class="row form-group">
      							<div class="col-sm-10">
									<div class="col-4 col-sm-4 st">阀门类型:</div>
									<div class="col-8 col-sm-8">
										<select class="select form-control" name="valveType" id="valveType" 
											onchange="getValueType(this.options[this.options.selectedIndex].value)"></select>
									</div>
								</div>
							</div>
							<div class="row form-group">
								<div class="col-sm-10">
									<div class="col-4 col-sm-4 st">规格型号:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="types" name="types" type="text" value="" placeholder="请输入规格型号">
									</div>
								</div>
							</div>
							<div class="row form-group">
								<div class="col-sm-10">
									<div class="col-4 col-sm-4 st">描述:</div>
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
				$('#editShellFrom').bootstrapValidator({
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
				                     message: '表壳编号条码'
				                 },
				                 regexp: {
				                     regexp: /^[^ ]+$/,
				                     message: '不能有空格.'
				                 },
				                 remote: {
				                     type: 'GET',
				                     url: '${pageContext.request.contextPath}/shell/checkCode',
				                     data:{
				                     	id:function(){return $("input#id").val();}
				                     },
				                     message: '表壳编号条码重复',
				                     delay: 1000
				                 }
				             }
				         },
				         factory: {
				             validators: {
				                 notEmpty: {
				                     message: '请填写表壳厂家'
				                 },
				                 regexp: {
				                     regexp: /^[^ ]+$/,
				                     message: '不能有空格.'
				                 }
				             }
				         },
				         valveFactory: {
				             validators: {
				                 notEmpty: {
				                     message: '请填写阀门厂家'
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
				                     message: '请填写规格型号'
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
					jData = eval('(' + data + ')').results;//拿到参数表集合（阀门类型）					
					//给所有系统参数下拉框赋值
					for(var i=0; i<jData.length;i++){
						if(jData[i].paramTypes == '阀门信息'){
							$("select#valveType").append("<option value='"+jData[i].name+"'>"+jData[i].name+"</option>");	
						}
					} 
					$("select#valveType option:first").prop("selected", 'selected');
				}
			});
			var id = null;
			var jData = null; 
			var valveType = null;
			//修改基表信息
			$('.table tbody').on("click",'.edit_shell', function() {
			    id = this.id;//获取对应订单id
			    $("#editShell").modal("show");
				$('#editShell').on('shown.bs.modal', function () {
	  			});
				
				$.ajax({
					url : "${pageContext.request.contextPath}/shell/find",
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
						$("input#factory").val(jData.factory);
						$("input#valveFactory").val(jData.valveFactory);
						$("input#types").val(jData.types);
						$("input#note").val(jData.note);
					    $("input#createdAt").val(dates);	    
					   	//给下拉框赋值
					    $("select#valveType").val(jData.valveType);
					    valveType = jData.valveType;
					}
				});
			});
		
			//删除基表信息
			$('.table tbody').on("click",'.del_shell', function() {
				var id =this.id;
				console.log(id);	
				layer.confirm('是否确认删除该记录？', {
					btn : [ '确认', '取消' ]
				//按钮
				}, function() {
					location.href = "${pageContext.request.contextPath}/shell/delete?id="+id;
				}, function() {
					layer.msg('取消');
				});
			});
		
			//通过select的onChange事件获取选中的option的值
			function getValueType(value){ 
				valveType = value;	
			}
			
			//表单验证
			function check() {
				return true;
			}
		</script>
	</tiles:putAttribute>
</tiles:insertDefinition>