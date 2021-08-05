package com.mar.repaso.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mar.repaso.models.Evento;

@Repository
public interface EventoRepo extends CrudRepository<Evento, Long>{
	
	List<Evento> findAll();

}
