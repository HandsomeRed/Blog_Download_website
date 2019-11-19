package com.bd.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.bd.entity.UserEntity;

public class AuthorizationInterceptor extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		// 获取用户会话
//		System.out.println("拦截器");
		Map session = actionInvocation.getInvocationContext().getSession();
		UserEntity ue = (UserEntity)session.get("saveUserInformationTOSession");
		if(session == null){
//			System.out.println("拦截！");
			return "Login";
			}else {
				if(ue == null) {
//					System.out.println("ue拦截！");
					return "Login";
				}else {
					return actionInvocation.invoke();
				}
			}
			
		}
	
}
