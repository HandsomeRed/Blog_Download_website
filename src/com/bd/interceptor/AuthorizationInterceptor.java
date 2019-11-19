package com.bd.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.bd.entity.UserEntity;

public class AuthorizationInterceptor extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		// ��ȡ�û��Ự
//		System.out.println("������");
		Map session = actionInvocation.getInvocationContext().getSession();
		UserEntity ue = (UserEntity)session.get("saveUserInformationTOSession");
		if(session == null){
//			System.out.println("���أ�");
			return "Login";
			}else {
				if(ue == null) {
//					System.out.println("ue���أ�");
					return "Login";
				}else {
					return actionInvocation.invoke();
				}
			}
			
		}
	
}
