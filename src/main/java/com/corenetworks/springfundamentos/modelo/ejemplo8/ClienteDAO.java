package com.corenetworks.springfundamentos.modelo.ejemplo8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ClienteDAO {
	//1. Atributos
	@Autowired
	@Qualifier("aD")
	private IDAO conexion;
	
	//2. M�todos
	public String insertar(Cliente c) {
		return conexion.insertar(c);
	}
	
	public ClienteDAO() {
		// TODO Auto-generated constructor stub
	}

	public ClienteDAO(IDAO conexion) {
		super();
		this.conexion = conexion;
	}

	public IDAO getConexion() {
		return conexion;
	}

	public void setConexion(IDAO conexion) {
		this.conexion = conexion;
	}
	
	

}
