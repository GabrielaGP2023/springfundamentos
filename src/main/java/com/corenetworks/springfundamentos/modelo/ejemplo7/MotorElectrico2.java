package com.corenetworks.springfundamentos.modelo.ejemplo7;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class MotorElectrico2 implements IMotor{
    @Override
    public String arrancar() {
        return "Arrancando con motor 2";
    }

    @Override
    public String cargar() {
        return "Cargando el motor 2";
    }

    @Override
    public String cambiarPotencia() {
        return "Cambiando la potencia del motor 2";
    }
}
