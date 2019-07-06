<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>添加虫害</title>
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
            margin-top:20px;
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
                <li><a href="index.jsp">森林病虫害防治系统</a></li>
            </ul>
            <ul  id="head1">
                <li>资料整理</li>
                <li>
                    <ul>
                        <li><a href="worm.jsp">虫害一览</a></li>
                        <li><a href="disease.jsp">病害一览</a></li>
                        <li><a href="mouse.jsp">鼠害一览</a></li>
                    </ul>
                </li>
            </ul>
            <ul  id="head2">
                <li>灾情防治</li>
                <li>
                    <ul>
                        <li><a href="area.jsp">区域一览</a></li>
                        <li><a href="minclass.jsp">小班管理</a></li>
                        <li><a href="event.jsp">事件记录</a></li>
                    </ul>
                </li>
            </ul>
            <ul  id="head3">
                <li>专家会商</li>
                <li>
                    <ul>
                        <li><a href="expert.jsp">专家一览</a></li>
                        <li><a href="talk.jsp">会商灾情</a></li>
                    </ul>
                </li>
            </ul>
            <ul  id="head4">
                <li>药剂器械出库管理</li>
                <li>
                    <ul>
                        <li><a href="medicine.jsp">药剂管理</a></li>
                        <li><a href="house.jsp">出库管理</a></li>
                    </ul>
                </li>
            </ul>
            <ul  id="head5">
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
                    <h3>添加虫害</h3>
                </div>
            </div>

            <div class="row">

                <form action="../WormAddServlet" method="post" enctype="multipart/form-data">
                    <div class="row">
                        <div class="col-sm-3 col-sm-push-4">名称:</div>
                        <div class="col-sm-3 col-sm-push-2"><input type="text" name="name" oninput="setCustomValidity('')"
                    pattern="^[\u4e00-\u9fa5]{0,6}$"
                    oninvalid="setCustomValidity('请输入汉字，最多6位');"
                    placeholder="请输入汉字，最多6位"
                    required /><span id="name"></span></div>
                    </div>
                    <div class="row">
                        <div class="col-sm-3 col-sm-push-4">寄主:</div>
                        <div class="col-sm-3 col-sm-push-2"><input type="text" name="host" oninput="setCustomValidity('')"
                    pattern="^[\u4e00-\u9fa5]{0,13}$"
                    oninvalid="setCustomValidity('请输入汉字，最多13位');"
                    placeholder="请输入汉字，最多13位"
                    required /><span id="host"></span></div>
                    </div>
                    <div class="row">
                        <div class="col-sm-3 col-sm-push-4">繁殖:</div>
                        <div class="col-sm-3 col-sm-push-2"><input type="text" name="breed" oninput="setCustomValidity('')"
                    pattern="^[\u4e00-\u9fa5]{0,13}$"
                    oninvalid="setCustomValidity('请输入汉字，最多13位');"
                    placeholder="请输入汉字，最多13位"
                    required /><span id="breed"></span></div>
                    </div>
                    <div class="row">
                        <div class="col-sm-3 col-sm-push-4">天敌:</div>
                        <div class="col-sm-3 col-sm-push-2"><input type="text" name="enemy" oninput="setCustomValidity('')"
                    pattern="^[\u4e00-\u9fa5]{0,13}$"
                    oninvalid="setCustomValidity('请输入汉字，最多13位');"
                    placeholder="请输入汉字，最多13位"
                    required /><span id="enemy"></span></div>
                    </div>
                    <div class="row">
                        <div class="col-sm-3 col-sm-push-4"> 幼虫图片:</div>
                        <div class="col-sm-3 col-sm-push-2">
                            <input type="file" name="bigImage" /><span id="bigImage"></span>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-3 col-sm-push-4"> 成虫图片:</div>
                        <div class="col-sm-3 col-sm-push-2">
                            <input type="file" name="smallImage"/><span id="smallImage"></span>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-3 col-sm-push-4"> 防治措施:</div>
                        <div class="col-sm-3 col-sm-push-2">
                            <textarea name="defend"  cols="22" rows="3" oninput="setCustomValidity('')"
                    pattern="^[\u4e00-\u9fa5]{0,13}$"
                    oninvalid="setCustomValidity('请输入汉字，最多13位');"
                    placeholder="请输入汉字，最多13位"
                    required ></textarea><span id="defend"></span>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-3 col-sm-push-4"> 主要危害:</div>
                        <div class="col-sm-3 col-sm-push-2">
                            <textarea name="harm" cols="22" rows="3" oninput="setCustomValidity('')"
                    pattern="^[\u4e00-\u9fa5]{0,13}$"
                    oninvalid="setCustomValidity('请输入汉字，最多13位');"
                    placeholder="请输入汉字，最多13位"
                    required ></textarea><span id="harm"></span>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-3  col-sm-push-6"> <input type="submit"  value="添加" oninput="setCustomValidity('')"
                    pattern="^[\u4e00-\u9fa5]{0,13}$"
                    oninvalid="setCustomValidity('请输入汉字，最多13位');"
                    placeholder="请输入汉字，最多13位"
                    required /><span id="add"></span></div>
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