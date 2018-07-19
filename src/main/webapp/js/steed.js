function refreshValidateCode(img){
	img.src = img.src+ "?" +Math.random();
}
function aceAjaxDone(dwzMessage){
	/*$.gritter.add({
		title: dwzMessage.title,
		text: dwzMessage.message,
		class_name: "gritter-info gritter-center" + " gritter-light"
	});*/
	var time;
	if(dwzMessage.statusCode == 200){
		time = 1500;
	}else{
		time = 2500;
	}
	/*setTimeout(function(){
		$.gritter.removeAll();
	},time)*/
	aceAlert(dwzMessage.title,dwzMessage.message,time)
}

function aceAlert(title,message,time){
	$.gritter.add({
		title: title,
		text: message,
		class_name: "gritter-info gritter-center" + " gritter-light"
	});
	setTimeout(function(){
		$.gritter.removeAll();
	},time)
}

function aceSmartAjaxDone(dwzMessage){
	var temp = eval("("+dwzMessage+")");
	aceAjaxDone(temp);
	return temp;
}

function getRodomCode(){
	$.ajax({
		url:"./getYzmCode.jsp?method=getRandCodeString",
		type:"post",
		dataType:"text",
		success:function(data){
			$("#securityCode").val(data);
		}
	});
}

function getCookie(c_name){
　　　　if (document.cookie.length>0){　　//先查询cookie是否为空，为空就return ""
　　　　　　c_start=document.cookie.indexOf(c_name + "=")　　//通过String对象的indexOf()来检查这个cookie是否存在，不存在就为 -1　　
　　　　　　if (c_start!=-1){ 
　　　　　　　　c_start=c_start + c_name.length+1　　//最后这个+1其实就是表示"="号啦，这样就获取到了cookie值的开始位置
　　　　　　　　c_end=document.cookie.indexOf(";",c_start)　　//其实我刚看见indexOf()第二个参数的时候猛然有点晕，后来想起来表示指定的开始索引的位置...这句是为了得到值的结束位置。因为需要考虑是否是最后一项，所以通过";"号是否存在来判断
　　　　　　　　if (c_end==-1) c_end=document.cookie.length　　
　　　　　　　　return decodeURI(document.cookie.substring(c_start,c_end))　　//通过substring()得到了值。想了解unescape()得先知道escape()是做什么的，都是很重要的基础，想了解的可以搜索下，在文章结尾处也会进行讲解cookie编码细节
　　　　　　} 
　　　　}
　　　　return ""
　　}
/**************\图片预览************/

function picPriview(file) {
    var pic = document.getElementById("avatar");
    var ext=file.value.substring(file.value.lastIndexOf(".")+1).toLowerCase();
     if(ext!='png'&&ext!='jpg'&&ext!='jpeg'){
         alert("图片的格式必须为png或者jpg或者jpeg格式！"); 
         return;
     }
     var isIE = navigator.userAgent.match(/MSIE/)!= null,
         isIE6 = navigator.userAgent.match(/MSIE 6.0/)!= null;
     if(isIE) {
        file.select();
        var reallocalpath = document.selection.createRange().text;
        // IE6浏览器设置img的src为本地路径可以直接显示图片
         if (isIE6) {
            pic.src = reallocalpath;
         }else {
            // 非IE6版本的IE由于安全问题直接设置img的src无法显示本地图片，但是可以通过滤镜来实现
             pic.style.filter = "progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod='image',src=\"" + reallocalpath + "\")";
             // 设置img的src为base64编码的透明图片 取消显示浏览器默认图片
             pic.src = 'data:image/gif;base64,R0lGODlhAQABAIAAAP///wAAACH5BAEAAAAALAAAAAABAAEAAAICRAEAOw==';
         }
     }else {
    	 setPicSrc(file,pic);
     }
}
 
 function setPicSrc(file,pic){
     var file = file.files[0];
     var reader = new FileReader();
     reader.readAsDataURL(file);
     reader.onload = function(e){
         pic.src=this.result;
     }
 }

/**************#图片预览************/
 /**************\百度编辑器************/
 function UEditorEditContent(id){
	 var content = document.getElementById(id).value;
	 if(content.indexOf("<p>") == -1){
		 document.getElementById(id).value = utf8to16(base64decode(content));
	 }
	 UE.getEditor(id);
 }
 
 /**************#百度编辑器************/







function containsChar(str,chars){
	for(var i=0;i<chars.length;i++){
	 if(str.indexOf(chars.substring(i,i+1))>-1){
		 return true;
	    }
	}
	return false;
}

function isObjNull(obj){
	var temp = obj == null || obj == undefined || obj == "";
	if(obj instanceof Array){
		return temp || obj.length < 1;
	}
	return temp;
}

function steedNavTabAjaxDone(json){
	DWZ.ajaxDone(json);
}

function deleteDomain(name,url1,id){
	var name2 = name;
	if(name2 == null){
		name2 = id;
	}
	 $.messager.confirm('是否删除？','确定删除&nbsp;'+name2+'&nbsp;?',function(r){
		if (r){
			$.ajax({ 
				type: "post", 
				url : url1+id, 
				dataType:'json',
				success: function(json){
					if(json.errCode==0){
						var a;
						if(id == null ){
							a = $("#"+name);
						}else{
							a = $("#"+id);
						}
						a.fadeOut(500,function(){
							a.remove();
						});
						$.messager.show({
							title:json.title,
							msg:json.message,
							timeout:2000,
							showType:'fade'
						});
					}else{
						$.messager.alert(json.title,json.message,"warring");
					}
				}
				});
		}
		}); 
}
