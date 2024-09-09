package com.corenetworks.springfundamentos.modelo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Campos {

    private int numero;

    public Campos(@Value("${mi.valor}") int numero) {
        this.numero = numero;
    }

    public String muestra(){
        return "El número es " + numero;
    }
    public void Incrementa()
    {
        numero++;
    }
}
