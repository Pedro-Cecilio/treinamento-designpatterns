package com.dbserver.designpattern.strategy.model;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FreteExpresso implements FreteStrategy {

    @Override
    public double calcularFrete(double peso) {
        log.info("Calculando frete expresso.");
        return peso * 1.0;
    }
    
}
