package com.bd.controller;

import com.opensymphony.xwork2.ActionSupport;

import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

//import org.apache.struts2.ServletActionContext;

import com.bd.entity.UserEntity;
import com.bd.service.UserService;
//import org.apache.struts2.interceptor.SessionAware;
import tool.Key_Value;

public class UserAction extends ActionSupport{

    private UserEntity ue; // ���ڷ�װ��¼������
    private UserService userService; // ��ע��
    private Map<String, Object> session; // session

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public UserEntity getUe() {
		return ue;
	}

	public void setUe(UserEntity ue) {
		this.ue = ue;
	}
	
	// ��¼
	public String doLogin() throws Exception {
        ue = userService.login(ue);
        if (ue != null) {
            // ��¼�ɹ� ��ת�� index.jsp,ͬʱ��user ��Ϣ������session.
			session.put(Key_Value.user, ue);
			return "index";
		}else {
			// ��¼ʧ�� login.jsp
			return "login";
		}
	}
	
	// ע��
	public String doRegist() throws Exception {

		if (userService.addUser(ue)) {
			System.out.println("ע��ɹ�");
			return "login";
		}else {
			System.out.println("ע��ʧ��");
			return "regist";
		}
		
	}
	//����û���  �������˷����Ŀ��ʱ������ע�� 2019��11��16�� 09:40:03
	public String doCheck() throws Exception{
//		HttpServletResponse response=ServletActionContext.getResponse();
//        //���´����JSON.java�п�������
//        response.setContentType("text/html");
//        PrintWriter out;
//        out = response.getWriter();
//		if(userService.checkUser(ue)) {
//			System.out.println("�˻�����");
//			out.print(SUCCESS);
//		}else {
//			System.out.println("�˻�������");
//			out.print("fail");
//		}
		return "test";
	}

//    @Override
//    public void setSession(Map<String, Object> session) {
//        this.session = session;
//    }

    public Map<String, Object> getSession() {
        return session;
    }
}
