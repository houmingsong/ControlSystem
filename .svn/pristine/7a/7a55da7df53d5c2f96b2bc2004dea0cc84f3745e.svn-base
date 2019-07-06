<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>用户管理</title>
    <link rel="stylesheet" href="../css/bootstrap-3.3.7-dist/css/bootstrap.css">
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
            margin-top:60px;
        }
        #div231{
            background-color:white;
            border: none;
        }
        #finds{
            background-color:white;
            height:30px;
            border: none;
            margin-top:40px;
        }
        #sasa{
            width:100%;
            height:450px;
            background-color:white;
            border: none;
        }
        #tj{
            margin-top:50px;
        }
        th{
            text-align:center;
            background-color:#dcdcdc;
        }
        table{
            margin-top:30px;
        }
    </style>
    <script src="../jquery/jquery-2.1.4.js"></script>
    <script type="text/javascript">
    $(function () {
    	var  currentPage=1;
    	var userLevel="所有用户";
    	$.getJSON("../UserServlet",{currentPage:currentPage,userLevel:userLevel},findData);
    	$("input[type=button]").click(function () {
    		var operation=this.value;
    		currentPage=parseInt($("input[name=currentPage]").val());
    		var totalPage=$("input[name=totalPage]").val();
    		 userLevel=$("select[name=userLevel]").val();
    		
    		 if(operation=="|<" || operation=="查询"){
    				currentPage=1;	
    			}else if(operation=="<"){
    				currentPage=currentPage-1;
    			}
    			else if (operation==">") {
    				currentPage+=1;
    			}else {//尾页
    				currentPage=totalPage;
    			}
    		$.getJSON("../UserServlet",{currentPage:currentPage,userLevel:userLevel},findData);
    		
    	});
    });
     function findData(data) {
    	var $table=$("table");
    	$table.empty();
    	var head="<tr><th>用户名</th><th>密码</th><th>等级</th><th>真实姓名</th><th>操作</th></tr>";
    	$table.append(head);
    	$.each(data.list,function(i,e){
    		var name=e.userName;
    		var password=e.password;
    		var realName=e.realName;
    		var userLevel=e.userLevel;
    		var tr="<tr><td>"+name+"</td><td>"+password+"</td><td>"+userLevel+"</td><td>"+realName
    		+"</td><td><a href=../UpdateFindUserServlet?id="+e.id+">修改用户信息</a> <a href=../DelUserServlet?id="+e.id+">删除信息</a></tr>";
    		$table.append(tr);
    	});
    	
    	$("input[name=currentPage]").val(data.currentPage);
    	$("input[name=totalPage]").val(data.totalPage);
    	$("span").html("第"+data.currentPage+"页，共"+data.totalPage+"页");
    	
    	
    }
    
    
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
                <li class="head1"><a href="index.jsp">森林病虫害防治系统</a></li>
            </ul>
            <ul>
                <li>资料整理</li>
                <li>
                    <ul>
                        <li><a href="worm.jsp">虫害一览</a></li>
                        <li><a href="disease.jsp">病害一览</a></li>
                        <li><a href="mouse.jsp">鼠害一览</a></li>
                    </ul>
                </li>
            </ul>
            <ul>
                <li class="head2">灾情防治</li>
                <li>
                    <ul>
                        <li><a href="area.jsp">区域一览</a></li>
                        <li><a href="minclass.jsp">小班管理</a></li>
                        <li><a href="event.jsp">事件记录</a></li>
                    </ul>
                </li>
            </ul>
            <ul>
                <li class="head2">专家会商</li>
                <li>
                    <ul>
                        <li><a href="expert.jsp">专家一览</a></li>
                        <li><a href="talk.jsp">会商灾情</a></li>
                    </ul>
                </li>
            </ul>
            <ul>
                <li class="head2">药剂器械出库管理</li>
                <li>
                    <ul>
                        <li><a href="medicine.jsp">药剂管理</a></li>
                        <li><a href="house.jsp">出库管理</a></li>
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
                    <h3>用户管理</h3>
                </div>
            </div>

            <div class="row">

                    <div class="row">

                        <div class="col-sm-10 col-sm-push-5" id="finds">
                            <label>
                                <select name="userLevel">
                                <option value="所有用户">所有用户</option>
                                   <option value="超级管理员">超级管理员</option>
                                <option value="资料管理员">资料管理员</option>
                                <option value="灾情管理员">灾情管理员</option>
                                <option value="专家管理员">专家管理员</option>
                                 <option value="库房管理员">库房管理员</option>
                                </select>
                            </label>
                           
                            <label><input type="button" value="查询"/></label>
                        </div>
                    </div>
            
            </div>

            <div class="col-sm-12" id="sasa">

                <table class="table table-hover table-bordered">
                 
                </table>
                <input type="button" name="operator"  value="|<"/>
                <input type="button" name="operator" value="<"/>
                <input type="button" name="operator" value=">"/>
                <input type="button" name="operator" value=">|"/>
                <span></span>
                <input type="hidden" name="currentPage"/>
                  <input type="hidden" name="totalPage"/>
                <div id="tj"><a href="../jsp/adduser.jsp">添加用户</a></div>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-sm-12"></div>
    </div>
</div>
</body>
</html>