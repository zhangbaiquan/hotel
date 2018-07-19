<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>入住信息查询详情</title>
<meta name="description" content="这是一个入住信息查询详情页面">
<meta name="keywords" content="index">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<meta name="renderer" content="webkit">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="icon" type="image/png"
	href="<c:url value='/assets/i/favicon.png'/>">
<link rel="apple-touch-icon-precomposed"
	href="<c:url value='/assets/i/app-icon72x72@2x.png'/>">
<meta name="apple-mobile-web-app-title" content="Amaze UI" />
<link rel="stylesheet"
	href="<c:url value='/assets/css/amazeui.min.css'/>">
<link rel="stylesheet" href="<c:url value='/assets/css/admin.css'/>">
<script src="<c:url value='/assets/js/jquery.min.js'/>"></script>
<script src="<c:url value='/assets/js/app.js'/>"></script>
<!-- kendoui combox -->
<script src="<c:url value='/kendoui/js/jquery.min.js'/>"></script>
<link href="<c:url value='/kendoui/styles/kendo.common.min.css'/>" rel="stylesheet">
<link href="<c:url value='/kendoui/styles/kendo.default.min.css'/>" rel="stylesheet">
<link rel="stylesheet" href="<c:url value='/diagram-viewer/inputtop.css'/>">
<script src="<c:url value='/kendoui/js/kendo.all.min.js'/>"></script>
<style>
	.am-table>tbody>tr>td{
		vertical-align: middle;
	}
	.am-btn-xs {
    	font-size: 1.4rem;
	}
	.am-btn-group-xs>.am-btn {
    	font-size: 1.4rem;
	}
</style>

</head>
<body>
	
    <div class="listbiaoti am-cf">
      <ul><img style="margin:-5px 5px 0px 0px;" src="<c:url value='/img/index/menu1.png'/>">入住信息查询详情</ul>
      
      <dl class="am-icon-home" style="float: right;"> 当前位置： <a href='${pageContext.request.contextPath}/mainPage.action' >首页</a> > <a href="#">入住信息查询详情</a></dl>

      
      
    </div>
	
    <div class="fbneirong">
<%--       <form id="myform" action="${pageContext.request.contextPath }/guestmanagement/SendDetail.action" method="post"> --%>
      <form id="myform" action="${pageContext.request.contextPath }/guestmanagement/showinfo.action" method="post">
      <input id="text" type="hidden" name="textjosn" value="">
<!--       	<table class="am-table am-table-bordered"> -->
			<table style="margin-bottom: 0px;" class="am-table am-table-bordered" id="detailslist">

      		<c:forEach items="${details}" var="detail" varStatus="status">

				<tr >
					<td width="10%">顾客姓名</td>				
					<td width="90%">${ detail.name}</td>
				</tr>
				<tr >
					<td >性别</td>
					<td>${ detail.gender}</td>
				</tr>
				<tr >
					<td >房间号</td>
					<td>${ detail.roomnum}</td>
				</tr>
				<tr >
					<td >证件类型</td>
					<td>${ detail.certificatetype}</td>
				</tr>
				<tr >
					<td >证件号</td>
					<td>${ detail.certificatenum}</td>
				</tr>
				<tr >
					<td >押金</td>
					<td>${ detail.deposit}</td>
				</tr>
				<tr >
					<td >会员类型</td>
					<td>${ detail.membertype}</td>
				</tr>
				<tr >
					<td >手机号</td>
					<td>${ detail.ex2}</td>
				</tr>
				<tr >
					<td >入住时间</td>
					<td><fmt:formatDate value="${ detail.checkintime}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
				</tr>
				<tr >
					<td >备注</td>
					<td>${ detail.note}</td>
				</tr>
				<tr >
      			<td colspan="2" align="center">
      				<a class="am-buttom" type="buttom" onclick="javascript:history.back(-1)">返回</a>
      			</td>
      		</tr>
			</c:forEach>	
			
      	</table>     		
      </form>
    </div>

</body>
</html>
