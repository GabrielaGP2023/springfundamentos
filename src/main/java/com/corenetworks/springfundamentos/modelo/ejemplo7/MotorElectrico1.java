package com.corenetworks.springfundamentos.modelo.ejemplo7;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class MotorElectrico1 implements IMotor{
    private String tipoBateria;

    @Override
    public String arrancar() {
        return "Arrancando con motor 1";
    }

    @Override
    public String cargar() {
        return "Se está cargando el motor 1";
    }

    @Override
    public String cambiarPotencia() {
        return "Cambiando potencia del motor 1";
    }
}
