<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>应急事件修改</title>
<meta name="description" content="这是一个应急事件修改页面">
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
      <ul><img style="margin:-5px 5px 0px 0px;" src="<c:url value='/img/index/menu8.png'/>"> 应急事件修改</ul>
     

      <!--这里打开的是新页面-->
   
    </div>
<div class="fbneirong" >
<form style="width: 100%" class="am-form" data-am-validator action="<c:url value='/security/emergencyeventsmodify.action'/>" method="post">
  
  <table class="am-table am-table-bordered">
      		<tr>
      			<input type="hidden" value="${security.id}" name="id" />
      			<input type="hidden" id = "type" value="${security.type }"/>
      			<td width="10%">记录人</td>
      			<td width="90%" ><input type="text" value="${security.name }" class="am-form-field am-radius" placeholder="请填入记录人姓名" maxlength="20" minlength="1" required name="name" /></td>
      		</tr>
      		<tr>
      			<td>事件类型</td>
      			<td>
      				<select name="type" id="type" value="${security.type }"/>
<!--       				<select required name="type" id="type" /> -->
						<option value ="应急事件">应急事件</option>
						<option value ="突发事件">突发事件</option>
						<option value ="其它事件">其它事件</option>
					</select>
      			</td>
      		</tr>
      		<tr>
      			<td>事件时间</td>
      			<td> 原记录时间 : <fmt:formatDate value="${security.time}" pattern="yyyy-MM-dd HH:mm:ss" /> <input type="text" class="form-datetime-lang am-form-field" <fmt:formatDate value="${security.time}" pattern="yyyy-MM-dd HH:mm:ss" /> placeholder="修改事件发生时间" name="time" /></td>
      		</tr>
      		<tr>
      			<td>备注</td>
      			<td><textarea rows="" cols=""  class="am-form-field am-radius" placeholder="备注" name="note" maxlength="50">${security.note }</textarea></td>
      		</tr>
      			<td colspan="2" align="center">
      				<input type="submit" class="am-btn am-btn-default input-save" value="" />
      			</td>
      		</tr>
      	</table> 
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
	  
	    var type = document.getElementById('type').value;
	    
	    
	    if(type == "应急事件"){
	        $("#type option[value='应急事件']").attr("selected","selected"); 
	    }else if(type == "突发事件"){ 
	        $("#type option[value='突发事件']").attr("selected","selected"); 
	    }else if(type == "其它事件"){
	    	$("#type option[value='其它事件']").attr("selected","selected"); 
	    }
	    

	  $('.form-datetime-lang').datetimepicker({
	    language:  'zh-CN',
	    autoclose: true,
	    todayBtn: true,
	    startDate: '2018-02-14 14:45',
	    format: 'yyyy-mm-dd hh:ii'
	  });
	}(jQuery));
	
</script>
</body>
</html>