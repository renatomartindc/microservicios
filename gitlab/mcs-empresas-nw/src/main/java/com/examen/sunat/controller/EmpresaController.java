package com.examen.sunat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.sunat.model.Empresa;
import com.examen.sunat.model.ResponseFormato;
import com.examen.sunat.model.ResponseFormatoAll;
import com.examen.sunat.model.ResponseFormatoGet;
import com.examen.sunat.service.impl.EmpresaServiceImpl;

@RestController
@RequestMapping("/examen")
public class EmpresaController {
	
	@Autowired
	private EmpresaServiceImpl _empresaService;
	

	@GetMapping(value = "/empresa", produces = "application/json")
	public ResponseFormatoAll getAllClientes(){
		ResponseFormatoAll response = new ResponseFormatoAll();
		response.setCodigo_servicio("0000");
		response.setEmpresas(_empresaService.getAllEmpresas());
		return response;
	}
	
	
	@GetMapping(value = "/empresa/{id}", produces = "application/json")	
	public ResponseFormatoGet getCliente(@PathVariable ("id") Integer id){
		//return _clienteService.getCliente(id);
		
		ResponseFormatoGet response = new ResponseFormatoGet();
		response.setCodigo_servicio("0000");
		response.setCliente(_empresaService.getEmpresa(id));
		
		return response;
	}
	
	@PostMapping(value = "/empresa", produces = "application/json")	
	public ResponseFormato saveCliente(@RequestBody Empresa empresa){
		
		
		_empresaService.saveEmpresa(empresa);
		
		ResponseFormato response = new ResponseFormato();
		response.setCodigo_servicio("0000");
		response.setDescripcion("Empresa registrado con éxito");		
				
		return response;
	}	
	
}
