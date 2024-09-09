package com.corenetworks.springfundamentos.modelo.ejemplo6;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public  class Cuadrado extends Figura {
	@Value("5")
//	1. Atributos
	private double lado;

	@Override
	public String posicion() {
		
		return "[" + coordenadaX + "," + coordenadaY + "]" + " lado : " + lado;
	}

	@Override
	public double calcularArea() {
		
		return Math.pow(lado, 2);
	}
	
//	3. Constructores
	public Cuadrado() {
		// TODO Auto-generated constructor stub
	}

	public Cuadrado(int coordenadaX, int coordenadaY, double lado) {
		super(coordenadaX, coordenadaY);
		this.lado = lado;
	}
	
// 4. Setters y Getters
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	

}
