package br.upe.summerweek.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.upe.summerweek.model.Activity;
import br.upe.summerweek.model.User;
import br.upe.summerweek.repository.IActivityRepository;
import br.upe.summerweek.repository.IUserRepository;

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
		Optional<Activity> a = repository.findById(3L);
		Activity linda = a.get();
		
		String result = linda.getTitle() + "<br>" + 
						"Descrição: " + linda.getDescription() + "<br>" + 
						"Tipo: " + linda.getType() + "<br>" +
						"Palestrante: " + linda.getSpeakerName() + "<br>" +
						"Horas: " + linda.getHours() + "<br>" +
						"Data: " + linda.getDate();
		
		
		
		
		return result;
	}
	
	@Autowired
	IUserRepository rep;
	
	@RequestMapping("/register")
	public String register() {
	
		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR, 1995); 
		date.set(Calendar.MONTH, Calendar.JANUARY); 
		date.set(Calendar.DAY_OF_MONTH, 15);
		
		rep.save(new User(false, "Lucas Mortadela", "123456", "Masculino", date, "lucasfjportela@lalala.com", "Universidade de Pernambuco", "Sistemas de Informação"));
		return "Done";
	}
	
	@RequestMapping("/get")
	public String get() {
		Optional<User> u = rep.findById(2L);
		User teste = u.get();
		
		String result = teste.isAdmin() + "<br>" + 
						"Nome: " + teste.getName() + "<br>" + 
						"Password: " + teste.getPassword() + "<br>" +
						"Sexo: " + teste.getSex() + "<br>" +
						"Data de Nascimento: " + teste.getBirthday() +
						"Email: " + teste.getEmail() + "<br>" +
						"Universidade: " + teste.getUniversity() + "<br>" +
						"Curso: " + teste.getCourse() + "<br>";		
		
		return result;
	}
	
	
}
