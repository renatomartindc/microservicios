package com.springboot.api.apitest.service;

import java.util.List;

import com.springboot.api.apitest.bean.ResponseAllPersona;
import com.springboot.api.apitest.model.Persona;

public interface PersonaService {

	//List<Persona> getAllPersonas();
	ResponseAllPersona getAllPersonas();
	
	Persona getPersona(Integer id);
	void savePersona(Persona persona);
	void deletePersona(Integer id);
	
}
