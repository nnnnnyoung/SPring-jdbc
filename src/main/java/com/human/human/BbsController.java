package com.human.human;

import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.human.VO.BoardVO;
import com.human.VO.PageVO;
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
	public String bbsList(Locale locale, Model model, @ModelAttribute("pageVO")PageVO pageVO )throws Exception {
		System.out.println("현재 페이지 정보: "+pageVO.getPage());
		if(pageVO.getPage()==null) { //클라이언트가 페이지정보를 넘겨주지 않는다면 기본값 1로 셋팅
			pageVO.setPage(1);
		}
		//page 계산하기 위해서는 첫번째 페이지 정보 (클라이언트가 넘겨줍니다.), 두번쨰는 전체 페이지수, 세번째는 페이지당 그리고  페이지 그룹당 수
		int totalpageCnt=brsv.countBoard();
		System.out.println(totalpageCnt+"건 등록됨");
		pageVO.setTotalCount(totalpageCnt);
		
		List<BoardVO> list=brsv.selectAll(pageVO);
		System.out.println(list.size()+"ddsfsd");
		model.addAttribute("bList",list);
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
