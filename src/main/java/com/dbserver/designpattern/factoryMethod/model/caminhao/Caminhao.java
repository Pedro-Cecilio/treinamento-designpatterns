package com.dbserver.designpattern.factoryMethod.model.caminhao;

import com.dbserver.designpattern.factoryMethod.model.transporte.Transporte;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Caminhao implements Transporte{

    
    @Override
    public void entregar() {
        log.info("Entregando com caminhão.");
    }
    
}
