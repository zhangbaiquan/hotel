<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>客房房态图</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="客房房态图">
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
	<div class="admin-biaogelist" style="position: static;">
		<div class="listbiaoti am-cf">
			<ul>
				<img style="margin: -5px 5px 0px 0px;" src="<c:url value='/img/index/menu0.png'/>">客房房态图
			</ul>

			<dl class="am-icon-home" style="float: right;">当前位置： <a href='${pageContext.request.contextPath}/mainPage.action' >首页</a> ><a href="#">客房房态图</a>
			</dl>
<!-- 			<input type="button" onclick="javascript:window.location.reload()" value="刷新" /> -->
			<!--这里打开的是新页面-->
		</div>
		<form id="search" action="<c:url value='/roommanagement/realtime_room.action'/>" method="post">
			<input type="hidden" name="page" value="" />
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
		<div id="room" class="room">
			<div id="B201" class="one">
				<p class="room_num">
					<font>B201</font>
				</p>
				<p class="roon_info">
					<font>标准单人间</font>
				</p>
			</div>
			<div id="B202" class="one">
				<p class="room_num">
					<font>B202</font>
				</p>
				<p class="roon_info">
					<font>标准单人间</font>
				</p>
			</div>
			<div id="B203" class="one">
				<p class="room_num">
					<font>B203</font>
				</p>
				<p class="roon_info">
					<font>标准单人间</font>
				</p>
			</div>
			<div id="B204" class="one">
				<p class="room_num">
					<font>B204</font>
				</p>
				<p class="roon_info">
					<font>标准单人间</font>
				</p>
			</div>
			<div id="B205" class="one">
				<p class="room_num">
					<font>B205</font>
				</p>
				<p class="roon_info">
					<font>标准单人间</font>
				</p>
			</div>
			<div id="B206" class="one">
				<p class="room_num">
					<font>B206</font>
				</p>
				<p class="roon_info">
					<font>标准单人间</font>
				</p>
			</div>
			<div id="B207" class="one">
				<p class="room_num">
					<font>B207</font>
				</p>
				<p class="roon_info">
					<font>标准单人间</font>
				</p>
			</div>
			<div id="B208" class="one">
				<p class="room_num">
					<font>B208</font>
				</p>
				<p class="roon_info">
					<font>标准单人间</font>
				</p>
			</div>
			<div id="B209" class="one">
				<p class="room_num">
					<font>B209</font>
				</p>
				<p class="roon_info">
					<font>标准单人间</font>
				</p>
			</div>

			<br />

			<div id="B301" class="one">
				<p class="room_num">
					<font>B301</font>
				</p>
				<p class="roon_info">
					<font>标准单人间</font>
				</p>
			</div>
			<div id="B302" class="one">
				<p class="room_num">
					<font>B302</font>
				</p>
				<p class="roon_info">
					<font>标准单人间</font>
				</p>
			</div>
			<div id="B303" class="one">
				<p class="room_num">
					<font>B303</font>
				</p>
				<p class="roon_info">
					<font>标准单人间</font>
				</p>
			</div>
			<div id="B304" class="one">
				<p class="room_num">
					<font>B304</font>
				</p>
				<p class="roon_info">
					<font>标准单人间</font>
				</p>
			</div>
			<div id="B305" class="one">
				<p class="room_num">
					<font>B305</font>
				</p>
				<p class="roon_info">
					<font>标准单人间</font>
				</p>
			</div>
			<div id="B306" class="one">
				<p class="room_num">
					<font>B306</font>
				</p>
				<p class="roon_info">
					<font>标准单人间</font>
				</p>
			</div>
			<div id="B307" class="one">
				<p class="room_num">
					<font>B307</font>
				</p>
				<p class="roon_info">
					<font>标准单人间</font>
				</p>
			</div>
			<div id="B308" class="one">
				<p class="room_num">
					<font>B308</font>
				</p>
				<p class="roon_info">
					<font>标准单人间</font>
				</p>
			</div>
			<div id="B309" class="one">
				<p class="room_num">
					<font>B309</font>
				</p>
				<p class="roon_info">
					<font>标准单人间</font>
				</p>
			</div>

			<br />

			<div id="B401" class="two">
				<p class="room_num">
					<font>B401</font>
				</p>
				<p class="roon_info">
					<font>标准双人间</font>
				</p>
			</div>
			<div id="B402" class="two">
				<p class="room_num">
					<font>B402</font>
				</p>
				<p class="roon_info">
					<font>标准双人间</font>
				</p>
			</div>
			<div id="B403" class="two">
				<p class="room_num">
					<font>B403</font>
				</p>
				<p class="roon_info">
					<font>标准双人间</font>
				</p>
			</div>
			<div id="B404" class="two">
				<p class="room_num">
					<font>B404</font>
				</p>
				<p class="roon_info">
					<font>标准双人间</font>
				</p>
			</div>
			<div id="B405" class="two">
				<p class="room_num">
					<font>B405</font>
				</p>
				<p class="roon_info">
					<font>标准双人间</font>
				</p>
			</div>
			<div id="B406" class="two">
				<p class="room_num">
					<font>B406</font>
				</p>
				<p class="roon_info">
					<font>标准双人间</font>
				</p>
			</div>
			<div id="B407" class="two">
				<p class="room_num">
					<font>B407</font>
				</p>
				<p class="roon_info">
					<font>标准双人间</font>
				</p>
			</div>
			<div id="B408" class="two">
				<p class="room_num">
					<font>B408</font>
				</p>
				<p class="roon_info">
					<font>标准双人间</font>
				</p>
			</div>
			<div id="B409" class="two">
				<p class="room_num">
					<font>B409</font>
				</p>
				<p class="roon_info">
					<font>标准双人间</font>
				</p>
			</div>

			<br />

			<div id="B501" class="two">
				<p class="room_num">
					<font>B501</font>
				</p>
				<p class="roon_info">
					<font>标准双人间</font>
				</p>
			</div>
			<div id="B502" class="two">
				<p class="room_num">
					<font>B502</font>
				</p>
				<p class="roon_info">
					<font>标准双人间</font>
				</p>
			</div>
			<div id="B503" class="two">
				<p class="room_num">
					<font>B503</font>
				</p>
				<p class="roon_info">
					<font>标准双人间</font>
				</p>
			</div>
			<div id="B504" class="two">
				<p class="room_num">
					<font>B504</font>
				</p>
				<p class="roon_info">
					<font>标准双人间</font>
				</p>
			</div>
			<div id="B505" class="two">
				<p class="room_num">
					<font>B505</font>
				</p>
				<p class="roon_info">
					<font>标准双人间</font>
				</p>
			</div>
			<div id="B506" class="two">
				<p class="room_num">
					<font>B506</font>
				</p>
				<p class="roon_info">
					<font>标准双人间</font>
				</p>
			</div>
			<div id="B507" class="two">
				<p class="room_num">
					<font>B507</font>
				</p>
				<p class="roon_info">
					<font>标准双人间</font>
				</p>
			</div>
			<div id="B508" class="two">
				<p class="room_num">
					<font>B508</font>
				</p>
				<p class="roon_info">
					<font>标准双人间</font>
				</p>
			</div>
			<div id="B509" class="two">
				<p class="room_num">
					<font>B509</font>
				</p>
				<p class="roon_info">
					<font>标准双人间</font>
				</p>
			</div>

			<br />
			<div id="B601" class="three">
				<p class="room_num">
					<font>B601</font>
				</p>
				<p class="roon_info">
					<font>特惠大床房</font>
				</p>
			</div>
			<div id="B602" class="three">
				<p class="room_num">
					<font>B602</font>
				</p>
				<p class="roon_info">
					<font>特惠大床房</font>
				</p>
			</div>
			<div id="B603" class="three">
				<p class="room_num">
					<font>B603</font>
				</p>
				<p class="roon_info">
					<font>特惠大床房</font>
				</p>
			</div>
			<div id="B604" class="three">
				<p class="room_num">
					<font>B604</font>
				</p>
				<p class="roon_info">
					<font>特惠大床房</font>
				</p>
			</div>
			<div id="B605" class="three">
				<p class="room_num">
					<font>B605</font>
				</p>
				<p class="roon_info">
					<font>特惠大床房</font>
				</p>
			</div>
			<div id="B606" class="three">
				<p class="room_num">
					<font>B606</font>
				</p>
				<p class="roon_info">
					<font>特惠大床房</font>
				</p>
			</div>
			<div id="B607" class="three">
				<p class="room_num">
					<font>B607</font>
				</p>
				<p class="roon_info">
					<font>特惠大床房</font>
				</p>
			</div>
			<div id="B608" class="three">
				<p class="room_num">
					<font>B608</font>
				</p>
				<p class="roon_info">
					<font>特惠大床房</font>
				</p>
			</div>
			<div id="B609" class="three">
				<p class="room_num">
					<font>B609</font>
				</p>
				<p class="roon_info">
					<font>特惠大床房</font>
				</p>
			</div>

			<br />

			<div id="B701" class="four">
				<p class="room_num">
					<font>B701</font>
				</p>
				<p class="roon_info">
					<font>豪华大床房</font>
				</p>
			</div>
			<div id="B702" class="four">
				<p class="room_num">
					<font>B702</font>
				</p>
				<p class="roon_info">
					<font>豪华大床房</font>
				</p>
			</div>
			<div id="B703" class="four">
				<p class="room_num">
					<font>B703</font>
				</p>
				<p class="roon_info">
					<font>豪华大床房</font>
				</p>
			</div>
			<div id="B704" class="four">
				<p class="room_num">
					<font>B704</font>
				</p>
				<p class="roon_info">
					<font>豪华大床房</font>
				</p>
			</div>
			<div id="B705" class="four">
				<p class="room_num">
					<font>B705</font>
				</p>
				<p class="roon_info">
					<font>豪华大床房</font>
				</p>
			</div>
			<div id="B706" class="four">
				<p class="room_num">
					<font>B706</font>
				</p>
				<p class="roon_info">
					<font>豪华大床房</font>
				</p>
			</div>
			<div id="B707" class="four">
				<p class="room_num">
					<font>B707</font>
				</p>
				<p class="roon_info">
					<font>豪华大床房</font>
				</p>
			</div>
			<div id="B708" class="four">
				<p class="room_num">
					<font>B708</font>
				</p>
				<p class="roon_info">
					<font>豪华大床房</font>
				</p>
			</div>
			<div id="B709" class="four">
				<p class="room_num">
					<font>B709</font>
				</p>
				<p class="roon_info">
					<font>豪华大床房</font>
				</p>
			</div>
		</div>
	</div>
	<!--[if lt IE 9]>
<script src="http://libs.baidu.com/jquery/1.11.1/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="assets/js/polyfill/rem.min.js"></script>
<script src="assets/js/polyfill/respond.min.js"></script>
<script src="assets/js/amazeui.legacy.js"></script>
<![endif]-->

	<!--[if (gte IE 9)|!(IE)]><!-->
	<script src="<c:url value='/assets/js/amazeui.min.js'/>"></script>
</body>
<script>
	
</script>
</html>