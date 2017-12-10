package br.upe.summerweek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.upe.summerweek.model.Activity;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

@Controller
@RequestMapping("/adminpanel")
public class AdminPanelController {
	
	private static final List<Activity> TESTE = new ArrayList<>(Arrays.asList(
			new Activity("palestra", "Palestra 01-2018", "essa é uma descrição"
					+ " para a 01", "Silvano Neto", new Date(), 1.1f),
			new Activity("palestra", "Palestra 02-2018", "essa é uma descrição"
					+ " para a 01", "Lucas Feijó", new Date(), 1.2f),
			new Activity("palestra", "Palestra 03-2018", "essa é uma descrição"
					+ " para a 01", "Matheusa", new Date(), 1.3f)));
	
	@GetMapping
	public String showAdminPanelPage(ModelMap model) {
		model.addAttribute("activities", TESTE);
		return "adminpanel";
	}
}
