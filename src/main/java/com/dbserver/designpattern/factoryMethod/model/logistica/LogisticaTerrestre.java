package com.dbserver.designpattern.factoryMethod.model.logistica;

import com.dbserver.designpattern.factoryMethod.model.caminhao.Caminhao;
import com.dbserver.designpattern.factoryMethod.model.transporte.Transporte;

public class LogisticaTerrestre extends Logistica{

    @Override
    public Transporte criarTransporte() {
        return new Caminhao();
    }
    
}
