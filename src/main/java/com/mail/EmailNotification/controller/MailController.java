package com.mail.EmailNotification.controller;

import com.mail.EmailNotification.dto.MailDto;
import com.mail.EmailNotification.service.MailService;
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
