/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corenetworks.springfundamentos.modelo.ejemplo5;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author Programacion
 */
@Component("gerente")
public class Gerente extends Empleado{
    // atributos
    @Value("1000")
    private double bono;
    //Métodos
    @Override
    public double calcularNomina() {
        return super.calcularNomina() + (bono*PORCENTAJE); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Gerente{" + "bono=" + bono + '}' + super.toString();
    }
    
    //Constructores

    public Gerente() {
    }
    
    public Gerente(double bono){
        this.bono = bono;
    }
    
    public Gerente(String nombre){
        super.nombre = nombre;
    }
    
   
    
    

    public Gerente(double bono, String nombre, double sueldo) {
        super(nombre, sueldo);
        this.bono = bono;
    }
    
    //Getters y Setters

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }


    /**
     *
     * @author Programacion
     */
    public static class Cuadrado extends Figura {

        //Atributos
        private double lado;
        //Métodos
        @Override
        public double calcularArea() {
            return Math.pow(lado, 2);

        }

        @Override
        public String toString() {
            return "Cuadrado{" + "lado=" + lado + '}' + super.toString();
        }

        //Constructores

        public Cuadrado() {
        }

        public Cuadrado(double lado, int x, int y) {
            super(x, y);
            this.lado = lado;
        }

        //Setters y Getters

        public double getLado() {
            return lado;
        }

        public void setLado(double lado) {
            this.lado = lado;
        }



    }

    /**
     *
     * @author Programacion
     */
    public abstract static class Figura {

        //Atributos

        protected int x;
        protected int y;

        // Métodos

        public abstract double calcularArea();

        public String mostrarPosicion(){
            return "(" + x + "," + y + ")";
        }

        @Override
        public String toString() {
            return "Figura{" + "x=" + x + ", y=" + y + '}';
        }


        //Constructores

        public Figura() {
        }

        public Figura(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }



    }

    /**
     *
     * @author Programacion
     */
    public static class Triangulo extends Figura {

        //Atributos
        private double base;
        private double altura;
        //Métodos
        @Override
        public double calcularArea() {
            return (base * altura) / 2;
        }

        @Override
        public String toString() {
            return "Triangulo{" + "base=" + base + ", altura=" + altura + '}';
        }
        //Constructores
        public Triangulo() {
        }

        public Triangulo(double base, double altura, int x, int y) {
            super(x, y);
            this.base = base;
            this.altura = altura;
        }

        //Setters y Getters

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
}
