<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>添加事件信息</title>
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
            margin-top:35px;
        }
        #div231{
            background-color:white;
            border: none;
        }
    </style>
    <script type="text/javascript" src="../jquery/jquery-2.1.4.js"></script>	
	<script type="text/javascript">
	<jsp:include page="remove.jsp" flush="false"/>
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
                    <h3>添加事件信息</h3>
                </div>
            </div>

            <div class="row">

                <form action="../AddThingServlet" method="get">
                    <div class="row">
                        <div class="col-sm-3 col-sm-push-2">事件名称:</div>
                        <div class="col-sm-3 "><input type="text" name="name"/></div>
                        <div class="col-sm-3 ">灾区图片:</div>
                        <div class="col-sm-3 col-sm-pull-2"><input type="file" name="image"/></div>
                    </div>
                    <div class="row">
                        <div class="col-sm-3 col-sm-push-2">时间:</div>
                        <div class="col-sm-3"><input type="date" name="time"/></div>
                        <div class="col-sm-3">灾害类型:</div>
                        <div class="col-sm-3 col-sm-pull-2">
                            <select name="kind">
                                <option value="虫害">虫害</option>
                                <option value="鼠害">鼠害</option>
                                <option value="病害">病害</option>
                                
                            </select>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-3 col-sm-push-2">灾情阶段:</div>
                        <div class="col-sm-3">
                            <select name="condition">
                                <option value="已得到控制">已得到控制</option>
                                <option value="防治中">防治中</option>
                                <option value="无法解决，申请专家会商">无法解决，申请专家会商</option>
                            </select>
                        </div>
                        <div class="col-sm-3">发现途径:</div>
                        <div class="col-sm-3 col-sm-pull-2"><input type="text" name="find"/></div>
                    </div>
                    <div class="row">
                        <div class="col-sm-3 col-sm-push-2">灾情描述:</div>
                        <div class="col-sm-3">
                            <textarea name="description" id="" cols="22" rows="3"></textarea>
                        </div>
                        <div class="col-sm-3">发生位置:</div>
                        <div class="col-sm-3 col-sm-pull-2">
                            <select name="areaName">
                                <option value="雅安一号地区">雅安一号地区</option>
                                <option value="宜宾二号地区">宜宾二号地区</option>
                                <option value="攀枝花三号地区">攀枝花三号地区</option>
                            </select>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-3 col-sm-push-2">所在小班:</div>
                        <div class="col-sm-3"><input type="text" name="className"/></div>
                        <div class="col-sm-3">初步损失:</div>
                        <div class="col-sm-3 col-sm-pull-2"><input type="text" name="loss"/></div>
                    </div>
                    <div class="row">
                        <div class="col-sm-3 col-sm-push-2">影响面积:</div>
                        <div class="col-sm-3"><input type="text" name="acreage"/></div>
                        <div class="col-sm-3">防治方案:</div>
                        <div class="col-sm-3 col-sm-pull-2"><input type="text" name="defend"/></div>
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