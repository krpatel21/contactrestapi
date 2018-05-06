package com.example.contactrestfulapi;

import com.example.contactrestfulapi.contact.ContactRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ContactTest {
    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ContactRepository contactRepository;


    @Test
    public void getContacts() throws Exception {
        mockMvc.perform(
                get("/contacts")
        )
                .andExpect(status().isOk());
    }
}
