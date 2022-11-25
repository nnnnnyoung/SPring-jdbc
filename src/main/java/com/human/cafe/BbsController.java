package com.human.cafe;

import java.util.List;
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
		return "redirect:/bbsList";
	}
	@RequestMapping(value = "/bbsList", method = RequestMethod.GET)
	public String bbsList(Locale locale, Model model, BoardVO bvo )throws Exception {
		//a 태그에서 넘어옴 a 태그는 get방식
		List blist=brsv.selectAll();
		System.out.println(brsv.selectAll().size()+"게시글 전체 확인");
		model.addAttribute("bList",blist) ;
		return "bbs/bbsList";
	}
	@RequestMapping(value = "/wrForm", method = RequestMethod.GET)
	public String wrForm(Locale locale, Model model) {
		//a 태그에서 넘어옴 a 태그는 get방식
		return "bbs/wrForm";
	}
	
	@RequestMapping(value = "/joinForm", method = RequestMethod.GET)
	public String joinForm(Locale locale, Model model) {
		//a 태그에서 넘어옴 a 태그는 get방식
		return "bbs/joinForm";
	}
}
