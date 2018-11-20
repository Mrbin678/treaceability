<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div class="header">
			<h1 class="page-header">
				上工信息<small> 全部上工信息.</small>
			</h1>
		</div>
		<div id="page-inner">
			<div class="row">
				<div class="col-md-3 pull-right">
					<form class="form" action="${pageContext.request.contextPath}/work/index" method="post">
						<input class="form-control" type="text" id="code" name="code" value="${requestScope.search_name}" placeholder="Search....">
					</form>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<div class="card">
						<div class="card-content">
							<div class="table-resposive">
								<table style="font-size: 11px" class="table table-striped table-condensed table-bordered table-hover" id="work_table">
									<thead>
										<tr>
											<th>订单编号</th>
											<th>工作内容</th>
											<th>工序1</th>
											<th>工序2</th>
											<th>工序3</th>
											<th>工序4</th>
											<th>工序5</th>
											<th>工序6</th>
											<th>工序7</th>
											<th>工序8</th>
											<th>工序9</th>
											<th>工序10</th>
											<th>工序11</th>
											<th>工序12</th>
											<th>工序13</th>
											<th>工序14</th>
											<th>工序15</th>
											<th>状态</th>
											<th>创建日期</th>
											<th>操作</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach var="iterm" items="${requestScope.work_list}">
											<tr>
												<td>${iterm.orderCode}</td>
												<td>${iterm.content}</td>
												<td>${iterm.operator1}</td>
												<td>${iterm.operator2}</td>
												<td>${iterm.operator3}</td>
												<td>${iterm.operator4}</td>
												<td>${iterm.operator5}</td>
												<td>${iterm.operator6}</td>
												<td>${iterm.operator7}</td>
												<td>${iterm.operator8}</td>
												<td>${iterm.operator9}</td>
												<td>${iterm.operator10}</td>
												<td>${iterm.operator11}</td>
												<td>${iterm.operator12}</td>
												<td>${iterm.operator13}</td>
												<td>${iterm.operator14}</td>
												<td>${iterm.operator15}</td>
												<td>${iterm.status}</td>
												<td><fmt:formatDate type="both"
														value="${iterm.createdAt}" pattern="yyyy-MM-dd HH:mm"/></td>
												<td><a class="edit_work" id="${iterm.id}">编辑</a> 
												<a class="del_work" id="${iterm.id}">删除</a></td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
								<ul class="pagination pull-right">
									<c:if test="${!pagehelper.isFirstPage}">
										<li><a
											href="${pageContext.request.contextPath}/work/index?start=${pagehelper.firstPage}">首页</a></li>
										<li><a
											href="${pageContext.request.contextPath}/work/index?start=${pagehelper.prePage}">上一页</a></li>
									</c:if>
									<c:forEach items="${pagehelper.navigatepageNums}" var="navigatepageNum">
										<c:if test="${navigatepageNum==pagehelper.pageNum}">
											<li class="active"><a
												href="${pageContext.request.contextPath}/work/index?start=${navigatepageNum}">${navigatepageNum}</a></li>
										</c:if>
										<c:if test="${navigatepageNum!=pagehelper.pageNum}">
											<li><a
												href="${pageContext.request.contextPath}/work/index?start=${navigatepageNum}">${navigatepageNum}</a></li>
										</c:if>
									</c:forEach>
									<c:if test="${!pagehelper.isLastPage}">
										<li><a
											href="${pageContext.request.contextPath}/work/index?start=${pagehelper.nextPage}">下一页</a></li>
										<li><a
											href="${pageContext.request.contextPath}/work/index?start=${pagehelper.lastPage}">最后一页</a></li>
									</c:if>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="modal fade" id="editWork">
			<div class="modal-dialog">
		    	<div class="modal-content">
					<div class="modal-header">
					    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					    <h4 class="modal-title" id="myModalLabel">编辑上工信息</h4>
				    </div>			
					<div class="modal-body">
						<form id="editWorkFrom" action="${pageContext.request.contextPath}/work/update" method="post" onsubmit="return check()">
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
									<div class="col-4 col-sm-4 st">工作内容:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="content" name="content" type="text" value="" placeholder="请输入工作内容">
									</div>
								</div>
							</div>
							<div class="row form-group">
								<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">工序1:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="operator1" name="operator1" type="text" value="" placeholder="请输入工序1员工id">
									</div>
								</div>
							</div>
							<div class="row form-group">
								<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">工序2:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="operator2" name="operator2" type="text" value="" placeholder="请输入工序2员工id">
									</div>
								</div>
							</div>
							<div class="row form-group">
								<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">工序3:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="operator3" name="operator3" type="text" value="" placeholder="请输入工序3员工id">
									</div>
								</div>
							</div>
							<div class="row form-group">
								<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">工序4:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="operator4" name="operator4" type="text" value="" placeholder="请输入工序4员工id">
									</div>
								</div>
							</div>
							<div class="row form-group">
								<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">工序5:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="operator5" name="operator5" type="text" value="" placeholder="请输入工序5员工id">
									</div>
								</div>
							</div>
							<div class="row form-group">
								<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">工序6:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="operator6" name="operator6" type="text" value="" placeholder="请输入工序6员工id">
									</div>
								</div>
							</div>
							<div class="row form-group">
								<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">工序7:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="operator7" name="operator7" type="text" value="" placeholder="请输入工序7员工id">
									</div>
								</div>
							</div>
							<div class="row form-group">
								<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">工序8:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="operator8" name="operator8" type="text" value="" placeholder="请输入工序8员工id">
									</div>
								</div>
							</div>
							<div class="row form-group">
								<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">工序9:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="operator9" name="operator9" type="text" value="" placeholder="请输入工序9员工id">
									</div>
								</div>
							</div>
							<div class="row form-group">
								<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">工序10:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="operator10" name="operator10" type="text" value="" placeholder="请输入工序10员工id">
									</div>
								</div>
							</div>
							<div class="row form-group">
								<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">工序11:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="operator11" name="operator11" type="text" value="" placeholder="请输入工序11员工id">
									</div>
								</div>
							</div>
							<div class="row form-group">
								<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">工序12:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="operator12" name="operator12" type="text" value="" placeholder="请输入工序12员工id">
									</div>
								</div>
							</div>
							<div class="row form-group">
								<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">工序13:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="operator13" name="operator13" type="text" value="" placeholder="请输入工序13员工id">
									</div>
								</div>
							</div>
							<div class="row form-group">
								<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">工序14:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="operator14" name="operator14" type="text" value="" placeholder="请输入工序14员工id">
									</div>
								</div>
							</div>
							<div class="row form-group">
								<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">工序15:</div>
									<div class="col-8 col-sm-8">
										<input class="form-control" id="operator15" name="operator15" type="text" value="" placeholder="请输入工序15员工id">
									</div>
								</div>
							</div>
							<div class="row form-group">
								<div class="col-sm-8">
									<div class="col-4 col-sm-4 st">状态:</div>
									<div class="col-8 col-sm-8">
										<select class="select form-control" name="selectStatus" id="selectStatus" onchange="getStatusValue(this.options[this.options.selectedIndex].value)">
											<option value="新建">新建</option>
											<option value="已完成">已完成</option>
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
		<script>
			$(document).ready(function() {
				//修改基表表单校验,fields验证对应的输入框的name属性
		       	$('#editWorkFrom').bootstrapValidator({
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
		                        },
		                        remote: {
		                            type: 'GET',
		                            url: '${pageContext.request.contextPath}/work/checkCode',
		                            data:{
		                            	id:function(){return $("input#id").val();}
		                            },
		                            message: '订单编号重复',
		                            delay: 1000
		                        }
		                    }
		                },
		                content: {
		                    validators: {
		                        notEmpty: {
		                            message: '请填写工作内容'
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
			var id = null;
			var jData = null; 
			var status1 = null;
			$("select#selectStatus option:first").prop("selected", 'selected');//默认第一个option被选中
			//修改上工信息
			$('.table tbody').on("click",'.edit_work', function() {
			    id = this.id;//对应上工信息id
			    $("#editWork").modal("show");
				$('#editWork').on('shown.bs.modal', function () {
	  			});
				$.ajax({
					url : "${pageContext.request.contextPath}/work/find",
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
						$("input#content").val(jData.content);
						$("input#operator1").val(jData.operator1);
						$("input#operator2").val(jData.operator2);
						$("input#operator3").val(jData.operator3);
						$("input#operator4").val(jData.operator4);
						$("input#operator5").val(jData.operator5);
						$("input#operator6").val(jData.operator6);
						$("input#operator7").val(jData.operator7);
						$("input#operator8").val(jData.operator8);
						$("input#operator9").val(jData.operator9);
						$("input#operator10").val(jData.operator10);
						$("input#operator11").val(jData.operator11);
						$("input#operator12").val(jData.operator12);
						$("input#operator13").val(jData.operator13);
						$("input#operator14").val(jData.operator14);
						$("input#operator15").val(jData.operator15);
					    $("input#createdAt").val(dates); 
					    //给下拉框赋值
					    $("select#selectStatus").val(jData.status);
					    status1 = jData.status;
					}
				});
			});
		
			//删除上工信息
			$('.table tbody').on("click",'.del_work', function() {
				var id =this.id;
				console.log(id);	
				/*   alert(id); //测试代码 */
				layer.confirm('是否确认删除该上工信息记录？', {
					btn : [ '确认', '取消' ]
				//按钮
				}, function() {
					location.href = "${pageContext.request.contextPath}/work/delete?id="+id;
				}, function() {
					layer.msg('取消');
				});
			});
			
			//通过select的onChange事件获取选中的option的值
			function getStatusValue(value){
				status1 = value;
			}
		
			//表单验证
			function check() {
				if(status1 == null||status1==""){
					alert("请选择上工信息状态！");
					return false;
				}
				return true;
			}
		</script>
	</tiles:putAttribute>
</tiles:insertDefinition>