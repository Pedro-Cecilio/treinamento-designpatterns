package com.dbserver.designpattern.strategy.model;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FreteNormal  implements FreteStrategy{

    @Override
    public double calcularFrete(double peso) {
        log.info("Calculando frete normal.");
        return peso * 0.5;
    }
    
}
