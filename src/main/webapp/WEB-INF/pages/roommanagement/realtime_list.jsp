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
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="icon" type="image/png" href="<c:url value='/assets/i/favicon.png'/>">
    <link rel="apple-touch-icon-precomposed" href="<c:url value='/assets/i/app-icon72x72@2x.png'/>">
    <meta name="apple-mobile-web-app-title" content="Amaze UI" />
    <link rel="stylesheet" href="<c:url value='/assets/css/amazeui.min.css'/>">
    <link rel="stylesheet" href="<c:url value='/assets/css/admin.css'/>">
    <link rel="stylesheet" href="<c:url value='/diagram-viewer/inputtop.css'/>">
    <script src="<c:url value='/assets/js/jquery.min.js'/>"></script>
    <script src="<c:url value='/assets/js/app.js'/>"></script>
    <script src="<c:url value='/js/jqPaginator.js'/>"></script>
</head>
<body>

<div class="admin-biaogelist" style="position: static;">

    <div class="listbiaoti am-cf">
        <ul><img style="margin:-5px 5px 0px 0px;" src="<c:url value='/img/index/menu0.png'/>">实时房态列表</ul>

        <dl class="am-icon-home" style="float: right;">当前位置： <a href='${pageContext.request.contextPath}/mainPage.action' >首页</a> > <a href="#">实时房态列表</a></dl>

        <!--这里打开的是新页面-->
    </div>
    

<%-- 	<form action="${pageContext.request.contextPath }/roommanagement/realtime_list.action" method="post"> --%>
	<form id="search" action="<c:url value='/roommanagement/realtime_list.action'/>" method="post">
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
	
    <div class="am-form am-g">
        <table class="am-table am-table-bordered am-table-radius am-table-striped am-text-nowrap">
            <thead>
            <tr class="am-success">
            	<th width="5%" style="text-align:center;"><input type="checkbox" id="checkAll"/></th>
                <th id="th1" width="10%" style="text-align:center;">房间号</th>
                <th width="10%" style="text-align:center;">楼层</th>
                <th width="10%" style="text-align:center;">房间类型</th>
                <th width="10%" style="text-align:center;">价格</th>
                <th width="10%" style="text-align:center;">房间状态</th>
<!--                 <th width="10%" style="text-align:center;">是否预定</th> -->
                
               <%-- <th width="20px" style="text-align:center;">查看</th>--%>
                <th width="10%" style="text-align:center;">房间说明</th>
<!--                 <th width="10%" style="text-align:center;">查看详情</th> -->
                <th width="8%" style="text-align:center;">操作</th>
            </tr>
            </thead>
            <tbody id="apply-table">
	
            <c:forEach items="${paging.list}" var="room"  varStatus="status">
            	<tr>
            	
				</tr>
            	<tr>
            		<td class="oder" style="text-align:center;">
            		 	<input type="checkbox" id="mychk" class="mychk" name="roomid" value="${room.roomid }"/>
            		</td>
				<%--<td style="text-align:center"><fmt:formatDate value="${room.roomid}" pattern="yyyy-MM-dd HH:mm:ss"/></td> --%>
            		<td style="text-align:center">${room.roomnum}</td>
					<td style="text-align:center;">${room.floor }</td>
					<td style="text-align:center;">${room.type }</td>
					<td style="text-align:center;">${room.price }</td>
					<td style="text-align:center;">${room.state }</td>
<%-- 					<td style="text-align:center;">${room.isreservation }</td> --%>
<%-- 					<td style="text-align:center;"><fmt:formatDate value="${room.endtime}" pattern="yyyy-MM-dd HH:mm:ss"/></td> --%>
					<td style="text-align:center;">${room.instructions }</td>
<!-- 					<td style="text-align:center;">详情</td> -->
					<td style="text-align:center;">	
                	<div class="am-btn-toolbar">
                    <div class="am-btn-group am-btn-group-xs">
                    <a type="button" class="am-btn am-btn-default am-btn-xs am-text-secondary am-round" href="<c:url value='/roommanagement/toRoomModify.action?roomid=${room.roomid }'/>" title="修改"><span class="am-icon-pencil-square-o">修改</span></a> 
                    <a type="button" class="am-btn am-btn-default am-btn-xs am-text-danger am-round" onclick="javascript:return confirm('您确认要删除吗?');" href="<c:url value='/roommanagement/delete.action?roomid=${room.roomid }'/>" title="删除"><span class="am-icon-pencil-square-o">删除</span></a> 
                    </div>
                  </div>
                	</td>
				</tr>
            </c:forEach>
            </tbody>
        </table>

        <div class="am-cf">
        	<ul class="am-pagination am-fr" id="pagination2">
			</ul>
			<ul class="am-pagination am-fr">
			</ul>
			<ul class="am-pagination am-fr">
			<li>总条数：${paging.totalRows }</li>
			<li>总页数：${paging.totalPages }</li>
			</ul>
			<div class="am-btn-group am-btn-group-xs">
            		<button type="button" class="am-btn am-btn-default button-del"
					onclick="deletechecked()"></button>
            		<a  type="button" class="am-btn am-btn-default button-add" 
            		href="<c:url value='/roommanagement/toroomadd.action'/>"></a>
           	</div>
			
			              <script type="text/javascript">
						    $.jqPaginator('#pagination2', {
						        totalPages: ${paging.totalPages },   
						        visiblePages: 3, 
						        currentPage: ${paging.currentPage}, 
						        disableClass: 'am-disabled',
						        activeClass: 'am-active',
						        prev: '<li class=""><a href="javascript:;">上一页</a></li>',
						        next: '<li class=""><a href="javascript:;">下一页</a></li>',
						        page: '<li class=""><a href="javascript:;">{{page}}</a></li>',
						        onPageChange: function (num, type) {
						            if(num!==${paging.currentPage}){  
						            	$("input[name='page']").val(num);
						            	$("form").submit();
						            }
						        }
						    });  
						    
						</script>

              </div>
        <hr />
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
//    			url:"deletelist.action?roomids="+roomids,
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