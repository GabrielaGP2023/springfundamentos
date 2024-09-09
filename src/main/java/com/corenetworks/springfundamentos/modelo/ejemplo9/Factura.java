package com.corenetworks.springfundamentos.modelo.ejemplo9;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Factura {
    @Autowired
    @Qualifier("reducido")
    private IImpuesto impuesto;
    private List<Producto> productos;

    public double calcularTotalFactura(){
        return
        productos.stream()
                .mapToDouble(p ->p.getPrecio() + impuesto.calcularImpuesto(p))
                .sum();
    }

}
