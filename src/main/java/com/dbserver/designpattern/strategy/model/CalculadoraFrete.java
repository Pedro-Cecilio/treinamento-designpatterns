package com.dbserver.designpattern.strategy.model;

public class CalculadoraFrete {
    private FreteStrategy freteStrategy;

    public CalculadoraFrete(FreteStrategy freteStrategy){
        this.freteStrategy = freteStrategy;
    }

    public void setFreteStrategy(FreteStrategy freteStrategy){
        this.freteStrategy = freteStrategy;
    }

    public double calcular(double peso){
        return this.freteStrategy.calcularFrete(peso);
    }

    
}
