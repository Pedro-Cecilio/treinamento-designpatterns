package com.dbserver.designpattern.builder.model.carro;

public class CarroBuilder {
    String marca;
    String modelo;
    int anoFabricacao;
    String cor;
    int numeroPortas;
    String tipoCombustivel;
    int potenciaMotor;

    public CarroBuilder(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public CarroBuilder anoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
        return this;
    }

    public CarroBuilder cor(String cor) {
        this.cor = cor;
        return this;
    }

    public CarroBuilder numeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
        return this;
    }

    public CarroBuilder tipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        return this;
    }

    public CarroBuilder potenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
        return this;
    }

    public Carro build() {
        return new Carro(this);
    }
}


