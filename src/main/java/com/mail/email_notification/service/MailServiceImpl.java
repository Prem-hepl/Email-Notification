package com.mail.email_notification.service;

import com.mail.email_notification.dto.MailDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class MailServiceImpl implements MailService {
    @Autowired
    JavaMailSender mailSender;

    @Override
    public String sendMail(MailDto mailDto) {

        List<String> recipients=mailDto.getRecipientEmails();

        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject(mailDto.getSubject());
        message.setText(mailDto.getBody());

        for (String recipient : recipients){
            message.setTo(recipient);
            mailSender.send(message);
        }
        return "Mail sent Successfully...";
    }

}
