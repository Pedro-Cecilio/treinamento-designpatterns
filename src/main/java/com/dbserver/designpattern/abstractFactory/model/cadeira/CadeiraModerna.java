package com.dbserver.designpattern.abstractFactory.model.cadeira;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CadeiraModerna implements ICadeira{

    @Override
    public void sentar() {
        log.info("Sentou na cadeira moderna.");
    }
    
}
