<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div class="header">
			<h1 class="page-header">
				用户管理 <small>全部用户信息.</small>
				<button id="add" class="button pull-right" data-toggle="modal" data-target="#addUser">+ 新建用户</button>
			</h1>
		</div>
		<div id="page-inner">
			<div class="row">
				<div class="col-md-12">
					<div class="card">
						<div class="card-content">
							<div class="table-resposive">
								<table class="table table-striped table-condensed table-bordered table-hover" id="users_table">
									<thead>
										<tr>
											<th>员工编号</th>	
											<th>登录账号</th>
											<th>员工姓名</th>
											<th>部门名称</th>
											<th>员工角色</th> 
											<th>创建时间</th>
											<th>状态</th>
											<th>操作</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach var="user" items="${requestScope.user_list}">
											<tr>
												<td>${user.operator}</td>
												<td>${user.loginName}</td>
												<td>${user.name}</td>
												<td>${user.department}</td>
												<td>${user.role}</td>
												<td><fmt:formatDate type="both" value="${user.createdAt}" pattern="yyyy-MM-dd HH:mm"/></td>
												<td>${user.status}</td> 
												<td>
													<a class="edit_user" id="${user.id}"  data-toggle="modal">编辑</a>&nbsp;
													<a class="del_user"  id="${user.id}">删除</a>
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
		<!-- 新建用户 -->
		<div class="modal fade" id="addUser" tabindex="-1" role="dialog" aria-labelledby="userModalLabel" aria-hidden="true">
		    <div class="modal-dialog">
		        <div class="modal-content">
		            <div class="modal-header">
		                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
		                <h4 class="modal-title" id="myModalLabel">添加用户</h4>
		            </div>
		            <div class="modal-body">
		            	<form id="addUserForm" action="${pageContext.request.contextPath}/users/create" method="post" autocomplete="off">
							<div class="row form-group">
      							<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">员工编号:</div>
									<div class="col-8 col-sm-8">
										<input type="text" class="form-control" id="operator" name="operator" placeholder="请输入员工编号" />
									</div>
								</div>
							</div>
							<div class="row form-group">
      							<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">员工名称:</div>
									<div class="col-8 col-sm-8">
										<input type="text" class="form-control" id="name" name="name" placeholder="请输入员工姓名" />
									</div>
								</div>
							</div>
							<div class="row form-group">
      							<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">部门名称:</div>
									<div class="col-8 col-sm-8">
										<select class="select form-control" id="department" name="department">
									
										</select>
									</div>
								</div>
							</div>
							<div class="row form-group">
      							<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">登录账号:</div>
									<div class="col-8 col-sm-8">
										<input type="text" class="form-control" id="loginName" name="loginName"  placeholder="请输入登录账号" >
									</div>
								</div>
							</div>
							<div class="row form-group">
      							<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">登录密码:</div>
									<div class="col-8 col-sm-8">
										<input type="password" class="form-control" id="password" name="password" placeholder="请输入登录密码" >
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
		<!-- 编辑用户-->
		<div class="modal fade" id="editUser" tabindex="-1" role="dialog" aria-labelledby="editModalLabel" aria-hidden="true">
		    <div class="modal-dialog">
		        <div class="modal-content">
		            <div class="modal-header">
		                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
		                <h4 class="modal-title" id="myModalLabel">编辑用户</h4>
		            </div>
		            <div class="modal-body">
		            	<form id="editUserForm" action="${pageContext.request.contextPath}/users/update" method="post">
							<input type="hidden" class="form-control" id="id" name="id"/>
		            		<div class="row form-group">
      							<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">员工编号:</div>
									<div class="col-8 col-sm-8">
										<input type="text" class="form-control" id="operator" name="operator" placeholder="请输入员工编号" />
									</div>
								</div>
							</div>
							<div class="row form-group">
      							<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">员工名称:</div>
									<div class="col-8 col-sm-8">
										<input type="text" class="form-control" id="name" name="name" placeholder="请输入员工姓名" />
									</div>
								</div>
							</div>
							<div class="row form-group">
      							<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">登录账号:</div>
									<div class="col-8 col-sm-8">
										<input type="text" class="form-control" id="loginName" name="loginName"  placeholder="请输入登录账号" >
									</div>
								</div>
							</div>
							<div class="row form-group">
      							<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">部门名称:</div>
									<div class="col-8 col-sm-8">
										<select class="select form-control" id="department" name="department">
									
										</select>
									</div>
								</div>
							</div>
							<div class="row form-group">
      							<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">对应角色:</div>
									<div class="col-8 col-sm-8">
										<select class="select form-control" id="roleId" name="roleId">
									
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
		<script >
			$(document).ready(function() {
				//初始化dataTable
				$('#users_table').dataTable();
				 /*
			     *表单校验
			     */
			     //添加用户表单校验
		        $('#addUserForm').bootstrapValidator({
		            message: '请填写改字段!',
		            feedbackIcons: {
		                valid: 'glyphicon glyphicon-ok',
		                invalid: 'glyphicon glyphicon-remove',
		                validating: 'glyphicon glyphicon-refresh'
		            },
		            fields: {
		                operator: {
		                    validators: {
		                        notEmpty: {
		                            message: '请填写员工编号'
		                        },
		                        remote: {
		                            type: 'GET',
		                            url: '${pageContext.request.contextPath}/users/check_operator',
		                            message: '员工编号重复',
		                            delay: 1000
		                        }
		                    }
		                },
		                name: {
		                    validators: {
		                        notEmpty: {
		                            message: '请填写您的用户名'
		                        }
		                    }
		                },
		                loginName: {
		                    validators: {
		                        notEmpty: {
		                            message: '请填写您的登录名'
		                        },
		                        remote: {
		                            type: 'GET',
		                            url: '${pageContext.request.contextPath}/users/check_login_name',
		                            message: '登录名重复',
		                            delay: 1000
		                        }
		                    }
		                },
		                password: {
		                    validators: {
		                        notEmpty: {
		                            message: '请填写密码'
		                        },
		                        stringLength: {
		                            min: 3,
		                            message: '密码不少于3位'
		                        }
		                }
		            }
		          }
		       });
				//修改用户表单校验
		       $('#editUserForm').bootstrapValidator({
		            message: '请填写改字段!',
		            feedbackIcons: {
		                valid: 'glyphicon glyphicon-ok',
		                invalid: 'glyphicon glyphicon-remove',
		                validating: 'glyphicon glyphicon-refresh'
		            },
		            fields: {
		                operator: {
		                    validators: {
		                        notEmpty: {
		                            message: '请填写员工编号'
		                        },
		                        remote: {
		                            type: 'GET',
		                            url: '${pageContext.request.contextPath}/users/edit_operator',
		                            data:{
		                            	id:function(){return $("input#id").val()}
		                            },
		                            message: '员工编号重复',
		                            delay: 1000
		                        }
		                    }
		                },
		                name: {
		                    validators: {
		                        notEmpty: {
		                            message: '请填写您的用户名'
		                        }
		                    }
		                },
		                loginName: {
		                    validators: {
		                        notEmpty: {
		                            message: '请填写您的登录名'
		                        },
		                        remote: {
		                            type: 'GET',
		                            url: '${pageContext.request.contextPath}/users/edit_login_name',
		                            data:{
		                            	id:function(){return $("input#id").val()}
		                            },
		                            message: '登录名重复',
		                            delay: 1000
		                        }
		                    }
		                }
		          	}
		       });
				//select赋值
				$.ajax({
					  url:"${pageContext.request.contextPath}/department/findAll",
					  type:"GET",
					  dataType:"text",
					  success:function(data){	
						  var jData = eval('(' + data + ')').results;
						  for(var i=0; i<jData.length;i++){
							  $("select#department").append("<option value='"+jData[i].name+"'>"+jData[i].name+"</option>");	
						  }
						  $("select#department option:first").prop("selected", 'selected');
					  }
				  })
				  $.ajax({
					  url:"${pageContext.request.contextPath}/rr/all_role",
					  type:"GET",
					  dataType:"text",
					  success:function(data){	
						  var jData = eval('(' + data + ')').results;
						  for(var i=0; i<jData.length;i++){
							  $("select#roleId").append("<option value='"+jData[i].id+"'>"+jData[i].name+"</option>");	
						  }
						  $("select#roleId option:first").prop("selected", 'selected');
					  }
				  })
			});
			//语言格式化
			$('#users_table').dataTable({
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
			//删除用户
			$('.table tbody').on("click",'.del_user', function() {
				var id =this.id;
				console.log(id);
				layer.confirm('是否确认删除该用户？', {
					btn : [ '确认', '取消' ]
				//按钮
				}, function() {
					location.href = "${pageContext.request.contextPath}/users/delete?id="+id;
				}, function() {
					//layer.msg('取消');
				});
			});
			//编辑用户
   			$('.table tbody').on("click",'.edit_user',function(){
   				$("#editUser").modal("show");
   				var id = this.id;
   				$.ajax({
					  url:"${pageContext.request.contextPath}/users/find",
					  type:"GET",
					  data:{id:id},
					  dataType:"text",
					  success:function(data){	
						  var jData = eval('(' + data + ')').results;
						  $("input#id").val(id);
						  $("input#operator").val(jData.operator);	
						  $("input#name").val(jData.name);
						  $("input#loginName").val(jData.loginName);
						  $("select#department").val(jData.department);
						  $("select#roleId").val(jData.roleId);
					  }
				  })
   			})
   			$('#addUser').on('show.bs.modal', function () {
   				$("input").val("");
   				$("input").css("-webkit-box-shadow","0 0 0px 1000px white inset");
			})
		</script>
	</tiles:putAttribute>
</tiles:insertDefinition>
