package com.mail.EmailNotification.service;

import com.mail.EmailNotification.dto.MailDto;
import com.mail.EmailNotification.model.Mail;
import com.mail.EmailNotification.repo.MailRepo;
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
