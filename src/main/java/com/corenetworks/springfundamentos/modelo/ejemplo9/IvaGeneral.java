package com.corenetworks.springfundamentos.modelo.ejemplo9;

import org.springframework.stereotype.Component;

@Component(value = "general")
public class IvaGeneral implements IImpuesto{
    public static double IVA = 0.21;
    @Override
    public double calcularImpuesto(Producto p1) {
        return p1.getPrecio()*IVA;
    }
}
