<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>LIBD_${ba.title}</title>
    <link rel="stylesheet" type="text/css" href="css/public.css">
    <link rel="stylesheet" type="text/css" href="css/index.css">
    <link rel="stylesheet" type="text/css" href="css/BlogArticle.css">
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

<s:div id="ba" value="#request.blogArticle">
    <div class="MainBox"><!--博文页面主体-->
        <div class="main"><!--右侧文章内容-->
            <div class="blogContentBox"><!--Main-->
                <div class="blogHeadBox"><!--博文头部框体-->
                    <div>
                        <div class="blogTitle"><!--title-->
                            <span>${ba.type}</span><!--文章类型-->
                            <h1>${ba.title}</h1><!--文章标题-->
                        </div>
                        <div class="clears"></div>
                        <div class="blogInfor">
                            <span>${ba.releaseTime}</span>
                            <a class="" href="">${ba.blogMng.user.name}</a>
                            <span>阅读数 ${ba.readNum}</span>
                        </div>
                    </div>
                </div>
                <div class="blogArticle"><!---博文内框体-->
                    <div class="articleContent">
                        <span>版权声明：本文为博主原创，转载请附上原文出处链接和本声明。</span>
                        <div class="linkBox">
                            本文链接：<a href="" class="link" id="thisUrl"></a>
                        </div>
                    </div>
                    <div class="blogContent"><!--博客正文-->
                            ${ba.content}
                    </div>
                </div>
            </div>
            <div><!--附件下载--->
            </div>
            <div><!--评论框体-->
            </div>
            <div><!--相关博文框体-->
            </div>
        </div>
        <div class="leftBox"><!--左侧框体-->
            <div class="authorInforBox"><!--作者信息框体-->
                <div class="authorInforUpBox"><!--上层-->
                    <div class="authorPic"><!--头像-->
                        <a><img src="images/defaultPic.jpg"/></a>
                    </div>
                    <div class="authorInfor"><!--用户名-->
                        <p><a class="authorName" href="doGetBlogMng?user.id=${ba.blogMng.user.id}">${ba.blogMng.user.name}</a></p>
                        <p><a class="homePage" href="doGetBlogMng?user.id=${ba.blogMng.user.id}">TA的个人主页</a></p>
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

    </div>
</s:div>

</body>

<script><!-- 获取本页地址 -->
	var thisUrl = document.getElementById('thisUrl');
	var hhref = window.location.href; // 创建一个名为hhref的变量，并赋值为当前页面地址。
	thisUrl.innerHTML = hhref;
</script>
</html>