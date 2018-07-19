<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>退房客人信息</title>
<meta name="description" content="这是一个入已退房重置为空净房页面">
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
      <ul><img style="margin:-5px 5px 0px 0px;" src="<c:url value='/img/index/menu1.png'/>"> 退房客人信息</ul>
     

      <!--这里打开的是新页面-->
   
    </div>
<div class="fbneirong" >
<form style="width: 100%" class="am-form" data-am-validator action="<c:url value='/guestmanagement/checkoutToEmpty.action'/>">
	<input type="hidden" name="roomid" value="${roomid }">
	<input type="hidden" name="roomnum" value="${roomnum }">
  	<table class="am-table am-table-bordered">
  			<tr>
  				<a class="am-buttom" type="buttom" onclick="javascript:history.back(-1)">返回</a>
  			</tr>
      		<tr>
      			<td width="10%">顾客姓名</td>
      			<td width="90%" >${livein.name }</td>
      		</tr>
      		<tr>
      			<td width="10%">房间号</td>
      			<td width="90%" >${livein.roomnum }</td>
      		</tr>
      		<tr>
      			<td>顾客性别</td>
      			<td>${livein.gender }</td>
      		</tr>
      		<tr>
      			<td>入住时间</td>
      			<td ><fmt:formatDate value="${livein.checkintime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
      		</tr>
      		<tr>
      			<td>退房时间</td>
      			<td ><fmt:formatDate value="${livein.leavetime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
      		</tr>
      		<tr>
      			<td>证件类型</td>
      			<td >${livein.certificatetype }</td>
      		</tr>
      		<tr>
      			<td>证件号</td>
      			<td>${livein.certificatenum }</td>
      		</tr>
      		<tr>
      			<td>会员类型</td>
      			<td>${livein.membertype }</td>
      		</tr>
      		<tr>
      			<td>押金</td>
      			<td>${livein.deposit }</td>
      		</tr>
      		<tr>
      			<td>手机号</td>
      			<td>${livein.ex2 }</td>
      		</tr>
      		<tr>
      			<td>备注</td>
      			<td>${livein.note }</td>
      		</tr>
      		<tr>
      			<td colspan="2" align="center">
      				<input type="submit" class="am-btn am-radius am-btn-xs am-btn-success find-quq" onclick="checkout()" value="已打扫" />
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