<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>虫害详细信息</title>
    <link rel="stylesheet" href="css/bootstrap-3.3.7-dist/css/bootstrap.css">
    <script type="text/javascript" src="jquery/jquery-2.1.4.js"></script>
    <script type="text/javascript">
    	<jsp:include page="remove2.jsp" flush="false"/>
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
    </style>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-sm-12"><h4>森林病虫害防治系统</h4></div>
    </div>

    <div class="row">
        <div class="col-sm-2">
            <ul>
                <li><a href="jsp/index.jsp">森林病虫害防治系统</a></li>
            </ul>
            <ul id="head1">
                <li>资料整理</li>
                <li>
                    <ul>
                        <li><a href="jsp/worm.jsp">虫害一览</a></li>
                        <li><a href="jsp/disease.jsp">病害一览</a></li>
                        <li><a href="jsp/mouse.jsp">鼠害一览</a></li>
                    </ul>
                </li>
            </ul>
            <ul id="head2">
                <li class="head2">灾情防治</li>
                <li>
                    <ul>
                        <li><a href="jsp/area.jsp">区域一览</a></li>
                        <li><a href="jsp/minclass.jsp">小班管理</a></li>
                        <li><a href="jsp/event.jsp">事件记录</a></li>
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
                        <li><a href="jsp/medicine.jsp">药剂管理</a></li>
                        <li><a href="jsp/house.jsp">出库管理</a></li>
                    </ul>
                </li>
            </ul>
            <ul id="head5">
                <li>系统信息</li>
                <li>
                    <ul>
                        <li><a href="jsp/user.jsp">用户管理</a></li>
                        <li><a href="jsp/log.jsp">日志一览</a></li>
                    </ul>
                </li>
            </ul>
        </div>

        <div class="col-sm-10">
            <div class="row">
                <div class="col-sm-12" id="div231">
                    <h3>虫害详细信息</h3>
                </div>
            </div>

            <div class="row">

                <div class="row">
                    <div class="col-sm-3 col-sm-push-2">名称:</div>
                    <div class="col-sm-3 "><label id="name">${WormBean.name}</label></div>
                    <div class="col-sm-3 ">繁殖:</div>
                    <div class="col-sm-3 col-sm-pull-2"><label>${WormBean.breed}</label></div>
                </div>
                <div class="row">
                    <div class="col-sm-3 col-sm-push-2">寄主:</div>
                    <div class="col-sm-3"><label id="host">${WormBean.host}</label></div>
                    <div class="col-sm-3">天敌:</div>
                    <div class="col-sm-3 col-sm-pull-2"><label>${WormBean.enemy}</label> </div>
                </div>
                <div class="row">
                    <div class="col-sm-3 col-sm-push-2">成虫图片:</div>
                    <div class="col-sm-3"><img src=/ControlSystem/img/${WormBean.bigImage} height="100px"  width=150px></div>
                    <div class="col-sm-3">幼虫图片:</div>
                    <div class="col-sm-3 col-sm-pull-2"><img src=/ControlSystem/img/${WormBean.smallImage} height="100px"  width=150px></div>
                </div>
                <div class="row">
                    <div class="col-sm-3 col-sm-push-2">防治措施:</div>
                    <div class="col-sm-3"><label>${WormBean.defend}</label> </div>
                    <div class="col-sm-3">主要危害:</div>
                    <div class="col-sm-3 col-sm-pull-2"><label>${WormBean.harm}</label></div>
                </div>

                <div class="row">
                    <div class="col-sm-3  col-sm-push-5"> <a href="jsp/worm.jsp">返回</a></div>
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