package com.dbserver.designpattern.factoryMethod.model.logistica;

import com.dbserver.designpattern.factoryMethod.model.transporte.ITransporte;

public abstract class Logistica {
    public abstract ITransporte criarTransporte();
}
