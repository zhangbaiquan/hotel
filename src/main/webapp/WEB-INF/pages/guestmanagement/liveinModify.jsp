<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>入住信息修改</title>
<meta name="description" content="这是一个入住信息修改页面">
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
      <ul><img style="margin:-5px 5px 0px 0px;" src="<c:url value='/img/index/menu1.png'/>"> 入住信息修改</ul>
     <dl class="am-icon-home" style="float: right;">当前位置： <a href='${pageContext.request.contextPath}/mainPage.action' >首页</a> ><a href="#">入住登记信息修改</a>
	</dl>
      <!--这里打开的是新页面-->
    </div>
<div class="fbneirong" >
<form style="width: 100%" class="am-form" data-am-validator action="<c:url value='/guestmanagement/modify.action'/>">
  <table class="am-table am-table-bordered">
      		<tr>
      			<input type="hidden" value="${livein.customerid}" name="customerid" />
      			<input type="hidden" value="${roomid}" name="roomid" />
      			<input type="hidden" id = "igender" value="${livein.gender }"/>
      			<input type="hidden" id = "imembertype" value="${livein.membertype }"/>
      			<input type="hidden" id = "icertificatetype" value="${livein.certificatetype }"/>
      		</tr>
      		<tr>
      			<td width="10%">顾客姓名</td>
      			<td width="90%" ><input type="text" class="am-form-field am-radius" placeholder="请填入入住客人姓名"  value="${livein.name }" name="name" maxlength="20" minlength="1"/></td>
      		</tr>
      		<tr>
      			<td width="10%">入住房间号</td>
      			<td width="90%" ><input type="text" class="am-form-field am-radius" placeholder="${roomnum }"  value="${livein.roomnum }" name="roomnum" /></td>
      		</tr>
      		<tr>
      			<td>顾客性别</td>
      			<td>
<%--       				<input type="text" class="am-form-field am-radius" placeholder="性别" value="${livein.gender }" name="gender"/> --%>
      				<select required name="gender" id="gender" value="${livein.gender }"/>
						<option value ="男">男</option>
						<option value ="女">女</option>
					</select>
      			</td>
      		</tr>
      		<tr>
      			<td>证件类型</td>
      			<td >
<%--       			<input type="text" class="am-form-field am-radius" placeholder="证件类型" value="${livein.certificatetype }" name="certificatetype"/> --%>
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
      			<td><input type="text" id="certificatenum" class="am-form-field am-radius"placeholder="证件号" value="${livein.certificatenum }" name="certificatenum"></td>
      		</tr>
      		<tr>
      			<td>押金</td>
      			<td><input type="number" class="am-form-field am-radius"placeholder="押金" value="${livein.deposit }" name="deposit" step="0.01" min="0" maxlength="5"></td>
      		</tr>
      		<tr>
      			<td>会员类型</td>
      			<td>
<%--       					<input type="text" class="am-form-field am-radius" placeholder="会员类型" value="${livein.membertype }" name="membertype"> --%>
					<select required name="membertype" id="membertype" value="${livein.membertype }" />
						<option value ="普通会员">普通会员</option>
						<option value ="银卡会员">银卡会员</option>
						<option value ="金卡会员">金卡会员</option>
						<option value ="铂金会员">铂金会员</option>
					</select>
					
      			</td>
      		</tr>
      		<tr>
      			<td>手机号</td>
      			<td><input type="number" class="am-form-field am-radius" placeholder="手机号" value="${livein.ex2 }" name="ex2" maxlength="11" minlength="11"></td>
      		</tr>
      		<tr>
      			<td>备注</td>
      			<td><textarea type="text" class="am-form-field am-radius" placeholder="备注" name="note" maxlength="50">${livein.note }</textarea></td>
<!--       		</tr> -->
<!--       			<td colspan="2" align="center"> -->
<!--       				<input type="submit" class="am-btn am-btn-default input-save" value="" /> -->
<!--       			</td> -->
<!--       		</tr> -->
			</tr>
      		<tr>
      			<td>操作</td>
      			<td  align="center">
      				<input type="submit" class="am-btn am-radius am-btn-xs am-btn-success find-quq" value="修改" />
      				<input type="button" class="am-btn am-radius am-btn-xs am-btn-success find-quq" onclick="checkout()" value="退房" />
      				<input type="button" class="am-btn am-radius am-btn-xs am-btn-success find-quq" onclick="changeroom()" value="换房" />
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

	var checkout=function(){
// 		roomid=o.id;
		roomid=${roomid};
		customerid=${livein.customerid};
// 		alert(customerid);
		customeridAndroomid = customerid+","+roomid;
// 		var url="${pageContext.request.contextPath}/guestmanagement/toreservation.action?customeridAndroomid="+customeridAndroomid;		
// 		var url="${pageContext.request.contextPath}/guestmanagement/toreservation.action?customeridAndroomid="+customeridAndroomid;		
		var url="${pageContext.request.contextPath}/guestmanagement/checkout.action?customeridAndroomid="+customeridAndroomid;		
        window.location.href=url;
    }
	var changeroom=function(){
// 		roomid=o.id;
		roomid=${roomid};
		customerid=${livein.customerid};
// 		alert(customerid);
		customeridAndroomid = customerid+","+roomid;
// 		alert(customeridAndroomid);
		var url="${pageContext.request.contextPath}/changeroom/tochangeroomadd.action?customeridAndroomid="+customeridAndroomid;		
// 		var url="${pageContext.request.contextPath}/guestmanagement/checkout.action?roomid="+roomid;		
        window.location.href=url;
    }
	
	//Ajax验证身份证号是否合法
	$(function() {

		$("#certificatetype").bind("change",function(){
		    if($(this).val()==0){
		      return;
		    }
		    else{
//	 	    	var certificatetype = $("#certificatetype").val();
		    	var certificatetype = $(this).find("option:selected").text();
//	 	    	alert(certificatetype);
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
//					 				alert("该身份证证件号合法！");
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
	
    var gender = document.getElementById('igender').value;
    var membertype = document.getElementById('imembertype').value;
    var certificatetype = document.getElementById('icertificatetype').value;
//     alert(sv);
		console.log(gender);
    if(gender == "男"){
        $("#gender option[value='男']").attr("selected","selected"); 
        console.log("1"+gender);
//         $("#gender").find("option[女="+"]").attr("selected",true);
//         $("#gender option[value='男']").attr('selected',true);
    }else {
        $("#gender option[value='女']").attr("selected","selected"); 
//         $("#gender").find("option[女="+"]").attr("selected",true);
        console.log("2"+gender);
    }
    
    if(membertype == "普通会员"){
        $("#membertype option[value='普通会员']").attr("selected","selected"); 
    }else if(membertype == "银卡会员"){ 
        $("#membertype option[value='银卡会员']").attr("selected","selected"); 
    }else if(membertype == "金卡会员"){
    	$("#membertype option[value='金卡会员']").attr("selected","selected"); 
    }else if(membertype == "铂金会员"){
    	$("#membertype option[value='铂金会员']").attr("selected","selected"); 
    }
    
    if(certificatetype == "身份证"){
        $("#certificatetype option[value='身份证']").attr("selected","selected"); 
    }else if(certificatetype == "护照"){ 
        $("#certificatetype option[value='护照']").attr("selected","selected"); 
    }else if(certificatetype == "贵宾卡"){
    	$("#certificatetype option[value='贵宾卡']").attr("selected","selected"); 
    }
   
    
</script>
</body>
</html>