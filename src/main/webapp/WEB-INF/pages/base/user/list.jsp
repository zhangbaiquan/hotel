<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户管理</title>
<link rel="stylesheet"
	href="<c:url value='/assets/css/amazeui.min.css'/>" />
<link rel="stylesheet" href="<c:url value='/assets/css/admin.css'/>">
<link rel="stylesheet"
	href="<c:url value='/diagram-viewer/inputtop.css'/>">
<script src="<c:url value='/assets/js/jquery.min.js'/>"></script>
<script src="<c:url value='/assets/js/app.js'/>"></script>
<script src="<c:url value='/js/jqPaginator.js'/>"></script>
</head>
<body>
	<div class="admin-biaogelist" style="position: static;">

		<div class="listbiaoti am-cf">
			<ul>
				<img style="margin: -5px 5px 0px 0px;"
					src="<c:url value='/img/index/menu6.png'/>"> 用户列表
			</ul>

			<dl class="am-icon-home" style="float: right;">
				当前位置：<a href='${pageContext.request.contextPath}/mainPage.action' >首页</a> >
				<a href="#">用户列表</a>
			</dl>

			<!--这里打开的是新页面-->
		</div>

		<div class="am-btn-toolbars am-btn-toolbar am-kg am-cf">
			<!--form表单的样式： class="am-form am-form-horizontal" -->
			<form id="myform"
				action="${pageContext.request.contextPath }/user/list.action"
				method="post">
				<input type="hidden" name="page" value="" />
				<ul>
					<!-- <div class="am-form-group"> -->
					<li><select  class="xlk-quq"
						class="am-form-field am-input-sm am-input-xm"name="dept">
      					<option value="">请选择部门</option>
      					<c:forEach items="${deptList}" var="deptList">
      						<option value="${deptList.deptname}" ${deptList.deptname eq dept?"selected='selected'":""} >${deptList.deptname}</option>
      					</c:forEach>
      				</select></li>
					<li><input type="text" class="gjz-quq"
						class="am-form-field am-input-sm am-input-xm" placeholder="姓名" value="${key}"
						name="key" /></li>
					<li><button type="sumbit"
							class="am-btn am-radius am-btn-xs am-btn-success find-quq">
							<span class="find-quq find">搜索</span>
						</button></li>
				</ul>
				<!-- </div> -->
			</form>

		</div>
		<div class="am-g">
			<table
				class="am-table am-table-bordered am-table-radius am-table-striped">
				<thead>
					<tr class="am-success">
						<th width="15%" style="text-align: center;">编号</th>
						<th width="10%" style="text-align: center;">登录名</th>
						<th width="15%" style="text-align: center;">用户姓名</th>
						<th width="15%" style="text-align: center;">任职部门</th>
						<th width="17%" style="text-align: center;">电话</th>
						<th width="10%" style="text-align: center;">职称</th>
						<th width="30%" style="text-align: center;">操作选项</th>
					</tr>
				</thead>
				<c:forEach items="${paging.list}" var="user">
					<tr>
						<td align="center">${user.emplyeeid}</td>
						<td align="center">${user.usename}</td>
						<td align="center">${user.realname}</td>
						<td align="center">${user.deptname}</td>
						<td align="center">${user.phone}</td>
						<td align="center">${user.titlename}</td>
						<td align="center"><a
							href="${pageContext.request.contextPath }/user/sendUpdate.action?id=${user.emplyeeid}">编辑</a>
							<a href="JavaScript:void(0)"
							onclick="deleteUser('${user.emplyeeid}')">删除</a></td>
					</tr>
				</c:forEach>
			</table>
			<div class="am-btn-group am-btn-group-xs">
				<a type="button" class="am-btn am-btn-default button-add"
					href="<c:url value='/user/sendAdd.action?deptid=${deptid}'/>"></a>

			</div>
			<div class="am-cf">
				<ul class="am-pagination am-fr" id="pagination2">
				</ul>
				<ul class="am-pagination am-fr">
				</ul>
				<ul class="am-pagination am-fr">
					<li>总条数：${paging.totalRows }</li>
					<li>总页数：${paging.totalPages }</li>
					<li>&nbsp;&nbsp;</li>
				
				</ul>
					<script type="text/javascript">
			    $.jqPaginator('#pagination2',{
			        totalPages: ${paging.totalPages},
			        visiblePages: ${paging.pageSize},
			        currentPage: ${paging.currentPage},
			        prev: '<li class="prev"><a href="javascript:;">上一页</a></li>',
			        next: '<li class="next"><a href="javascript:;">下一页</a></li>',
			        page: '<li class="page"><a href="javascript:;">{{page}}</a></li>',
			        onPageChange: function (num, type) {
			            if(num!==${paging.currentPage}){
			            	$("input[name='page']").val(num);
			            	$("form").submit();
			            }
			        }
			    });
			</script>

				</div>
			</div>
		</div>
</body>
<script type="text/javascript">
var deleteUser=function(id){
	if(confirm("您确认要删除？")){
		$.ajax({
			url:"${pageContext.request.contextPath}/user/deleteUser.action?id="+id,
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