package com.dbserver.designpattern.factoryMethod.model.logistica;

import com.dbserver.designpattern.factoryMethod.model.caminhao.Caminhao;
import com.dbserver.designpattern.factoryMethod.model.transporte.ITransporte;

public class LogisticaTerrestre extends Logistica{

    @Override
    public ITransporte criarTransporte() {
        return new Caminhao();
    }
    
}
