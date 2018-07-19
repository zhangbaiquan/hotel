<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html class="no-js">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>修改用户信息</title>
<link rel="icon" type="image/png" href="assets/i/favicon.png">
<link rel="stylesheet" href="<c:url value='/assets/css/amazeui.min.css'/>"/>
<link rel="stylesheet" href="<c:url value='/assets/css/admin.css'/>">
<script src="<c:url value='/assets/js/jquery.min.js'/>"></script>
<script src="<c:url value='/assets/js/app.js'/>"></script>
<link href="<c:url value='/kendoui/content/shared/styles/examples-offline.css'/>" rel="stylesheet">
<link href="<c:url value='/kendoui/styles/kendo.common.min.css'/>" rel="stylesheet">
<link href="<c:url value='/kendoui/styles/kendo.rtl.min.css'/>" rel="stylesheet">
<link href="<c:url value='/kendoui/styles/kendo.default.min.css'/>" rel="stylesheet">
<link href="<c:url value='/kendoui/styles/kendo.default.mobile.min.css'/>" rel="stylesheet">
<script src="<c:url value='/kendoui/js/jquery.min.js'/>"></script>
<script src="<c:url value='/kendoui/js/jszip.min.js'/>"></script>
<script src="<c:url value='/kendoui/js/kendo.all.min.js'/>"></script>
<script src="<c:url value='/kendoui/content/shared/js/console.js'/>"></script>
<script type="text/javascript">
var message="${message}";
if(message!=null&&message!=""){
	alert(message);
}
$(function () {
    var dataSource = new kendo.data.DataSource({
        transport: {
            read: {
                url: "${pageContext.request.contextPath }/user/titleList.action",
                dataType: "json"
            }
        }
    });

    var MultiSelect= $("#movies").kendoMultiSelect({
        dataTextField: "titlename",
        dataValueField: "titleid",
        autoBind: false,
        dataSource: dataSource
    }).data("kendoMultiSelect");
    MultiSelect.dataSource.filter({}); //clear applied filter before setting value

    MultiSelect.value("${user.titleid}".split(","));
});
</script>
</head>
<body>
	<div class="listbiaoti am-cf">
      <dl class="am-icon-home" style="float: right;"> 当前位置： <a href='${pageContext.request.contextPath}/mainPage.action' >首页</a> > <a href="#">修改用户信息</a></dl>
    </div>
	 <!-- Row start -->
	<div class="am-g">
		<div class="am-u-sm-12" style="padding-top: 50px;padding-bottom: 50px"align="center">
			<h2>修改用户信息</h2>
		</div>
        <div class="am-u-sm-12">
          <form class="am-form am-form-horizontal" id="myform" action="${pageContext.request.contextPath }/user/update.action" method="post">
          		<input type="hidden" value="${titlename}">
          		<input type="hidden" value="${user.titleid }">
          		<div class="am-form-group">
				    <label for="doc-ipt-3" class="am-u-sm-2 am-form-label">员工编号</label>
				    <div class="am-u-sm-10">
				      <input type="text" id="doc-ipt-3" name="emplyeeid" placeholder="请输入真实姓名" value="${user.emplyeeid}">
				    </div>
				  </div>
				  <div class="am-form-group">
				    <label for="doc-ipt-pwd-2" class="am-u-sm-2 am-form-label">用户名</label>
				    <div class="am-u-sm-10">
				      <input type="text" id="doc-ipt-pwd-2" name="usename" placeholder="请输入登录用的用户名" value="${user.usename}">
				    </div>
				  </div>
          		<div class="am-form-group">
				    <label for="doc-ipt-3" class="am-u-sm-2 am-form-label">姓名</label>
				    <div class="am-u-sm-10">
				      <input type="text" id="doc-ipt-3" name="realname" placeholder="请输入真实姓名" value="${user.realname}">
				    </div>
				  </div>
				
				<%-- <div class="am-form-group">
			      <label for="doc-select-1" class="am-u-sm-2 am-form-label">性别</label>
			      <div class="am-u-sm-10">
				      <select id="doc-select-1" required name="sex">
				        <option value="0" ${user.sex==0?"selected='selected'":"" }>男</option>
				        <option value="1" ${user.sex==1?"selected='selected'":"" }>女</option>
				      </select>
				   <span class="am-form-caret"></span>
			      </div>
			    </div> --%>
				  <div class="am-form-group">
				    <label for="doc-ipt-pwd-2" class="am-u-sm-2 am-form-label">电话</label>
				    <div class="am-u-sm-10">
				      <input type="text" id="doc-ipt-pwd-2" name="phone" placeholder="请输入你的电话号码" value="${user.phone}">
				    </div>
				  </div>
				
				<div class="am-form-group">
				    <label for="doc-ipt-pwd-2" class="am-u-sm-2 am-form-label">单位</label>
				    <div class="am-u-sm-10">
				     	<select id="doc-select-1" required name="deptid">
				     	<%-- <option value="${user.deptid }">${user.deptname}</option> --%>
				     		<c:forEach items="${deptList }" var="dept">
					      	  <option value="${dept.deptid }" ${dept.deptid==user.emplyeeid?"selected='selected'":"" }>${dept.deptname}</option>

					       </c:forEach>
					      </select> 
				     </div>
				  </div>
				  <div class="am-form-group">
				    <label for="doc-ipt-pwd-2" class="am-u-sm-2 am-form-label">职称</label>
				    <div class="am-u-sm-10">
				    <select id="movies" name="titleid"></select>
				     <%-- 	<select id="doc-select-1"  required name="titleid" >
				   	<option value="${user.titleid }">${titlename}</option>
				     		<c:forEach items="${titlelist }" var="title">
					      	  <option value="${title.titleid }" ${titleid==user.titleid?"selected='selected'":"" }>${title.titlename}</option>
					       </c:forEach>
					      </select> --%>
				     </div>
				  </div>
				  <div class="am-form-group">
				    <label for="doc-ipt-pwd-2" class="am-u-sm-2 am-form-label">角色</label>
				    <div class="am-u-sm-10">
				     	<select id="doc-select-1" required name="groupid">
				     	<%-- <option value="${user.groupid }">${grouping.userclassname}</option> --%>
				     		<c:forEach items="${grouplist }" var="group">
					       	 <option value="${group.userclassid }" ${group.userclassid==user.groupid?"selected='selected'":"" }>${group.userclassname }</option>
					        </c:forEach>
					      </select> 
				     </div>
				  </div>
				    	<div class="am-form-group" align="center">
				    	<button type="submit"  class="btn btn-default">确认提交</button>
				      	<button type="reset"  class="btn btn-default">重新填写</button>
		</div>
          </form>
        </div>

     </div>

</body>
</html>