package com.dbserver.designpattern.abstractFactory.model.mesaDeCentro;



import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MesaDeCentroModerna implements MesaDeCentro {

    @Override
    public void colocarObjeto() {
        log.info("Colocando um objeto na mesa moderna.");
    }
    
}
