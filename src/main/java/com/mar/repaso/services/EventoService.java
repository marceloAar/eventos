package com.mar.repaso.services;

import java.util.List;
import java.util.Optional;

import com.mar.repaso.models.Evento;
import com.mar.repaso.repositories.EventoRepo;


public class EventoService {
	
	private final EventoRepo eventoRepo;
    
	public EventoService(EventoRepo eventoRepo) {
		this.eventoRepo = eventoRepo;
	}
	  
	public List<Evento> allEventos() {
		return eventoRepo.findAll();
	}
	  
	public Evento crearEvento(Evento b) {
	        return eventoRepo.save(b);
	}
	   
	public Evento buscarEvento(Long id) {
		Optional<Evento> optional = eventoRepo.findById(id);
	    if(optional.isPresent()) {
	    	return optional.get();
	    } else {
	    	return null;
	    }
	}	
	

}
