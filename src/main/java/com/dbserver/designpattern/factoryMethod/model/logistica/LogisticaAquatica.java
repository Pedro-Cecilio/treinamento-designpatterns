package com.dbserver.designpattern.factoryMethod.model.logistica;

import com.dbserver.designpattern.factoryMethod.model.navio.Navio;
import com.dbserver.designpattern.factoryMethod.model.transporte.Transporte;

public class LogisticaAquatica extends Logistica{

    @Override
    public Transporte criarTransporte() {
        return new Navio();
    }
}
