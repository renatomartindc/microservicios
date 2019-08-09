package com.examen.sunat.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.sunat.dao.impl.EmpresaDAOImpl;
import com.examen.sunat.model.Empresa;
import com.examen.sunat.service.EmpresaService;

@Service
public class EmpresaServiceImpl implements EmpresaService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private EmpresaDAOImpl _empresaDao;
	
	@Override
	public List<Empresa> getAllEmpresas() {
		// TODO Auto-generated method stub
		return _empresaDao.getAllEmpresas();
	}

	@Override
	public Empresa getEmpresa(Integer id) {
		// TODO Auto-generated method stub
		return _empresaDao.getEmpresa(id);
	}

	@Override
	public void saveEmpresa(Empresa empresa) {
		_empresaDao.saveEmpresa(empresa);	
		
	}

}
