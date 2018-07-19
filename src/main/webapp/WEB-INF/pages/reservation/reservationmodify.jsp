<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>预定信息修改</title>
<meta name="description" content="这是一个预定信息修改页面">
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
      <ul><img style="margin:-5px 5px 0px 0px;" src="<c:url value='/img/index/menu1.png'/>"> 预定信息修改</ul>
     <dl class="am-icon-home" style="float: right;">当前位置： <a href='${pageContext.request.contextPath}/mainPage.action' >首页</a> ><a href="#">入住登记信息修改</a>
	</dl>
      <!--这里打开的是新页面-->
    </div>
<div class="fbneirong" >
<form style="width: 100%" class="am-form" data-am-validator action="<c:url value='/reservation/reservationmodify.action'/>">
  <table class="am-table am-table-bordered">
      			<input type="hidden" value="${reservation.reserveid}" name="reserveid" />
      			<input type="hidden" value="${roomid}" name="roomid" />
      			<input type="hidden" id = "igender" value="${reservation.gender }"/>
      		<tr>
      		
      			<td width="10%">预定房间号</td>
      			<td width="90%"><input type="text" id="roomnum" class="am-form-field am-radius" placeholder="预定房间号" value="${reservation.roomnum }" maxlength="20" minlength="1" required name="roomnum"/></td>
      		</tr>
      		<tr>
      			<td >姓名</td>
      			<td ><input type="text" class="am-form-field am-radius" placeholder="您的姓名" value="${reservation.name }" maxlength="20" minlength="1" required name="name"/></td>
      		</tr>
      		<tr>
      			<td>性别</td>
      			<td>
      				<select required name="gender" id="gender" value="${reservation.gender }"/>
						<option value ="男">男</option>
						<option value ="女">女</option>
					</select>
      			</td>
      		</tr>
      		<tr>
      			<td>身份证号</td>
      			<td><input type="text" id="cardnum" class="am-form-field am-radius" placeholder="身份证号" value="${reservation.cardnum }" required name="cardnum" maxlength="18" minlength="18"></td>
      		</tr>
      		<tr>
      			<td>预定人数</td>
      			<td><input type="number" class="am-form-field am-radius" placeholder="预定人数" step="1" min="1" value="${reservation.numofpeople }" name="numofpeople" ></td>
      		</tr>
      		<tr>
      			<td>到达时间</td>
      			<td>原预计到达时间：<fmt:formatDate value="${reservation.reservationtime}" pattern="yyyy-MM-dd HH:mm:ss" /><input type="text" class="form-datetime-lang am-form-field" placeholder="预计达到时间" name="reservationtime"/></td>
      		</tr>
      		<tr>
      			<td>手机号</td>
      			<td><input type="number" class="am-form-field am-radius" placeholder="手机号" required name="phonenum" value="${reservation.phonenum}" maxlength="11" minlength="11"></td>
      		</tr>
      		<tr>
      			<td>备注</td>
      			<td><textarea rows="" cols=""  class="am-form-field am-radius" placeholder="备注" name="note" maxlength="200">${reservation.note}</textarea></td>
<!--       		</tr> -->
<!--       			<td colspan="2" align="center"> -->
<!--       				<input type="submit" class="am-btn am-btn-default input-save" value="" /> -->
<!--       			</td> -->
<!--       		</tr> -->
			<tr>
      			<td>操作</td>
      			<td  align="center">
      				<input type="submit" class="am-btn am-radius am-btn-xs am-btn-success find-quq" value="修改" />
      				<input type="button" class="am-btn am-radius am-btn-xs am-btn-success find-quq" onclick="reservationToLivein()" value="入住" />
      				<input type="button" class="am-btn am-radius am-btn-xs am-btn-success find-quq" onclick="cancelReservation()" value="取消预定" />
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

	
// 	Ajax验证身份证号是否合法  
	  $("#cardnum").blur(function(){
			var certificatenum = $("#cardnum").val();
			$.ajax({
				"url":"${pageContext.request.contextPath}/guestmanagement/validIdCardtwo.action",
				"type":"post",
				"data":{"certificatenum":certificatenum},
				"async":true,
				"dateType":"json",
				"success":function(res){
					if(res){
//		 				alert("该身份证证件号合法！");
					}
					else{
						alert("身份证号输入有误，为不合法的身份证号，请确认后重新输入！");
					}
				}
			});
		});
//	  Ajax验证该房间是否为空净房
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
						alert("该房间不存在或房间状态不为空净房，暂时无法预定，请核对后重新预定！");
					}
				}
			});
		});
	
	 	var reservationToLivein=function(){
		roomid=${roomid}; 
		reserveid=${reservation.reserveid};
		reserveidAndroomid = reserveid+","+roomid;
		console.log("roomid = "+roomid);
		console.log("reserveid = "+reserveid);
		console.log("reserveidAndroomid = "+reserveidAndroomid);
		
		var url="${pageContext.request.contextPath}/guestmanagement/reservationToLivein.action?reserveidAndroomid="+reserveidAndroomid;		
      	window.location.href=url;
  	}
		var cancelReservation=function(){
		roomid=${roomid};
		reserveid=${reservation.reserveid};
		reserveidAndroomid = reserveid+","+roomid;
		console.log("roomid 2 = "+roomid);
		console.log("reserveid 2 = "+reserveid);
		console.log("reserveidAndroomid 2 = "+reserveidAndroomid);
		var url="${pageContext.request.contextPath}/reservation/cancelReservation.action?reserveidAndroomid="+reserveidAndroomid;		
      window.location.href=url;
 	}
		
		var gender = document.getElementById('igender').value;
		console.log(gender);
	if(gender == "男"){
	    $("#gender option[value='男']").attr("selected","selected"); 
	    console.log("1"+gender);

	}else {
	    $("#gender option[value='女']").attr("selected","selected"); 
	    console.log("2"+gender);
	}
    
</script>
	
</body>
</html>