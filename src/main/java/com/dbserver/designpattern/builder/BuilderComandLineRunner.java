package com.dbserver.designpattern.builder;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dbserver.designpattern.builder.model.carro.Carro;
import com.dbserver.designpattern.builder.model.cliente.Cliente;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class BuilderComandLineRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        // Builder construido manualmente
        Carro carro = Carro.builder("Toyota", "Corolla")
                .anoFabricacao(2022)
                .cor("Prata")
                .numeroPortas(4)
                .tipoCombustivel("Gasolina")
                .potenciaMotor(140)
                .build();

        log.info(carro.toString());

        // Builder construido usando o Lombok
        Cliente cliente = Cliente.builder()
                .nome("Lucas")
                .sobrenome("Silva")
                .idade(30)
                .email("joao.silva@example.com")
                .telefone("123456789")
                .endereco("Rua A, 123, Cidade B, Estado C, 12345-678")
                .build();

        log.info(cliente.toString());
    }

}
