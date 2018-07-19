<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
	<meta charset="UTF-8">
	<title></title>
	<link rel="stylesheet" href="<c:url value='/assets/css/amazeui.min.css'/>" />
	<link rel="stylesheet" href="<c:url value='/assets/css/admin.css'/>">
	<link rel="stylesheet" href="<c:url value='/diagram-viewer/inputtop.css'/>">
	<script src="<c:url value='/assets/js/jquery.min.js'/>"></script>
	<script src="<c:url value='/assets/js/app.js'/>"></script>
	<script src="<c:url value='/js/jqPaginator.js'/>"></script>
</head>

	<body>
		<div class="am-g" style="margin-left: 5px;margin-right: 5px;">
			<div class="admin-biaogelist" style="position: static;">
	
    	<div class="listbiaoti am-cf">
	      <ul><img style="margin:-5px 5px 0px 0px;" src="<c:url value='/img/index/menu6.png'/>"> 部门列表</ul>
		      
		      <dl class="am-icon-home" style="float: right;">当前位置： <a href='${pageContext.request.contextPath}/mainPage.action' >首页</a> > <a href="#">部门列表</a></dl>
		
		      <!--这里打开的是新页面-->
		</div>  
		 <form  id="myform" action="${pageContext.request.contextPath }/dept/list.action" method="post">    
			<div class="am-btn-toolbars am-btn-toolbar am-kg am-cf">
		  <ul>   
		    <li><input type="text" name="sname"class="gjz-quq" class="am-form-field am-input-sm am-input-xm" placeholder="部门" value="${sname}"/></li>
		    <li><button type="submit" class="am-btn am-radius am-btn-xs am-btn-success find-quq"><span class="find-quq find">搜索</span></button></li>
		  </ul>
		</div>
		 <input type="hidden" name="page" value=""/>
		 </form>
		<div class="am-g">
				<table class="am-table am-table-bordered am-table-radius am-table-striped">
	          <thead>
	             <tr class="am-success">
						<th style="text-align:center;">编号</th>
						<th style="text-align:center;">部门</th>
						<th style="text-align:center;">部门领导</th>
						<th style="text-align:center;">公司</th>
						<th style="text-align:center;">操作选项</th>
					</tr>
					 </thead>
					<c:forEach items="${childlist.list }" var="dept">
					<tr>
						<td align="center">${dept.deptid }</td>
						<td style="text-align:center;">${dept.deptname }</td>
						<td style="text-align:center;">${dept.ex2 }</td>
						<td style="text-align:center;">${dept.company }</td>
						<td align="center">
							<a href="sendUpdate.action?deptid=${dept.deptid}">编辑</a>
							<a href="javascript:void(0)" onclick="deletedept('${dept.deptid}')">删除</a>
						</td>
					</tr>
						<%-- <c:forEach items="${childlist}" var="c">
							<c:if test="${c.parentid==dept.deptid }">
								<tr>
									<td align="center">${c.deptid }</td>
									<td align="left">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="${pageContext.request.contextPath }/img/arr1.gif">${c.deptname }</td>
									<td align="center">
										<a href="${pageContext.request.contextPath }/dept/sendUpdate.action?deptid=${c.deptid}">编辑</a>
										<a href="javascript:void(0)" onclick="deletedept('${c.deptid}')">删除</a>
									</td>
								</tr>
							</c:if>
						</c:forEach> --%>
					</c:forEach>
				</table>
				<div class="am-btn-group am-btn-group-xs">
		        	<!-- <button type="button" class="am-btn am-btn-default" onclick="deletechecked()"><span class="am-icon-minus"></span> 选中删除</button> 
		            <a  type="button" class="am-btn am-btn-default" href="<c:url value='/dept/sendAdd.action'/>"><span class="am-icon-plus"></span> 新增</a>-->
		            <a  type="button" class="am-btn am-btn-default button-add" 
            		href="<c:url value='/dept/sendAdd.action'/>"></a>
		        </div>
		        
				<div class="am-cf">
				<ul class="am-pagination am-fr" id="pagination2">
				</ul>
				<ul class="am-pagination am-fr">
				</ul>
				<ul class="am-pagination am-fr">
					<li>总条数：${childlist.totalRows }</li>
					<li>总页数：${childlist.totalPages }</li>
					<li>&nbsp;&nbsp;&nbsp;</li>
				</ul>
              <script type="text/javascript">
			    $.jqPaginator('#pagination2',{
			        totalPages: ${childlist.totalPages},
			        visiblePages: ${childlist.pageSize},
			        currentPage: ${childlist.currentPage},
			        prev: '<li class="prev"><a href="javascript:;">上一页</a></li>',
			        next: '<li class="next"><a href="javascript:;">下一页</a></li>',
			        page: '<li class="page"><a href="javascript:;">{{page}}</a></li>',
			        onPageChange: function (num, type) {
			            if(num!==${childlist.currentPage}){
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
var deletedept=function(id){
	if(confirm("您确认要删除？")){
		$.ajax({
			url:"${pageContext.request.contextPath}/dept/delete.action?deptid="+id,
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
