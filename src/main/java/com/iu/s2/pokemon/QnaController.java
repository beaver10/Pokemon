package com.iu.s2.pokemon;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.iu.s2.util.Pager1;


@Controller
@RequestMapping("/qna/*")
public class QnaController {

	@Autowired
	private QnaService qnaService;
	
	//list
	@RequestMapping(value = "list", method = RequestMethod.GET) 
	public ModelAndView getQnaList(Pager1 pager1)throws Exception{
		ModelAndView mv = new ModelAndView();
		
		List<QnaDTO> ar = qnaService.getQnaList(pager1);
		
		mv.setViewName("qna/list");
		mv.addObject("list", ar);
		mv.addObject("pager1", pager1);
		
		return mv;
	}
	//detail
	@RequestMapping(value = "detail", method = RequestMethod.GET) 
	public ModelAndView getQnaDetail(QnaDTO qnaDTO )throws Exception{
		ModelAndView mv = new ModelAndView();
		
		qnaDTO = qnaService.getQnaDetail(qnaDTO);
		
		mv.setViewName("qna/detail");
		mv.addObject("dto",qnaDTO);
		
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
		mv.setViewName("bankBook/update");
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
