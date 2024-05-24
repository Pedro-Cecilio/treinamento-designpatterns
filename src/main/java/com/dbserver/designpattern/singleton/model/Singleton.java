package com.dbserver.designpattern.singleton.model;

import lombok.Getter;

public class Singleton {
    private static Singleton instance;

    @Getter
    private String valor;

    private Singleton(String valor) {
        this.valor = valor;
    }

    public static Singleton getInstance(String valor) {
        if(instance == null) {
            instance = new Singleton(valor);
        }
        return instance;
    }
}
