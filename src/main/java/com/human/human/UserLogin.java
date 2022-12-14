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
		//로그인 절차 
		// 1. 파라미터 받는다. 2.쿼리 실행 후 결과값에 따라 판단.. 서비스단이 필요
		
		
		if(id.equals("ttt")) { //쿼리 실행 후 아이디와 패스워드가 정상적인 경우 리턴받는 것으로 수정
			//로그인 성공인 경우
			if(session.getAttribute("Login")!=null) {
				session.removeAttribute("login"); //일종의 초기화 한번 더 청소하고 가겠다.
			}
			
			session.setAttribute("login", id); //세션처리
			session.setAttribute("grade", "vip"); //처리하고 싶은 변수를 선택하여 등록, 객체도 가능
		}else {
			//로그인 실패인 경우
		}
		// <--- 여기까지가 테스트용 나중에 DB연동 시켜야 한다.
		
		System.out.println("로그인 공사중");
		return "home";
	}
	
	@RequestMapping(value = "/Logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate(); //세션을 무력화..
		return "home";
	}
}
