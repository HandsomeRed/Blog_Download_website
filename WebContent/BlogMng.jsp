<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset=utf-8"/>
    <title>博客管理</title>
    <link rel="stylesheet" type="text/css" href="css/public.css"/>
    <link rel="stylesheet" type="text/css" href="css/BlogMng.css"/>
    <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="js/submit.js"></script>
    <script src="js/test.js" type="text/javascript"></script>
    <link type="text/css" rel="stylesheet" href="css/test.css"/>
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
            		<a href="doGetMyArticles" style="margin-left:30px;">博客管理</a>
            	</li>
            	<li>
            		<a href="doGetMyResources">资源管理</a>
            	</li>
            </s:else>
        </ul>
    </div>
</div>
<div class="clears"></div>

<!--系统公告栏-->
<div class="notice" style="display: true;">
    <img src="images/notice_1.jpg" class="noticeIco_1"/><!--小喇叭-->
    <span class="noticeText">公告：</span>
    <span class="">
  	<a href=""><span style="color: #CA0C16">博主每周活跃榜单首次大公开，你上榜了吗~</span></a>
  </span>
    <img src="images/notice_X.jpg" class="noticeIco_X"/><!--叉叉-->
</div>

<!--博客管理-->
<div class="blogMngMain">
    <div class="blogMngMainBox">
        <div class="leftBox"><!--左侧box-->
            <div class="leftGroup leftBoxLine">
                <a href="WriteBlog.jsp" class="richText leftGroupItem" target=""><img src="images/write_blog.jpg" class="leftBoxIco"/>富文本编辑器</a>
            </div>
            <s:div id="bAriticleList" value="#request.blogArticleList">
            <div class="leftGroup leftBoxLine">
                <a href="doGetBlogMng?user.id=${session.saveUserInformationTOSession.id }" class="leftGroupItem" target="">查看主页</a>
            </div>
            </s:div>
            <div class="leftGroupItem leftGroupTitle">内容</div>
            <div class="leftGroup">
                <a href="" class="leftGroupItem" target="">文章管理</a>
                <a href="" class="leftGroupItem" target="">评论管理</a>
                <a href="" class="leftGroupItem" target="">分类专栏</a>
            </div>
            <div class="leftGroupItem leftGroupTitle">数据</div>
            <div class="leftGroup">
                <a href="" class="leftGroupItem" target="">数据统计</a>
            </div>
            <div class="leftGroupItem leftGroupTitle">设置</div>
            <div class="leftGroup leftBoxLine">
                <a href="" class="leftGroupItem" target="">博客设置</a>
            </div>
        </div>
        <div class="rightBox"><!--右侧box-->
            <div class="statusDiv"><!--文章状态-->
                <ul class="statusUl">
                    <li class="statusLi"><a href="doGetMyArticles" class="a_text_black">全部</a></li>
                    <li class="statusLi"><a href="doGetMyArticles?ba.status=公开" class="a_text_black">公开</a></li>
                    <li class="statusLi"><a href="doGetMyArticles?ba.status=私密" class="a_text_black">私密</a></li>
                    <li class="statusLi"><a href="doGetMyArticles?ba.status=审核" class="a_text_black">审核</a></li>
                    <li class="statusLi"><a href="doGetMyArticles?ba.status=草稿" class="a_text_black">草稿箱</a></li>
                    <li class="statusLi"><a href="doGetMyArticles?ba.status=弃置" class="a_text_black">回收站</a></li>
                </ul>
            </div>

            <div class="mainSearchBox"><!--searchBox--><!--暂做静态处理-->
                <form action="doGetMyArticles" id="serach" class="mainSearchForm">
                    <div class="select dowebok">
                        <input name="ba.releaseTime" style="display: none" id="badate">
                        <span class="placeholder" id="year">年</span>
                        <ul>
                            <li>不限</li>
                            <li>2019</li>
                        </ul>
                    </div>
                    
                    <div class="select dowebok">
                        <span class="placeholder" id="month">月</span>
                        <ul>
                            <li>不限</li>
                            <li>1</li>
                            <li>2</li>
                            <li>3</li>
                            <li>4</li>
                            <li>5</li>
                            <li>6</li>
                            <li>7</li>
                            <li>8</li>
                            <li>9</li>
                            <li>10</li>
                            <li>11</li>
                            <li>12</li>
                        </ul>
                    </div>
                    <div class="select dowebok">
                        <span class="placeholder" id="type">类型</span>
                        <input style="display: none" name="ba.type" id="batype">
                        <ul>
                            <li>不限</li>
                            <li>原创</li>
                            <li>转载</li>
                            <li>其他</li>
                        </ul>
                    </div>
                    <div class="select1 dowebok" id="classify">
                        <span class="placeholder">分类专栏</span>
                        <ul>
                            <li>不限</li>
                        </ul>
                    </div>
                    <input class="keywordInput" id="key" type="text" name="ba.title" placeholder="标题关键词"/>
                    <button type="button" class="mainSearchBtn" id="searchBt">搜索</button>
                    <div class="clears"></div>
                </form>
	
            </div>


            <div class="contentTab"><!--博文List-->
            	<!--循环开始-->
            	<s:iterator id="bAriticle" value="#request.blogArticleList">
                <div  class="contentTabBox">
                    <div class="contentArticle">
                        <div class="contentArticleTitle">
                            <span class="contentArticleTitleTag">${bAriticle.status}</span>
                            <p class="contentArticleTitleTxt">
                                <a href="doGetBlogArticle?ba.id=${bAriticle.id}" target="" title="">${bAriticle.title}</a>
                            </p>
                        </div>
                        <div class="contentArticleInfor">
                            <div class="contentArticleInforLeft">
                                <span class="">${bAriticle.type}</span>
                                <span class="">${bAriticle.releaseTime}</span>
                                <span class=""><img src="images/bookIco.jpg"/>${bAriticle.readNum}</span>
                                <span class=""><img src="images/commentIco.jpg"/>${bAriticle.likeNum}</span><!-- 得加博文表评论字段  这里暂用likeNum代替 -->
                            </div>
                            <div class="contentArticleInforRight">
                                <a href="doGetBlogArticle?ba.id=${bAriticle.id}" class="a_text_blue"><span>查看</span></a>
                                <a href="doDeleteBlogArticle?ba.id=${bAriticle.id}"
                                   class="a_text_red"><span>删除</span></a><!-- 有bug，待解决 -->
                            </div>
                        </div>
                    </div>
                </div>
            </s:iterator>
            <!--循环结束-->
            </div>
        </div>
    </div>
</div>

</body>
</html>