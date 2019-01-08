<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript">
$(function(){
	//alert(1);
	var params = '{"id": 1,"name": "测试商品","price": 99.9,"detail": "测试商品描述","pic": "123456.jpg"}';
	var param = '[{"id":1,"username":"tom","age":22,"sex":"男","address":"北京"},{"id":2,"address":"上海","username":"jack","age":30,"sex":"女"}]';
	var param1 ='[{"id":1,"username":"tom","sex":"男","address":"北京","birthday":"2014-03-25 22:03:03"},{"birthday":"2017-03-25 22:03:03","id":2,"address":"上海","username":"jack","sex":"女"}]';
	var param2 ='{"id":1,"username":"tom","sex":"男","address":"北京","birthday":"2014-03-25 22:03:03"}';
// 	$.post(url,params,function(data){
		//回调2014:03-25 22_03-03
// 	},"json");//
	$("#bn1").click(function(){
		$.ajax({
			url : "${pageContext.request.contextPath }/my/myajax.action",
			data : params,
			contentType : "application/json;charset=UTF-8",//发送数据的格式
			type : "post",
			dataType : "json",//回调
			//自动将后台的json字符串转化为json对象
			success : function(data){
				alert(data.success);
			},
			error:function(response){
				alert("请求失败！！");
				}
			
		});
	});	
	
	$("#bn2").click(function(){
		$.ajax({
			url : "${pageContext.request.contextPath }/my/pojoajax.action",
			data : param,
			contentType : "application/json;charset=UTF-8",//发送数据的格式
			type : "post",
			dataType : "json",//回调
			//自动将后台的json字符串转化为json对象
			success : function(da){
				alert(da.username);
			},
			error:function(response){
				alert("请求失败！！");
				}
			
		});
	});	
	
	$("#bn3").click(function(){
		$.ajax({
			url : "${pageContext.request.contextPath }/my/listpojoajax.action",
			data : param,
			contentType : "application/json;charset=UTF-8",//发送数据的格式
			type : "post",
			dataType : "json",//回调
			//自动将后台的json字符串转化为json对象
			success : function(data){
				for(x in data){
					alert(data[x].username);
				}
			},
			error:function(response){
				alert("请求失败！！");
				}
			
		});
	});	
	
	
	$("#bn4").click(function(){
		$.ajax({
			url : "${pageContext.request.contextPath }/my/datelistpojoajax.action",
			data : param2,
			contentType : "application/json;charset=UTF-8",//发送数据的格式
			type : "post",
			dataType : "json",//回调
			//自动将后台的json字符串转化为json对象
			success : function(data){
				for(x in data){
					alert(data[x].username);
				}
			},
			error:function(response){
				alert("请求失败！！");
				}
			
		});
	});	
});
	



</script>
</head>
<body>

<button id="bn1">提交ajax</button>


<button id="bn2">提交listpojoajax</button>

<button id="bn3">提交pojoajax,返回listPojo</button>

<button id="bn4">提交datepojoajax,返回listPojo</button>

<form method="post" action="${pageContext.request.contextPath }/my/datelistpojoajax.action">
<input type="text" name="birthday">
<input type="submit" value="提交"/>
</form>
</body>
</html>