package com.dbserver.designpattern.observer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dbserver.designpattern.observer.model.cliente.Cliente;
import com.dbserver.designpattern.observer.model.produto.Produto;



@Component
public class ObserverLineRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        Produto monitor = new Produto("Monitor 144hz");
        Cliente paulo = new Cliente("Paulo");
        Cliente lucas = new Cliente("Lucas");

        monitor.registrarObservador(paulo);

        monitor.setDisponivel(true);
    }

}
