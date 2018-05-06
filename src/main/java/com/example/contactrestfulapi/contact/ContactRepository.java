package com.example.contactrestfulapi.contact;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;


public interface ContactRepository extends PagingAndSortingRepository<Contact, Long> {
    @RestResource(path = "email-equals", rel = "emailEquals")
    Contact findByEmailEquals(@Param("email") String name);

    @RestResource(path = "phone-equals", rel = "phoneEquals")
    Contact findByPersonalPhoneEquals(@Param("phone") String phpme);

    @RestResource(path = "email-or-phone", rel = "emailOrPhoneEquals")
    Contact findByEmailEqualsOrPersonalPhoneEquals(@Param("email") String email, @Param("phone") String phone);

    @RestResource(path = "city-and-state", rel = "cityAndStateEquals")
    Page<Contact> findByCityAndStateEquals(@Param("city") String city, @Param("state") String state, Pageable p);

    @RestResource(path = "city-or-state", rel = "cityOrStateEquals")
    Page<Contact> findByCityOrStateEquals(@Param("city") String city, @Param("state") String state, Pageable p);

    @RestResource(path = "city", rel = "city")
    Page<Contact> findByCityEquals(@Param("city") String city, Pageable p);

    @RestResource(path = "state", rel = "state")
    Page<Contact> findByStateEquals(@Param("state") String city, Pageable p);

    @Override
    void delete(Contact contact);
}
