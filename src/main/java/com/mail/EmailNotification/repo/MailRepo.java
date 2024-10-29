package com.mail.EmailNotification.repo;

import com.mail.EmailNotification.model.Mail;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MailRepo extends MongoRepository<Mail,String> {
}
