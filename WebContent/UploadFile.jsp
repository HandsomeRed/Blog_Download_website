<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<head>
<meta charset="utf-8">
<title>上传文件</title>
<link rel="stylesheet" type="text/css" href="css/public.css">
<link rel="stylesheet" type="text/css" href="css/Uploading.css">
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
<div class="meeting_main">
    <div class="download_new">
        <div>
            <div class="create_album_wrap">
                <h4 class="dl_common_t"><span>上传资源</span></h4>
                <div class="create_album upl_resources">
                    <form action="uploadFile" class="form" method="post" enctype="multipart/form-data"><!-- 字符流转字节流 -->
                        <div id="targetLayer"></div>
                        <ul class="create_album_list">
                            <li class="resource_li">
                                <div class="choose_weap">
                                    <div id="progress_box_new">
                                        <div id="progress_box_new"></div>
                                        <!--<span id="progress_status_new">上传中...(0%)</span>-->
                                    </div>
                                    <span class="choose_intro choose_file"><em
                                            id="li_userfile">✙点击上传资源，文件小于2M</em></span>
                                    <input type="file" name="file" class="file">

                                </div>
                                <em class="form_error"></em>
                            </li>
                            <li>
                                <label>
                                    <span class="requird_icon">*</span>
                                    资源名称：
                                </label>
                                <input type="text" max="80" id="title" name="resource.name" placeholder="请输入资源名称"
                                       class="album_inpt">
                                <em class="form_error"></em>
                            </li>
                            <li>
                                <label>
                                    <span class="requird_icon">*</span>
                                    资源类型：
                                </label>
                                <select def="0" name="resource.type" class="select" id="">
                                    <option>请选择</option>
                                    <option value="文档">文档类</option>
                                    <option value="代码">代码类</option>
                                    <option value="工具">工具类</option>
                                    <option value="其他">其他</option>
                                </select>
                                <div class="res_tip"></div>
                                <em class="form_error"></em>
                            </li>
                            <li>
                                <label>
                                    <span class="requird_icon">*</span>
                                    所属分类：
                                </label>
                                <select def="0" name="resource.resourceClassifySmall.id" class="select" id="selectSmallClassify">
                                    <option value="0">请选择</option>
                                    <option value="1">C</option>
                                    <option value="2">C#</option>
                                    <option value="3">C++</option>
                                    <option value="4">Java</option>
                                    <option value="5">Javascript</option>
                                    <option value="6">PHP</option>
                                    <option value="7">Python</option>
                                    <option value="8">VB</option>
                                    <option value="9">Web开发</option>
                                    <option value="10">嵌入式</option>
                                    <option value="11">其他资源</option>
                                    <!--其他再进行添加-->
                                </select>
                                <em class="form_error"></em>
                            </li>
                            <li class="tag_li">
                                <label>
                                    <span class="requird_icon">*</span>
                                    资源标签：
                                </label>
                                <div class="txt-box">
                                    <div class="txt-box">
                                       <!--<button id="addTag" class="btn_add_tag">添加标签</button>-->
                                        <textarea name="resource.resourceKeyword" max="500"
                                                  placeholder="最多添加5个标签，每个标签不超过16个字符"></textarea>
                                    </div>
                                </div>
                                <em class="form_error"></em>
                                <div class="form_tips_b">标签与标签之间使用空格分隔</div>
                            </li>
                            <li>
                                <label>
                                    <span class="requird_icon">*</span>
                                    资源描述：
                                </label>
                                <textarea name="resource.introduction" max="500"
                                          placeholder="描述不支持HTML标签；详细的资源描述有机会获得我们的推荐，更有利于他人下载，赚更多积分。如描述不清，有可能审核不能通过。"></textarea>
                                <em class="form_error"></em>
                            </li>
                            <li class="source_tips">
                                <input type="checkbox" checked="checked">
                                <label style="width:auto;" for="cb_agree">同意<a href="">资源共享规则</a></label>
                            </li>
                            <div class="create_album_b">
                                <input type="submit" value="提交" class="album_submit">
                                <button class="btn btn_report">意见反馈</button>
                            </div>
                        </ul>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>