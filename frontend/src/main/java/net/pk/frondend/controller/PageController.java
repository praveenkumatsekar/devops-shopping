package net.pk.frondend.controller;
import 


@Controller
public class PageController {
	
	@RequestMapping(value = {"/","/home","/index"})
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page")
				return mv;
	}

}
