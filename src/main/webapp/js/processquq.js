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
function chooseUser(i){
	//alert($("#option"+e).val());
	document.getElementById("my-prompt-two").style.display = "none";
	//$("#my-prompt-two").style.display='none';
	 $("#tittop").remove();
	$("#tit").after('<span id="tittop">执行人员</span>');
	$("#wpr").val(i);
		$(function() {
		    $('#my-prompt').modal({
		      relatedTarget: this,
		      onConfirm: function(e) {  
		    	  var p=$("div[class='option"+e.data+"']");
		    		var nameinput= p.find("input").eq(2);
		    		var idinput=p.find("input").eq(1);
		    	  var id=$('input:radio[name="wtr"]:checked').val();
		    	  var name=$('input:radio[name="wtr"]:checked').parent("p").text();
		    	  idinput.val(id);
		    	  nameinput.val(name);
		    	  document.getElementById("my-prompt-two").style.display = "block";
		      },
		      onCancel: function(e) {
		    	  $("#namelistbf").remove();
		    	  document.getElementById("my-prompt-two").style.display = "block";
		      }
		    });
		  });
	
	
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
					li += '<p><input type="radio" style=" margin:0px 30px 0px 100px;" name="wtr" value="' +
					result[i].id + '">' + result[i].name + '</p>';
				}
			$("#namelistbf").remove();
			$("#namelist").after(li+'</div>');
		}
	})
}
	//跳转
	function lcdy(tdk){
		$("#optionlist").empty();
		$.ajax({
			url:"../permission/listUserTask.action?procDefId="+tdk,
			type:"POST",
			success:function(result){
				var s = result;
				//alert(result);
				var li="";
					for(var i=0;i<result.length;i++){
						switch(result[i].taskDefKey){
							case("adjust_task"):
								li += '<div class="option'+i+'" style="width:100%;padding-left:50px;"align="left">'+result[i].taskName +':<input type="hidden" value="'+result[i].id
								+'" name="taskId"/><input type="hidden" value="0" name="candidataIds"/>'
								+'<input type="text" value="任务发起人" readonly></div>';
								break;
							case("deptLeader_task"):
								li += '<div class="option'+i+'" style="width:100%;padding-left:50px;"align="left">'+result[i].taskName +':<input type="hidden" value="'+result[i].id
								+'" name="taskId"/><input type="hidden" value="0" name="candidataIds"/>'
								+'<input type="text" value="部门领导 " name="candidateName" readonly/></div>';
								break;
							default:
								li += '<div class="option'+i+'" style="width:100%;padding-left:50px;"align="left">'+result[i].taskName +':<input type="hidden" value="'+result[i].id
								+'" name="taskId"/><input type="hidden" value="'+result[i].candidateIds+'" name="candidataIds"/>'
								+'<input type="text" value="'+(result[i].candidateName==null?'':result[i].candidateName) +'" name="candidateName" readonly/><a href="javascript:chooseUser('+i+')" id="option'+i+'">设定</a>' +'</div>';
						}
					}
				$("#optionlist").append(li);
			}
		})
		$('#my-prompt-two').modal({
		      relatedTarget: this,
		      onConfirm: function(e) {
		    	var list=$("#optionlist").children("div");
		    	var taskIds="";
		    	var ids="";
		    	var names="";
		    	$("#optionlist").children("div").each(function(){
		    		taskIds+=$(this).find("input").eq(0).val()+",";
		    		if($(this).find("input").eq(1).val()!=0 && $(this).find("input").eq(0).val()!=null){
		    			ids+=$(this).find("input").eq(1).val()+",";
		    		}else{
		    			ids+="0,";
		    		}
		    		if($(this).find("input").eq(2).val()!=0){
		    			names+=$(this).find("input").eq(2).val()+",";
		    		}else{
		    			names+="0,";
		    		}	
		    	})
		    	taskIds = taskIds.substring(0,taskIds.lastIndexOf(','));
		    	ids = ids.substring(0,ids.lastIndexOf(','));
		    	names = names.substring(0,names.lastIndexOf(','));
		    	$.ajax({
		    		url:"../permission/setPermission.action",
		    		data:{"ids":taskIds,"candidateIds":ids,"candidateNames":names},
		    		type:"POST",
		    		success:function(result){
		    			alert(result.message)
		    			if(result.states){
		    				window.location.reload();
		    			}
		    		}
		    	})
		      },
		      onCancel: function(e) {
		    	  $("#option").remove();
		      }
		    });
	}
	function taskxlk(e){
		$('#jumptask').val(e.value);
	}