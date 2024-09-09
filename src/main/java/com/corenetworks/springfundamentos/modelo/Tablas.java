package com.corenetworks.springfundamentos.modelo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Tablas {
    private int numero;

    public Tablas(@Value("${mi.tabla}") int numero) {
        this.numero = numero;
    }

    public String muestraTabla()
    {
        String cadena="";
        for (int i = 1; i <= 10; i++)
        {
            cadena += numero + " x " + i + " = "+ numero * i + "\n";
        }
        return cadena;
    }
}
