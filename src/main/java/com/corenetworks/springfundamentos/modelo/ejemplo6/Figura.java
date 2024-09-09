package com.corenetworks.springfundamentos.modelo.ejemplo6;

public abstract class Figura {
    //1. Atributos
    protected int coordenadaX;
    protected int coordenadaY;
    
    //2. M�todos
    public abstract String posicion();
    public abstract double calcularArea();
    
    //3. Constructores
    
    public Figura() {
		// TODO Auto-generated constructor stub
	}

    public Figura(int coordenadaX, int coordenadaY) {
		super();
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
	}


	//4. Setters y Getters

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }



}
