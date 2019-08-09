package com.examen.sunat.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.examen.sunat.model.Empresa;

public class EmpresaRowMapper implements RowMapper<Empresa>{
	
	@Override
	public Empresa mapRow(ResultSet rs, int rowNum) throws SQLException {
		Empresa empresa = new Empresa();
		
		empresa.setId_empresa(rs.getInt("id"));
		empresa.setRazon_social(rs.getString("razon_social"));
		empresa.setRuc(rs.getString("ruc"));
		empresa.setEstado_actual(rs.getString("estado"));
		
		return empresa;
	}

}
