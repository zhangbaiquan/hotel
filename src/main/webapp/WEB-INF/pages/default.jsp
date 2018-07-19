<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="icon" type="image/png" href="<c:url value='/assets/i/favicon.png'/>">
    <link rel="apple-touch-icon-precomposed" href="<c:url value='/assets/i/app-icon72x72@2x.png'/>">
    <meta name="apple-mobile-web-app-title" content="Amaze UI" />
    <link rel="stylesheet" href="<c:url value='/assets/css/amazeui.min.css'/>">
    <link rel="stylesheet" href="<c:url value='/assets/css/admin.css'/>">
    <link rel="stylesheet" href="<c:url value='/diagram-viewer/inputtop.css'/>">
    <script src="<c:url value='/assets/js/jquery.min.js'/>"></script>
    <script src="<c:url value='/assets/js/app.js'/>"></script>
    <script src="<c:url value='/js/jqPaginator.js'/>"></script>
    <style type="text/css">
    body {
	vertical-align: middle;
	font-family: "Microsoft YaHei";
	font-size: 2.2em;
	color:#666;
	letter-spacing: 2px;
}

    </style>
</head>
<body>

<div class="admin-biaogelist" style="position:fixed; top:0px;left:0px;right:0px;bottom:0px;background-color: #4c6983;">
<!-- <div style="width: 100px;height: 100px;color: red;background-color: #4c6983;"> -->

<div style="height:97%; margin: 21px 0px 0px 20px;padding: 120px 200px;background-color: #f8fcff;">
<img width="90%" height="90%" src="<c:url value='/img/bug.png'/>">
<span style="position: absolute; top: 38%; left: 23%;z-index: 8;width: 400px;">${message}<p style="margin-left: 50px;">点击&nbsp&nbsp&nbsp&nbsp<a style="font-size: 2.4em;color: #1c81ff;" href="javascript:history.back(-1)">返回</a></p></span> 
</div>
</div>
<%-- ${message}<br/><a href="javascript:history.back(-1)">返回</a> --%>
</body>
</html>