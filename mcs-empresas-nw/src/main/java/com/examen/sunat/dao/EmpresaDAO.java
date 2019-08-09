package com.examen.sunat.dao;

import java.util.List;

import com.examen.sunat.model.Empresa;

public interface EmpresaDAO {

	List<Empresa> getAllEmpresas();
	Empresa getEmpresa(Integer id);
	void saveEmpresa(Empresa empresa);
	
}
