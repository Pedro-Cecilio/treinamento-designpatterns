package com.dbserver.designpattern.abstractFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dbserver.designpattern.abstractFactory.model.mobiliaFactory.MobiliaFactory;
import com.dbserver.designpattern.abstractFactory.model.mobiliaFactory.MobiliaModernaFactory;
import com.dbserver.designpattern.abstractFactory.model.mobiliaFactory.MobiliaVitorianaFactory;

@Component
public class AbstractFactoryComandLineRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        MobiliaFactory mobiliaModernaFactory = new MobiliaModernaFactory();
        executarFactory(mobiliaModernaFactory);

        MobiliaFactory mobiliaVitorianaFactory = new MobiliaVitorianaFactory();
        executarFactory(mobiliaVitorianaFactory);
    }

    private void executarFactory(MobiliaFactory factory){
        factory.criarCadeira();
        factory.criarSofa();
        factory.criarMesaDeCentro();
    }
}
