package com.human.human;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserLogin {
	
	@RequestMapping(value = "/Login", method = RequestMethod.POST)
	public String login(HttpSession session,
						@RequestParam("id") String id,
						@RequestParam("pass") String pass) {
		//�α��� ���� 
		// 1. �Ķ���� �޴´�. 2.���� ���� �� ������� ���� �Ǵ�.. ���񽺴��� �ʿ�
		
		
		if(id.equals("ttt")) { //���� ���� �� ���̵�� �н����尡 �������� ��� ���Ϲ޴� ������ ����
			//�α��� ������ ���
			if(session.getAttribute("Login")!=null) {
				session.removeAttribute("login"); //������ �ʱ�ȭ �ѹ� �� û���ϰ� ���ڴ�.
			}
			
			session.setAttribute("login", id); //����ó��
			session.setAttribute("grade", "vip"); //ó���ϰ� ���� ������ �����Ͽ� ���, ��ü�� ����
		}else {
			//�α��� ������ ���
		}
		// <--- ��������� �׽�Ʈ�� ���߿� DB���� ���Ѿ� �Ѵ�.
		
		System.out.println("�α��� ������");
		return "home";
	}
	
	@RequestMapping(value = "/Logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate(); //������ ����ȭ..
		return "home";
	}
}
