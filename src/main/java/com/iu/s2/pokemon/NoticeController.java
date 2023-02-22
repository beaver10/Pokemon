package com.iu.s2.pokemon;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.iu.s2.util.Pager1;

@Controller
@RequestMapping (value = "/notice/*")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	//list
	@RequestMapping (value = "list", method = RequestMethod.GET)
	public ModelAndView getNoticeList(Pager1 pager1)throws Exception{
		ModelAndView mv = new ModelAndView();
		
		List<NoticeDTO> ar = noticeService.getNoticeList(pager1);
		
		mv.setViewName("notice/list");
		mv.addObject("list", ar);
		mv.addObject("pager1", pager1);
		return mv;
	}
	
	//detail
	@RequestMapping(value = "detail", method = RequestMethod.GET) 
	public ModelAndView getNoticeDetail(NoticeDTO noticeDTO)throws Exception{
		ModelAndView mv = new ModelAndView();
		
		noticeDTO = noticeService.getNoticeDetail(noticeDTO);
		
		mv.setViewName("notice/detail");
		mv.addObject("dto",noticeDTO);
		
		return mv;
	}
	//add(get)
	@RequestMapping(value = "add", method = RequestMethod.GET) 
	public ModelAndView getNoticeAdd(ModelAndView mv)throws Exception{
		
		mv.setViewName("notice/add");
		
		return mv;
	}
	//add(post)
	@RequestMapping(value = "add", method = RequestMethod.POST) 
	public ModelAndView getNoticeADdd(NoticeDTO noticeDTO)throws Exception{
		ModelAndView mv = new ModelAndView();
		noticeService.setNoticeAdd(noticeDTO);
		mv.setViewName("redirect:./list");
		
		return mv;
	}
	//delete
	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public ModelAndView setNoticeDelete(NoticeDTO noticeDTO)throws Exception{
		ModelAndView mv = new ModelAndView();
		int result = noticeService.setNoticeDelete(noticeDTO);
		
		mv.setViewName("redirect:./list");
		
		return mv;
	}
	
	//update(get)
	@RequestMapping(value = "update", method = RequestMethod.GET)
	public ModelAndView setNoticeUpdate(NoticeDTO noticeDTO)throws Exception{
		ModelAndView mv = new ModelAndView();
		noticeDTO = noticeService.getNoticeDetail(noticeDTO);
		mv.setViewName("notice/update");
		mv.addObject("dto", noticeDTO);
		
		return mv;
	}
	//update(post)
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public ModelAndView setNoticedate(NoticeDTO noticeDTO) throws Exception{
		ModelAndView mv = new ModelAndView();
		int result = noticeService.setNoticeUpdate(noticeDTO);
			
		mv.setViewName("redirect:./list");
			
		return mv;
	}
	
	
	
	
	

}
