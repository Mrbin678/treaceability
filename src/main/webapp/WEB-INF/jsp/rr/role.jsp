<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div class="header">
			<h1 class="page-header">
				角色管理 <small>所以角色列表.</small>
				<button id="add_param" class="button pull-right" data-toggle="modal" data-target="#add">+ 新建角色</button>
			</h1>
		</div>
		<div id="page-inner">
			<div class="row">
				<div class="col-md-12">
					<div class="card">
						<div class="card-content">
							<table class="table table-striped table-condensed table-bordered table-hover" id="role_table">
								<thead>
									<tr>
										<th>角色名称</th>
										<th>对应权限</th>
										<th>分配权限</th>
										<th>操作</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach var="roles" items="${requestScope.roles}">
										<tr>
											<td>${roles.name}</td>
											<td><a class="view_Rights"   data-id="${roles.id}" data-toggle="modal">查看权限</a></td>
											<td><a class="assign_Rights" data-id="${roles.id}" data-toggle="modal">分配权限</a></td>
											<td><a class="delete_right"  data-id="${roles.id}">删除</a></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!--新建角色 -->
		<div class="modal fade" id="add" tabindex="-1" role="dialog" aria-labelledby="addModal" aria-hidden="true">
		    <div class="modal-dialog">
		        <div class="modal-content">
		            <div class="modal-header">
		                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
		                <h4 class="modal-title" id="myModalLabel">新建角色</h4>
		            </div>
		            <div class="modal-body">
						<div class="container-fluid">
							<div class="row">
								<form id="addForm" action="${pageContext.request.contextPath}/rr/create" method="post" autocomplete="off">
									<div class="row form-group">
		      							<div class="col-sm-8">
											<div class="col-4 col-sm-4 st">角色名称:</div>
											<div class="col-8 col-sm-8">
												<input type="text" id="name" name="name" class="form-control" placeholder="请输入角色名称">
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
		<!-- 角色对应权限 -->
		<div class="modal fade" id="right_info" tabindex="-1" role="dialog" aria-labelledby="ModalLabel" aria-hidden="true">
		    <div class="modal-dialog">
		        <div class="modal-content">
		            <div class="modal-header">
		                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
		                <h4 class="modal-title" id="myModalLabel">该角色对应权限为:</h4>
		            </div>
		            <div class="modal-body">
		            	<ul class="list-group" id="own_rights">
							<!-- <li class="list-group-item">免费域名注册</li> -->
						</ul>
		            </div>
		        </div><!-- /.modal-content -->
		    </div><!-- /.modal -->
		</div>
		<!-- 分配权限 -->
		<div class="modal fade" id="select_right" tabindex="-1" role="dialog" aria-labelledby="ModalLabel" aria-hidden="true">
		    <div class="modal-dialog">
		        <div class="modal-content">
		            <div class="modal-header">
		                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
		                <h4 class="modal-title" id="myModalLabel">请选择权限:</h4>
		            </div>
		            <div class="modal-body">
		            	<form id="right_form" action="${pageContext.request.contextPath}/rr/assign_rights/" method="post">
		            	</form>
		            </div>
		        </div><!-- /.modal-content -->
		    </div><!-- /.modal -->
		</div>
		<script>
		$(document).ready(function() {
			//初始化dataTable
			$('#role_table').dataTable();
		});
		//语言格式化
		$('#role_table').dataTable({
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
		//查看权限
		$('.table tbody').on("click",'.view_Rights',function(){
			$('#right_info').modal("show");
			var id = $(this).attr('data-id'); //alert(id);
			$.ajax({
				url:"${pageContext.request.contextPath}/rr/view_rights",
				contentType : 'application/json;charset=utf-8',
				data:{id:id},
				dataType:"text",
				success:function(data){	
					var jData = eval('(' + data + ')');
					var html="";
					for(var i in jData.results){
						html =html+ "<li class='list-group-item'>"+jData.results[i]+"</li>"
					}
					$('#own_rights').html(html);
				}
			});
		})
		//分配权限
		$('.table tbody').on("click",'.assign_Rights',function(){
			$('#select_right').modal("show");
			var roleId = $(this).attr('data-id'); 
			$.ajax({
				url:"${pageContext.request.contextPath}/rr/all_rights",
				type:"POST",
				dataType:"text",
				success:function(data){	
					var jData = eval('(' + data + ')');
					var html="<input type='hidden' name='roleId' value='"+roleId+"'>";
					for(var i in jData.results){
						html = html + "<div class='checkbox'><label><input type='checkbox' id='"+jData.results[i].id+"' name='rightId' value='"+jData.results[i].id+"'>"+jData.results[i].name+"</label></div>"
					}
					if(jData.results.length==0){
						html="<p>未设置权限,请联系管理员!</p><br/>"
					}
					html=html+"<button type='submit' class='btn btn-primary' style='margin:auto;'>保&nbsp;&nbsp;存</button>";
					$("#right_form").html(html)
				}
			});
		})
		//删除角色
		$('.table tbody').on("click",'.delete_right', function() {
			var roleId = $(this).attr('data-id'); 
			layer.confirm('是否确认删除该角色?', {
				btn : [ '确认', '取消' ]
			//按钮
			}, function() {
				location.href = "${pageContext.request.contextPath}/rr/delete_role?id="+roleId;
			}, function() {
				layer.msg('取消');
			});
		});
		</script>
	</tiles:putAttribute>
</tiles:insertDefinition>
