<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>查看出库信息</title>
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
            margin-top:20px;
        }
        #div231{
            background-color:white;
            border: none;
        }
        .table{
            width:80%;
            margin:50px auto;
        }
        th{
        	background-color: #dcdcdc;
        }
    </style>
<script type="text/javascript" src="jquery/jquery-2.1.4.js"></script>
    <script type="text/javascript">
    	<jsp:include page="remove2.jsp" flush="false"/>
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
                    <h3>查看出库信息</h3>
                </div>
            </div>

            <div class="row">

                <div class="row">
                    <div class="col-sm-3 col-sm-push-2">领用小班:<label>${list[0].className}</label></div>
                    <div class="col-sm-3 col-sm-push-2 ">出库人:<label>${list[0].houseUserName}</label></div>
                    <div class="col-sm-3 col-sm-push-2 ">领用日期:<label>${list[0].date}</label></div>

                </div>

                <div class="row">
                    <table class="table table-hover table-bordered">
                        <tr>
                            <th>物品名称</th>
                            <th>类别</th>
                            <th>防治类型</th>
                            <th>领用数量</th>
                        </tr>
                      	<c:forEach items="${list}" var="li">
                      	 <tr>
                      	   <td>${li.instrumentName }</td>
                      	   <td>${li.instrumentType }</td>
                      	   <td>${li.instrumentKind }</td>
                      	   <td>${li.instrumentNumber }</td>
                      	 </tr>
                      	</c:forEach>

                    </table>
                </div>

                <div class="row">
                    <div class="col-sm-3  col-sm-push-5"> <a href="jsp/house.jsp">返回</a></div>
                </div>
            </div>
        </div>
    </div>
	
    <div class="row">
        <div class="col-sm-12"></div>
    </div>
</div>
</body>
</html>