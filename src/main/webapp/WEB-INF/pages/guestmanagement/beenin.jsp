<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>入住登记</title>
<meta name="description" content="这是一个入住登记页面">
<meta name="keywords" content="index">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<meta name="renderer" content="webkit">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="icon" type="image/png" href="<c:url value='/assets/i/favicon.png'/>">
<link rel="apple-touch-icon-precomposed" href="<c:url value='/assets/i/app-icon72x72@2x.png'/>">
<meta name="apple-mobile-web-app-title" content="Amaze UI" />
<link rel="stylesheet" href="<c:url value='/assets/css/amazeui.min.css'/>">
<link rel="stylesheet" href="<c:url value='/assets/css/admin.css'/>">
<link rel="stylesheet" href="<c:url value='/assets/css/amazeui.datetimepicker.css'/>">
<link rel="stylesheet" href="<c:url value='/diagram-viewer/inputtop.css'/>">
<script src="<c:url value='/assets/js/jquery.min.js'/>"></script>
<script src="<c:url value='/assets/js/app.js'/>"></script>
<script src="<c:url value='/assets/js/amazeui.datetimepicker.min.js'/>"></script>
</head>
<body>
    <div class="listbiaoti am-cf">
      <ul><img style="margin:-5px 5px 0px 0px;" src="<c:url value='/img/index/menu1.png'/>"> 入住登记</ul>
     

      <!--这里打开的是新页面-->
   
    </div>
<div class="fbneirong" >
<form style="width: 100%" class="am-form" data-am-validator action="<c:url value='/guestmanagement/liveinAdd.action'/>">

  	<table class="am-table am-table-bordered">
  			<tr>
      			<td width="10%">顾客姓名</td>
      			<td width="90%" ><input type="text" class="am-form-field am-radius" placeholder="入住客人姓名" required name="name" maxlength="20" minlength="1"/></td>
      		</tr>
  			<tr>
      			<td width="10%">房间号</td>
      			<td width="90%" ><input type="text" id="roomnum" class="am-form-field am-radius" placeholder="当前房间号：${roomnum }" value="${roomnum }" required name="roomnum" /></td>
      		</tr>
      		<tr>
      			<td width="10%">房间状态</td>
<!--       			<td width="90%" ><input type="text" class="am-form-field am-radius" placeholder="请填入入住客人姓名" required name="name" /></td> -->
      			<td width= 200px >
      				<select name="roomstate">
      					<option value ="state">${state }</option>
						<option value ="已入住">已入住</option>
						<option value ="空净房">空净房</option>
						<option value="脏房">脏房</option>
					</select>
				</td>
      		</tr>
      		<tr>
      			<td width="10%">顾客姓名</td>
      			<td width="90%" ><input type="text" class="am-form-field am-radius" placeholder="请填入入住客人姓名" required name="name" /></td>
      		</tr>
      		<tr>
      		<td>顾客性别</td>
      			<td>
<!--       			<input type="text" class="am-form-field am-radius" placeholder="性别" required name="gender"/> -->
      				<select required name="gender"/>
						<option value ="男">男</option>
						<option value ="女">女</option>
					</select>
      			</td>
      		</tr>
<!--       		<tr> -->
<!--       			<td>入住时间</td> -->
<!--       			<td ><input type="text" class="form-datetime-lang am-form-field" placeholder="入住时间" readonly required name="checkintime"/></td> -->
<!--       		</tr> -->
      		<tr>
      			<td>证件类型</td>
<!--       			<td ><input type="text" class="am-form-field am-radius" placeholder="证件类型" required name="certificatetype"/></td> -->
      			<td >
				<!--<input type="text" class="am-form-field am-radius" placeholder="证件类型" required name="certificatetype"/> -->
      				<select id="certificatetype" required name="certificatetype"/>
						<option value ="">请选择证件类型</option>
						<option value ="身份证">身份证</option>
						<option value ="护照">护照</option>
						<option value ="贵宾卡">贵宾卡</option>
					</select>
      			</td>
      		</tr>
      		<tr>
      			<td>证件号</td>
      			<td><input type="text" class="am-form-field am-radius"placeholder="证件号" maxlength="20" required name="certificatenum"></td>
      		</tr>
      		<tr>
      			<td>押金</td>
      			<td><input type="number" class="am-form-field am-radius"placeholder="押金" required name="deposit" step="0.01" min="0" maxlength="5"></td>
      		</tr>
      		<tr>
      			<td>会员类型</td>
      			<td><input type="text" class="am-form-field am-radius" placeholder="会员类型" required name="membertype"></td>
      		</tr>
      		<tr>
      			<td>手机号</td>
      			<td><input type="number" class="am-form-field am-radius" placeholder="手机号" required name="ex2" maxlength="11" minlength="11"></td>
      		</tr>
      		<tr>
      			<td>备注</td>
      			<td><textarea type="text" class="am-form-field am-radius" placeholder="备注" name="note" maxlength="200"></textarea></td>
      		</tr>
      		
      			<td colspan="2" align="center">
      				<input type="submit" class="am-btn am-btn-default input-save" value="" />
      			</td>
      		</tr>
      	</table> 
<%--   </c:if> --%>

  
  
  
</form>

</div>
<script src="<c:url value='/assets/js/amazeui.min.js'/>"></script>
<script>
(function($){
	  // 也可以在页面中引入 amazeui.datetimepicker.zh-CN.js
	  $.fn.datetimepicker.dates['zh-CN'] = {
	    days: ["星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期日"],
	    daysShort: ["周日", "周一", "周二", "周三", "周四", "周五", "周六", "周日"],
	    daysMin:  ["日", "一", "二", "三", "四", "五", "六", "日"],
	    months: ["一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"],
	    monthsShort: ["一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"],
	    today: "今日",
	    suffix: [],
	    meridiem: ["上午", "下午"]
	  };

	  $('.form-datetime-lang').datetimepicker({
	    language:  'zh-CN',
	    autoclose: true,
	    todayBtn: true,
	    startDate: '2018-02-14 14:45',
	    format: 'yyyy-mm-dd hh:ii'
	  });
	}(jQuery));
	
//Ajax验证身份证号是否合法
$(function () {

	$("#certificatetype").bind("change",function(){
	    if($(this).val()==0){
	      return;
	    }
	    else{
// 	    	var certificatetype = $("#certificatetype").val();
	    	var certificatetype = $(this).find("option:selected").text();
// 	    	alert(certificatetype);
			if(certificatetype == "身份证"){
				
				$("#certificatenum").blur(function(){
					var certificatenum = $("#certificatenum").val();
					$.ajax({
						"url":"${pageContext.request.contextPath}/guestmanagement/validIdCard.action",
						"type":"post",
						"data":{"certificatenum":certificatenum},
						"async":true,
						"dateType":"json",
						"success":function(res){
							if(res){
//				 				alert("该身份证证件号合法！");
							}
							else{
								alert("身份证号输入有误，为不合法的身份证号，请确认后重新输入！");
							}
						}
					});
					});
			}
	    }
	  });
	
});
</script>
</body>
</html>