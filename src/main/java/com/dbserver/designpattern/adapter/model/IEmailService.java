package com.dbserver.designpattern.adapter.model;

public interface IEmailService {
    void enviarEmail(String para, String assunto, String corpo);
}
