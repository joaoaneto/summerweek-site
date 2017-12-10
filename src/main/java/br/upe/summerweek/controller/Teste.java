package br.upe.summerweek.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.upe.summerweek.model.Activity;
import br.upe.summerweek.repository.IActivityRepository;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class Teste {
	@Autowired
	IActivityRepository repository;
	
	@RequestMapping("/insert")
	public String process() {
	
		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR, 1995); 
		date.set(Calendar.MONTH, Calendar.MARCH); 
		date.set(Calendar.DAY_OF_MONTH, 20);
		
		repository.save(new Activity("Sexo", "Suruba com geral", "Muito sexo grupal", "Matheus Bengala", date, 5.0f));
		return "Done";
	}
	
	@RequestMapping("/pegar")
	public String pegar() {
		Optional<Activity> a = repository.findById(2L);
		Activity linda = a.get();
		
		String result = linda.getTitle() + "<br>" + 
						"Descrição: " + linda.getDescription() + "<br>" + 
						"Tipo: " + linda.getType() + "<br>" +
						"Palestrante: " + linda.getSpeakerName() + "<br>" +
						"Horas: " + linda.getHours() + "<br>" +
						"Data: " + linda.getDate();
		
		
		
		
		return result;
	}
	
	
}
