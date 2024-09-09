package com.corenetworks.springfundamentos.modelo.ejemplo8;

import org.springframework.stereotype.Component;

@Component("aD")
public class AccesoDesarrollo implements IDAO {

	@Override
	public String insertar(Cliente c) {
		// TODO Auto-generated method stub
		return "Se ha insertado en la BBDD de desarrollo el cliente con nif " + c.getNumNIF();
	}

}
