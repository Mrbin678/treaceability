<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div class="header">
			<h1 class="page-header">
				条码规则
				<button id="add_param" class="button pull-right" data-toggle="modal" data-target="#add">+ 新建条码规则</button>
			</h1>
		</div>
		<div id="page-inner">
			<div class="row">
				<div class="col-md-12">
					<div class="card">
						<div class="card-content">
							<div class="table-resposive">
								<table class="table table-striped table-condensed table-bordered table-hover" id="barcode_table">
									<thead>
										<tr>
											<th>条码名称</th>	
											<th>开始字符</th>
											<th>结束字符</th>
											<th>中间条码长度</th>
											<th>创建时间</th>
											<th>操作</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach var="barcode" items="${requestScope.barcodes}">
											<tr>
												<td>${barcode.name}</td>
												<td>${barcode.beginCode}</td>
												<td>${barcode.endCode}</td>
												<td>${barcode.codeLength}</td>
												<td><fmt:formatDate type="both" value="${barcode.createdAt}" pattern="yyyy-MM-dd HH:mm"/></td>
												<td>
													<a class="edit_code" id="${barcode.id}"  data-toggle="modal">编辑</a>&nbsp;
													<a class="del_code"  id="${barcode.id}">删除</a>
												</td>
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
		<!--新建条码规则 -->
		<div class="modal fade" id="add" tabindex="-1" role="dialog" aria-labelledby="addModal" aria-hidden="true">
		    <div class="modal-dialog">
		        <div class="modal-content">
		            <div class="modal-header">
		                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
		                <h4 class="modal-title" id="myModalLabel">添加条码规则</h4>
		            </div>
		            <div class="modal-body">
						<div class="container-fluid">
							<div class="row">
								<form id="addForm" action="${pageContext.request.contextPath}/barcode/create" method="post" autocomplete="off">
									<div class="row form-group">
		      							<div class="col-sm-8">
											<div class="col-4 col-sm-4 st">条码名称:</div>
											<div class="col-8 col-sm-8">
												<input type="text" id="name" name="name" class="form-control" placeholder="请输入条码名称">
											</div>
										</div>
									</div>
									<div class="row form-group">
		      							<div class="col-sm-8">
											<div class="col-4 col-sm-4 st">开始字符:</div>
											<div class="col-8 col-sm-8">
												<input type="text" id="beginCode" name="beginCode" class="form-control" placeholder="请输入开始字符">
											</div>
										</div>
									</div>
									<div class="row form-group">
		      							<div class="col-sm-8">
											<div class="col-4 col-sm-4 st">结束字符:</div>
											<div class="col-8 col-sm-8">
												<input type="text" id="endCode" name="endCode" class="form-control" placeholder="请输入结束字符">
											</div>
										</div>
									</div>
									<div class="row form-group">
		      							<div class="col-sm-8">
											<div class="col-4 col-sm-4 st">条码长度:</div>
											<div class="col-8 col-sm-8">
												<input type="text" id="codeLength" name="codeLength" class="form-control" placeholder="请输入中间条码长度">
											</div>
										</div>
									</div>
									<div class="modal-footer">
						                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
						                <button type="submit" class="btn btn-primary">提交</button>
						            </div>
								</form>
							</div>
						</div>
					</div>
		        </div><!-- /.modal-content -->
		    </div><!-- /.modal -->
		</div>
		<!-- 编辑条码规则 -->
		<div class="modal fade" id="edit" tabindex="-1" role="dialog" aria-labelledby="addModal" aria-hidden="true">
		    <div class="modal-dialog">
		        <div class="modal-content">
		            <div class="modal-header">
		                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
		                <h4 class="modal-title" id="myModalLabel">编辑条码规则</h4>
		            </div>
		            <div class="modal-body">
						<div class="container-fluid">
							<div class="row">
								<form id="editForm" action="${pageContext.request.contextPath}/barcode/update" method="post" autocomplete="off">
									<div class="row form-group">
		      							<div class="col-sm-8">
											<div class="col-4 col-sm-4 st">条码名称:</div>
											<div class="col-8 col-sm-8">
												<input type="text" id="name" name="name" class="form-control" placeholder="请输入条码名称">
											</div>
										</div>
									</div>
									<div class="row form-group">
		      							<div class="col-sm-8">
											<div class="col-4 col-sm-4 st">开始字符:</div>
											<div class="col-8 col-sm-8">
												<input type="text" id="beginCode" name="beginCode" class="form-control" placeholder="请输入开始字符">
											</div>
										</div>
									</div>
									<div class="row form-group">
		      							<div class="col-sm-8">
											<div class="col-4 col-sm-4 st">结束字符:</div>
											<div class="col-8 col-sm-8">
												<input type="text" id="endCode" name="endCode" class="form-control" placeholder="请输入结束字符">
											</div>
										</div>
									</div>
									<div class="row form-group">
		      							<div class="col-sm-8">
											<div class="col-4 col-sm-4 st">条码长度:</div>
											<div class="col-8 col-sm-8">
												<input type="text" id="codeLength" name="codeLength" class="form-control" placeholder="请输入中间条码长度">
											</div>
										</div>
									</div>
									<div class="modal-footer">
						                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
						                <button type="submit" class="btn btn-primary">更新</button>
						            </div>
								</form>
							</div>
						</div>
					</div>
		        </div><!-- /.modal-content -->
		    </div><!-- /.modal -->
		</div>
		<script >
			$(document).ready(function() {
				//初始化dataTable
				$('#barcode_table').dataTable();
			});
			//语言格式化
			$('#barcode_table').dataTable({
				"bLengthChange" : false,//禁用显示多少条数
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
			//删除
			$('.table tbody').on("click",'.del_code', function() {
				var id =this.id;
				console.log(id);
				layer.confirm('是否确认删除该规则?', {
					btn : [ '确认', '取消' ]
				//按钮
				}, function() {
					location.href = "${pageContext.request.contextPath}/barcode/delete?id="+id;
				}, function() {
					layer.msg('取消');
				});
			});
			//编辑系统参数
			$('.table tbody').on("click",'.edit_code',function(){
   				$("#edit").modal("show");
   				var id = this.id;
   				$.ajax({
					  url:"${pageContext.request.contextPath}/barcode/find",
					  type:"GET",
					  data:{id:id},
					  dataType:"text",
					  success:function(data){	
						  var jData = eval('(' + data + ')').results;
						  $("input#id").val(id);
						  $("input#name").val(jData.name);	
						  $("input#beginCode").val(jData.beginCode);
						  $("input#endCode").val(jData.endCode);
						  $("input#codeLength").val(jData.codeLength);
					  }
				  })
   			})
		</script>
	</tiles:putAttribute>
</tiles:insertDefinition>
