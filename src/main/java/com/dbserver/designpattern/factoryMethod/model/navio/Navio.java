package com.dbserver.designpattern.factoryMethod.model.navio;


import com.dbserver.designpattern.factoryMethod.model.transporte.Transporte;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Navio implements Transporte{

    
    @Override
    public void entregar() {
        log.info("Entregando com navio.");
    }
    
}
