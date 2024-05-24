package com.dbserver.designpattern.builder.model.carro;

public class Carro {

    private String marca;
    private String modelo;
    private int anoFabricacao;
    private String cor;
    private int numeroPortas;
    private String tipoCombustivel;
    private int potenciaMotor;

    public static CarroBuilder builder(String marca, String modelo){
        return new CarroBuilder(marca, modelo);
    }
    
    Carro(CarroBuilder builder) {
        this.marca = builder.marca;
        this.modelo = builder.modelo;
        this.anoFabricacao = builder.anoFabricacao;
        this.cor = builder.cor;
        this.numeroPortas = builder.numeroPortas;
        this.tipoCombustivel = builder.tipoCombustivel;
        this.potenciaMotor = builder.potenciaMotor;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                ", cor='" + cor + '\'' +
                ", numeroPortas=" + numeroPortas +
                ", tipoCombustivel='" + tipoCombustivel + '\'' +
                ", potenciaMotor=" + potenciaMotor +
                '}';
    }
}
