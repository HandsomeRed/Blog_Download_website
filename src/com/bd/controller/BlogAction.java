package com.bd.controller;

import java.util.List;
import java.util.Map;

import com.bd.entity.BlogClassifyEntity;
import com.bd.entity.UserEntity;

import com.bd.entity.BlogArticleEntity;
import com.bd.service.BlogService;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import tool.Key_Value;


@Controller
public class BlogAction extends ActionSupport{

    @Autowired
    private BlogService blogService; // ��ע��

	private BlogClassifyEntity type; // ǰ̨����������ص���������
	private BlogArticleEntity ba; // ǰ̨����

    private UserEntity user; //�������˲�����ҳ��
	private Map<String, Object> request;
	private Map<String, Object> session;


    public void setBlogService(BlogService blogService) {
        this.blogService = blogService;
    }


	public void setType(BlogClassifyEntity type) {
		this.type = type;
	}

	public BlogArticleEntity getBa() {
		return ba;
	}

	public void setBa(BlogArticleEntity ba) {
		this.ba = ba;
	}


//	@Override
//	public void setSession(Map<String, Object> session) {
//		this.session = session;
//
//	}

    public void setUser(UserEntity user) {
        this.user = user;
    }

//    @Override
//	public void setRequest(Map<String, Object> request) {
//		this.request = request;
//	}

    /**
     *  2019��11��16�� 11:48:26
     *  SpringMVC ���Ժ���
     * @return
     */

    @RequestMapping(value = "/TestSpringMVC", method = RequestMethod.POST)
    public String TestSpringMVC(Integer i){
        System.out.println("[TestSpringMVC]-[ִ��]");
        System.out.println("���յ�ǰ̨��������" + i);
        return "list"
    ;}

    // ������ҳ���� ����
	public String list(){

		List<BlogClassifyEntity> baList = blogService.getBlogClassify();
		List<BlogArticleEntity> selectArticle = blogService.getSelectBlogArticles(type);
        if (baList != null) {
			request.put("ArticleClassifyList", baList);
		}
        if (selectArticle != null) {
			request.put("selectArticlesList",selectArticle);
		}

		return "index";
	}


    //�������˲�����ҳ | ���ظ��˲��͹���ҳ��� ����List
    public String doGetBlogMng() {
        if (user == null || user.getId() == 0) {
            return "fail";
        }
        List<BlogArticleEntity> publicArticles;
        publicArticles = blogService.getBlogMng(user);
        request.put("someoneArticleList", publicArticles);
        
        UserEntity someone = new UserEntity();
        someone = blogService.getUser(user);
        request.put("author", someone);
        
        return "success";
    }


	// ����ָ��article �ɹ�����success,ʧ�ܷ���fail
    public String doGetArticle() {
		ba = blogService.getArticle(ba);
		if (ba == null) return "fail";
		request.put("blogArticle", ba);
		return "success";
	}

    //�Լ�blogMng
    public String doGetMyArticles() {

        UserEntity user = (UserEntity) session.get(Key_Value.user);
        if (user == null) return "fail";
        List<BlogArticleEntity> myArticles;
        myArticles = blogService.getMyArticles(user, ba);

        if (myArticles == null) return "fail";
        request.put("blogArticleList", myArticles);

        return "success";
    }

    public String doDeleteBlogArticle() {
        UserEntity user = (UserEntity) session.get(Key_Value.user);
        if (user == null) return "fail";

        return blogService.doDeleteBlogArticle(user, ba);
    }


}
