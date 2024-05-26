package com.dbserver.designpattern.adapter.model;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmailInternoService implements IEmailService {
    @Override
    public void enviarEmail(String para, String assunto, String corpo) {
        // Simula envio de email internamente
        log.info("Email enviado internamente para: {}", para);
    }
}
