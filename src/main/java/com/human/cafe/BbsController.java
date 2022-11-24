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
		System.out.println(bvo.getName()+"Ȯ��");
		brsv.insertOne(bvo);
		return "home";
	}
	@RequestMapping(value = "/wrForm", method = RequestMethod.GET)
	public String wrForm(Locale locale, Model model) {
		//a �±׿��� �Ѿ�� a �±״� get���
		return "wrForm";
	}
	
	@RequestMapping(value = "/joinForm", method = RequestMethod.GET)
	public String joinForm(Locale locale, Model model) {
		//a �±׿��� �Ѿ�� a �±״� get���
		return "joinForm";
	}
}
