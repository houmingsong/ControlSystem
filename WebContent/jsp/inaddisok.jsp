<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加成功</title>
<style>
	#div1{
		width:100%;
		height:100%;
		position:fixed;
	}
	#div2{
		background-color:#dcdcdc;
		position:relative;
		border:1px solid #dcdcdc;
		width:200px;
		height:120px;
		margin:200px auto;
		padding:20px;
		z-index: 10;
	}
	p{
		text-align: center;
	}
	#div2 a{
		float:right;
		margin:20px auto;
		color: #4682B4;
		font-size: 14px;
		text-decoration: none;
	}
</style>
</head>
<body>
	<div id="div1">
		<div id="div2">
			<p>添加成功</p>
			<a href="medicine.jsp">返回</a> 
		</div>
	</div>	
</body>
</html>