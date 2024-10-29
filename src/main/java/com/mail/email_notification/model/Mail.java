package com.mail.email_notification.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "mail")
public class Mail {
    @Id
    private String id;
    @NotBlank(message = "sendTo is Mandatory")
    private String[] sendTo;
    private String subject;
    private String body;
}
