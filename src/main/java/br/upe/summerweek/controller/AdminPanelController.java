package br.upe.summerweek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.upe.summerweek.model.Activity;
import br.upe.summerweek.model.User;
import br.upe.summerweek.repository.IActivityRepository;
import br.upe.summerweek.repository.IUserRepository;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

@Controller
public class AdminPanelController {
	
	@Autowired
	IActivityRepository actRep;
	IUserRepository usrRep;
	
	private static final Calendar C = Calendar.getInstance();
	
	private static final List<Activity> TESTE = new ArrayList<>(Arrays.asList(
			new Activity("palestra", "Palestra 01-2018", "essa é uma descrição"
					+ " para a 01", "Silvano Neto", C, 1.1f),
			new Activity("palestra", "Palestra 02-2018", "essa é uma descrição"
					+ " para a 01", "Lucas Feijó", C, 1.2f),
			new Activity("palestra", "Palestra 03-2018", "essa é uma descrição"
					+ " para a 01", "Matheusa", C, 1.3f)));
	
	@GetMapping("/admin/panel")
	public String showAdminPanelPage(ModelMap model, Activity activity) {
		model.addAttribute("activities", actRep.findAll());
		return "adminpanel";
	}
	
	@PostMapping("/activity/insert")
	public String addNewActivity(@ModelAttribute Activity activity, ModelMap model) {
		actRep.save(activity);
		return "redirect:/admin/panel";
	}
	
	@PostMapping("/activity/edit")
	public String editNewActivity(@ModelAttribute Activity activity, ModelMap model) {
		actRep.save(activity);
		return "redirect:/admin/panel";
	}
	
	@GetMapping("/activity/remove")
	public String removeActivity(@RequestParam("id") String id, ModelMap model) {
		Long pid = Long.parseLong(id);
		actRep.deleteById(pid);
		
		/*Consertar Null Point Exception*/
		ArrayList<User>users = (ArrayList<User>)usrRep.findAll();
		
		for(int i=0; i<users.size(); i++) {
			ArrayList<Long> a = users.get(i).getListActivities();
			
			for(int j=0; j<a.size(); j++){
				
				if(a.get(j) == pid) {
					a.remove(j);
					break;
				}
			}
		}
		
		usrRep.saveAll(users);
		
		return "redirect:/admin/panel";
	}
	
	
}
