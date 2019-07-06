<%@ page language="java" contentType="text/html; UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>用户登陆</title>
<link rel="stylesheet"
	href="../css/bootstrap-3.3.7-dist/css/bootstrap.css">
<style>
	.container {
		margin-top: 50px;
		height: 700px;
		border: 1px solid black;
	}
	
	.col-sm-12 {
		border: 1px solid black;
		background-color: #dcdcdc;
		height: 50px;
		text-align: center;
	}
	
	h4 {
		line-height: 30px;
	}
	
	img {
		margin-top: 50px;
	}
	
	.col-sm-6 {
		text-align: center;
		height: 600px;
	}
	
	table {
		margin: 50px auto;
		text-align: left;
	}
	
	.form-inline {
		margin-top: 60px;
	}
	
	input[type="submit"] {
		margin-left: 190px;
	}
	#span{
		margin-left: 40px;
	}
</style>
</head>
<script type="text/javascript" src="../jquery/jquery-2.1.4.js"></script>
<script type="text/javascript">
	//取出传回来的参数error并与yes比较
	$(function(){
	  	var error ='<%=request.getParameter("error")%>';
	  	if(error=='yes'){
	   		$("#span").html("账号或密码错误,请重新输入!");
	   		$("#span").css("color","red");
	  }
  });
 
</script>
<body>
	<div class="container">
		<div class="row">
			<div class="col-sm-12">
				<h4>森林病虫害防治系统</h4>
			</div>
		</div>

		<div class="row">
			<div class="col-sm-6 col-sm-push-3">
				<img src="../img/1.jpg" />

				<form class="form-inline" action="../LoginServlet" method="post">
					<div class="form-group">
						<label>用户名:</label> <input type="text" class="form-control"
							id="exampleInputEmail3" name="username" />
					</div>
					<br />
					<br />
					<div class="form-group">
						<label>密码:&nbsp;&nbsp;&nbsp;</label> <input type="password"
							class="form-control" id="exampleInputPassword3" name="pwd">
					</div>
					<br />
					<span id="span"></span>
					<br />
					<br /> <input type="submit" value="登陆" />
				</form>
			</div>
		</div>

		<div class="row">
			<div class="col-sm-12"></div>
		</div>
	</div>
</body>
</html>
