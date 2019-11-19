<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册页面</title>
<script type="text/javascript" src = "js/regist.js"></script>
<script type="text/javascript" src = "js/jquery-3.2.1.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/public.css">
<link rel="stylesheet" type="text/css" href="css/regist.css">

</head>
<body>
<div class="frame">

	<div class="leftFrame"><!--图片-->
    	<img src="images/gg.jpg">
	</div>
 	<div class="regist"><!--登录-->
    	<div class="form">
    		<form action="doRegist" id="form">
    		<div class="tab"><!--注册tab-->
    			<!--  <input type="button" onclick="Change(this)" id="tab_1" class="tab_1" value="账号注册">
    			<input type="button" onclick="Change(this)" id="tab_2" class="tab_2" value="邮箱注册">-->
        		<div onclick="Change(this)" id="tab_1" class="tab_1">账号注册</div>
        		<div onclick="Change(this)" id="tab_2" class="tab_2">邮箱注册</div>
	       	</div>
            <div class="clears"></div>
	       	<div class="accountTab">
            	<div class="account">
            		<input type="text" onblur="checkUser(this)" name="ue.email" placeholder="邮箱" id="email" class="accInput" style="display: none;">
                	<input type="text" onblur="checkUser(this)" name="ue.account" placeholder="账号 6~13位" id="account" class="accInput"><span id="upormpt"></span>
                </div>
            </div>
            <div class="passwordTab">
            	<div class="password">
                	<input type="password" name="ue.password" placeholder="密码 6~18位" id="password" class="pwdInput">
                </div>
            </div>
            <div class="passwordTab">
            	<div class="password">
                	<input type="password"placeholder="确认密码  6~18位" id="confirmPassword" class="pwdInput">
                </div>
            </div>
            <div class="forgetpwd"><a href="">忘记密码</a></div>
            <div class="error" id="error"><!--失败提示--></div>
            <div class="clears"></div>
            <div class="loginButton">
            	<input type="button" onclick="Submit()" class="btn" value="注册">
            	<!--  <button class="btn" onclick="Submit()">注册</button>-->
            </div>
    		</form>
        	
        </div>
    	
    </div>

</div>
</body>

</html>