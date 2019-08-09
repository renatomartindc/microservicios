package com.examen.sunat.model;

import java.util.List;

public class ResponseFormatoAll {
	
	private String codigo_servicio;
	private List<Empresa> empresas;
	
	public String getCodigo_servicio() {
		return codigo_servicio;
	}
	public void setCodigo_servicio(String codigo_servicio) {
		this.codigo_servicio = codigo_servicio;
	}
	public List<Empresa> getEmpresas() {
		return empresas;
	}
	public void setEmpresas(List<Empresa> empresas) {
		this.empresas = empresas;
	}
}
