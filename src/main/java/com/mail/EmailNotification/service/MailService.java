package com.mail.EmailNotification.service;

import com.mail.EmailNotification.dto.MailDto;
import org.springframework.http.ProblemDetail;

public interface MailService {
    String sendMail(MailDto mailDto);
}
