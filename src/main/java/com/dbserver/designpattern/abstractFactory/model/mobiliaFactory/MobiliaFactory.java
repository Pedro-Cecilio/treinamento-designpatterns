package com.dbserver.designpattern.abstractFactory.model.mobiliaFactory;

import com.dbserver.designpattern.abstractFactory.model.cadeira.Cadeira;
import com.dbserver.designpattern.abstractFactory.model.mesaDeCentro.MesaDeCentro;
import com.dbserver.designpattern.abstractFactory.model.sofa.Sofa;

public interface MobiliaFactory {
    Cadeira criarCadeira();
    Sofa criarSofa();
    MesaDeCentro criarMesaDeCentro();
}
