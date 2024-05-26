package com.dbserver.designpattern.adapter.model;

public class MailChimpAdapter implements IEmailService{

    private MailChimpApi mailChimpApi;

    public MailChimpAdapter(MailChimpApi mailChimpApi) {
        this.mailChimpApi = mailChimpApi;
    }

    @Override
    public void enviarEmail(String para, String assunto, String corpo) {
        mailChimpApi.mail(para, assunto, corpo);
    }
    
}
