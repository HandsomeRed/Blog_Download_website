<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>资源主页</title>
<link rel="stylesheet" type="text/css" href="css/public.css">
<link rel="stylesheet" type="text/css" href="css/ResourceHomepage.css">
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
<div class="news_nav">
	<div class="container">
    	<div class="nav_bar">
        	<a href="">下载首页</a>
            <a href="">精品推荐</a>
            <a href="">我的资源</a>
            <a href="">上传资源赚积分</a>
            <a href="">已下载</a>
            <a href="">我的收藏</a>
            <a href="">参与活动送会员</a>
            <span class="hot_text">hot</span>
        </div>
        <div class="search_download">
        	<a href=""  class="help">☹下载帮助</a>
        </div>
    </div>
    <div class="clears"></div>
</div>
<div class="home_page_wrap">
	<div class="right_bottom_ads"></div>
    <input id="is_login" type="hidden" value="true">
    <div class="home_banner" style="display:none;"></div>
    <div class="container main" >
    	<div class="main_l left" style="margin-top:-20px;">
        	<div class="dl_wrap">
            	<dl class=" cate_sea_list">
                	<dt>资源分类：</dt>
                    <dd>
                    	<ul class=" cate_list">
                        	<li class="cate_cur"><a href="rList">全部</a></li><!-- 取分类暂做静态，后台暂未修改 -->
                            <li><a href="rList?resource.resourceClassifySmall.id=1">C</a></li>
                            <li><a href="rList?resource.resourceClassifySmall.id=2">C#</a></li>
                            <li><a href="rList?resource.resourceClassifySmall.id=3">C++</a></li>
                            <li><a href="rList?resource.resourceClassifySmall.id=4">Java</a></li>
                            <li><a href="rList?resource.resourceClassifySmall.id=5">JavaScript</a></li>
                            <li><a href="rList?resource.resourceClassifySmall.id=6">PHP</a></li>
                            <li><a href="rList?resource.resourceClassifySmall.id=7">Python</a></li>
                            <li><a href="rList?resource.resourceClassifySmall.id=8">VB</a></li>
                            <li><a href="rList?resource.resourceClassifySmall.id=9">Web开发</a></li>
                            <li><a href="rList?resource.resourceClassifySmall.id=10">嵌入式</a></li>
                            <li><a href="rList?resource.resourceClassifySmall.id=11">其它</a></li>
                            <div class="clears"></div>
                        </ul>
                    </dd>
                </dl>
                <dl class="cate_sea_list">
                	<dt>资源类型：</dt>
                    <dd>
                    	<label class="source_item cate_cur">
                        	<a>全部</a>
                        </label>
                        <label class="source_item">
                        	<a>文档类</a>
                        </label>
                        <label class="source_item">
                        	<a>工具类</a>
                        </label>
                        <label class="source_item">
                        	<a>代码类</a>
                        </label>
                        <label class="source_item">
                        	<a>其他</a>
                        </label>
                    </dd>
                </dl>
                <dl class="cate_sea_list">
                	<dt class="keyword_dt">关键词:</dt>
                    <dd>
                    	<input type="text" class="keywords">
                        <a class="cate_search">搜索</a>
                    </dd>
                </dl>
            </div>
        </div>
        <div class="download_l main_l left">
        	<div class="resouces_tab_shows" style="margin-top:0;">
            	<div class="tab_bar">
                	<ul class="tab_list">
                    	<li class="tab_item cur"><a>代码资源</a></li>
                        <li class="tab_item"><a>最新上传</a></li>
                    </ul>
                    <div class="more_info"><a>更多</a></div>
                </div>
                <div class="tab_con_box">
                	<div class="tab_page">
                    <div class="album_detail_wrap">
                    <s:iterator id="rList" value="#request.resourceList"><!-- 资源循环开始 -->
                    	<dl class="album_detail_list">
                        	<dt>
                            	<a>
                                	<img src="images/img_rar.png">
                                </a>
                            </dt>
                            <dd>
                            	<a class="album_detail_title" href="doGetResource?resource.id=${rList.id }">${rList.name }</a>
                                <div class="album_detail_bot">
                                	<label>
                                    	<span>上传者：</span><em class="upl_name">${rList.resourceMng.user.name}</em>
                                    </label>
                                    <label>
                                    	<span>上传时间：</span><em class="upl_time">${rList.releaseTime }</em>
                                    </label>
                                    <strong>
                                    	<span class="jifem">积分/C币:</span>
                                        <em>${rList.resourceCode }</em>
                                    </strong>
                                </div>
                            </dd>
                        </dl>
                        </s:iterator><!-- 资源循环结束 -->
                    </div>
                </div>
            </div>
        </div>
        </div>
        
        <div class="main_r right" style="margin-top:-50px;">
        	<div class="dl_right_fixed">
            	<!-- 推送 -->
            	<div class="carousel_box wrapper" style="width:300px; margin-top:-150px; margin-bottom:116px;">
                	<div class="quake-slider" style="width:300px; height:250px;">
                    	<div></div>
                    </div>
                </div>
                
                <s:if test="#session.saveUserInformationTOSession==null">
                <div class=" mod_personal home_personal" style="margin-top:-106px;">
                	<dl class="personal_wrap">
                    	<dt>
                        	<a>
                            	<img src="images/defaultPic.jpg" class="head">
                            </a>
                            <span class="vip"></span>
                        </dt>
                        <dd>
                        	<a class="name">游客用户</a>
                            <p>
                            	<span class="dl_rank">
                                	<span>
                                    	<img src="images/grade.png">
                                    </span>
                                </span>
                                <span class="dl_score">
                                	<i>下载积分：</i><em>0</em>
                                </span>
                            </p>
                        </dd>
                    </dl>
                    <div class="user_sign_tips">
                    	<div class="btn_group">
                        	<a class="dl_upload_btn" href="Login.jsp">点我登陆</a>
                        </div>
                    </div>
                </div>
            	</s:if>
            	<s:else>
            	<div class=" mod_personal home_personal" style="margin-top:-106px;">
                	<dl class="personal_wrap">
                    	<dt>
                        	<a>
                            	<img src="images/defaultPic.jpg" class="head">
                            </a>
                            <span class="vip"></span>
                        </dt>
                        <dd>
                        	<a class="name">${session.saveUserInformationTOSession.name }</a>
                            <p>
                            	<span class="dl_rank">
                                	<span>
                                    	<img src="images/grade.png">
                                    </span>
                                </span>
                                <span class="dl_score">
                                	<i>下载积分：</i><em>${session.saveUserInformationTOSession.code }</em>
                                </span>
                            </p>
                        </dd>
                    </dl>
                    <div class="user_sign_tips">
                    	<div class="btn_group">
                    		<s:if test="#session.saveUserInformationTOSession==null">
                				<a class="dl_upload_btn" href="Login.jsp">上传资源</a>
            				</s:if>
            				<s:else>
                				<a class="dl_upload_btn" href="UploadFile.jsp">上传资源</a>
            				</s:else>  
                        </div>
                    </div>
                </div>
            	</s:else>
                
                
                <div class="gitchat_news right_plate_con">
                	<div class="com_plate_tit">
                    	<span class="plate_title"><font color="#FF0000"><strong>| </strong></font>精品推荐</span>
                        <a class="more_link">更多</a>
                    </div>
                    <div class="con_detail">
                    	<ul class="news_list">
                        	<li class="news_item">
                            	<a>机器学习极简入门课</a>
                                <p class="small">
                                	<span class="authorName">作者/分享人：</span>
                                    <span>李烨·微软高级软件工程师</span>
                                </p>
                            </li>
                            <li class="news_item">
                            	<a>机器学习极简入门课</a>
                                <p class="small">
                                	<span class="authorName">作者/分享人：</span>
                                    <span>李烨·微软高级软件工程师</span>
                                </p>
                            </li>
                            <li class="news_item">
                            	<a >机器学习极简入门课</a>
                                <p class="small">
                                	<span class="authorName">作者/分享人：</span>
                                    <span>李烨·微软高级软件工程师</span>
                                </p>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="meeting_ppt right_plate_con">
                	<div class="com_plate_tit">
                    	<span class="plate_title"><font color="#FF0000"><strong>| </strong></font>会议PPT</span>
                        <a class="more_link">更多</a>
                    </div>
                   	<div class="con_detail">
                    	<a class="ppt_img">
                        	<img src="images/meeting.jpg">
                            <span class="ppt_num"></span>
                        </a>
                        <ul class="cd_list">
                        	<li class="cd_item">
                            	<a class="item_tit">ppt下载 | 2019AI开发者大会</a>
                                <span class="item_time">2019-09-05 - 2019-09-07</span>
                            </li>
                            <li class="cd_item">
                            	<a class="item_tit">ppt下载 | 2019AI开发者大会</a>
                                <span class="item_time">2019-09-05 - 2019-09-07</span>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="tags right_plate_con">
                	<div class="com_plate_tit">
                    	<span class="plate_title"><font color="#FF0000"><strong>| </strong></font>热门资源标签</span>
                    </div>
                    <div class="con_detail content">
                    	<a>apktool</a>
                        <a>修复</a>
                        <a>chm</a>
                        <a>中文版</a>
                        <a>反编译</a>
                        <a>资源</a>
                        <a>注册机</a>
                        <a>这个位置剩下的再加</a>
                    </div>
                </div>
                <div class=" dl_wrap">
            	<h4 class=" dl_common_t">
                	<span class="plate_title"><font color="#FF0000"><strong>| </strong></font>公告</span>
                </h4>
                <div class="dl_notice">
                	<ul class="resource_c_list">
                    	<li>
                        	<i class="fa">▶</i><a>下载频道用户反馈专区</a>
                            
                        </li>
                        <li>
                        	<i class="fa">▶</i><a>下载频道用户反馈专区</a>
                            
                        </li>
                        <li>
                        	<i class="fa">▶</i><a>下载频道用户反馈专区</a>
                            
                        </li>
                    </ul>
                </div>
            </div>
            </div>
        </div>
    </div>

</div>

</body>
</html>
