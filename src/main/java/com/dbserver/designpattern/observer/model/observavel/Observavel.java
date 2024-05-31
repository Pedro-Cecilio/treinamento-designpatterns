package com.dbserver.designpattern.observer.model.observavel;

import com.dbserver.designpattern.observer.model.observador.Observador;

public interface Observavel {
    void registrarObservador(Observador observador);
    void removerObservador(Observador observador);
    void notificarObservadores();
}