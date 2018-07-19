<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>登陆-基于JAVA SSM框架的酒店管理系统</title>
<link href="<c:url value='/img/login/style/login.css'/>" rel="stylesheet" type="text/css">
<script src="<c:url value='/assets/js/jquery.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/js/steed.js'/>"></script>
<script src="<c:url value='/js/jQuery.md5.js'/>" type="text/javascript"></script>
<script type="text/javascript">
<%-- 	var message ="<%=request.getParameter("message")%>"; --%>
var message = "${message }";

if(message!=null&&message!=""){
	console.log("message = "+message);
		alert(message);
}

</script>

<script type="text/javascript">
	if (window != top) 
	top.location.href = location.href; 
	
	function submitLogin() {
		$("#btndiv").remove();
		$("#loging").css("display", "");
		setTimeout(function() {
			document.getElementById("loginForm").submit();
		}, 2000);
	}

	var clickable = true;
	function login() {
		var nickName = $("#nickName").val();
		if (isObjNull(nickName)) {
			alert("用户名不能为空！！");
			return false;
		}
		
		var pwd = $("#password").val();
		if (isObjNull(pwd)) {
			alert("密码不能为空！！");
			return false;
		}
		var password = $.md5(pwd);
		
	 	var securityCode = $("#securityCode").val();
		if (isObjNull(securityCode)) {
			alert("验证码不能为空！！");
			return false;
		} 
		
		$("#btndiv").hide();
		$("#loging").show();		
		return true;
	}
</script>
</head>
<body>
	<div class="full-bg">
		<div class="header">
			<ul>
				<li><img src="<c:url value='/img/head_logo.png'/>"></li>
				<li>|</li>
				<li>基于JAVA SSM框架的酒店管理系统</li>
			</ul>
		</div>
		<style>
			.header{
				position: absolute;
				top:0;
				left:0;
				width: 100%;
				height: 80px;
				background-color: #4f647e;
			}
			.header ul{
				margin-top: 12px;
				margin-left: 10px;
				color: #ffffff;
				font-size: 35px;
				font-family:KaiTi;
				font-weight: bold;
				height: 60px;
			}
			.header ul li{
				float: left;
				margin-left:10px;
				list-style: none;
				height: 50px;
				line-height: 50px;
				
			}
			.header ul li img{
				margin-top: 5px;
				height: 40px;
				width: 125px;
			}
		</style>
		<div class="full_pic"></div>
		<div class="footer">
			<ul>
				<li>重庆第二师范学院（学校）..${message}</li>
				<li>地址：重庆市南岸区南山街道崇教路1号</li>
				<li>电话：023-88888888</li>
				<li>传真：023-66666666</li>
				<li>邮编：400065</li>
			</ul>
			<ul style="width: 450px">
				<li>渝ICP备00000001号</li>
				<li>中国重庆2511工作室版权所有</li>
			</ul>
		</div>
		<style>
			.footer{
					position: fixed;
					bottom:0;
					left:0;
					width: 100%;
					height: 80px;
					background-color: #4f647e;
					color: #ffffff;
					font-family:KaiTi;
					padding-top: 10px;
				}
				.footer ul{
					width: 900px;
					height: 30px;
					margin: 0 auto;
				}
				.footer ul li{
					float:left;
					margin-left:10px;
					list-style: none;
					height: 30px;
					line-height: 30px;
				}
		</style>
		<div class="login">
			<%-- <img src="<c:url value='/img/login/images/y.jpg'/>" class="y">  --%>
			<img
				src="<c:url value='/img/login/images/logo.png'/>" class="logo" >
			<div class="company"><st:config key="companyName"></st:config></div>
			<div class="menu">
				<form action="user/login.action" onsubmit="return login();" id="loginForm" method="post">
<!-- 						<input type="hidden" name="securityCode" /> -->
					<div>
						<input type="text" name="username" id="nickName" />
						<span><img src="<c:url value='/img/login/images/name.jpg'/>"></span>
					</div>
					<div>
						<input type="password" name="pwd" id="password" />
						<span><img src="<c:url value='/img/login/images/mima.jpg'/>"></span>
					</div>
					<div>
						<input id="securityCode" name="securityCode" class="code" type="text" size="5" />
						<span>
						 <img id="securityCodeImg" title="点击刷新" style="cursor: pointer;text-align:left;width: 80px;height: 26px;position: relative;right:20px;" alt="点击刷新"
							onclick="refreshValidateCode(this);" src="code.action" alt="" width="80" height="26" />
					     </span>
					</div>
					<div class="btn" id="btndiv">
						<input class="sub" type="submit" value="登录" style="width: 100%;color: white;font-family:'微软雅黑';font-size: 16px;font-weight: bolder;" />
					</div>
					<center style="font-size: 13px; color: #2FA7E4; display: none; margin-top: 5px;" id="loging">
						<img alt="正在登录..." src="<c:url value='/img/login/images/loading.gif'/>" />
						正在登录，请稍后...
					</center>
				</form>
			</div>
<!-- 			<div class="jzmm"><a href="#"></a><span>记住密码</span></div> -->
		</div>
	</div>
</body>
</html>