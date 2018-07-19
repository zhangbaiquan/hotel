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
<script src="<c:url value='/assets/js/app.js'/>"></script>
<script src="<c:url value='/js/jqPaginator.js'/>"></script>
</head>
<body>
	<div class="am-u-sm-12">
		<table class="am-table am-table-bordered">
			<tr>
				<td style="width:30%" align="right">
					功能编号：
				</td>
				<td align="left">
					${func.id}
				</td>
			</tr>
			<tr>
				<td style="width:30%" align="right">
					功能名称：
				</td>
				<td align="left">
					${func.name}
					
				</td>
			</tr>
			<tr>
				<td style="width:30%" align="right">
					链接指向：
				</td>
				<td align="left">
					${func.url}
				</td>
			</tr>
			<tr>
				<td style="width:30%" align="right">
					上级编号：
				</td>
				<td align="left">
					${func.pid}
				</td>
			</tr>
			<tr>
				<td style="width:30%" align="right">
					功能状态：
				</td>
				<td align="left">
					<c:if test="${func.activate==1}">
						启用
					</c:if>
					<c:if test="${func.activate!=1}">
						关闭
					</c:if>
						
				</td>
			</tr>
		</table>
	</div>
	<div class="am-u-sm-12" align="center">
		<a class="btn" href="${pageContext.request.contextPath }/func/sendUpdate.action?id=${func.id}">
			<img src="${pageContext.request.contextPath }/img/but_edit.gif">
		</a>
		<a href="script:void(0)" onclick="deletefunc('${func.id}')">
			<img src="${pageContext.request.contextPath }/img/but_del.gif">
		</a>
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