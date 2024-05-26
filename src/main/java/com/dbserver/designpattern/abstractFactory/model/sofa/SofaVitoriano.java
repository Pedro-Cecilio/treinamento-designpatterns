package com.dbserver.designpattern.abstractFactory.model.sofa;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SofaVitoriano implements ISofa{@Override
    public void sentar() {
        log.info("Sentando no sofá vitoriano");
    }
    
}
