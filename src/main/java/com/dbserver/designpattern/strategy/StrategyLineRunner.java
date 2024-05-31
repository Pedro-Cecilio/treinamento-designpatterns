package com.dbserver.designpattern.strategy;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dbserver.designpattern.strategy.model.CalculadoraFrete;
import com.dbserver.designpattern.strategy.model.FreteExpresso;
import com.dbserver.designpattern.strategy.model.FreteNormal;
import com.dbserver.designpattern.strategy.model.FreteStrategy;

import lombok.extern.slf4j.Slf4j;



@Component
@Slf4j
public class StrategyLineRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        FreteStrategy freteNormal = new FreteNormal();
        FreteStrategy freteExpresso = new FreteExpresso();

        CalculadoraFrete calculadoraFrete = new CalculadoraFrete(freteNormal);

       
        double valorFreteNormal = calculadoraFrete.calcular(50);

        calculadoraFrete.setFreteStrategy(freteExpresso);
        double valorFreteExpresso = calculadoraFrete.calcular(50);

        log.info("Valor frete normal: {}", valorFreteNormal);
        log.info("Valor frete expresso: {}", valorFreteExpresso);
    }
}
