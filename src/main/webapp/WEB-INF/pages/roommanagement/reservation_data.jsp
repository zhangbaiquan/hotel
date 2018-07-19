<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>预定实时房态图</title>
    <meta name="description" content="预定实时房态图">
<meta name="keywords" content="index">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<meta name="renderer" content="webkit">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="icon" type="image/png"
	href="<c:url value='/assets/i/favicon.png'/>">
<link rel="apple-touch-icon-precomposed"
	href="<c:url value='/assets/i/app-icon72x72@2x.png'/>">
<meta name="apple-mobile-web-app-title" content="Amaze UI" />
<link rel="stylesheet" href="<c:url value='/css/realtime_room.css'/>">
<link rel="stylesheet" href="<c:url value='/bootstrap-3.3.7-dist/css/bootstrap.min.css'/>">
<link rel="stylesheet" href="<c:url value='/assets/css/amazeui.min.css'/>">
<link rel="stylesheet" href="<c:url value='/assets/css/admin.css'/>">
<link rel="stylesheet" href="<c:url value='/diagram-viewer/inputtop.css'/>">
<script src="<c:url value='/assets/js/jquery.min.js'/>"></script>
<script src="<c:url value='/assets/js/app.js'/>"></script>
<script src="<c:url value='/js/jqPaginator.js'/>"></script>
<script src="<c:url value='/js/jquery.min.js'/>"></script>
<script src="<c:url value='/bootstrap-3.3.7-dist/js/bootstrap.min.js'/>"></script>
<script src="<c:url value='/js/realtime_room.js'/>"></script>
</head>
<body>
<style>
.box{
	margin-left: 10px;
	margin-top: 10px;
	height: 500px;
/* 	height: auto; */
	min-height: 450px;
	min-width :1490px;
	width: 100%;
}
.box .divHeight {
	float: left;
	margin-left: 10px;
	margin-top: 10px;
	height: 450px;
	height: auto;
	min-height: 450px;
	width: 1050px;
	display:inline-block;
}
.box .room_instruct{
 	float: right;
 	margin-right: 50px;
	margin-top: 10px;
	height: 450px;
	height: auto;
	min-height: 450px;
	width: 300px;
/* 	display:inline-block; */
	background-color: #FCFCFC;

}
</style>
<div class="admin-biaogelist" style="position: static;">

    <div class="listbiaoti am-cf">
        <ul><img style="margin:-5px 5px 0px 0px;" src="<c:url value='/img/index/menu1.png'/>">预定实时房态图</ul>

        <dl class="am-icon-home" style="float: right;">当前位置： <a href='${pageContext.request.contextPath}/mainPage.action' >首页</a> > <a href="#">预定实时房态图</a></dl>

        <!--这里打开的是新页面-->
    </div>

	<form id="search" action="<c:url value='/roommanagement/reservation.action'/>" method="post">
		<input type="hidden" name="page" value=""/>
	    <div class="am-btn-toolbars am-btn-toolbar am-kg am-cf">
	        <ul>
	            <li>
					<input class="gjz-quq" name="roomnum" value="${roomnum}" class="am-form-field am-input-sm am-input-xm" placeholder="房间号查询" />
	            </li>
	            <li>
	    			<select class="xlk-quq" name="floor" value="${floor }">
						<option value="">房间楼层</option>
						<option value="2楼" ${floor.equals("2楼")?"selected='selected'":""}>2楼</option>
						<option value="3楼" ${floor.equals("3楼")?"selected='selected'":""}>3楼</option>
						<option value="4楼" ${floor.equals("4楼")?"selected='selected'":""}>4楼</option>
						<option value="5楼" ${floor.equals("5楼")?"selected='selected'":""}>5楼</option>
						<option value="6楼" ${floor.equals("6楼")?"selected='selected'":""}>6楼</option>
						<option value="7楼" ${floor.equals("7楼")?"selected='selected'":""}>7楼</option>
						<option value="8楼" ${floor.equals("8楼")?"selected='selected'":""}>8楼</option>
						<option value="9楼" ${floor.equals("9楼")?"selected='selected'":""}>9楼</option>
					</select>
	            </li>
	            <li>
	            	<select class="xlk-quq" name="state" value="${state }">
						<option value="">房间状态</option>
						<option value="空净房" ${state.equals("空净房")?"selected='selected'":""}>空净房</option>
						<option value="已入住" ${state.equals("已入住")?"selected='selected'":""}>已入住</option>
						<option value="已预定" ${state.equals("已预定")?"selected='selected'":""}>已预定</option>
						<option value="脏房" ${state.equals("脏房")?"selected='selected'":""}>脏房</option>
					</select>
	            </li>
	            <li>
	            	<select class="xlk-quq" name="type" >
						<option value="">房间类型</option>
						<option value="标准单人间" ${type.equals("标准单人间")?"selected='selected'":""}>标准单人间</option>
						<option value="标准双人间" ${type.equals("标准双人间")?"selected='selected'":""}>标准双人间</option>
						<option value="特惠大床房" ${type.equals("特惠大床房")?"selected='selected'":""}>特惠大床房</option>
						<option value="豪华大床房" ${type.equals("豪华大床房")?"selected='selected'":""}>豪华大床房</option>
					</select>
	            </li>
	
	             <li><button onclick="compaire()"  class="am-btn am-radius am-btn-xs am-btn-success find-quq"><span class="find-quq find">搜索</span></button></li> 
	        </ul>
	    </div>
	</form>
	
<!--     <div class="am-form am-g"> -->
 <div class="box">
	<div class="divHeight">
	 <c:forEach items="${paging.list}" var="room"  varStatus="status">
	 
					<c:choose>
					<c:when test="${room.type eq '标准单人间' }">
						<div id="${room.roomid }" class="one" onclick="method(this)">
						<p class="room_num">
							<font>${room.roomnum }</font>
						</p>
						<p class="roon_info" >
							<font>${room.type }</font>
						</p>
						</div>
						
					</c:when>
					<c:when test="${room.type eq '标准双人间' }">
						<div id="${room.roomid }" class="two" onclick="method(this)">
						<p class="room_num">
							<font>${room.roomnum }</font>
						</p>
						<p class="roon_info" >
							<font>${room.type }</font>
						</p>
						</div>
					</c:when>
					<c:when test="${room.type eq '特惠大床房' }">
						<div id="${room.roomid }" class="three" onclick="method(this)">
						<p class="room_num">
							<font>${room.roomnum }</font>
						</p>
						<p class="roon_info" >
							<font>${room.type }</font>
						</p>
						</div>
					</c:when>
					<c:when test="${room.type eq '豪华大床房' }">
						<div id="${room.roomid }" class="four" onclick="method(this)">
						<p class="room_num">
							<font>${room.roomnum }</font>
						</p>
						<p class="roon_info" >
							<font>${room.type }</font>
						</p>
						</div>
					</c:when>
					</c:choose>
					
					
					<c:choose>
						<c:when test="${room.state eq '脏房' }">
							<script type="text/javascript">
							var roomid = ${room.roomid };
							var d = document.getElementById(roomid);
							d.style.backgroundColor = "red";
							</script>
						</c:when>
						<c:when test="${room.state eq '已入住' }">
							<script type="text/javascript">
							var roomid = ${room.roomid };
							var d = document.getElementById(roomid);
							d.style.backgroundColor = "blue";
							</script>
						</c:when>
						<c:when test="${room.state eq '已预定' }">
							<script type="text/javascript">
							var roomid = ${room.roomid };
							var d = document.getElementById(roomid);
							d.style.backgroundColor = "#FF79BC";
							</script>
						</c:when>
					</c:choose>
            </c:forEach>
	</div>
	<div class="room_instruct">
		<div class="emptynetroom">
			<p class="roon_info">
				<font>空净房</font>
			</p>
		</div>
		<div class="livein">
			<p class="roon_info">
				<font>已入住</font>
			</p>
		</div>
		<div class="reservation">
			<p class="roon_info">
				<font>已预定</font>
			</p>
		</div>
		<div class="dirty">
			<p class="roon_info">
				<font>脏房</font>
			</p>
		</div>
	</div>
</div>
		<br /><br />

</div>

</body>
<script src="<c:url value='/assets/js/amazeui.min.js'/>"></script>
<script>

    $(function () {
        $("button[look]").click(function(){
            $("#modalLook").modal("open");
        });
    });
    
    
	var method=function(o){
		roomid=o.id;
		
		$.ajax({
   			url:"${pageContext.request.contextPath}/roommanagement/getstate.action?roomid="+roomid,
   			type:"POST",
   			success:function(result){
   				console.log("result = "+result);
   				if(result=="EMPTYNETROOM"){
   					var url="${pageContext.request.contextPath}/reservation/toreservationgrap.action?roomid="+roomid;		
   			        window.location.href=url;
   				}else if(result=="RESERVATION"){
//    					reserveid=${reservation.reserveid};
//   			 		alert(reserveid);
//    					reserveidAndroomid = reserveid+","+roomid;
   					var url="${pageContext.request.contextPath}/reservation/toreservationModify.action?roomid="+roomid;		
//    					var url="${pageContext.request.contextPath}/reservation/toreservationModify.action?reserveidAndroomid="+reserveidAndroomid;		
   			        window.location.href=url;
   				}else{
   					alert("该房间您不可操作！");
   				}
   			}		
   		})
   	}
		
</script>
</html>