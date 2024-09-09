package com.corenetworks.springfundamentos.modelo.ejemplo7;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class Bicicleta {
    private String color;
    @Autowired
    @Qualifier("motorElectrico2")
    private IMotor motor;

    public Bicicleta(IMotor m1) {
        motor = m1;
    }

    public String avanzar(){
        return motor.arrancar();
    }
}
