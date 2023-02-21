package com.iu.s2.trainer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/trainer/*")
public class TrainerController {
	

	@Autowired
	private TrainerService trainerService;

	@RequestMapping (value = "trainerJoin", method = RequestMethod.GET)
	public ModelAndView trainerJoin() throws Exception{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/trainer/trainerJoin");
		return mv;
	}

	@RequestMapping (value = "trainerJoin", method = RequestMethod.POST)
	public ModelAndView trainerJoin(TrainerDTO trainerDTO) throws Exception{
		ModelAndView mv = new ModelAndView();
		int result = trainerService.trainerJoin(trainerDTO);
		mv.setViewName("redirect:../");
		return mv;
	}
	
	
	@RequestMapping(value = "trainerLogin", method = RequestMethod.GET)
	public ModelAndView gettrainerLogin() throws Exception{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("trainer/trainerLogin");
		return mv;
	}
	
	@RequestMapping(value = "trainerLogin", method = RequestMethod.POST)
	public ModelAndView gettrainerLogin(TrainerDTO trainerDTO, HttpServletRequest request)throws Exception{
		ModelAndView mv = new ModelAndView();
		trainerDTO = trainerService.getTrainerLogin(trainerDTO);
		if(trainerDTO != null) {
			HttpSession session = request.getSession();
			session.setAttribute("trainer", trainerDTO);
		}
		mv.setViewName("redirect:../");
		return mv;
	}
	
	@RequestMapping(value = "trainerLogout", method = RequestMethod.GET)
	public ModelAndView gettrainerLogout(HttpSession session) throws Exception{
		ModelAndView mv = new ModelAndView();
		session.invalidate();
		mv.setViewName("redirect:../");
		return mv;
	}
	
	
	
	@RequestMapping(value = "trainerPage", method = RequestMethod.GET)
	public ModelAndView gettrainerPage(HttpSession session) throws Exception {
		ModelAndView mv = new ModelAndView();
		TrainerDTO trainerDTO = (TrainerDTO)session.getAttribute("trainer");
		trainerDTO = trainerService.getTrainerPage(trainerDTO);
		mv.addObject("dto" , trainerDTO);
		mv.setViewName("trainer/trainerPage");
		return mv;
	}
	
	@RequestMapping(value = "trainerUpdate", method = RequestMethod.GET)
	public ModelAndView gettrainerUpdate(HttpSession session) throws Exception{
		ModelAndView mv = new ModelAndView();
		TrainerDTO trainerDTO = (TrainerDTO) session.getAttribute("trainer");
		
		trainerDTO = trainerService.getTrainerPage(trainerDTO);
		mv.addObject("dto", trainerDTO);
		mv.setViewName("trainer/trainerUpdate");
		return mv;
	}
	
	@RequestMapping(value = "trainerUpdate", method = RequestMethod.POST)
	public ModelAndView settrainerUpdate(TrainerDTO trainerDTO, HttpSession session) throws Exception{
		ModelAndView mv = new ModelAndView();
		TrainerDTO sessiontrainerDTO = (TrainerDTO)session.getAttribute("trainer");
		trainerDTO.setId(sessiontrainerDTO.getId());
		int result = trainerService.setTrainerUpdate(trainerDTO);
//		if(result>0) {
//			session.setAttribute("trainer", trainerDTO);
//		}
		mv.setViewName("redirect:./trainerPage");
		return mv;
	}
	
}
