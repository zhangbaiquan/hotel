<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<c:url value='/assets/css/amazeui.min.css'/>"/>
<link rel="stylesheet" href="<c:url value='/assets/css/admin.css'/>">
<link rel="stylesheet" href="<c:url value='/diagram-viewer/inputtop.css'/>">
<script src="<c:url value='/assets/js/jquery.min.js'/>"></script>
<script src="<c:url value='/assets/js/app.js'/>"></script>
<script src="<c:url value='/js/jqPaginator.js'/>"></script>
</head>
<body >
				<div class="admin-biaogelist" style="position: static;">
	
    	<div class="listbiaoti am-cf">
	      <ul><img style="margin:-5px 5px 0px 0px;" src="<c:url value='/img/index/menu6.png'/>"> 角色及权限管理</ul>
		<dl class="am-icon-home" style="float: right;">当前位置： <a href='${pageContext.request.contextPath}/mainPage.action' >首页</a> > <a href="#">角色及权限管理</a></dl>
		
		      <!--这里打开的是新页面-->
		</div>      
			<div class="am-btn-toolbars am-btn-toolbar am-kg am-cf">
		 <!--  <ul>   
		    <li><input type="text" class="am-form-field am-input-sm am-input-xm" placeholder="关键词搜索" /></li>
		    <li><button type="button" class="am-btn am-radius am-btn-xs am-btn-success" style="margin-top: -1px;">搜索</button></li>
		  </ul> -->
		</div>
		<div class="am-g">
				<table class="am-table am-table-bordered am-table-radius am-table-striped">
	         	 <thead>
	             	<tr class="am-success">
						<td align="center">编号</td>
						<td align="center">用户组名</td>
						<td align="center">描述</td>
						<td align="center">操作选项</td>
					</tr>
					</thead>
					<c:forEach items="${paging.list }" var="g">
						<tr>
							<td align="center">${g.userclassid }</td>
							<td align="center">${g.userclassname }</td>
							<td align="center">${g.classnotes }</td>
							<td align="center">
								<a href="${pageContext.request.contextPath }/group/sendManage.action?id=${g.userclassid}">权限设置</a>
								<a href="${pageContext.request.contextPath }/group/sendUpdate.action?id=${g.userclassid}">修改</a>
								<a href="javascript:void(0)" onclick="deletegroup('${g.userclassid}')">删除</a>
							</td>
						</tr>
					</c:forEach>
					<tr>
						<td colspan="4">
							<div style="width: 100%;float: left">
								<div style="width: 45%;float: left;margin-left: 5px" align="left" >
									<font>共${paging.totalPages }页/当前第${paging.currentPage }页</font>
								 </div>
								<div style="width: 45%;float: right;margin-right: 5px" align="right" >
									<c:if test="${paging.currentPage>1}">
										<a href="${pageContext.request.contextPath }/group/showList.action?page=1">首页</a>
										<a href="${pageContext.request.contextPath }/group/showList.action?page=${paging.currentPage-1}">上一页</a>
									</c:if>
									<c:if test="${paging.currentPage<paging.totalPages}">
										<a href="${pageContext.request.contextPath }/group/showList.action?page=${paging.currentPage+1}">下一页</a>
										<a href="${pageContext.request.contextPath }/group/showList.action?page=${paging.totalPages}">尾页</a>
									</c:if>
								 </div>
							</div>
						</td>
					</tr>
				</table>
				<div class="am-btn-group am-btn-group-xs">
				<a type="button" class="am-btn am-btn-default button-add"
					href="<c:url value='/group/sendAdd.action'/>"></a>
			</div>
			</div>
			</div>
	</body>
	<script type="text/javascript">
	var deletegroup=function(id){
		if(confirm("您确认要删除？")){
			$.ajax({
				url:"${pageContext.request.contextPath}/func/delete.action?ids="+id,
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
</html>
