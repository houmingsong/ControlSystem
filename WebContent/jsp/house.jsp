<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>药剂器械出库管理</title>
    <link rel="stylesheet" href="../css/bootstrap-3.3.7-dist/css/bootstrap.css">
    <script type="text/javascript" src="../jquery/jquery-2.1.4.js"></script>	
	<script type="text/javascript">
	<jsp:include page="remove.jsp" flush="false"/>
	</script>
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
	<script>
    	$(function(){
    		
    		var thispage = parseInt($("#thispage").html());
    		var maxpage = $("#maxpage").html();
    		var startdate = $("input[name=startdate]").val();
    		var enddate = $("input[name=enddate]").val();
    		var minclass = $("input[name=minclass]").val();
    		
    		var $btn1 = $("input[id=btn1]");
    		var $btn2 = $("input[id=btn2]");
    		var $btn3 = $("input[id=btn3]");
    		var $btn4 = $("input[id=btn4]");
    		var $btn5 = $("input[id=btn5]");

 			$.getJSON("../wareHouse",{thispage:thispage},instrumentfindthis);
 			$btn1.click(function(){
 				
 				var startdate = $("input[name=startdate]").val();
 	    		var enddate = $("input[name=enddate]").val();
 	    		var minclass = $("input[name=minclass]").val();
 				$.getJSON("../wareHouse",{thispage:1,instrumentname:startdate,
 					instrumenttype:enddate,instrumentkind:minclass},instrumentfindthis);
 			});
 			$btn2.click(function(){
 				var thispage = parseInt($("#thispage").html());
 				if(thispage<2){
 					return;
 				}
 	    		var maxpage = $("#maxpage").html();
 	    		var startdate = $("input[name=startdate]").val();
 	    		var enddate = $("input[name=enddate]").val();
 	    		var minclass = $("input[name=minclass]").val();
 				$.getJSON("../wareHouse",{thispage:thispage-1,instrumentname:startdate,
 					instrumenttype:enddate,instrumentkind:minclass},instrumentfindthis);
 			});
 			$btn3.click(function(){
 				var thispage = parseInt($("#thispage").html());
 	    		var maxpage = parseInt($("#maxpage").html());
 	    		if(thispage==maxpage){
 	    			return;
 	    		}
 	    		var startdate = $("input[name=startdate]").val();
 	    		var enddate = $("input[name=enddate]").val();
 	    		var minclass = $("input[name=minclass]").val();
 				$.getJSON("../wareHouse",{thispage:thispage+1,instrumentname:startdate,
 					instrumenttype:enddate,instrumentkind:minclass},instrumentfindthis);
 			});
 			$btn4.click(function(){
 				var thispage = parseInt($("#thispage").html());
 	    		var maxpage = $("#maxpage").html();
 	    		var startdate = $("input[name=startdate]").val();
 	    		var enddate = $("input[name=enddate]").val();
 	    		var minclass = $("input[name=minclass]").val();
 				$.getJSON("../wareHouse",{thispage:maxpage,instrumentname:startdate,
 					instrumenttype:enddate,instrumentkind:minclass},instrumentfindthis);
 			});
 			$btn5.click(function(){
 				var startdate = $("input[name=startdate]").val();
 	    		var enddate = $("input[name=enddate]").val();
 	    		var minclass = $("input[name=minclass]").val();
 				$.getJSON("../wareHouse",{thispage:1,instrumentname:startdate,
 					instrumenttype:enddate,instrumentkind:minclass},instrumentfindthis);
 			});
    	});
    	
    	function instrumentfindthis(data){
    		var $table = $("#table");
    		var str = "<tr><th>日期</th><th>领用小班</th><th>出库人</th><th>操作</th></tr>";
    		$.each(data.list,function(i,n){
    			str+="<tr><td>"+n.time+"</td><td>"+n.className+"</td><td>"+n.userName+"</td><td><a href='../findhouse?classid="+n.classId+"&date="+n.time+"&username="+n.userName+"'>查看详细信息</a></td></tr>";
    			
    		});
    		$table.empty();
    		$table.append(str);
    		$("#thispage").html(data.currentPage);
    		$("#maxpage").html(data.totalPage);
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
                <li><a href="index.jsp">森林病虫害防治系统</a></li>
            </ul>
            <ul id="head1">
                <li>资料整理</li>
                <li>
                    <ul>
                        <li><a href="worm.jsp">虫害一览</a></li>
                        <li><a href="disease.jsp">病害一览</a></li>
                        <li><a href="mouse.jsp">鼠害一览</a></li>
                    </ul>
                </li>
            </ul>
            <ul id="head2">
                <li>灾情防治</li>
                <li>
                    <ul>
                        <li><a href="area.jsp">区域一览</a></li>
                        <li><a href="minclass.jsp">小班管理</a></li>
                        <li><a href="event.jsp">事件记录</a></li>
                    </ul>
                </li>
            </ul>
            <ul id="head3">
                <li>专家会商</li>
                <li>
                    <ul>
                        <li><a href="jsp/expert.jsp">专家一览</a></li>
                        <li><a href="jsp/talk.jsp">会商灾情</a></li>
                    </ul>
                </li>
            </ul>
            <ul id="head4">
                <li>药剂器械出库管理</li>
                <li>
                    <ul>
                        <li><a href="medicine.jsp">药剂管理</a></li>
                        <li><a href="house.jsp">出库管理</a></li>
                    </ul>
                </li>
            </ul>
            <ul id="head5">
                <li>系统信息</li>
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
                    <h3>药剂器械出库管理</h3>
                </div>
            </div>

            <div class="row">

                <form action="#" method="get">
                    <div class="row">

                        <div class="col-sm-10 col-sm-push-1" id="finds">
                            <label>起始日期:<input type="date" name="startdate"/></label>
                            <label> 结束日期: <input type="date" name="enddate"/></label>
                            <label> 领用小班:<input type="text" name="minclass"/></label>
                            <label><input type="button" value="查询" id="btn5"/></label>
                        </div>
                    </div>
                </form>
            </div>

            <div class="col-sm-12" id="sasa">

                <table class="table table-hover table-bordered" id="table">
                    <tr>
                        <th>名称</th>
                        <th>食物</th>
                        <th>主要危害</th>
                    </tr>
                  
                </table>
                <input type="button" id="btn1" value="|<"/>
                <input type="button" id="btn2" value="<"/>
                <span id="thispage">1</span>/<span id="maxpage">1</span>
                <input type="button" id="btn3" value=">"/>
                <input type="button" id="btn4" value=">|"/>

                <div id="tj"><a href="addhouse.jsp">添加出库信息</a></div>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-sm-12"></div>
    </div>
</div>
</body>
</html>