//改变邮箱/账户注册方式
function Change(t){
	var account = document.getElementById("account");
	var email = document.getElementById("email");
	console.log(t.id)
	if(t.id == "tab_1"){
		email.setAttribute("style","display: none")
		account.setAttribute("style","display: block")
	}else if(t.id =="tab_2"){
		account.setAttribute("style","display: none")
		email.setAttribute("style","display: block")
	}
}
//检测邮箱/账户是否可用
function checkUser(t){
	var myReg = /^[-_A-Za-z0-9]+@([_A-Za-z0-9]+\.)+[A-Za-z0-9]{2,3}$/;
	
	var upormpt = document.getElementById("upormpt");
	//var account = document.getElementById("account").value;
	if(t.id == "account"){//检测账户是否可用
		if(t.value.length<6 || t.value.length>13){
			upormpt.innerHTML = "☒  用户名在6~13位";
			upormpt.setAttribute("style","color:red;");
		}else{
			$.post("doCheck",{"ue.account":t.value},function(data){
				
					if(data == "success" && t.value != ""){
						upormpt.innerHTML = "☑  该账户可用";
						upormpt.setAttribute("style","color:green;");
					}else if(data == "fail"){
						upormpt.innerHTML = "☒  该账户已被注册";
						upormpt.setAttribute("style","color:red;");
					}
			});
		}
			
	}else if(t.id == "email"){//检测邮箱是否可用
		if(myReg.test(t.value)){
			console.log(t.value)
			$.post("doCheck",{"ue.email":t.value},function(data){
				
				if(data == "success" && t.value != ""){
					upormpt.innerHTML = "☑  该邮箱可用！";
					upormpt.setAttribute("style","color:green;");
				}else if(data == "fail"){
					upormpt.innerHTML = "☒  该邮箱已被注册！";
					upormpt.setAttribute("style","color:red;");
				}
			});
		}else{
			upormpt.innerHTML = "☒  邮箱格式错误！";
			upormpt.setAttribute("style","color:red;");
		}
		
	}
	
	
}
//提交表单
function Submit(){
	var form = document.getElementById("form");
	var error = document.getElementById("error");
	var pass = document.getElementById("password").value;
	var repass = document.getElementById("confirmPassword").value;
	var account = document.getElementById("account");
	if(pass != repass){
		error.innerHTML="☒ 两次密码输入不一样";
	}else if(pass.length<6 || pass.length>18){
		error.innerHTML="☒ 密码必须在6~18位";
	}else{
		form.submit();
	}
}