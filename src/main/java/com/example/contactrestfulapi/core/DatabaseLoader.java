package com.example.contactrestfulapi.core;

import com.example.contactrestfulapi.contact.Contact;
import com.example.contactrestfulapi.contact.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.util.Calendar;

@Component
public class DatabaseLoader implements ApplicationRunner {
    private final ContactRepository contactRepository;

    @Autowired
    public DatabaseLoader(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Contact contact = new Contact("John","Smith", "abc corp", "ffff", "jsmith@example.com",
                new Date(Calendar.getInstance().getTimeInMillis()), "6302222", "333333", "2222", "Chicago", "Illinois");
        contactRepository.save(contact);
    }
}
