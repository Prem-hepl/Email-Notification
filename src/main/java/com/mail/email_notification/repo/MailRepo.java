package com.mail.email_notification.repo;

import com.mail.email_notification.model.Mail;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MailRepo extends MongoRepository<Mail,String> {
}
