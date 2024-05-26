package com.dbserver.designpattern.abstractFactory.model.mobiliaFactory;

import com.dbserver.designpattern.abstractFactory.model.cadeira.ICadeira;
import com.dbserver.designpattern.abstractFactory.model.mesaDeCentro.IMesaDeCentro;
import com.dbserver.designpattern.abstractFactory.model.sofa.ISofa;

public interface IMobiliaFactory {
    ICadeira criarCadeira();
    ISofa criarSofa();
    IMesaDeCentro criarMesaDeCentro();
}
