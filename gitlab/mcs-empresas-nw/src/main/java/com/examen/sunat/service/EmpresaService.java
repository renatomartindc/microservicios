package com.examen.sunat.service;

import java.util.List;

import com.examen.sunat.model.Empresa;

public interface EmpresaService {

	List<Empresa> getAllEmpresas();
	Empresa getEmpresa(Integer id);
	void saveEmpresa(Empresa empresa);
	
}
