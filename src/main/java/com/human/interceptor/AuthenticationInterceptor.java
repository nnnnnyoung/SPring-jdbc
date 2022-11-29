package com.human.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AuthenticationInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		//�α����� ���� ���� �α����� �ϵ����Ѵ�. �۾��� �� �ڼ��� ����� �α����� �ؾ߸� ������ �� �ִ�. 
		// ������ �˻� ��..
		//Ŭ���̾�Ʈ���� ������ �ִ�. Ŭ���̾�Ʈ�� ���� ��Ű�� ���̵�� ��Ƽ�ϴ� ������ ��ü�� �����Ͷ�
		HttpSession session =request.getSession();
		//������ ���ǿ��� login ������ ã�Ƽ� ���Ϲ޾ƶ�. �׷��� login������ ����Ÿ���� �𸣴� ��纯���� �ֻ����� object�� ����
		Object obj=session.getAttribute("login");
		if(obj == null) { //�α��� ���Ѱ��
			response.sendRedirect(request.getContextPath()+"/"); //��Ʈ�ѷ� / ��ιٲ�
			return false;
		}
		return true; //���� ��η� ����
		
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("PostHandle start");
		System.out.println("PostHandle end");
		super.postHandle(request, response, handler, modelAndView);
	}
//���ͼ��� ����� Ȱ���ϱ� ���� ��ӹ���..
	
	
	
	
	
}
