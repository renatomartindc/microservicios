package com.examen.sunat.model;

public class ResponseFormatoGet {
	private String codigo_servicio;
	private Empresa empresa;
	
	
	public String getCodigo_servicio() {
		return codigo_servicio;
	}
	public void setCodigo_servicio(String codigo_servicio) {
		this.codigo_servicio = codigo_servicio;
	}
	public Empresa getCliente() {
		return empresa;
	}
	public void setCliente(Empresa cliente) {
		this.empresa = cliente;
	}
}
