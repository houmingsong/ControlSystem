<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>专家会商</title>
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
            margin:0 auto;
        }
        select{
            height: 200px;
            width: 60px;
             float: left;
        }
    </style>
    <script>
    <jsp:include page="remove.jsp" flush="false"/>
        function moveleft(obj){
            var left = document.getElementById("left");
            var leftList = left.childNodes;
            var right = document.getElementById("right");
            if(obj.className=="all"){
                for(var i=leftList.length-1;i>=0;i--){
                    right.appendChild(leftList[i]);
                }
                return
            }
            for(var i=leftList.length-1;i>=0;i--){
                if(leftList[i].selected){
                    right.appendChild(leftList[i]);
                }
            }
        }
        function moveright(obj){
            var left = document.getElementById("left");
            var right = document.getElementById("right");
            var rightList = right.childNodes;
            if(obj.className=="all"){
                for(var i=rightList.length-1;i>=0;i--){
                    left.appendChild(rightList[i]);
                }
                return
            }
            for(var i=rightList.length-1;i>=0;i--){
                if(rightList[i].selected){
                    left.appendChild(rightList[i]);
                }
            }
        }

        window.onload = function() {
            var left = document.getElementById("left");
            var right = document.getElementById("right");
            left.ondblclick = function(){
                var oList = left.options;
                right.appendChild(oList[left.selectedIndex]);
            }
            right.ondblclick = function(){
                var oList = right.options;
                left.appendChild(oList[right.selectedIndex]);
            }
        }
    </script>
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
                    <h3>专家会商</h3>
                </div>
            </div>

            <div class="row">
             <form action="AddMeetingServlet" method="get">
                <div class="row">
                    <div class="col-sm-3 col-sm-push-2">事件名称:</div>
                    <div class="col-sm-3 "><label >${thingBean.name}</label></div>
                    <div class="col-sm-3 ">灾区图片:</div>
                    <div class="col-sm-3 col-sm-pull-2"><label >${thingBean.image}</label></div>
                </div>
                <div class="row">
                    <div class="col-sm-3 col-sm-push-2">时间:</div>
                    <div class="col-sm-3"><input type="text" name="time" value="${thingBean.time }" ></div>
                    <div class="col-sm-3"></div>
                    <div class="col-sm-3 col-sm-pull-2"><label ></label> </div>
                </div>
                <div class="row">
                    <div class="col-sm-3 col-sm-push-2">灾情描述:</div>
                    <div class="col-sm-3"><label >${thingBean.description}</label></div>
                    <div class="col-sm-3">发现途径:</div>
                    <div class="col-sm-3 col-sm-pull-2"><label >${thingBean.find}</label></div>
                </div>
                <div class="row">
                    <div class="col-sm-3 col-sm-push-2">发生位置:</div>
                    <div class="col-sm-3"><label >${thingBean.areaName}</label> </div>
                    <div class="col-sm-3">灾害类型:</div>
                    <div class="col-sm-3 col-sm-pull-2"><label >${thingBean.kind}</label> </div>
                </div>
                <div class="row">
                    <div class="col-sm-3 col-sm-push-2">会商结果:</div>
                    <div class="col-sm-3"><input type="text" name="result"></div>
                    <div class="col-sm-3">会商人员:</div>
                    <div class="col-sm-3 col-sm-pull-2"><label ><select id="left" name="person" multiple="multiple">
    <option ondblclick="clickMove(this)">张大海</option>
    <option value="李鹏">李鹏</option>
    <option value="张玉玲">张玉玲</option>
        <option value="何玉瑞">何玉瑞</option>
        <option value="陶大宇">陶大宇</option>
        <option value="麦蒂">麦蒂</option>
    </select>
     <input type="button" value=">" onclick="moveleft(this)">
    <input type="button" value=">>" class="all" onclick="moveleft(this)">
    <input type="button" value="<" onclick="moveright(this)">
    <input type="button" value="<<" class="all" onclick="moveright(this)">
    <select id="right" name="person" multiple="multiple">
    </select>
   </label> </div>
                </div>
                <div class="row">
                    <div class="col-sm-3 col-sm-push-2">影响面积:</div>
                    <div class="col-sm-3"><label >${thingBean.acreage}</label> </div>
                </div>
                <div class="row">
                    <table class="table table-hover table-bordered">
                     <tr>
                            <th>日期</th>
                            <th>会商人员</th>
                            <th>会商结果</th>
                        </tr>
                        <tr>
                       <c:forEach items="${meetingList}" var="meeting">
                      <td>${meeting.time }</td>
                          <td>${meeting.person }</td>
                          <td>${meeting.result }</td>
                      </c:forEach>
                           </tr>
                    </table>
                </div>
                <div class="row">
                  <div class="col-sm-3  col-sm-push-3"> <input type="submit" value="添加会商信息"></div>
                  </div>
                    </form>
                  
                    <div class="col-sm-3  col-sm-push-3"> <a href="jsp/talk.jsp">返回</a></div>
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