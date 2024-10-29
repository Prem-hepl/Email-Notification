package com.mail.email_notification.service;

import com.mail.email_notification.dto.MailDto;

public interface MailService {
    String sendMail(MailDto mailDto);
}
