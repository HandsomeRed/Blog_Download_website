<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/public.css">
<link rel="stylesheet" type="text/css" href="css/frame.css">
</head>
<body>
<div class="frame">

	<div class="leftFrame"><!--图片-->
        <img src="images/gg.jpg"/>
	</div>
 	<div class="login"><!--登录-->
    	<div class="form">
    		<form action="doLogin" method="post">
    		<div class="tab"><!--登录tab-->
        		<a href="" id="tab_1" class="tab_1">账号登录</a>
        		<a href="" id="tab_2" class="tab_2">免密登录</a>
	       	</div>
            <div class="clears"></div>
	       	<div class="accountTab">
            	<div class="account">
                	<input type="text" name="ue.account" placeholder="手机号/邮箱/用户名" id="account" class="accInput" onblur="Check(this)">
                </div>
            </div>
            <div class="passwordTab">
            	<div class="password">
                	<input type="password" name="ue.password" placeholder="密码" id="password" class="pwdInput">
                </div>
            </div>
                <div class="forgetpwd"><a href="Login.jsp">忘记密码</a></div>
            <div class="error"><!--失败提示--><s:div theme="simple"><s:actionerror/></s:div></div>
            <div class="clears"></div>
            <div class="loginButton">
            	<button class="btn">登录</button>
            </div>
    		</form>
        	
        </div>
    	
    </div>

</div>
</body>
<script type="text/javascript">
function Check(t){
	if(t.id == "account"){
		var myReg = /^[-_A-Za-z0-9]+@([_A-Za-z0-9]+\.)+[A-Za-z0-9]{2,3}$/;
		if(myReg.test(t.value)){
			t.setAttribute("name","ue.email");
		}
	}
	if(t.id == "password"){
		
	}
	
}


</script>
</html>