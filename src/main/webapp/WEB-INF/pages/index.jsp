<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html class="no-js">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>基于JAVA SSM框架的酒店管理系统</title>
<meta name="keywords" content="index">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<meta name="renderer" content="webkit">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="icon" type="image/png" href="assets/i/favicon.png">
<link rel="apple-touch-icon-precomposed" href="assets/i/app-icon72x72@2x.png">
<link rel="shortcut icon" type="image/x-icon" href="img/icon.ico" media="screen" /> 
<meta name="apple-mobile-web-app-title" content="Amaze UI" />
<link rel="stylesheet" href="assets/css/amazeui.min.css"/>
<link rel="stylesheet" href="assets/css/admin.css">
<script src="assets/js/jquery.min.js"></script>
<script src="assets/js/app.js"></script>
</head>
<body>
<!--[if lte IE 9]><p class="browsehappy">升级你的浏览器吧！ <a href="http://se.360.cn/" target="_blank">升级浏览器</a>以获得更好的体验！</p><![endif]-->






</head>

<body>
<div class="header">
			<ul>
				<li><img style="margin-top: 12px;" src="<c:url value='/img/logo1.png'/>"></li>
				<li ><div style="margin-top:24px;margin-left:5px; width: 2px;height:25px; background: #FFF;"></div></li>
				<li style="margin-top: 10px;">基于JAVA SSM框架的酒店管理系统</li>
			</ul>
		</div>
		<style>
			.header{
				position: fixed;
				top:0;
				left:0;
				width: 100%;
				height: 90px;
				background-color: #151d26;
				overflow: hidden;
			}
			.header ul{
				margin-top: 5px;
				margin-left: -10px;
				color: #ffffff;
				font-size: 36px;
				font-family:KaiTi;
				font-weight: bold;
				height: 60px;
			}
			.header ul li{
				float: left;
				margin-left:10px;
				list-style: none;
				line-height: 50px;
				
			}
			.header ul li img{
				margin-top: 5px;
				height: 40px;
				width: 125px;
			}
		</style>

<div class="am-cf admin-main"> 

<div class="nav-navicon admin-main admin-sidebar" style="background-color:#232D36; top:90px;bottom:80px;min-height: 200px;">
    
    
    <%-- <div class="sideMenu am-icon-dashboard" style="color:#ffffff;font-family:Microsoft YaHei;font-size:14px; margin: 10px 0 0 0;"> 您好！${user.realname }</div> --%>
    <div class="sideMenu" style="color:#ffffff;font-family:Microsoft YaHei;font-size:14px; margin: 10px 0px 20px 0px;"><img src="<c:url value='/img/1.png'/>"> 您好！${user.realname }
    	<a href="<c:url value='/loginPage.action'/>">安全退出 </a>
    </div>
    <div class="sideMenu" style="">
    <style>
    .sideMenu h3{
    margin:2px;
    height: 60px;
    padding-top: 12px;
    }
    	.sideMenu h3.on em{
    		background:url(<c:url value='/img/on.png'/>) 16px 5px no-repeat; 
    	}
    	.sideMenu h3 em{
    		background:url(<c:url value='/img/off.png'/>) 16px 5px no-repeat; 
    	}
    	.sideMenu a{
    		font-family:FangSong;
    		font-size:18px;
    		/* font-weight: bold; */
    	}
    </style>
    <c:forEach items="${parentlist }" var="p" varStatus="index">
    	<h3 style="background-color:#2b3a47;"><em></em> <img style="margin:-8px 5px 0px 0px;" src="<c:url value='/img/index/menu${p.pxid }.png'/>"><a href="#"><span style="margin-top: 5px;">${p.name }</span></a></h3>
    	 <ul style="background-color:#2b3a47; margin-top: -15px;margin-left: 1px;z-index: 5;">
    	 	<c:forEach items="${funclist }" var="c">
    	 		<c:if test="${c.pid==p.id}">
	        		<li><a style="margin: 1px 0px 1px 12px;font-size:16px;" href="${c.url}" target="myframe" >${c.name }</a></li>
	        	</c:if>
	        </c:forEach>
	      </ul>
    </c:forEach>
   
    </div>
    <!-- sideMenu End --> 
    
    <script type="text/javascript">
			jQuery(".sideMenu").slide({
				titCell:"h3", //鼠标触发对象
				targetCell:"ul", //与titCell一一对应，第n个titCell控制第n个targetCell的显示隐藏
				effect:"slideDown", //targetCell下拉效果
				delayTime:300 , //效果时间
				triggerTime:150, //鼠标延迟触发时间（默认150）
				defaultPlay:false,//默认是否执行效果（默认true）
				returnDefault:false //鼠标从.sideMen移走后返回默认状态（默认false）
				});
		</script> 
    
</div>

<div class=" admin-content">
	
		<div class="daohang"style="top: 90px;height: 10px;">
		</div>
<div class="admin" style="top:90px;bottom:80px">
 		<iframe name="myframe" src="mainPage.action" style=" width: 100%;height: 100%">
 		
 		</iframe>
      	<script type="text/javascript">jQuery(".slideTxtBox").slide();</script> 
</div>
 
</div>
</div>
</div>

<!--[if lt IE 9]>
<script src="http://libs.baidu.com/jquery/1.11.1/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="assets/js/polyfill/rem.min.js"></script>
<script src="assets/js/polyfill/respond.min.js"></script>
<script src="assets/js/amazeui.legacy.js"></script>
<![endif]--> 

<!--[if (gte IE 9)|!(IE)]><!--> 
<script src="assets/js/amazeui.min.js"></script>
<!--<![endif]-->

		<div class="footer">
			<ul>
				<li>重庆第二师范学院（学校）</li>
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
					background-color: #151d26;
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

</body>
</html>