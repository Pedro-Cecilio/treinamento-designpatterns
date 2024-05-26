package com.dbserver.designpattern.adapter.model;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MailChimpApi {
    public void mail(String to, String title, String content) {
        log.info("Email enviado via MailChimp para: {}", to);
    }
}
