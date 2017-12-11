package br.upe.summerweek.repository;

import org.springframework.data.repository.CrudRepository;

import br.upe.summerweek.model.User;

public interface IUserRepository extends CrudRepository<User, Long>{
	
}