package com.dbserver.designpattern.abstractFactory.model.mobiliaFactory;

import com.dbserver.designpattern.abstractFactory.model.cadeira.Cadeira;
import com.dbserver.designpattern.abstractFactory.model.cadeira.CadeiraVitoriana;
import com.dbserver.designpattern.abstractFactory.model.mesaDeCentro.MesaDeCentro;
import com.dbserver.designpattern.abstractFactory.model.mesaDeCentro.MesaDeCentroVitoriana;
import com.dbserver.designpattern.abstractFactory.model.sofa.Sofa;
import com.dbserver.designpattern.abstractFactory.model.sofa.SofaVitoriano;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MobiliaVitorianaFactory implements MobiliaFactory{

    @Override
    public Cadeira criarCadeira() {
        log.info("Criando cadeira vitoriana");
        return new CadeiraVitoriana();
    }

    @Override
    public Sofa criarSofa() {
        log.info("Criando sofa vitoriano");
        return new SofaVitoriano();
    }

    @Override
    public MesaDeCentro criarMesaDeCentro() {
        log.info("Criando mesa de centro vitoriana");
        return new MesaDeCentroVitoriana();
    }
    
}
