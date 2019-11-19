<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>资源管理</title>
    <link rel="stylesheet" type="text/css" href="css/public.css">
    <link rel="stylesheet" type="text/css" href="css/MyResource.css">
    <link rel="stylesheet" type="text/css" href="js/jquery-3.3.1.min.js">
</head>

<body>
<div class="navigation"> <!--导航-->
    <div class="navigatLeft">
        <ul>
            <li><a href="list" title="首页图片"><img src="images/ico.jpg"/></a></li>
            <li><a href="list" title="首页" style="margin-left:0px">首页</a></li>
            <li><a href="list" title="博客">博客</a></li>
            <li><a href="rList" title="下载">下载</a></li>
            <li><a href="" title="APP">APP</a></li>
            <li><a href="" title="专题">专题</a></li>
            <li><a href="" title="招聘">招聘</a></li>
            <li><a href="" title="课程">课程</a></li>
            <li><a href="" title="GitHub">GitHub</a></li>
            <li>
                <div class="navigatLeftSearch">
                    <input type="text" class="inputSearch" name="search" id="search" placeholder="搜索"/>
                    <a href="">
                        <img src="images/search.jpg" class="icoSearch"/>
                    </a>
                </div>
            </li>
            <li class="writeBlog">
                <a href="WriteBlog.jsp" title="writeBlog">
                    <img src="images/write_blog.jpg"/>
                    <span>写博客</span>
                </a>
            </li>
            <li class="message">
                <a href="" title="message">
                    <img src="images/message.jpg"/>
                    <span>消息</span>
                </a>
            </li>
            <s:if test="#session.saveUserInformationTOSession==null">
                <li class="login_regist">
                    <a href="Login.jsp" title="login">登陆</a>
                    <span></span>
                    <a href="Regist.jsp" title="regist">注册</a>
                </li>
            </s:if>
            <s:else>
                <li class="loginedUser">
                    <div class="loginedUserBox">
                        <a href="" class="loginedUserBoxA"><img class="loginedUserBoxAImg" src="images/defaultPic.jpg"></a>
                    </div>
                </li>
                <li>
            		<a href="doGetMyArticles">博客管理</a>
            	</li>
            	<li>
            		<a href="doGetMyResources">资源管理</a>
            	</li>
            </s:else>
        </ul>
    </div>
</div>
<div class="clears"></div>
<div class="news_nav">
    <div class="container">
        <div class="nav_bar">
            <a href="rList">下载首页</a>
            <a href="">精品推荐</a>
            <a href="">我的资源</a>
            <a href="">上传资源赚积分</a>
            <a href="">已下载</a>
            <a href="">我的收藏</a>
            <a href="">参与活动送会员</a>
            <span class="hot_text">hot</span>
        </div>
        <div class="search_download">
            <a href="" class="help">☹下载帮助</a>
        </div>
    </div>
    <div class="clears"></div>
</div>
<div class="meeting_main">
    <div class="download_profile">
        <div class="profile_card">
            <div class="card1">
                <img src="images/defaultPic.jpg" class="avatar">
            </div>
            <div class="brief">
                <div class="name"><span>${session.saveUserInformationTOSession.name}</span></div>
                <p class="rights">
                    <span><img src="images/grade.png"></span>
                    <span><label>上传权限：</label>220M</span>
                </p>
            </div>
            <ul class="datas">
                <li><label>积分</label>
                    <span>0</span>
                </li>
                <li><label>总排名</label>
                    <span>427390943</span>
                </li>
                <li><label>上传资源</label>
                    <span>0</span>
                </li>
                <li><label>下载资源</label>
                    <span>1</span>
                </li>
                <li><label>创建专辑</label>
                    <span>0</span>
                </li>
            </ul>
        </div>
        <div class="cardr">
            <ul class="non_nembers">
                <li>
                    <a href="rList" class="btn_vip">下载资源</a>
                </li>
            </ul>
        </div>
        <div class="clears"></div>
        <div class="main">
            <div class="datas_detail left">
                <ul class="tabs" id="tabs">
                    <li class="cur" onClick="change(this,0)"><a href="">上传资源</a></li>
                    <li onclick="change(this,1)"><a>积分明细</a></li>
                    <li onclick="change(this,2)"><a>下载明细</a></li>
                    <li onclick="change(this,3)"><a>我的收藏</a></li>
                </ul>
                <div class="clears"></div>
                <div class="items" id="items">
                	
                    <div id = "uploading_div">
                    	<div class="selector_box">
	                        <a href="" class="btn_selector active">全部</a>
	                        <a href="" class="btn_selector">待审核</a>
	                        <a href="" class="btn_selector">已通过</a>
	                        <a href="" class="btn_selector">未通过</a>
	                        <a href="" class="btn_selector">已私密</a>
	                    </div>
	                    <div class="clears"></div>
	                    <div class="list_container">
	                    <s:iterator id="mResource" value="#request.myResources">
	                    	<!--循环开始-->
	                    	<ul>
	                        	<li>
	                            	<div class="resourceBox">
	                                
	                                	<div class="resourceImg"><!--资源类型图片-->
	                                    	<a><img src="images/fileImg.jpg"/></a>
	                                    </div>
	                                    <div class="resourceCon"><!--资源信息-->
	                                    	<h3>
	                                        	<a target="_blank" href="doGetResource?resource.id=${mResource.id }">${mResource.name}</a>
	                                        </h3>
	                                    </div>
	                                    <div class="clears"></div>
	                                    <div class="resourceTagBox">
	                                        <s:iterator id="keyword" value="#mResource.resourceKeyword">
	                                            <label class="resourceTag">
	                                                <a target="_blank" href="">${keyword.name}</a>
	                                        	</label>
	                                        </s:iterator>
	                                    	
	                                        <div class="resourceState">
	                                        	<span class="resourceStatu">${mResource.status}</span>
	                                        </div>
	                                    </div>
	                                    <div class="resourceDate">
	                                    	<label>上传时间：</label>
	                                        ${mResource.releaseTime}
	                                    </div>
	                                    <div class="resourceScore">
	                                    	<label>所需积分/C币：</label>
	                                        5
	                                    </div>
	                                    <div class="resourceOperate">
	                                    	<a href="" class="">编辑</a>
	                                       	<label class="ShuXian"></label>
	                                        <a href="doResourcePrivate?resource.id=${mResource.id }&resource.status=已私密" class="">私密</a>
	                                        <label class="ShuXian"></label>
	                                        <a class="" id="copyUrl" onclick="copyUrl('doGetResource?resource.id=${mResource.id}')">复制链接</a>
	                                    </div>
	                                </div>
	                                
	                            </li>
	                        </ul>
	                        <div class="list_container_nav"><!--分割线--></div>
						</s:iterator>
	                    </div>
                    </div>
                    <div id="integral_div" class="hide">
                    	<div class="item score_detail" style="background: white;">
                        	<ul>
                            	<li>
                                	<div class="card">
                                    	<div class="score">分数</div>
                                        <div class="date">时间</div>
                                        <div class="from">下载资源</div>
                                        
                                    </div>
                                    <div class="card" style="font-size: 20px; color: black;">
                                    	<div class="score" style="color: red;">-5</div>
                                        <div class="date">2015-06-03</div>
                                        <div class="from">愤怒的小鸟项目源代码</div>
                                        
                                    </div>
                                </li>
                            </ul>
                            <div class="clears"></div>
                            <div class="page_nav"></div>
                        </div>
                    </div>
                	<div id="download_div" class="hide">
                		<div class="item uresource">
                        	<ul>
                            	<li>
                                	<div class="card" style="background:#FFF">
                                    	<div class="img rar1">
                                        	<a><img src="images/img_rar.png"></a>
                                        </div>
                                        <div class="content">
                                        	<h3>
                                            	<a>愤怒的小鸟项目源代码</a>
                                            </h3>
                                            <p class="brief">项目源代码，Java实现的</p>
                                            <div class="flec-box state-box">
                                            	<p class="tags"><a>项目源码</a></p>
                                            </div>
                                            <div class="date">
                                            	<label>上传时间：</label>
                                                2015-06-03
                                            </div>
                                            <div class="score">
                                            	<label>所需积分：</label>3
                                            </div>
                                            <div class="flag">
                                            	<a>立即评价</a>
                                            </div>
                                        </div>
                                        <div class="content" style="margin-left:42px; display:none;"></div>
                                    </div>
                                </li>
                            </ul>
                            <div class="clears"></div>
                        	<div class="page_nav"></div>
                        </div>
                	</div>
                	<div id="collect_div" class="hide">
                    	<div class="item uresource">
                        	<ul>
                            	<li>
                                	<div class="card" style="background:#FFF">
                                    	<div class="img rar1">
                                        	<a><img src="images/img_rar.png"></a>
                                        </div>
                                        <div class="content">
                                        	<h3>
                                            	<a>filter,安卓系统.zip</a>
                                            </h3>
                                            <p class="brief">Android 热修复框架 （基于类加载机制的代码修复）支持 Android 5.0 以上设备运行时修复，应用无需重启版本更新时要注意 dex 修复包的清理1.如何接入Project 层级下的 build.gradle 文件Module 层级下的 build.gradle 文件2.类及其方法介绍Fe</p>
                                            <div class="flec-box state-box">
                                            	<p class="tags"><a>开源项目</a></p>
                                            </div>
                                            <div class="date">
                                            	<label>上传时间：</label>
                                                2018-09-24
                                            </div>
                                            <div class="score">
                                            	<label>所需积分：</label>5
                                            </div>
                                            <div class="flag">
                                            	<a>取消收藏</a>
                                            </div>
                                        </div>
                                        <div class="content" style="margin-left:42px; display:none;"></div>
                                    </div>
                                </li>
                            </ul>
                            <div class="clears"></div>
                        	<div class="page_nav"></div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="aside right">
                <div class="btns"><!-- 暂做静态拦截，后续修改 -->
           		<s:if test="#session.saveUserInformationTOSession==null">
                	<a href="Login.jsp">上传资源</a>
            	</s:if>
            	<s:else>
                	<a href="UploadFile.jsp">上传资源</a>
            	</s:else>   
                </div>
                <div class="tags">
                    <h3>我的tag</h3>
                    <div class="content">
                        暂无内容
                    </div>
                </div>
                <div class="clears"></div>
                <div class=""></div><!--自定义内容-->
            </div>
        </div>
    </div>
</div>

</body>
<script type="text/javascript">
//切换
function change(t,suoyin){
	var tabs = document.getElementById("tabs");
	var li = tabs.getElementsByTagName("li");
	var i = 0;
	for(i = 0;i<=li.length-1;i++){
		li[i].className = "";
		}
	t.className="cur";
	var items = document.getElementById("items");
	var divs = items.children;
		for(i = 0;i<=divs.length-1;i++){
			divs[i].className = "hide";
			}
	divs[suoyin].className = ""
}

//复制标签
function copyUrl(str) {  
	inp = document.createElement("input");
	inp.id = "copy";
	inp.type="text"
	inp.value = "http://localhost:8080/Blog_Download/" + str;
	document.body.appendChild(inp)
	inp.select();
	document.execCommand("Copy")
	document.body.removeChild(inp)
    alert("已复制到剪贴板✔");  
}
</script>
</html>
