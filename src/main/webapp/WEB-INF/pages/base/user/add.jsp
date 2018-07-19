<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html class="no-js">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>新增用户</title>
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
      <dl class="am-icon-home" style="float: right;"> 当前位置： <a href='${pageContext.request.contextPath}/mainPage.action' >首页</a> > <a href="#">添加用户</a></dl>
    </div>
	 <!-- Row start -->
	<div class="am-g">
		<div class="am-u-sm-12" style="padding-top: 50px;padding-bottom: 50px"align="center">
			<h2>添加用户</h2>
		</div>
        <div class="am-u-sm-12">
          <form class="am-form am-form-horizontal" id="myform" action="${pageContext.request.contextPath }/user/add.action" method="post">
          		<div class="am-form-group">
				    <label for="doc-ipt-3" class="am-u-sm-2 am-form-label">员工编号</label>
				    <div class="am-u-sm-10">
				      <input type="text" id="doc-ipt-3" name="emplyeeid" placeholder="请输入员工编号">
				    </div>
				  </div>
				  <div class="am-form-group">
				    <label for="doc-ipt-pwd-2" class="am-u-sm-2 am-form-label">用户名</label>
				    <div class="am-u-sm-10">
				      <input type="text" id="doc-ipt-pwd-2" name="usename" placeholder="请输入登录用的用户名">
				    </div>
				  </div>
          		<div class="am-form-group">
				    <label for="doc-ipt-3" class="am-u-sm-2 am-form-label">姓名</label>
				    <div class="am-u-sm-10">
				      <input type="text" id="doc-ipt-3" name="realname" placeholder="请输入真实姓名">
				    </div>
				  </div>
				
				<div class="am-form-group">
			      <label for="doc-select-1" class="am-u-sm-2 am-form-label">电话</label>
			      <div class="am-u-sm-10">
				      <input type="text" id="doc-ipt-3" name="phone" placeholder="请输入你的电话号码">
				   <span class="am-form-caret"></span>
			      </div>
			    </div>
				<!--   <div class="am-form-group">
				    <label for="doc-ipt-pwd-2" class="am-u-sm-2 am-form-label">密码</label>
				    <div class="am-u-sm-10">
				      <input type="password" id="doc-ipt-pwd-2" name="pwd" placeholder="请输入密码">
				    </div>
				  </div> -->
				
				<div class="am-form-group">
				    <label for="doc-ipt-pwd-2" class="am-u-sm-2 am-form-label">部门</label>
				    <div class="am-u-sm-10">
				     	<select id="doc-select-1" required name="deptid">
				     		<c:forEach items="${deptList}" var="dept">
					      	  <option value="${dept.deptid }" ${deptid==dept.deptid?"selected='selected'":"" }>${dept.deptname }</option>
					       </c:forEach>
					      </select> 
				     </div>
				  </div>
				  <div class="am-form-group">
				    <label for="doc-ipt-pwd-2" class="am-u-sm-2 am-form-label">职称</label>
				    <div class="am-u-sm-10">
				     	<select id="required"  name="titleid">
				     		<c:forEach items="${titlelist }" var="title">
					      	  <option value="${title.titleid }" ${titleid==title.titleid?"selected='selected'":"" }>${title.titlename}</option>
					       </c:forEach>
					      </select>
				     </div>
				  </div>
				  <div class="am-form-group">
				    <label for="doc-ipt-pwd-2" class="am-u-sm-2 am-form-label">角色</label>
				    <div class="am-u-sm-10">
				     	<select id="doc-select-1" required name="groupid">
				     		<c:forEach items="${grouplist }" var="group">
					       	 <option value="${group.userclassid }">${group.userclassname }</option>
					        </c:forEach>
					      </select> 
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