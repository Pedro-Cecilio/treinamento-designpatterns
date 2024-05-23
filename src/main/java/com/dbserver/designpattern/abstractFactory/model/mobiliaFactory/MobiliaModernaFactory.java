package com.dbserver.designpattern.abstractFactory.model.mobiliaFactory;

import com.dbserver.designpattern.abstractFactory.model.cadeira.Cadeira;
import com.dbserver.designpattern.abstractFactory.model.cadeira.CadeiraModerna;
import com.dbserver.designpattern.abstractFactory.model.mesaDeCentro.MesaDeCentro;
import com.dbserver.designpattern.abstractFactory.model.mesaDeCentro.MesaDeCentroModerna;
import com.dbserver.designpattern.abstractFactory.model.sofa.Sofa;
import com.dbserver.designpattern.abstractFactory.model.sofa.SofaModerno;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MobiliaModernaFactory implements MobiliaFactory{

    @Override
    public Cadeira criarCadeira() {
        log.info("Criando cadeira moderna");
        return new CadeiraModerna();
    }

    @Override
    public Sofa criarSofa() {
        log.info("Criando sofa moderno");
        return new SofaModerno();
    }

    @Override
    public MesaDeCentro criarMesaDeCentro() {
        log.info("Criando mesa de centro moderna");
        return new MesaDeCentroModerna();
    }
    
}
