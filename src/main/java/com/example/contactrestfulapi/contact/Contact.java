package com.example.contactrestfulapi.contact;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final Long id;
    private String firstName;
    private String lastName;
    private String company;
    private String profileImage;
    private String email;
    private Date birthDate;
    private String workPhone;
    private String personalPhone;
    private String address;
    private String city;
    private String state;

    protected Contact() {
        id = null;
    }

    public Contact(String firstName, String lastName, String company, String profileImage, String email, Date birthDate, String workPhone, String personalPhone, String address, String city, String state) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.profileImage = profileImage;
        this.email = email;
        this.birthDate = birthDate;
        this.workPhone = workPhone;
        this.personalPhone = personalPhone;
        this.address = address;
        this.city = city;
        this.state = state;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public String getPersonalPhone() {
        return personalPhone;
    }

    public void setPersonalPhone(String personalPhone) {
        this.personalPhone = personalPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
