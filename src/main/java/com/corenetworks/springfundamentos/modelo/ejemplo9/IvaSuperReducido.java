package com.corenetworks.springfundamentos.modelo.ejemplo9;

import org.springframework.stereotype.Component;

@Component("reducido")
public class IvaSuperReducido implements IImpuesto{
    public static double IVA_REDUCIDO = 0.04;
    @Override
    public double calcularImpuesto(Producto p1) {
        return p1.getPrecio()*IVA_REDUCIDO;
    }
}
