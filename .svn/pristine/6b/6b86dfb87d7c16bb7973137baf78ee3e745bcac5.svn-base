<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>恒芯生产系统管理</title>
<link rel="shortcut icon" href="${pageContext.request.contextPath }/img/favicon.ico" type="image/x-icon" />
<link href="${pageContext.request.contextPath }/css/login_style.css" rel="stylesheet" type="text/css"/>
<style>
.button {
	background-color: #4CAF50; /* Green */
	width: 100%;
	height: 32px;
	border: none;
	color: #FFF;
	padding-bottom: 2px;
	font-size: 14px;
}
</style>
<script type="text/javascript">

    function validate_required(field,alerttxt)
    {
        with (field)
        {
            if (value==null||value=="")
            {alert(alerttxt);return false}
            else {return true}
        }
    }

    function validate_form(thisform)
    {
        with (thisform)
        {
            if (validate_required(loginName,"用户名不能为空")==false)
            {loginName.focus();return false}
            if (validate_required(password,"密码不能为空")==false)
            {password.focus();return false}
            if (validate_required(type_code,"验证码不能为空")==false)
            {type_code.focus();return false}
            if(type_code.value != ${requestScope.answer}){
                //alert("验证码不正确！");
                document.getElementById("notice").innerHTML="<span id='notice'> 验证码不正确！</span>";
                return false;
            }
        }
    }
</script>
</head>

<body class="login">
	<div class="login_m">
		<div class="login_logo">
			<img src="${pageContext.request.contextPath }/img/logo.png" width="300" height="50" />
		</div>
		<div class="login_boder">
			<div class="login_padding">
				<form action="${pageContext.request.contextPath }/welcome/login_check" method="post" onsubmit="return validate_form(this)">
					<h2>用户名</h2>
					<label> 
						<input type="text" name="loginName" id="loginName" class="txt_input txt_input2" value="${requestScope.loginName}"/>
					</label>
					<h2>密码</h2>
					<label><input type="password" name="password" id="password" class="txt_input"/></label>
					<div>
						<label class="">请输入验证码 ${requestScope.question} </label> 
						<input type="text" name="type_code" id="type_code" class="txt_input txt_input_short" /> <span id="notice">${requestScope.message}</span>
					</div>
					<p style="color: green; width: 300px; margin: 0 0 0 0;"></p>
					<div class="rem_sub">
						<label> <input type="submit" class="button" name="button" id="button" value="登录" style="opacity: 0.7;" /> </label>
					</div>
				</form>
			</div>
		</div>
	</div>
	<!--login_m end-->
	<br />
	<br />
	<br />
	<br />
	<p align="center">
		&copy; 2016 <a href="http://www.schxkj.net/" target="_blank" title="四川恒芯">四川恒芯</a>
	</p>
</body>
</html>