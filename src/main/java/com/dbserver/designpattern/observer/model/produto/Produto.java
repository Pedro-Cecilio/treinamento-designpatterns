package com.dbserver.designpattern.observer.model.produto;

import java.util.ArrayList;
import java.util.List;

import com.dbserver.designpattern.observer.model.observador.Observador;
import com.dbserver.designpattern.observer.model.observavel.Observavel;

public class Produto implements Observavel {
    private List<Observador> observadores;
    private String nome;
    private Boolean disponivel;

    public Produto(String nome) {
        this.nome = nome;
        this.observadores = new ArrayList<>();
    }

    @Override
    public void registrarObservador(Observador observador) {
        observadores.add(observador);
    }

    @Override
    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores() {
        this.observadores.forEach(observador -> observador.atualizar(nome, disponivel));
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
        notificarObservadores();
    }

    

}
