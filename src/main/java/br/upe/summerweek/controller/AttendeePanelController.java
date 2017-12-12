package br.upe.summerweek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.upe.summerweek.model.Activity;
import br.upe.summerweek.model.User;
import br.upe.summerweek.repository.IActivityRepository;
import br.upe.summerweek.repository.IUserRepository;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

@Controller

public class AttendeePanelController {

	@Autowired
	IActivityRepository actRep;
	@Autowired
	IUserRepository userRep;

	@GetMapping("/attendee/panel")
	public String showAttendeePanelPage(ModelMap model) {
		List<Activity> acts = (List<Activity>) actRep.findAll();
		List<Activity> userActivities = new ArrayList<Activity>();
		List<Long> actIDS = new ArrayList<Long>();
		User u = userRep.findById(29L).get();
		
		
		for(int j = 0; j < acts.size(); j++) {
			actIDS.add(acts.get(j).getID());
		}
		
		
		for(int i = 0; i < u.getListActivities().size(); i++) {
			
			if(actIDS.contains(u.getListActivities().get(i))){
				for(int k = 0; k < acts.size(); k++) {
					if(acts.get(k).getID() == u.getListActivities().get(i)) {
						userActivities.add(acts.get(k));
						acts.remove(k);
						
					}
				}
			}
		}		
			model.addAttribute("activities", acts);
			model.addAttribute("userActivities", userActivities);
			return "attendeePanel";
		}

		@GetMapping("/userActivity/add")
		public String addActivityForUser(@RequestParam("userID") String userID, @RequestParam("activityID") String activityID) {

			User u = userRep.findById(Long.parseLong(userID)).get();
			u.addActivitie(Long.parseLong(activityID));
			userRep.save(u);

			return "redirect:/attendee/panel";
		}

		@GetMapping("/userActivity/remove")
		public String removeActivityForUser(@RequestParam("userID") String userID, @RequestParam("activityID") String activityID) {

			User u = userRep.findById(Long.parseLong(userID)).get();

			for(int i = 0; i < u.getListActivities().size(); i++) {
				if(u.getListActivities().get(i) == Long.parseLong(activityID)) {
					u.getListActivities().remove(i);
				}
			}

			userRep.save(u);
			return "redirect:/attendee/panel";
		}
	}