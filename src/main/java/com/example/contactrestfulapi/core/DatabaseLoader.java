package com.example.contactrestfulapi.core;

import com.example.contactrestfulapi.contact.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements ApplicationRunner {
    private final ContactRepository contactRepository;

    @Autowired
    public DatabaseLoader(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
}
