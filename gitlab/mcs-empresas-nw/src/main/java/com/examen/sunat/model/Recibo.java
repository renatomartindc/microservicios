package com.examen.sunat.model;

public class Recibo {

	
	private String nro_recibo;
	private double monto_emitido;
	private int fg_retencion;
	private Empresa empresa;
	public String getNro_recibo() {
		return nro_recibo;
	}
	public void setNro_recibo(String nro_recibo) {
		this.nro_recibo = nro_recibo;
	}
	public double getMonto_emitido() {
		return monto_emitido;
	}
	public void setMonto_emitido(double monto_emitido) {
		this.monto_emitido = monto_emitido;
	}
	public int getFg_retencion() {
		return fg_retencion;
	}
	public void setFg_retencion(int fg_retencion) {
		this.fg_retencion = fg_retencion;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public Recibo(String nro_recibo, double monto_emitido, int fg_retencion, Empresa empresa) {
		super();
		this.nro_recibo = nro_recibo;
		this.monto_emitido = monto_emitido;
		this.fg_retencion = fg_retencion;
		this.empresa = empresa;
	}
	public Recibo() {
		super();
	}
	@Override
	public String toString() {
		return "Recibo [nro_recibo=" + nro_recibo + ", monto_emitido=" + monto_emitido + ", fg_retencion="
				+ fg_retencion + ", empresa=" + empresa + "]";
	}
	
	
	
}
