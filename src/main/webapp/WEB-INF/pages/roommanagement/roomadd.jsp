<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>新增房间</title>
<meta name="description" content="这是一个新增房间添加页面">
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
      <ul><img style="margin:-5px 5px 0px 0px;" src="<c:url value='/img/index/menu0.png'/>"> 新增房间</ul>
     

      <!--这里打开的是新页面-->
   
    </div>
<div class="fbneirong" >
<form style="width: 100%" class="am-form" data-am-validator action="<c:url value='/roommanagement/roomadd.action'/>" method="post">
  
  <table class="am-table am-table-bordered">
      		<tr>
      			<td width="10%">房间号</td>
      			<td width="90%" ><input type="text" class="am-form-field am-radius" placeholder="请填入新增房间号，例如：B603" required name="roomnum" /></td>
      		</tr>
      		<tr>
      			<td>房间楼层</td>
      			<td><input type="text" class="am-form-field am-radius" placeholder="房间楼层，例如 ：6楼" required name="floor"/></td>
      		</tr>
      		<tr>
      			<td>房间类型</td>
      			<td >
      				<input type="text" class="am-form-field am-radius" placeholder="房间类型，例如：标准单人间" required name="type"/>
      			</td>
      		</tr>
      		<tr>
      			<td>房间价格</td>
      			<td><input type="number" class="am-form-field am-radius" placeholder="房间价格" step="0.01" min="0" required name="price" maxlength="5"></td>
      		</tr>
      		<tr>
      			<td>房间状态</td>
      			<td>
<!--       				<input type="text" class="am-form-field am-radius" placeholder="房间状态，下拉选择，默认请选择空净房" required name="state"> -->
      				<select id="state" required name="state"/>
						<option value ="">房间状态：（默认请选择空净房）</option>
						<option value ="空净房">空净房</option>
						<option value ="已预定">已预定</option>
						<option value ="已入住">已入住</option>
						<option value ="脏房">脏房</option>
					</select>
      			</td>
      		</tr>
<!--       		<tr> -->
<!--       			<td>是否有预定</td> -->
<!--       			<td><input type="text" class="am-form-field am-radius" placeholder="是否有预定" readonly="readonly" required name="isreservation" value="未预定"></td> -->
<!--       		</tr> -->
      		<tr>
      			<td>房间说明</td>
      			<td><textarea rows="" cols=""  class="am-form-field am-radius" placeholder="房间说明" name="instructions"></textarea></td>
      		</tr>
      		
<!--       		<tr> -->
<!--       			<td>时间</td> -->
<%--       			 <%   --%>
<!-- //       			java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(     -->
<!-- //    				     "yyyy-MM-dd HH:mm:ss");     -->
<!-- //    				   java.util.Date currentTime = new java.util.Date();     -->
<!-- //    				   String time = simpleDateFormat.format(currentTime).toString();   -->
<!-- //    				   out.println("当前时间为："+time);    -->
<%--      			%>   --%>
<%--       			<td ><input type="text" class=" am-form-field" readonly="readonly" placeholder="<%out.println("当前时间为："+time); %>"/></td> --%>
<!--       		</tr> -->
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