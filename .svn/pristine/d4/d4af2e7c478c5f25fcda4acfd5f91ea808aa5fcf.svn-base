<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div class="header">
			<h1 class="page-header">
				密码修改
			</h1>
		</div>
		<div id="page-inner">
			<div class="row">
				<div class="col-md-12">
					<div class="card">
						<div class="card-content">
							<form id="password_form" action="${pageContext.request.contextPath}/users/change_password" method="post">
								<div class="row form-group">
	      							<div class="col-sm-5">
										<div class="col-3 col-sm-3 st">当前密码:</div>
										<div class="col-9 col-sm-6"  style="padding-right:0px;">
											<input type="hidden" id="id" name="id" value="${user.id}">
											<input type="password" class="form-control" id="old_password" name="old_password" placeholder="请输入当前密码"/>
										</div>
									</div>
								</div>
								<div class="row form-group">
	      							<div class="col-sm-5">
										<div class="col-3 col-sm-3 st">新密码:</div>
										<div class="col-9 col-sm-6" style="padding-right:0px;">
											<input type="password" class="form-control" id="new_password" name="new_password" placeholder="请输入新密码" />
										</div>
									</div>
								</div>
								<div class="row form-group">
	      							<div class="col-sm-5">
										<div class="col-3 col-sm-3 st">重复密码:</div>
										<div class="col-9 col-sm-6" style="padding-right:0px;">
											<input type="password" class="form-control" id="password" name="password" placeholder="再次输入新密码" />
										</div>
									</div>
								</div>
								<div class="row form-group">
	      							<div class="col-sm-5">
	      								<div class="col-3 col-sm-3"></div>
	      								<div class="col-9 col-sm-6">
					           		 		<button type="submit" class="btn btn-primary pull-left">提交</button>
					           		 	</div>
					           		 </div>
					           	</div>
				           	</form>
						</div>
					</div>
				</div>
			</div>
		</div>
		<script >
			$(document).ready(function() {
				$('#password_form').bootstrapValidator({
		            message: '请填写旧密码!',
		            feedbackIcons: {
		                valid: 'glyphicon glyphicon-ok',
		                invalid: 'glyphicon glyphicon-remove',
		                validating: 'glyphicon glyphicon-refresh'
		            },
		            fields: {
		            	old_password: {
		                    validators: {
		                        notEmpty: {
		                            message: '请填写旧密码!'
		                        },
		                        remote: {
		                            type: 'post',
		                            url: '${pageContext.request.contextPath}/users/check_old_password',
		                            data:{
		                            	id:function(){return $("input#id").val()}
		                            },
		                            message: '密码错误',
		                            delay: 1000
		                        }
		                    }
		                },
		                new_password: {
		                    message:'密码无效',
		                    validators: {
		                        notEmpty: {
		                            message: '密码不能为空'
		                        },
		                        stringLength: {
		                            min: 3,
		                            message: '长度必须大于3'
		                        }
		                    }
		                },
		                password: {
		                    message: '密码无效',
		                    validators: {
		                        notEmpty: {
		                            message: '不能为空'
		                        },
		                        stringLength: {
		                            min: 3,
		                            message: '长度必须大于3'
		                        },
		                        identical: {//相同
		                            field: 'new_password',
		                            message: '两次密码不一致'
		                        }		                    }
		                }
		          	}
		       });
			});
		</script>
	</tiles:putAttribute>
</tiles:insertDefinition>
