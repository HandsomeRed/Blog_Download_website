<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>主页</title>
<link rel="stylesheet" type="text/css" href="css/public.css">
<link rel="stylesheet" type="text/css" href="css/BlogPerson.css">
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
                    	<img  src="images/search.jpg" class="icoSearch"/>
                    </a>
                </div>
            </li>
            
            <s:if test="#session.saveUserInformationTOSession==null">
            	<li class="writeBlog">
            		<a href="doLoginWriteBlog" title="writeBlog">
                		<img src="images/write_blog.jpg"/>
                    	<span>写博客</span>
                	</a>
            	</li>
            	<li class="message">
            		<a href="" title="message">
                		<img src="images/message.jpg" />
                    	<span>消息</span>
                	</a>
            	</li>
            	<li class="login_regist">
            		<a href="Login.jsp" title="login">登陆</a>
             	   <span></span>
             	   <a href="Regist.jsp" title="regist">注册</a>
            	</li>
            </s:if>
            <s:else>
            	<li class="writeBlog">
            		<a href="WriteBlog.jsp" title="writeBlog">
                		<img src="images/write_blog.jpg"/>
                    	<span>写博客</span>
                	</a>
            	</li>
            	<li class="message">
            		<a href="" title="message">
                		<img src="images/message.jpg" />
                    	<span>消息</span>
                	</a>
            	</li>
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
<s:div id="author" value="#request.author">
<div class="banner">
	<div class="container">
    	<div class="title">
        	<h1 class="title_blog">
            	<a href="" class="a_text_white">${author.blogMng.title }</a>
            </h1>
            <p class="description">${author.blogMng.desc }</p>
        </div>
    </div>

</div>
<div class="content" id="">
	
    <div class="leftBox left" style="width:300px"><!--左侧框体-->
            <div class="authorInforBox"><!--作者信息框体-->
                <div class="authorInforUpBox"><!--上层-->
                    <div class="authorPic"><!--头像-->
                        <a><img src="images/defaultPic.jpg"/></a>
                    </div>
                    <div class="authorInfor"><!--用户名-->
                        <p><a class="authorName">${author.name}</a></p>
                        <p><a class="homePage">TA的个人主页</a></p>
                    </div>
                    <div class="guanzhuBtnBox"><!--关注按钮-->
                        <span>
                    	<a class="guanzhuBtn">关注</a>
                    </span>
                    </div>
                </div>
                <div class="authorInforMiddleBox"><!--中层-->
                    <dl class="MiddleBoxDl" title="">
                        <dt class="authorInforText"><a>原创</a></dt>
                        <dt><a><span class="authorInforNum">1234</span></a></dt>
                    </dl>
                    <dl class="MiddleBoxDl" title="">
                        <dt class="authorInforText">粉丝</dt>
                        <dd><span class="authorInforNum">3万+</span></dd>
                    </dl>
                    <dl class="MiddleBoxDl" title="">
                        <dt class="authorInforText">喜欢</dt>
                        <dd><span class="authorInforNum">3万+</span></dd>
                    </dl>
                    <dl class="MiddleBoxDl" title="">
                        <dt class="authorInforText">评论</dt>
                        <dd><span class="authorInforNum">1万+</span></dd>
                    </dl>
                </div>
                <div class="clears"></div>
                <div class="authorInforDownBox">
                    <div class="authorInforDown">
                        <dl>
                            <dt>等级：</dt>
                            <dd>Lv10</dd>
                        </dl>
                        <dl>
                            <dt>访问：</dt>
                            <dd title="">1084万+</dd>
                        </dl>
                        <dl>
                            <dt>积分：</dt>
                            <dd title="">13万+</dd>
                        </dl>
                        <dl title="">
                            <dt>排名：</dt>
                            <dd>5</dd>
                        </dl>
                    </div>
                </div>
            </div>
            <!--以下为左侧自定义框体-->
        </div>
    
    </s:div>
    <div class="main left">
   		<div class="filter_box ">
    		<table width="700" border="0">
  				<tr>
    				<td width="100">
                    	<form action="" id="Original">
            				<label class="ck_box" for="ckOriginal">
            					<input onChange="" type="checkbox" id="">只看原创
                            </label>
        				</form>
                    </td>
					<td width="20">排序</td>
    				<td width="10"><a href="">默认</a></td>
    				<td width="40"><a href="">按更新间</a></td>
    				<td width="40"><a href="">按访问量</a></td>
    				<td width="40"><a href="">RSS订阅</a></td>
  				</tr>
			</table>
        </div>
        
		<div class="article-list left">
			<s:iterator id="sArticle" value="#request.someoneArticleList"><!-- 循环开始 -->
            <div class="articleBox">
            	<h4>
            		<a href="doGetBlogArticle?ba.id=${sArticle.id}" class="a_text_black">
            			<span class="article_type">${sArticle.type}</span>
            			${sArticle.title}
            		</a>
            	</h4>
            	<div class="cnt">
            		<a href="" class="a_text_black">
            			${sArticle.content.substring(0,10)}...
            		</a>
            	</div>

                <div class="info_box">
                	<span><span class="date">${sArticle.releaseTime}</span></span>
                    <span class="point"></span>
                    <span><span class="reead_num">阅读数  </span><span class="num">${sArticle.readNum}</span></span>
                    <span class="point"></span>
                    <span><span class="reead_num">评论数  </span><span class="num">${sArticle.likeNum}</span></span>
                </div>
            </div>
            </s:iterator>
            
        </div>
    </div>
    <div class="clears"></div>
</div>

</body>
</html>