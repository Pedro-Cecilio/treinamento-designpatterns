package com.dbserver.designpattern.adapter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dbserver.designpattern.adapter.model.EmailInternoService;
import com.dbserver.designpattern.adapter.model.IEmailService;
import com.dbserver.designpattern.adapter.model.MailChimpAdapter;
import com.dbserver.designpattern.adapter.model.MailChimpApi;



@Component
public class AdapterLineRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        IEmailService emailInterno = new EmailInternoService();
        IEmailService mailChimp = new MailChimpAdapter(new MailChimpApi());

        emailInterno.enviarEmail("lucas@email.com", "assunto", "corpo");
        mailChimp.enviarEmail("lucas@email.com", "assunto", "corpo");
    }


}
