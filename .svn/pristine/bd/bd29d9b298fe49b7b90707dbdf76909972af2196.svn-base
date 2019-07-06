<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>修改用户信息</title>
    <link rel="stylesheet" href="css/bootstrap-3.3.7-dist/css/bootstrap.css">
    <style>
        .container{
            margin-top:50px;
            height:700px;
            border:1px solid black;
        }
        .col-sm-12{
            border:1px solid black;
            background-color:#dcdcdc;
            height:50px;
            text-align:center;
        }
        h4{
            line-height:30px;
        }
        .col-sm-2,.col-sm-10{
            height:600px;
            border:1px solid black;
        }
        .col-sm-2{
            background-color:#dcdcdc;
            padding:0px;
        }
        ul{
            list-style-type:none;
        }
        .col-sm-3{
            margin-top:50px;
        }
        #div231{
            background-color:white;
            border: none;
        }
    </style>
    
    <script type="text/javascript" src="jquery/jquery-2.1.4.js"></script>
<script type="text/javascript">
$(function() {
	
	$("input[name=pwd]").blur(function(){
		var password = $("input[name=password]").val().trim();
		var pwd = $("input[name=pwd]").val().trim();
		var $span = $("#span");
		if(password != pwd){
			$span.html("<h5>!两次密码不一致</h5>");
			$span.css({color:"red"});
		}else{
			$span.empty();
		}
	});
});

</script>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-sm-12"><h4>森林病虫害防治系统</h4></div>
    </div>

    <div class="row">
        <div class="col-sm-2">
            <ul>
                <li class="head1"><a href="jsp/index.jsp">森林病虫害防治系统</a></li>
            </ul>
            <ul>
                <li>资料整理</li>
                <li>
                    <ul>
                        <li><a href="jsp/worm.jsp">虫害一览</a></li>
                        <li><a href="jsp/disease.jsp">病害一览</a></li>
                        <li><a href="jsp/mouse.jsp">鼠害一览</a></li>
                    </ul>
                </li>
            </ul>
            <ul>
                <li class="head2">灾情防治</li>
                <li>
                    <ul>
                        <li><a href="jsp/area.jsp">区域一览</a></li>
                        <li><a href="jsp/minclass.jsp">小班管理</a></li>
                        <li><a href="jsp/event.jsp">事件记录</a></li>
                    </ul>
                </li>
            </ul>
            <ul>
                <li class="head2">专家会商</li>
                <li>
                    <ul>
                        <li><a href="jsp/expert.jsp">专家一览</a></li>
                        <li><a href="jsp/talk.jsp">会商灾情</a></li>
                    </ul>
                </li>
            </ul>
            <ul>
                <li class="head2">药剂器械出库管理</li>
                <li>
                    <ul>
                        <li><a href="jsp/medicine.jsp">药剂管理</a></li>
                        <li><a href="jsp/house.jsp">出库管理</a></li>
                    </ul>
                </li>
            </ul>
            <ul>
                <li class="head2">系统信息</li>
                <li>
                    <ul>
                        <li><a href="user.jsp">用户管理</a></li>
                        <li><a href="log.jsp">日志一览</a></li>
                    </ul>
                </li>
            </ul>
        </div>

        <div class="col-sm-10">
            <div class="row">
                <div class="col-sm-12" id="div231">
                    <h3>修改用户信息</h3>
                </div>
            </div>

            <div class="row">

                <form action="UpdateuserServlet" method="get">
                    <div class="row">
                        <div class="col-sm-3 col-sm-push-4">用户名:</div>
                        <div class="col-sm-3 col-sm-push-2"><label >${userBean.userName }</label></div>
                    </div>
                    <div class="row">
                        <div class="col-sm-3 col-sm-push-4"> 密码:</div>
                        <div class="col-sm-3 col-sm-push-2"><input oninput="setCustomValidity('')"
                    pattern="^[a-zA-Z]\w{5,17}$"
                    oninvalid="setCustomValidity('请输入密码，以字母开头，长度6到16位');"
                    placeholder="请输入密码，以字母开头，长度6到16位"
                    required  type="text" name="password"  value="${userBean.password}"/></div>
                    </div>
                    <div class="row">
                        <div class="col-sm-3 col-sm-push-4"> 确认密码:</div>
                        <div class="col-sm-3 col-sm-push-2"><input oninput="setCustomValidity('')"
                    pattern="^[a-zA-Z]\w{5,17}$"
                    oninvalid="setCustomValidity('请再次输入密码');"
                    placeholder="请再次输入密码"
                    required  type="text" name="pwd" value="${userBean.password}"/></div>
                    <span id="span"> </span>
                    </div>
                    <div class="row">
                        <div class="col-sm-3 col-sm-push-4"> 真实姓名:</div>
                        <div class="col-sm-3 col-sm-push-2"><label >${userBean.realName}</label></div>
                    </div>
                    <div class="row">
                        <div class="col-sm-3 col-sm-push-4"> 用户等级:</div>
                        <div class="col-sm-3 col-sm-push-2">
                            <select name="userLevel" >
                                 <option value="超级管理员">超级管理员</option>
                                <option value="资料管理员">资料管理员</option>
                                <option value="灾情管理员">灾情管理员</option>
                                <option value="专家管理员">专家管理员</option>
                                 <option value="库房管理员">库房管理员</option>
                            </select>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-3  col-sm-push-6"> <input type="submit" value="修改"/></div>
                    </div>
                </form>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-sm-12"></div>
    </div>
</div>
</body>
</html>