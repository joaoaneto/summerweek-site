package br.upe.summerweek.repository;

import org.springframework.data.repository.CrudRepository;

import br.upe.summerweek.model.Activity;

public interface IActivityRepository extends CrudRepository<Activity, Long>{
	
}