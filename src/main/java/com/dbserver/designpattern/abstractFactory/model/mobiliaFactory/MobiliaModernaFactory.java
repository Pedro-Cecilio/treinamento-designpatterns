package com.dbserver.designpattern.abstractFactory.model.mobiliaFactory;

import com.dbserver.designpattern.abstractFactory.model.cadeira.ICadeira;
import com.dbserver.designpattern.abstractFactory.model.cadeira.CadeiraModerna;
import com.dbserver.designpattern.abstractFactory.model.mesaDeCentro.IMesaDeCentro;
import com.dbserver.designpattern.abstractFactory.model.mesaDeCentro.MesaDeCentroModerna;
import com.dbserver.designpattern.abstractFactory.model.sofa.ISofa;
import com.dbserver.designpattern.abstractFactory.model.sofa.SofaModerno;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MobiliaModernaFactory implements IMobiliaFactory{

    @Override
    public ICadeira criarCadeira() {
        log.info("Criando cadeira moderna");
        return new CadeiraModerna();
    }

    @Override
    public ISofa criarSofa() {
        log.info("Criando sofa moderno");
        return new SofaModerno();
    }

    @Override
    public IMesaDeCentro criarMesaDeCentro() {
        log.info("Criando mesa de centro moderna");
        return new MesaDeCentroModerna();
    }
    
}
