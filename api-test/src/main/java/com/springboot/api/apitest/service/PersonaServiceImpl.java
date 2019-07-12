package com.springboot.api.apitest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.api.apitest.bean.ResponseAllPersona;
import com.springboot.api.apitest.dao.PersonaDao;
import com.springboot.api.apitest.model.Persona;

@Service
public class PersonaServiceImpl implements PersonaService {

	
	@Autowired
	private PersonaDao _personaDao;
	
	
	@Override
	public ResponseAllPersona getAllPersonas() {
		// TODO Auto-generated method stub
		ResponseAllPersona response = new ResponseAllPersona();
		List<Persona> personas = new ArrayList<Persona>();
		personas = _personaDao.getAllPersonas();
		
		if(personas.size()>0) {
			response.setCodigo("0000");
			response.setMensaje("Se ha encontrado personas en la lista");
			response.setPersonas(personas);
		}else{
			response.setCodigo("999");
			response.setMensaje("No se ha encontrado personas en la lista");
		}
		
		//return _personaDao.getAllPersonas();
		
		return response;
	}

	@Override
	public Persona getPersona(Integer id) {
		// TODO Auto-generated method stub
		return _personaDao.getPersona(id);
	}

	@Override
	public void savePersona(Persona persona) {
		_personaDao.savePersona(persona);
		
	}

	@Override
	public void deletePersona(Integer id) {
		_personaDao.deletePersona(id);
		
	}

}
