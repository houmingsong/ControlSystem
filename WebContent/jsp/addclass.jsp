<%@ page language="java" contentType="text/html; charset=utf-8"
pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>添加小班</title>
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
            margin-top:50px;
        }
        #div231{
            background-color:white;
            border: none;
        }
    </style>
<script src="../jquery/jquery-2.1.4.js"></script>
	<script type="text/javascript">
	<jsp:include page="remove.jsp" flush="false"/>
		$(function(){
			
			var areaName=null;
			$.getJSON("../ClassAreaFindservlet",{areaName:areaName},fillDate);
		});
		function fillDate(data){
			var $select=$("select");
			$select.empty;
			$.each(data,function(i,e){
				var option="<option value="+e.id+">"+e.areaName+"</option>";
				$select.append(option);
			});
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
                        <li><a href="expert.jsp">专家一览</a></li>
                        <li><a href="talk.jsp">会商灾情</a></li>
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
                    <h3>添加小班</h3>
                </div>
            </div>

            <div class="row">

              <form action="../AddClassServlet" method="get">
                    <div class="row">
                        <div class="col-sm-3 col-sm-push-4">名称:</div>
                        <div class="col-sm-3 col-sm-push-2"><input oninput="setCustomValidity('')"
                    pattern="^[\u4e00-\u9fa5]{0,10}$"
                    oninvalid="setCustomValidity('请输入汉子，最多10位');"
                    placeholder="请输入汉字，最多10位"
                    required  type="text" name="name"/></div>
                    </div>
                    <div class="row">
                        <div class="col-sm-3 col-sm-push-4"> 负责人:</div>
                        <div class="col-sm-3 col-sm-push-2"><input oninput="setCustomValidity('')"
                    pattern="^[\u4e00-\u9fa5]{0,6}$"
                    oninvalid="setCustomValidity('请输入汉字，最多6位');"
                    placeholder="请输入汉字，最多6位"
                    required  type="text" name="principal"/></div>
                    </div>
                    <div class="row">
                        <div class="col-sm-3 col-sm-push-4"> 负责人电话:</div>
                        <div class="col-sm-3 col-sm-push-2"><input  oninput="setCustomValidity('')"
                    pattern="^(\(\d{3,4}\)|\d{3,4}-)?\d{7,11}$"
                    oninvalid="setCustomValidity('请输入数字，最多11位');"
                    placeholder="请输入数字，最多11位"
                    required  type="text" name="tel"/></div>
                    </div>
                    <div class="row">
                        <div class="col-sm-3 col-sm-push-4"> 人员数量:</div>
                        <div class="col-sm-3 col-sm-push-2"><input oninput="setCustomValidity('')"
		                    pattern="^[0-9]{0,3}$"
		                    oninvalid="setCustomValidity('请输入数字，最多3位');"
		                    placeholder="请输入数字，最多3位"
		                    required   type="text" name="personNumber"/>
                    </div>
                    
                    </div>
                    <div class="row">
                        <div class="col-sm-3 col-sm-push-4"> 负责区域:</div>
                        <div class="col-sm-3 col-sm-push-2">
                            <select name="areaId">
                             <!--    <option value="1">成都一号地区</option>
                                <option value="2">成都二号地区</option>
                                <option value="3">成都三号地区</option>
                                <option value="4">雅安一号地区</option>
                                <option value="5">雅安二号地区</option>
                                <option value="6">雅安三号地区</option>
                                <option value="7">卧龙一号地区</option>
                                <option value="8">卧龙二号地区</option>
                                <option value="9">卧龙三号地区</option>
                                <option value="10">卧龙自然保护区</option>
                                <option value="11">绵阳一号地区</option>
                                <option value="12">绵阳二号地区</option>
                                <option value="13">南充自然保护区</option> -->
                            </select>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-3  col-sm-push-6"> <input type="submit" value="添加"/></div>
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