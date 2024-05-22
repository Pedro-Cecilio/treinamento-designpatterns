package com.dbserver.designpattern.factoryMethod.model.logistica;

import com.dbserver.designpattern.factoryMethod.model.transporte.Transporte;

public abstract class Logistica {
    public abstract Transporte criarTransporte();
}
