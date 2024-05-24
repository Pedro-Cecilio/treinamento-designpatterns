package com.dbserver.designpattern.singleton;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dbserver.designpattern.singleton.model.Singleton;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class SingletonLineRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        /*
         * Se o valor dos objetos forem diferentes, significa que o singleton não foi aplicado. 
         * Se o valor dos objetos forem iguais, significa que o singleton foi aplicado
        */
        Singleton singleton = Singleton.getInstance("Primeiro valor");
        Singleton outroSingleton = Singleton.getInstance("Segundo valor");

        log.info(singleton.getValor());
        log.info(outroSingleton.getValor());
        log.info("{}", singleton == outroSingleton);
    }

}
