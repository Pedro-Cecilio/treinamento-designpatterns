package com.dbserver.designpattern.observer.model.cliente;

import com.dbserver.designpattern.observer.model.observador.Observador;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Cliente implements Observador{
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String produto, Boolean disponivel) {
        log.info("Notificando o {} que o produto {} teve status de disponibilidade alterado para {}", nome, produto, disponivel);
    }
    
}
