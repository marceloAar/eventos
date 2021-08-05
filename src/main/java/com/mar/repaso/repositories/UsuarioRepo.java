package com.mar.repaso.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mar.repaso.models.Usuario;

@Repository
public interface UsuarioRepo extends CrudRepository<Usuario, Long>{
	
	List<Usuario> findAll();
	
	Usuario findByEmail(String email);

}
