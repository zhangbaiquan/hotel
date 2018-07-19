<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html class="no-js">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>角色管理-新增角色</title>
<link rel="icon" type="image/png" href="assets/i/favicon.png">
<link rel="stylesheet" href="<c:url value='/assets/css/amazeui.min.css'/>"/>
<link rel="stylesheet" href="<c:url value='/assets/css/admin.css'/>">
 <link href="<c:url value='/kendoui/styles/examples-offline.css'/>" rel="stylesheet">
 <link href="<c:url value='/kendoui/styles/kendo.common.min.css'/>" rel="stylesheet"> 
 <link href="<c:url value='/kendoui/styles/kendo.rtl.min.css'/>" rel="stylesheet"> 
 <link href="<c:url value='/kendoui/styles/kendo.default.min.css'/>" rel="stylesheet"> 
 <link href="<c:url value='/kendoui/styles/kendo.default.mobile.min.css'/>" rel="stylesheet"> 
 <script src="<c:url value='/kendoui/js/jquery.min.js'/>"></script> 
 <script src="<c:url value='/kendoui/js/jszip.min.js'/>"></script> 
 <script src="<c:url value='/kendoui/js/kendo.all.min.js'/>"></script> 
<script src="<c:url value='/assets/js/app.js'/>"></script>
<script src="<c:url value='/kendoui/js/console.js'/>"></script>
<style>
        .demo-section label {
            display: block;
            margin: 15px 0 5px 0;
        }
        #get {
            float: right;
            margin: 25px auto 0;
        }
    </style>
</head>
<body>
	<div class="listbiaoti am-cf">
      <dl class="am-icon-home" style="float: right;"> 当前位置： <a href='${pageContext.request.contextPath}/mainPage.action' >首页</a> > <a href="#">添加角色</a></dl>
    </div>
	 <!-- Row start -->
	<div class="am-g">
		<div class="am-u-sm-12" style="padding-top: 50px;padding-bottom: 50px"align="center">
			<h2>添加角色</h2>
		</div>
        <div class="am-u-sm-12">
          <form class="am-form am-form-horizontal" id="myform" action="${pageContext.request.contextPath }/group/add.action" method="post">
          		<div class="am-form-group">
				    <label for="doc-ipt-3" class="am-u-sm-2 am-form-label">角色编号</label>
				    <div class="am-u-sm-10">
				      <input type="text" id="doc-ipt-3" value="自动编号" readonly="readonly" placeholder="自动编号">
				    </div>
				  </div>
				  <div class="am-form-group">
				    <label for="doc-ipt-pwd-2" class="am-u-sm-2 am-form-label">角色名称</label>
				    <div class="am-u-sm-10">
				      <input type="text" class="form-control" id="inputEmail3" name="userclassname">
				    </div>
				  </div>
          		<div class="am-form-group">
				    <label for="doc-ipt-3" class="am-u-sm-2 am-form-label">描述信息</label>
				    <div class="am-u-sm-10">
				      <input type="text" class="form-control" id="inputEmail3" name="classnotes">
				    </div>
				  </div>
				
				
				  <div class="am-form-group">
				    <div class="am-u-sm-10 am-u-sm-offset-2">
				      <button type="submit" class="am-btn am-btn-default">确认提交</button>
				      <button type="reset" class="am-btn am-btn-default">重新填写</button>
				      <a onclick="javascript:history.back(-1)" class="am-btn am-btn-default">返回</a>
				    </div>
				  </div>
          </form>
        </div>

     </div>

</body>
<script>
        $(function(){
        	$("#required").kendoMultiSelect().data("kendoMultiSelect");
        })
    </script>
</html>