<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<c:url value='/assets/css/amazeui.min.css'/>"/>
<link rel="stylesheet" href="<c:url value='/assets/css/admin.css'/>">
<script src="<c:url value='/assets/js/jquery.min.js'/>"></script>
<script src="<c:url value='/assets/js/amazeui.min.js'/>"></script>
<link rel="stylesheet" href="<c:url value='/treeview/jquery.treeview.css'/>" />
<script src="<c:url value='/treeview/jquery.treeview.js'/>"></script>
<script type="text/javascript">
$(document).ready(function(){
	
	$("#navigation").treeview({
		persist: "location",
		collapsed: false,
		//unique: true
	});
	$("body").resize(function(){
		IFrameResize();
	})
})
</script>
<style>
	body{
		color:blank;
		font-family: Microsoft YaHei;
	}
</style>
</head>
<body style="height: 100%">
<div style="width:100%;float:left;"id="container">
<%-- 	<div class="col-md-12">
		<h2 style="margin: 0 auto;">用户管理</h2><a href="${pageContext.request.contextPath }/user/sendAdd.action" style="float:right;">添加用户</a>
		<hr style="margin-top: 30px"/>
	</div> --%>
	<div class="am-u-sm-12 " style="float: left;margin: 0;padding: 0">
				<div  class="am-u-sm-2" style=" /* background-color: #dddddd; */ border:1px solid #dddddd;height: 100%;overflow-y:auto;margin: 0;padding: 0 ">
					<div class="admin-biaogelist" style="position: static;">
				
				    	<div class="listbiaoti am-cf">
					      <ul class="am-icon-flag on"> 部门列表</ul>
						</div> 
						<div class="am-g">
							<ul id="navigation" >
								<li style="background-color: #ffffff;" >
									<a href="javascript:void(0)" target="leftFrame" >烟草公司</a>
									<ul id="dept">	
										<c:forEach items="${deptList}" var="dept">
											<li>
												<a href="${pageContext.request.contextPath }/user/showUserList.action?deptId=${dept.deptid}" target="leftFrame">
													${dept.deptname}
												</a>
											</li>
										</c:forEach>
									</ul>
								</li>
							</ul>
						</div>
					</div>
				</div>
				<div class="am-u-sm-10" style="margin: 0;padding: 0">
					<iframe id="userlist" name="leftFrame"  src="showUserList.action" style="overflow: visible;"scrolling="no" frameborder="no" width="100%" height="800" >
					</iframe>
				 </div>
	
	</div>
</div>
</body>

</html>