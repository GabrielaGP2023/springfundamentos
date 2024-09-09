package com.corenetworks.springfundamentos.modelo;

import org.springframework.stereotype.Component;

@Component
public class Saludo {
    public String saludar(){

        return ("Bienvenidos al curso de Java");
    }
}
