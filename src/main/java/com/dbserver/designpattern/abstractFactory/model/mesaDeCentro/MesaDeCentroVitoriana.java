package com.dbserver.designpattern.abstractFactory.model.mesaDeCentro;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MesaDeCentroVitoriana implements IMesaDeCentro {

    @Override
    public void colocarObjeto() {
        log.info("Colocando objeto na mesa de centro vitoriana");
    }
    
}
