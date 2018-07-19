<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>客人换房</title>
<meta name="description" content="这是一个客人换房添加页面">
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
      <ul><img style="margin:-5px 5px 0px 0px;" src="<c:url value='/img/index/menu1.png'/>"> 客人换房</ul>
     <dl class="am-icon-home" style="float: right;">当前位置： <a href='${pageContext.request.contextPath}/mainPage.action' >首页</a> ><a href="#">客人换房</a>
	</dl>
      <!--这里打开的是新页面-->
   
    </div>
<div class="fbneirong" >
<form style="width: 100%" class="am-form" data-am-validator action="<c:url value='/changeroom/changeroomadd.action'/>">
  
  <table class="am-table am-table-bordered">
  				<input type="hidden" name="customerid" value="${livein.customerid }">
  				<input type="hidden" name="roomid" value="${roomid }">
<!--       		<tr> -->
<!--       			<td width="10%">顾客Id</td> -->
<%--       			<td width="90%" ><input type="text" class="am-form-field am-radius" placeholder="顾客 Id" readonly="readonly" value="顾客 Id = ${customerid }"/></td> --%>
<!--       		</tr> -->
      		<tr>
      			<td>入住房间号</td>
      			<td><input type="text" class="am-form-field am-radius" placeholder="入住房间号" name="roomnum" value="${livein.roomnum }" readonly="readonly" maxlength="8" minlength="1"/></td>
      		</tr>
      		<tr>
      			<td width="10%">顾客姓名</td>
      			<td width="90%"><input type="text" class="am-form-field am-radius" placeholder="顾客姓名" readonly="readonly" value="${livein.name }" maxlength="20" minlength="1"/></td>
      		</tr>
      		
      		<tr>
      			<td>更换到房间</td>
      			<td >
      				<input type="text" id="roomnum" class="am-form-field am-radius" placeholder="更换到房间" required name="changetoroom" maxlength="8" minlength="1"/>
      			</td>
      		</tr>
<!--       		<tr> -->
<!--       			<td>更换时间</td> -->
<!--       			<td><input type="text" class="am-form-field am-radius"placeholder="更换时间" required name="changetime"></td> -->
<!--       		</tr> -->
      		<tr>
      			<td>换房原因</td>
      			<td><input type="text" class="am-form-field am-radius" placeholder="换房原因" name="reason" maxlength="50" /></td>
      		</tr>
      		<tr>
      			<td>操作员</td>
      			<td><input type="text" class="am-form-field am-radius" placeholder="操作员" readonly="readonly" value="${user.realname }"></td>
      		</tr>
      		<tr>
      			<td>备注</td>
      			<td><textarea rows="3" cols="" class="am-form-field am-radius" name="note"></textarea></td>
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
	  
// 	  Ajax验证该房间是否为空净房
	  $("#roomnum").blur(function(){
			var roomnum = $("#roomnum").val();
			$.ajax({
				"url":"${pageContext.request.contextPath}/reservation/validRoomNum.action",
				"type":"post",
				"data":{"roomnum":roomnum},
				"async":true,
				"dateType":"json",
				"success":function(res){
					if(res){
						
					}
					else{
						alert("该房间不存在或房间状态不为空净房，暂时无法预定，请核对后再进行操作！");
					}
				}
			});
		});

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