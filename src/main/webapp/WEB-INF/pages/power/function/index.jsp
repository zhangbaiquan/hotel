<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html style="height:100%">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<c:url value='/assets/css/amazeui.min.css'/>"/>
<link rel="stylesheet" href="<c:url value='/assets/css/admin.css'/>">
<link rel="stylesheet" href="<c:url value='/diagram-viewer/inputtop.css'/>">
<script src="<c:url value='/assets/js/jquery.min.js'/>"></script>
<script src="<c:url value='/assets/js/app.js'/>"></script>
<script src="<c:url value='/js/jqPaginator.js'/>"></script>
<style type="text/css">
body a{
	color:#666;
}
body a:HOVER{
	color:#0e90d2;
}
</style>
</head>
<body style="height:100%">
		<div class="admin-biaogelist" style="position: static;height: 100%">
	
    	<div class="listbiaoti am-cf">
	      <ul><img style="margin:-5px 5px 0px 0px;" src="<c:url value='/img/index/menu6.png'/>">功能列表</ul>
		      
		      <dl class="am-icon-home" style="float: right;">当前位置： <a href='${pageContext.request.contextPath}/mainPage.action' >首页</a> > <a href="#">功能列表</a></dl>
		
		      <!--这里打开的是新页面-->
		</div>      
			<div class="am-btn-toolbars am-btn-toolbar am-kg am-cf">
		 <!--  <ul>   
		    <li><input type="text" class="am-form-field am-input-sm am-input-xm" placeholder="关键词搜索" /></li>
		    <li><button type="button" class="am-btn am-radius am-btn-xs am-btn-success" style="margin-top: -1px;">搜索</button></li>
		  </ul> -->
		  <a type="button" class="am-btn am-radius am-btn-xs" style="margin-top: -1px;" href="${pageContext.request.contextPath }/func/sendAdd.action" target="mainPage">添加</a>
		</div>
		<div  style="display:block;position:fixed; top:90px;left:10px; bottom:10px;height: auto;width:300px;overflow-y:scroll;background-color: #ffffff ">
			<table width="100%" class="table am-table-bordered">
			<c:forEach items="${parentlist }" var="p">
					<tr height="25px">
						<td>
							<a href="${pageContext.request.contextPath }/func/showInfo.action?id=${p.id}" target="mainPage">
								<img src="${pageContext.request.contextPath }/img/org.gif">
								${p.name}
							</a>
						</td>
						<td width="80px">
							<a href="${pageContext.request.contextPath }/func/sendUpdate.action?id=${p.id}" target="mainPage">编辑</a>
							<a href="javascript:void(0)" onclick="deletefunc('${p.id}')">删除</a>
						</td>
					</tr>
					<c:forEach items="${childlist}" var="c1">
						<c:if test="${p.id==c1.pid }">
							<tr>
								<td>
									&nbsp;&nbsp;&nbsp;&nbsp;<a href="${pageContext.request.contextPath }/func/showInfo.action?id=${c1.id}" target="mainPage">
										<img src="${pageContext.request.contextPath }/img/ico2.gif">
										${c1.name}
									</a>
								</td>
								<td>
									<a href="${pageContext.request.contextPath }/func/sendUpdate.action?id=${c1.id}" target="mainPage">编辑</a>
									<a href="javascript:void(0)" onclick="deletefunc('${c1.id}')">删除</a>
								</td>
							</tr>
							<c:forEach items="${childlist}" var="c2">
								<c:if test="${c1.id==c2.pid }">
									<tr>
										<td>
											&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="${pageContext.request.contextPath }/func/showInfo.action?id=${c2.id}" target="mainPage">
												<img src="${pageContext.request.contextPath }/img/ico1.gif">
												${c2.name}
											</a>
										</td>
										<td>
											<a href="${pageContext.request.contextPath }/func/sendUpdate.action?id=${c2.id}" target="mainPage">编辑</a>
											<a href="javascript:void(0)" onclick="deletefunc('${c2.id}')">删除</a>
										</td>
									</tr>
								</c:if>
							</c:forEach>
						</c:if>
					</c:forEach>
				</c:forEach>
			</table>
		</div>
		<div style="position:absolute ;height:auto;left:310px;right:10px;top:90px;bottom:10px;background-color: #ffffff ">
			<iframe src="" name="mainPage" id="mainPage" style="overflow: visible;" width="100%" height="100%" frameborder="0"></iframe>
		</div>
		<div style="clear:both;"></div>
	</div>
	<script type="text/javascript">
		var deletefunc=function(id){
			if(confirm("您确认要删除？")){
				$.ajax({
					url:"${pageContext.request.contextPath}/func/delete.action?id="+id,
					type:"POST",
					success:function(result){
						if(result=="success"){
							alert("删除成功！");
							window.location.reload();
						}else{
							alert("删除失败！");
						}
					}			
				})
			}
		}
		
	</script>
</body>
</html>