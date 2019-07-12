package com.springboot.api.apitest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.api.apitest.bean.ResponseAllPersona;
import com.springboot.api.apitest.model.Persona;
import com.springboot.api.apitest.service.PersonaService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/persona")
@Api(description="Controlador con los métodos necesarios para hacer un CRUD")
public class PersonaController {

	
	@Autowired 
	private PersonaService _personaService;
	
	@GetMapping(value="/",produces="application/json")
	@ApiOperation("Método para listar todas las personas")
	public ResponseAllPersona getAllPersonas(){
		return _personaService.getAllPersonas();
	}
	
	@GetMapping(value="/{id}",produces="application/json")
	public Persona getPersona(@PathVariable ("id") Integer id){
		return _personaService.getPersona(id);
	}
	
	@PostMapping(value="/",produces="application/json")
	public ResponseAllPersona savePersona(@RequestBody Persona persona){
		_personaService.savePersona(persona);
		
		return _personaService.getAllPersonas();
	}
	
	@DeleteMapping(value="/{id}",produces="application/json")
	public 	ResponseAllPersona deletePersona(@PathVariable ("id") Integer id){
		_personaService.deletePersona(id);
		
		return _personaService.getAllPersonas();
	}
	
}
