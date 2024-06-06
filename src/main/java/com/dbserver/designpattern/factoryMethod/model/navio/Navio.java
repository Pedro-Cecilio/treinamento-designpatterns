package com.dbserver.designpattern.factoryMethod.model.navio;


import com.dbserver.designpattern.factoryMethod.model.transporte.ITransporte;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Navio implements ITransporte{

    @Override
    public void entregar() {
        log.info("Entregando com navio.");
    }
    
}
