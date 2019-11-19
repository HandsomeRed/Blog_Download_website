<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
<meta charset="UTF-8">
<title>ckeditor demo</title>
<link rel="stylesheet" type="text/css" href="css/public.css"/>
<link rel="stylesheet" type="text/css" href="css/WriteBlog.css"/>
<script src="ckeditor/ckeditor.js"></script>
<script type="text/javascript">
    window.onload = function()
    {
        CKEDITOR.replace( 'description',{height:786});

    };
</script>
</head>

<body>
<form method="post" action="doWriteBlog">
<div class="bigBox"><!--文章标题 提交按钮 头像-->
	
    <div style="width: 100%; height: 56px; overflow: inherit;">
		<div class="topBox">
    		<div class="title"><!--文章标题-->
     	   		<input maxlength="100" placeholder="输入文章标题" class="titleInput" name="be.title"/>
                <span class="textNum"><!--标题字数统计 js控制，暂未完成-->
					0/100
                </span>
     	   	</div>
      	  	<div class="btnBox"><!--提交按钮 头像-->
      	  		<input type="submit" class="submitBtn" value="发布文章"/>
                <div class="userBox">
                	<div class="userInforBox">
                    	<div class="userPic"><a href=""><img src="images/defaultPic.jpg" class="userPicImg"/></a></div>
                        <div><!--头像下拉菜单--></div>
                    </div>
                </div>
      	  	</div>
    	</div>
	</div>

	<div><!-- 富文本编辑器 -->
		<textarea name="be.content" id="description"/></textarea>
	</div>
</form>
</div>
</body>
</html>