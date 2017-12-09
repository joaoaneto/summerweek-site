package br.upe.summerweek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.upe.summerweek.model.User;

@Controller
public class SigninController {

	@GetMapping("/login")
	public String showSigninPage(ModelMap map, User user) {
		return "signin";
	}
	
}
