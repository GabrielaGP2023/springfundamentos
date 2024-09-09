package com.corenetworks.springfundamentos.modelo.ejemplo6;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Triangulo extends Figura {

//	1. Atributos
	@Value("5")
	private double base;
	@Value("7")
	private double altura;

	@Override
	public String posicion() {
		// TODO Auto-generated method stub
		return "[" + coordenadaX + "," + coordenadaY + "]" + " base : " + base + " altura : " + altura;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return base * altura / 2;
	}

//	3. Constructores
	public Triangulo() {
		// TODO Auto-generated constructor stub
	}

	public Triangulo(int coordenadaX, int coordenadaY, double base, double altura) {
		super(coordenadaX, coordenadaY);
		this.base = base;
		this.altura = altura;
	}
	
//	4. Setters y Getters

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	

	

}
