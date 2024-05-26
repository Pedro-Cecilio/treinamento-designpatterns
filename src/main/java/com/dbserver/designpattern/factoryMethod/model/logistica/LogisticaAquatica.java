package com.dbserver.designpattern.factoryMethod.model.logistica;

import com.dbserver.designpattern.factoryMethod.model.navio.Navio;
import com.dbserver.designpattern.factoryMethod.model.transporte.ITransporte;

public class LogisticaAquatica extends Logistica{

    @Override
    public ITransporte criarTransporte() {
        return new Navio();
    }
}
