package com.examen.sunat.dao.impl;

import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.examen.sunat.dao.EmpresaDAO;
import com.examen.sunat.model.Empresa;
import com.examen.sunat.rowmapper.EmpresaRowMapper;

@Repository
public class EmpresaDAOImpl extends JdbcDaoSupport implements EmpresaDAO {

	public EmpresaDAOImpl(DataSource dataSource) {
		this.setDataSource(dataSource);
	}
	
	@Override
	public List<Empresa> getAllEmpresas() {

		List<Empresa> listaEmpresas = new ArrayList<Empresa>();
		
		String sql = " SELECT id, razon_social, ruc, estado\n" + 
				" FROM empresa";
		
		try {
			
			RowMapper<Empresa> empresaRow = new EmpresaRowMapper();
			listaEmpresas = getJdbcTemplate().query(sql, empresaRow);
			logger.debug("Se han listado "+listaEmpresas.size()+" empresas");
					
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		
		return listaEmpresas;
	}

	@Override
	public Empresa getEmpresa(Integer id) {
		Empresa empresa = new Empresa();	
		List<Empresa> listaEmpresas = new ArrayList<Empresa>();
		
		String sql = " SELECT id, razon_social, ruc, estado\n" + 
				" FROM empresa where id='"+id+"'";
				
		try {
			
			RowMapper<Empresa> empresaRow = new EmpresaRowMapper();
			listaEmpresas = getJdbcTemplate().query(sql, empresaRow);
			
			empresa = listaEmpresas.get(0);
			
			logger.debug("Se ha traido a la empresa "+listaEmpresas.get(0).toString());
			
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		
		return empresa;
	}

	@Override
	public void saveEmpresa(Empresa empresa) {
		String sql = "insert into empresa (razon_social, ruc, estado) "  
				+ "values (?, ?, ?);";
		
		Object[] params = { empresa.getRazon_social(), empresa.getRuc(), empresa.getEstado_actual()};
		int[] tipos = { Types.VARCHAR, Types.VARCHAR, Types.VARCHAR};
		
		try {
			
			int filas = getJdbcTemplate().update(sql, params,tipos);
			
			logger.debug("Se han insertado : "+filas+" filas");
			logger.debug("Se ha registrado a la empresa "+empresa.toString());
			
		} catch (Exception e) {
			logger.error(e.getMessage());
		}

	}

}
