<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LIBD首页</title>
<link rel="stylesheet" type="text/css" href="css/public.css">
<link rel="stylesheet" type="text/css" href="css/index.css">
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
<div class="content"><!--大内容框架-->
	<div class="classify">
    	<ul class="classifyUL">
    		<li class="focus"><a  href="list">推荐</a></li>
    		<s:iterator id="classify" value="#request.ArticleClassifyList"><!-- blogclassifyList 包含分类以及分类下文章集合的集合 -->
            <li><a href="list?type.id=${classify.id}">${classify.name}</a></li>
    		</s:iterator>
        </ul>
    </div><!--左侧分类-->
    <div class="fixContent"><!--右侧内容-->
    	<div class="blogView">
        	<ul class="blogViewUl">
        	<!-- 2019年8月27日 22:10:15 未完成 -->
        	<s:iterator id="blogList" value="#request.selectArticlesList">
        		<li><!-- 单条博文开始 --><!-- 单条博文开始 -->
                	<div class="listContent">
                    	<div class="titleDiv">
                        	<h2><a href="doGetBlogArticle?ba.id=${blogList.id}" class="titleH2">${blogList.title}</a></h2>
                        </div>
                        <div class="summary"><!-- 概要 -->
                        	${blogList.content.substring(0,10)}...
                        </div>
                        <dl class="listUserBar">
                   			<dt><!-- 头像 -->
                            	<a href="" class="userImg"><img src="images/touxiang.jpg"/></a>
                            </dt>
                            <dd class="name">
                            	<a href="doGetBlogMng?user.id=${blogList.blogMng.user.id}">${blogList.blogMng.user.name}</a>
                            </dd>
                            <div class="fenge"></div>
                            <dd class="time">${blogList.releaseTime}</dd>
                            <div class="right read_comment"><!-- 阅读 评论数 -->
                            	<dd class="readNum">
                                	<a href=""><span class="text">阅读</span><span class="num">${blogList.readNum}</span></a>
                                </dd>
                                <div class="fenge"></div><!-- 竖线分隔符 -->
                                <dd class="commentNum">
                                	<a href=""><span class="text">喜欢</span><span class="num">${blogList.likeNum}</span></a>
                                </dd>
                            </div>
                        </dl>
                    </div>
                </li><!-- 单条博文结束 -->
        	</s:iterator>
                
            </ul>
        </div><!--博文浏览-->
    	<div class="rightBox">
        	<div class="tuijian"><!--每日推荐-->
            	<h3 class="todayTuijian">
                	<span class="redLine"><!--红色竖线--></span>
                    <span class="txt">每日推荐</span>
                </h3>
                <div>
                	<ul class="tuijianList">
                    	<li>
                        	<div class="imgBox">
                            	<a href=""><img src="images/tuijianPic.jpg" class="tuijianPic"/></a>
                            </div>
                            <div class="tuijianContent">
                            	<h3 class="tuijian_con"><a href="">64%的投资者对比特币不感兴趣，那是谁投资了比特币？</a></h3>
                            </div>
                        </li>
                        <li>
                        	<div class="imgBox">
                            	<a href=""><img src="images/tuijianPic.jpg" class="tuijianPic"/></a>
                            </div>
                            <div class="tuijianContent">
                            	<h3 class="tuijian_con"><a href="">64%的投资者对比特币不感兴趣，那是谁投资了比特币？</a></h3>
                            </div>
                        </li>
                        <li>
                        	<div class="imgBox">
                            	<a href=""><img src="images/tuijianPic.jpg" class="tuijianPic"/></a>
                            </div>
                            <div class="tuijianContent">
                            	<h3 class="tuijian_con"><a href="">64%的投资者对比特币不感兴趣，那是谁投资了比特币？</a></h3>
                            </div>
                        </li>
                        <li>
                        	<div class="imgBox">
                            	<a href=""><img src="images/tuijianPic.jpg" class="tuijianPic"/></a>
                            </div>
                            <div class="tuijianContent">
                            	<h3 class="tuijian_con"><a href="">64%的投资者对比特币不感兴趣，那是谁投资了比特币？</a></h3>
                            </div>
                        </li>
                        <li>
                        	<div class="imgBox">
                            	<a href=""><img src="images/tuijianPic.jpg" class="tuijianPic"/></a>
                            </div>
                            <div class="tuijianContent">
                            	<h3 class="tuijian_con"><a href="">64%的投资者对比特币不感兴趣，那是谁投资了比特币？</a></h3>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
            <div><!--关于我们-->
            </div>
        </div><!--推荐栏 关于我们-->
    </div>
    
</div>

</body>
</html>