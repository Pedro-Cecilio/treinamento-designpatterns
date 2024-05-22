package com.dbserver.designpattern.factoryMethod.model.navio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dbserver.designpattern.factoryMethod.model.transporte.Transporte;

public class Navio implements Transporte{

    private static final Logger logger = LoggerFactory.getLogger(Navio.class);
    
    @Override
    public void entregar() {
        logger.info("Entregando com navio.");
    }
    
}
