package br.upe.summerweek.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String showHomePage(ModelMap model) {
		
	    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    
	    model.addAttribute("auth", auth);
	    
		return "index";
	}
	
}
