package com.dbserver.designpattern.factoryMethod.model.caminhao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dbserver.designpattern.factoryMethod.model.transporte.Transporte;

public class Caminhao implements Transporte{

    private static final Logger logger = LoggerFactory.getLogger(Caminhao.class);
    
    @Override
    public void entregar() {
        logger.info("Entregando com caminhão.");
    }
    
}
