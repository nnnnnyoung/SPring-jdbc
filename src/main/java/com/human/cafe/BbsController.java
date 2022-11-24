package com.human.cafe;

import java.util.Locale;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.human.VO.BoardVO;
import com.human.service.IF_boardService;
@Controller
public class BbsController {
	@Inject
	private IF_boardService brsv;
	
	
	@RequestMapping(value = "/wrAction", method = RequestMethod.POST)
	public String wrAction(Locale locale, Model model, BoardVO bvo) throws Exception{
		System.out.println(bvo.getName()+"확인");
		brsv.insertOne(bvo);
		return "home";
	}
	@RequestMapping(value = "/wrForm", method = RequestMethod.GET)
	public String wrForm(Locale locale, Model model) {
		//a 태그에서 넘어옴 a 태그는 get방식
		return "wrForm";
	}
	
	@RequestMapping(value = "/joinForm", method = RequestMethod.GET)
	public String joinForm(Locale locale, Model model) {
		//a 태그에서 넘어옴 a 태그는 get방식
		return "joinForm";
	}
}
