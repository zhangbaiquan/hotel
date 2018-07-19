<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html class="no-js">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>修改用户</title>
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
      <dl class="am-icon-home" style="float: right;"> 当前位置： <a href='${pageContext.request.contextPath}/mainPage.action' >首页</a> > <a href="#">修改部门信息</a></dl>
    </div>
	 <!-- Row start -->
	<div class="am-g">
		<div class="am-u-sm-12" style="padding-top: 50px;padding-bottom: 50px"align="center">
			<h2>修改部门信息</h2>
		</div>
        <div class="am-u-sm-12">
          <form class="am-form am-form-horizontal" id="myform" action="updateDept.action" method="post">
          		<input type="hidden" class="form-control" name="ex2" value="">
          		<div class="am-form-group">
				    <label for="doc-ipt-3" class="am-u-sm-2 am-form-label">部门编号</label>
				    <div class="am-u-sm-10">
				      <input type="text" class="form-control" id="inputEmail3" name="deptid" value="${dept.deptid }" readonly="readonly">
				    </div>
				  </div>
				  <div class="am-form-group">
				    <label for="doc-ipt-pwd-2" class="am-u-sm-2 am-form-label">部门名称</label>
				    <div class="am-u-sm-10">
				      <input type="text" class="form-control" id="inputEmail3" name="deptname" value="${dept.deptname }">
				    </div>
				  </div>
          		<div class="am-form-group">
				    <label for="doc-ipt-3" class="am-u-sm-2 am-form-label">部门领导</label>
				    <div class="am-u-sm-10">
				      <select  name="ex3" onchange="showInfo()">
		      	<option id="leader"
		      	 value="0">请选择人员</option>
		      	<c:forEach items="${employee }" var="p">
		      		<option name="employee" value="${p.emplyeeid}" ${dept.ex3==p.emplyeeid?"selected='selected'":"" }>${p.realname }</option>
		      	</c:forEach>
		      </select>
				    </div>
				  </div>
				
				
				  <div class="am-form-group">
				    <label for="doc-ipt-pwd-2" class="am-u-sm-2 am-form-label">所属公司</label>
				    <div class="am-u-sm-10">
				      <input type="text" class="form-control" id="inputEmail3" name="company"value="${dept.company }">
				    </div>
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
<script type="text/javascript">
function showInfo() {
	/* var value = obj.value;
	$.post("${pageContext.request.contextPath }/dept/getdeptById.action",
			{
				id : value
			}, function(data, status) {
				$().find("input[name='ex2']").val(
						data.deptname);
			}); */
			/* $("#leader").find("option").each(function){
				第一种方法
			} */
			//第二种方法
			var deptname=$("option[name='employee']:selected").text();
			$("input[name='ex2']").val(deptname);
};
</script>
</html>