package com.dbserver.designpattern.factoryMethod.model.caminhao;

import com.dbserver.designpattern.factoryMethod.model.transporte.ITransporte;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Caminhao implements ITransporte{
    @Override
    public void entregar() {
        log.info("Entregando com caminhão.");
    }
    
}
