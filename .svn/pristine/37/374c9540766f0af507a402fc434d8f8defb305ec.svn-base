<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div class="header">
			<h1 class="page-header">
				权限管理 <small>所有权限列表.</small>
				<button id="add_param" class="button pull-right" data-toggle="modal" data-target="#add">+ 新建权限</button>
			</h1>
		</div>
		<div id="page-inner">
			<div class="row">
				<div class="col-md-12">
					<div class="card">
						<div class="card-content">
							<table class="table table-striped table-condensed table-bordered table-hover" id="right_table">
								<thead>
									<tr>
										<th>权限名称</th>
										<th>权限代码</th>
										<th>操作</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach var="rights" items="${requestScope.rights}">
										<tr>
											<td>${rights.name}</td>
											<td>${rights.url}</td>
											<td>
												<a class="edit_right" data-id="${rights.id}">编辑</a>
												&nbsp;
												<a class="del_right" data-id="${rights.id}">删除</a>
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
		<!--新建权限 -->
		<div class="modal fade" id="add" tabindex="-1" role="dialog" aria-labelledby="addModal" aria-hidden="true">
		    <div class="modal-dialog">
		        <div class="modal-content">
		            <div class="modal-header">
		                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
		                <h4 class="modal-title" id="myModalLabel">新建权限</h4>
		            </div>
		            <div class="modal-body">
						<div class="container-fluid">
							<div class="row">
								<form id="addForm" action="${pageContext.request.contextPath}/rr/create_right" method="post" autocomplete="off">
									<div class="row form-group">
		      							<div class="col-sm-8">
											<div class="col-4 col-sm-4 st">权限名称:</div>
											<div class="col-8 col-sm-8">
												<input type="text" id="name" name="name" class="form-control" placeholder="请输入权限名称">
											</div>
										</div>
									</div>
									<div class="row form-group">
		      							<div class="col-sm-8">
											<div class="col-4 col-sm-4 st">权限代码:</div>
											<div class="col-8 col-sm-8">
												<input type="text" id="url" name="url" class="form-control" placeholder="请输入权限代码">
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
		<!-- 编辑权限 -->
		<div class="modal fade" id="edit" tabindex="-1" role="dialog" aria-labelledby="addModal" aria-hidden="true">
		    <div class="modal-dialog">
		        <div class="modal-content">
		            <div class="modal-header">
		                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
		                <h4 class="modal-title" id="myModalLabel">编辑权限</h4>
		            </div>
		            <div class="modal-body">
						<div class="container-fluid">
							<div class="row">
								<form id="editForm" action="${pageContext.request.contextPath}/rr/update" method="post" autocomplete="off">
									<div class="row form-group">
		      							<div class="col-sm-8">
											<div class="col-4 col-sm-4 st">权限名称:</div>
											<div class="col-8 col-sm-8">
												<input type="hidden" id="id" name="id" >
												<input type="text" id="name" name="name" class="form-control" placeholder="请输入权限名称">
											</div>
										</div>
									</div>
									<div class="row form-group">
		      							<div class="col-sm-8">
											<div class="col-4 col-sm-4 st">权限代码:</div>
											<div class="col-8 col-sm-8">
												<input type="text" id="url" name="url" class="form-control" placeholder="请输入权限代码">
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
		<script>
		$(document).ready(function() {
			//初始化dataTable
			$('#right_table').dataTable();
		});
		//语言格式化
		$('#right_table').dataTable({
			"bLengthChange": false,//禁用显示多少条数
			"oLanguage" : {
				"sLengthMenu" : "显示_MENU_条",
				"sZeroRecords" : "抱歉， 没有找到",
				"sInfo" : "从 _START_ 到 _END_ /共 _TOTAL_ 条数据"	,
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
		//删除权限
		$('.table tbody').on("click",'.del_right', function() {
			var rightId = $(this).attr('data-id'); 
			layer.confirm('是否确认删除该权限?', {
				btn : [ '确认', '取消' ]
			//按钮
			}, function() {
				location.href = "${pageContext.request.contextPath}/rr/delete_right?id="+rightId;
			}, function() {
				layer.msg('取消');
			});
		});
		//编辑权限
		$('.table tbody').on("click",'.edit_right', function() {
			$("#edit").modal("show");
			var id = $(this).attr('data-id');
			$.ajax({
				  url:"${pageContext.request.contextPath}/rr/find",
				  type:"GET",
				  data:{id:id},
				  dataType:"text",
				  success:function(data){	
					  var jData = eval('(' + data + ')').results;
					  $("input#id").val(id);
					  $("input#name").val(jData.name);	
					  $("input#url").val(jData.url);
				  }
			  })
		})
		</script>
	</tiles:putAttribute>
</tiles:insertDefinition>
