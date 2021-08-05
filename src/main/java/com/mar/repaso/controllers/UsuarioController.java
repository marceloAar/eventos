package com.mar.repaso.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mar.repaso.models.Usuario;
import com.mar.repaso.services.UsuarioService;

@Controller
public class UsuarioController {
	
	private final UsuarioService usuarioService;
	
	public UsuarioController(UsuarioService usuarioService){
		this.usuarioService = usuarioService;
	}
	
	@RequestMapping("/")
    public String index() {
        
        return "index.jsp";
    }
	
	//crear nuevo       
    @RequestMapping(value="/registro", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("usuarios") Usuario usuario, BindingResult result) {
        if (result.hasErrors()) {
            return "index.jsp";
        } else {
        	usuarioService.crearUsuario(usuario);
            return "redirect:/";
        }
    }
	

}
