package com.dbserver.designpattern.factoryMethod;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dbserver.designpattern.factoryMethod.model.logistica.Logistica;
import com.dbserver.designpattern.factoryMethod.model.logistica.LogisticaAquatica;
import com.dbserver.designpattern.factoryMethod.model.logistica.LogisticaTerrestre;
import com.dbserver.designpattern.factoryMethod.model.transporte.Transporte;

@Component
public class FactoryMethodComandLineRunner implements CommandLineRunner{

    @Override
    public void run(String... args) throws Exception {
       Logistica logisticaTerrestre = new LogisticaTerrestre();
       Transporte caminhao = logisticaTerrestre.criarTransporte();
       caminhao.entregar();

       Logistica logisticaAquatica = new LogisticaAquatica();
       Transporte navio = logisticaAquatica.criarTransporte();
       navio.entregar();

    }
    
}
