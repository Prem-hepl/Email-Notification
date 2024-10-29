package com.mail.email_notification.dto;

import lombok.Data;

import java.util.List;

@Data
public class MailDto {
    private List<String> recipientEmails;
    private String subject;
    private String body;
}
