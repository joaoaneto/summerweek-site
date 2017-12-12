package br.upe.summerweek.controller;

import java.util.Calendar;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.upe.summerweek.model.User;
import br.upe.summerweek.repository.IUserRepository;

@Controller
public class SignupController {
	@Autowired
	IUserRepository repository;
	
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
		repository.save(new User(user.getName(), 
								 user.getPassword(), 
								 user.getSex(), 
								 user.getBirthday(), 
								 user.getEmail(), 
								 user.getUniversity(), 
								 user.getCourse()));
		
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
