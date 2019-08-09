package com.examen.sunat.model;

public class Empresa {

	@Override
	public String toString() {
		return "Empresa [id_empresa=" + id_empresa + ", ruc=" + ruc + ", razon_social=" + razon_social
				+ ", estado_actual=" + estado_actual + "]";
	}
	private int id_empresa;
	private String ruc;
	private String razon_social;
	private String estado_actual;
	
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getRazon_social() {
		return razon_social;
	}
	public void setRazon_social(String razon_social) {
		this.razon_social = razon_social;
	}
	public String getEstado_actual() {
		return estado_actual;
	}
	public void setEstado_actual(String estado_actual) {
		this.estado_actual = estado_actual;
	}
	public Empresa(int id_empresa, String ruc, String razon_social, String estado_actual) {
		super();
		this.setId_empresa(id_empresa);
		this.ruc = ruc;
		this.razon_social = razon_social;
		this.estado_actual = estado_actual;
	}
	public Empresa() {
		super();
	}
	public int getId_empresa() {
		return id_empresa;
	}
	public void setId_empresa(int id_empresa) {
		this.id_empresa = id_empresa;
	}
	
	
	
	
}
