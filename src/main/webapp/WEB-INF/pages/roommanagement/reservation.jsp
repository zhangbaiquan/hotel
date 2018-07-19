<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>实时房态列表</title>
    <meta name="description" content="实时房态列表">
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
        <ul><img style="margin:-5px 5px 0px 0px;" src="<c:url value='/img/index/menu0.png'/>">实时房态列表</ul>

        <dl class="am-icon-home" style="float: right;">当前位置： <a href='${pageContext.request.contextPath}/mainPage.action' >首页</a> > <a href="#">实时房态列表</a></dl>

        <!--这里打开的是新页面-->
    </div>

	<form id="search" action="<c:url value='/roommanagement/realtime_data.action'/>" method="post">
		<input type="hidden" name="page" value=""/>
	    <div class="am-btn-toolbars am-btn-toolbar am-kg am-cf">
	        <ul>
	            <li>
					<input class="gjz-quq" name="roomnum" value="${roomnum }" class="am-form-field am-input-sm am-input-xm" placeholder="房间号查询" />
	            </li>
	            <li>
	    			<select class="xlk-quq" name="floor">
						<option value="">房间楼层</option>
						<option value="2楼">2楼</option>
						<option value="3楼">3楼</option>
						<option value="4楼">4楼</option>
						<option value="5楼">5楼</option>
						<option value="6楼">6楼</option>
						<option value="7楼">7楼</option>
						<option value="8楼">8楼</option>
						<option value="9楼">9楼</option>
					</select>
	            </li>
	            <li>
	            	<select class="xlk-quq" name="state">
						<option value="">房间状态</option>
						<option value="空净房">空净房</option>
						<option value="已入住">已入住</option>
						<option value="脏房">脏房</option>
					</select>
	            </li>
	            <li>
	            	<select class="xlk-quq" name="type">
						<option value="">房间类型</option>
						<option value="标准单人间">标准单人间</option>
						<option value="标准双人间">标准双人间</option>
						<option value="特惠大床房">特惠大床房</option>
						<option value="豪华大床房">豪华大床房</option>
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
						<div id="${room.roomid }" class="one"  onclick="method(this)" >
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
							d.style.backgroundColor = "yellow";
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
		<div class="dirty">
			<p class="roon_info">
				<font>脏房</font>
			</p>
		</div>
		
	</div>
</div>
		<br /><br />

</div>
<!--[if (gte IE 9)|!(IE)]><!-->

</body>
<script src="<c:url value='/assets/js/amazeui.min.js'/>"></script>
<script>

    $(function () {
        $("button[look]").click(function(){
            $("#modalLook").modal("open");
        });
    });
    
    var compaire=function(){
    	var beginDate=$("input[name='beginDate']").val();  
    	 var endDate=$("input[name='endDate']").val();  
    	 var d1 = new Date(beginDate.replace(/\-/g, "\/"));  
    	 var d2 = new Date(endDate.replace(/\-/g, "\/"));  

    	  if(beginDate!=""&&endDate!=""&&d1 >=d2)  
    	 {  
    	  alert("开始时间不能大于结束时间！");  
    	  return false;  
    	 }
    	  else{
    		  $("form").submit();
    	  }
    }
    var manuallyAdd=function(){
    	$("form").submit();
    	
    }
    
	var method=function(o){
		
		
		roomid=o.id;
		var url="${pageContext.request.contextPath}/roommanagement/room.action?roomid="+roomid;		
        window.location.href=url;
    }
	
	
    $(document).ready(function(){
		$("#checkAll").click(function(){
        	if($(this).is(':checked')){
        		$(".mychk").each(function(){
        			this.checked=true;
        		});
        	}else{
        		$(".mychk").each(function(){
        			this.checked=false;
        		});
        	}
        });
	});

    
    var deletechecked=function(){
        var roomids="";
           	$("input[name='roomid']").each(function(){
           		if($(this).prop("checked")){
           			roomids=roomids+$(this).val()+",";
           		}    		
           	})
    
    if(roomids==""){
   		alert("请至少选择一条记录！！");
   		return;
   	}
   	if(confirm("您确认要删除所有选中项？")){
   		$.ajax({
//    		url:"deletelist.action?roomids="+roomids,
   			url:"${pageContext.request.contextPath}/roommanagement/deletelist.action?roomids="+roomids,
   			type:"POST",
   			success:function(result){
   				if(result=="success"){
   					alert("删除成功！");
   					window.location.reload();
   				}else{
   					alert("删除失败！");
   				}
   			}		
   		})
   	}
   }; 	
    
</script>
</html>