package com.springboot.api.apitest.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.springboot.api.apitest.dao.PersonaDao;
import com.springboot.api.apitest.model.Persona;
import com.springboot.api.apitest.rowmapper.PersonaRowMapper;

@Repository
public class PersonaDaoImpl extends JdbcDaoSupport implements PersonaDao {

	//private static List<Persona> listapersonas = new ArrayList<Persona>();
	
	public PersonaDaoImpl(DataSource dataSource){
		/* lista = new Personas add ....*/
		this.setDataSource(dataSource);
	}
	
	@Override
	public List<Persona> getAllPersonas() {
		// return listapersonas
		List<Persona> personas = new ArrayList<Persona>();
		String sql = "select id,nombres,apellidoPaterno,apellidoMaterno,sexo,direccion,estadoCivil from persona;";
		
		try{
			RowMapper<Persona> personaRow = new PersonaRowMapper();
			personas =  getJdbcTemplate().query(sql, personaRow);
			logger.debug("Se han listado las siguientes personas :"+personas.toString());
			
		}catch(Exception e){
			logger.error(e.getMessage());
		}
		
		
		return personas;
	}

	@Override
	public Persona getPersona(Integer id) {
		
		/*
		Persona persona=null;
		
		for(Persona per:listapersonas) {
			if(per.getId().equals(id))
				return per;
		}*/
		
		return null;
	}

	@Override
	public void savePersona(Persona persona) {
		/*
		 * if(persona.getId()==null || "".equals(persona.getId())){
		 * persona.setId(listapersonas.size()+1); listapersonas.add(persona); }else {
		 * for(int i=0;i<listapersonas.size();i++) {
		 * if(listapersonas.get(i).getId()==persona.getId()){ listapersonas.set(i,
		 * persona); return; } } }
		 */
		
		
	}

	@Override
	public void deletePersona(Integer id) {
		
		/*
		 * for(int i=0;i<listapersonas.size();i++) {
		 * if(listapersonas.get(i).getId().equals(id)){ listapersonas.remove(i); return;
		 * } }
		 */
		
	}

}
