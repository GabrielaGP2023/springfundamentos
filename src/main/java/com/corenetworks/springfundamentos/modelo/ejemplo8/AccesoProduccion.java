package com.corenetworks.springfundamentos.modelo.ejemplo8;

import org.springframework.stereotype.Component;

@Component("aP")
public class AccesoProduccion implements IDAO {

	@Override
	public String insertar(Cliente c) {
		// TODO Auto-generated method stub
		return "Se ha insertado en la BBDD de produccion el cliente con nif " + c.getNumNIF();
	}

}
