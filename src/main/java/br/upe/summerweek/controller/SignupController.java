package br.upe.summerweek.controller;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.upe.summerweek.model.User;

@Controller
public class SignupController {

	@GetMapping("/signup")
	public String showSignupPage(ModelMap model, User user) {
		return "signup";
	}
	
	@GetMapping("/test")
	public String showTest(ModelMap model) {
		model.addAttribute("var", "test");
		return "test";
	}
	
	@PostMapping("/signup")
	public String userSignupSubmit(@ModelAttribute User user, ModelMap model) {
		user.setPassword(generateHashPassword(user.getPassword()));
		model.addAttribute("user", user);
		// User Persistence method will be call here  
		// If everything ok redirect to login page
		return "redirect:/";
	}
	
	//This function make the BCrypt encode of password
	public String generateHashPassword(String plainTextPassword) {
		return BCrypt.hashpw(plainTextPassword, BCrypt.gensalt());
	}
	
	//This function checks if received password match storage password
	public boolean checkPassword(String plainTextPassword, String hashedPassword) {
		return BCrypt.checkpw(plainTextPassword, hashedPassword);
	}
	
	
}
