package com.springboot.api.apitest.bean;

import java.util.List;

import com.springboot.api.apitest.model.Persona;

public class ResponseAllPersona {

	private String codigo;
	private String mensaje;
	private List<Persona> personas;
	
	
	
	public ResponseAllPersona() {
		super();
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public List<Persona> getPersonas() {
		return personas;
	}
	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}
	public ResponseAllPersona(String codigo, String mensaje, List<Persona> personas) {
		super();
		this.codigo = codigo;
		this.mensaje = mensaje;
		this.personas = personas;
	}
	@Override
	public String toString() {
		return "ResponseAllPersona [codigo=" + codigo + ", mensaje=" + mensaje + ", personas=" + personas + "]";
	}
	
	
	
	
}
