package com.corenetworks.springfundamentos.modelo.ejemplo9;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Producto {
    private String nombre;
    private double precio;
}
