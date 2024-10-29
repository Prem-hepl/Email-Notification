package com.mail.email_notification.controller;

import com.mail.email_notification.dto.MailDto;
import com.mail.email_notification.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {
    @Autowired
    MailService mailService;

    @PostMapping("/sendMail")
    public String sendMail(@RequestBody MailDto mailDto){
        return mailService.sendMail(mailDto);
    }

}
