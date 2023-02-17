package com.iu.s2.pokemon;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.iu.s2.util.Pager1;

@Controller
@RequestMapping (value = "/pokemon/notice/*")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	//list
	@RequestMapping (value = "list", method = RequestMethod.GET)
	public ModelAndView getNoticeList(Pager1 pager1)throws Exception{
		ModelAndView mv = new ModelAndView();
		
		List<NoticeDTO> ar = noticeService.getNoticeList(pager1);
		
		mv.setViewName("pokemon/list");
		mv.addObject("list", ar);
		mv.addObject("pager1", pager1);
		return mv;
	}
	
	

}
