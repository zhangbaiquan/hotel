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
<form action="${pageContext.request.contextPath }/func/update.action" method="post"> 
<input type="hidden"name="id" value="${func.id }">
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
					排序号：
				</td>
				<td align="left">
					<input type="text" name="pxid" class="form-control" value="${func.pxid }" >
				</td>
			</tr>
			<tr>
				<td style="width:30%" align="right">
					功能名称：
				</td>
				<td align="left">
					<input type="text" name="name" class="form-control" value="${func.name }" >
				</td>
			</tr>
			<tr>
				<td style="width:30%" align="right">
					链接指向：
				</td>
				<td align="left">
					<input type="text" name="url" class="form-control" value="${func.url }" >
				</td>
			</tr>
			<tr>
				<td style="width:30%" align="right">
					上级菜单：
				</td>
				<td align="left">
					<select name="pid">
						<option value="0" ${func.pid=="0" ?"selected='selected'":""}>
							无上级菜单
						</option>
						<c:forEach items="${parentlist }" var="p">
							<option value="${p.id }" ${func.pid==p.id?"selected='selected'":""}>${p.name }</option>
							<c:forEach items="${childlist }" var="c">
								<c:if test="${c.pid==p.id }">
									<option value="${c.id }" ${func.pid==c.id?"selected='selected'":""}>&nbsp;&nbsp;&nbsp;&nbsp;${c.name }</option>
								</c:if>
							</c:forEach>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<td style="width:30%" align="right">
					功能状态：
				</td>
				<td align="left">
					<label class="radio-inline">
					  <input type="radio" name="activate" id="inlineRadio1" value="1"${func.activate==1 ?"checked='checked'":""}> 启用
					</label>
					<label class="radio-inline">
					  <input type="radio" name="activate" id="inlineRadio2" value="0" ${func.activate==0 ?"checked='checked'":""}> 关闭
					</label>
						
				</td>
			</tr>
		</table>
	</div>
	<div class="am-u-sm-12" align="center">
		<button  type="submit"> <!-- onclick="formsubmit()" -->
			提交
		</button >
		<button  type="reset">
			重填
		</button>
		<button onclick="javascript:history.back(-1)">
			返回
		</button>
	</div>
	</form>
	<script type="text/javascript">
		var formsubmit=function(){
			
		}
	</script>
</body>
</html>