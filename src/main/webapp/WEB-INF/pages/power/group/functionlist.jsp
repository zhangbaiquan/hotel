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
<script type="text/javascript">
function IFrameResize(){ 
	//alert(this.document.body.scrollHeight); //弹出当前页面的高度 
	var obj = parent.document.getElementById("addFrame"); //取得父页面IFrame对象 
	//alert(obj.height); //弹出父页面中IFrame中设置的高度 
	obj.height = this.document.body.scrollHeight; //调整父页面中IFrame的高度为此页面的高度 
	}
function formSubmit(){
	var groupid=$("input[name=groupid]").attr("value");
	var ids="";
	$("input[name=ids]").each(function(){
		if($(this).prop("checked")){			
			ids+=$(this).attr("value")+",";
		}
	})
 	$.ajax({
		url:"${pageContext.request.contextPath}/group/setFunction.action",
		datatype: 'json',
		data:{groupid:groupid,ids:ids},
		type:"POST",
		success:function(result){
			if(result=="success"){
				alert("设置成功！");
			}else{
				alert("设置失败！");
			}
		}	
	})
}
$(function(){
	$("input").click(function(){
		alert("1")
		var checked=$(this).prop("checked");
		var classname="func_"+$(this).attr("value");
		$('input').each(function(){
			if($(this).hasClass(classname)){
				$(this).prop("checked",checked);
				}
			
		});
		if(checked){
			var thisclass=$(this).attr("class");
			var getclass=thisclass.split(" ");
			for(var i=0;i<getclass.length;i++){
				var getvalue=getclass[i].split("_");
				$("input").each(function(){
					if($(this).hasClass(getvalue[1])){
						$(this).prop("checked",checked);
					}
				})
			}
		}
		
	})
})
</script>
</head>
<body>
	<div  style="float:right; width: 50%;margin-top: 20px;padding-right: 50px" align="right">
		<button class="btn" onclick="formSubmit()">保存</button>
	</div>
	<div class="am-u-sm-12">
	<form id="myform" action="${pageContext.request.contextPath }/group/setFunction.action" method="post">
	<input type="hidden" name="groupid"value="${group.userclassid}">
	<span style="float: left;"><span>角色权限列表 : </span>角色名:${group.userclassname }</span>
	<table class="am-table am-table-bordered">
		<tr>
			<td style="color:#ffffff;background-color: #cfcfcf" align="center">
				<span style="font-size: 14px;font-family: 宋体;font-weight: bold;">操作权限设置(功能模块)</span>
			</td>
		</tr>
		
		<c:forEach items="${parentfv}" var="p">
			<tr>
				<td >
					<img src="${pageContext.request.contextPath }/img/org.gif">
					<label class="checkbox-inline">
					  <input type="checkbox" class="func_${p.fid}" name="ids" value="${p.fid}" ${p.checked==1?"checked='checked'":"" }>${p.fname}
					</label>
				</td>
			</tr>
			<c:forEach items="${childfv}" var="c1">
			
				<c:if test="${c1.pid==p.fid }">
					<tr>
						<td >
							&nbsp;&nbsp;&nbsp;&nbsp;
							<img src="${pageContext.request.contextPath }/img/ico2.gif">
							<label class="checkbox-inline">
							  <input type="checkbox" class="func_${p.fid} func_${c1.fid}" name="ids" value="${c1.fid }" ${c1.checked==1?"checked='checked'":"" }> ${c1.fname}
							</label>
						</td>
					</tr>
					<c:forEach items="${childfv}" var="c2">
						<c:if test="${c2.pid==c1.fid }">
							<tr>
								<td  class="func_${p.fid} func_${c1.fid }">
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									<img src="${pageContext.request.contextPath }/img/page.gif">
									<label class="checkbox-inline">
									  <input type="checkbox" class="func_${p.fid} func_${c1.fid }" name="ids" value="${c2.fid}" ${c2.checked==1?"checked='checked'":"" }> ${c2.fname}
									</label>
								</td>
							</tr>
						</c:if>
					</c:forEach>
				</c:if>
			</c:forEach>		
		</c:forEach>		
	</table>
</form>
	</div>	
</body>

</html>