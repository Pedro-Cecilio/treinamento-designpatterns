package com.dbserver.designpattern.abstractFactory.model.mobiliaFactory;

import com.dbserver.designpattern.abstractFactory.model.cadeira.ICadeira;
import com.dbserver.designpattern.abstractFactory.model.cadeira.CadeiraVitoriana;
import com.dbserver.designpattern.abstractFactory.model.mesaDeCentro.IMesaDeCentro;
import com.dbserver.designpattern.abstractFactory.model.mesaDeCentro.MesaDeCentroVitoriana;
import com.dbserver.designpattern.abstractFactory.model.sofa.ISofa;
import com.dbserver.designpattern.abstractFactory.model.sofa.SofaVitoriano;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MobiliaVitorianaFactory implements IMobiliaFactory{

    @Override
    public ICadeira criarCadeira() {
        log.info("Criando cadeira vitoriana");
        return new CadeiraVitoriana();
    }

    @Override
    public ISofa criarSofa() {
        log.info("Criando sofa vitoriano");
        return new SofaVitoriano();
    }

    @Override
    public IMesaDeCentro criarMesaDeCentro() {
        log.info("Criando mesa de centro vitoriana");
        return new MesaDeCentroVitoriana();
    }
    
}
