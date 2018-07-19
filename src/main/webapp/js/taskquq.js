$(document).ready(function(){
	$("#navigation").treeview({
		persist: "location",
		collapsed: false,
		//unique: true
	});
	
	$("body").resize(function(){
		IFrameResize();
	})
	
	$.ajax({
		url:"gettodoTask.action",
		type:"POST",
		success:function(result){
			var li = ""
				for(var i=0;i<result.length;i++){
					li += '<li><a href="javascript:getnamelist(' +
					result[i].deptid +')" target="leftFrame">' +
					result[i].deptname + '</a></li>';
				}
			$("#deptlist").after(li);
		}
	})
})
//选择转办、委派人窗口  e=1 委派  0 转办
function chooseUser(e,taskId){
	 $("#tittop").remove();
	if(e == 1){
		$("#tit").after('<span id="tittop">委派人员</span>');
		$(function() {
		    $('#my-prompt').modal({
		      relatedTarget: this,
		      onConfirm: function(e) {
		        alert('提交的是：' + e.data || '');
		        $.ajax({
		    		url:"delegateTask.action",
		    		type:"POST",
		    		dateType:"json",
		    		data:{"taskId":taskId,"userId":e.data},
		    		success:function(result){
		    			if(result.status){
		    				alert(result.message);
		    				window.location.reload();
		    			}else{
		    				alert(result.message);
		    			}
		    		}
		    	})
		      },
		      onCancel: function(e) {
		    	  $("#namelistbf").remove();
		      }
		    });
		  });
	}else{
		$("#tit").after('<span id="tittop">转办人员</span>');
		$(function() {
		    $('#my-prompt').modal({
		      relatedTarget: this,
		      onConfirm: function(e) {
		       // alert('提交的是：' + e.data || '');
		        $.ajax({
		    		url:"transferTask.action",
		    		type:"POST",
		    		dateType:"json",
		    		data:{"taskId":taskId,"userId":e.data},
		    		success:function(result){
		    			if(result.status){
		    				alert(result.message);
		    				window.location.reload();
		    			}else{
		    				alert(result.message);
		    			}
		    		}
		    	})
		      },
		      onCancel: function(e) {
		    	  $("#namelistbf").remove();
		      }
		    });
		  });
	}
	
}
//委派人的传递参数
function fzname(e){
		$('#wpr').val(e.value);
}
//获取姓名列表
function getnamelist(e){
	$.ajax({
		url:"gettodoTaskUser.action?deptId="+e,
		type:"POST",
		success:function(result){
			var li = '<div id="namelistbf">';
				for(var i=0;i<result.length;i++){
					li += '<p><input type="radio" style=" margin:0px 30px 0px 100px;" onclick="fzname(this)" name="wtr" value="' +
					result[i].id + '">' + result[i].name + '</p>';
				}
			$("#namelistbf").remove();
			$("#namelist").after(li+'</div>');
		}
	})
}
	//跳转
	function chooseTask(taskName,taskid,tdk){
		$("#selectwt").remove();
		$.ajax({
			url:"jumpTasklist.action?processDefinitionId="+tdk,
			type:"POST",
			success:function(result){
				var s = result;
				//alert(result);
				var li='<select id="selectwt" onchange="taskxlk(this)" class="xlk-quq">';
					for(var i=0;i<result.length;i++){
						li += '<option value="'+result[i].id+'">'+result[i].name+'</option>';
						//alert(li);
					}
				$("#optionsj").after(li+'</select>');
				li = "";
			}
		})
		$("#taskname").remove();
		$("#tasknametop").after('<span id="taskname">'+taskName+'</span>');
		$('#my-prompt-two').modal({
		      relatedTarget: this,
		      onConfirm: function(e) {
		    	  alert(e.data);
		    	  $.ajax({
			    		url:"jumpTask.action",
			    		type:"POST",
			    		dateType:"json",
			    		data:{"currentTaskId":taskid,"targetTaskDefinitionKey":e.data},
			    		success:function(result){
			    			if(result.status){
			    				alert(result.message);
			    				window.location.reload();
			    			}else{
			    				alert(result.message);
			    			}
			    		}
			    	})
		      },
		      onCancel: function(e) {
		    	  $("#selectwt").remove();
		      }
		    });
	}
	function taskxlk(e){
		$('#jumptask').val(e.value);
	}