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
	
	//detail
	@RequestMapping(value = "detail", method = RequestMethod.GET) 
	public ModelAndView getNoiceDetail(NoticeDTO noticeDTO )throws Exception{
		ModelAndView mv = new ModelAndView();
		
		noticeDTO = noticeService.getNoticeDetail(noticeDTO);
		
		mv.setViewName("notice/detail");
		mv.addObject("dto",noticeDTO);
		
		return mv;
	}
	//add(get)
	@RequestMapping(value = "add", method = RequestMethod.GET) 
	public ModelAndView getQnaAdd(ModelAndView mv)throws Exception{
		
		mv.setViewName("qna/add");
		
		return mv;
	}
	//add(post)
	@RequestMapping(value = "add", method = RequestMethod.POST) 
	public ModelAndView getQnaADdd(QnaDTO qnaDTO)throws Exception{
		ModelAndView mv = new ModelAndView();
		qnaService.setQnaAdd(qnaDTO);
		mv.setViewName("redirect:./list");
		
		return mv;
	}
	//delete
	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public ModelAndView setQnaDelete(QnaDTO qnaDTO)throws Exception{
		ModelAndView mv = new ModelAndView();
		int result = qnaService.setQnaDelete(qnaDTO);
		
		mv.setViewName("redirect:./list");
		
		return mv;
	}
	
	//update(get)
	@RequestMapping(value = "update", method = RequestMethod.GET)
	public ModelAndView setQnaUpdate(QnaDTO qnaDTO)throws Exception{
		ModelAndView mv = new ModelAndView();
		qnaDTO = qnaService.getQnaDetail(qnaDTO);
		mv.setViewName("qna/update");
		mv.addObject("dto", qnaDTO);
		
		return mv;
	}
	//update(post)
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public ModelAndView setQnadate(QnaDTO qnaDTO) throws Exception{
		ModelAndView mv = new ModelAndView();
		int result = qnaService.setQnaUpdate(qnaDTO);
			
		mv.setViewName("redirect:./list");
			
		return mv;
	}
	
	
	
	
	

}
