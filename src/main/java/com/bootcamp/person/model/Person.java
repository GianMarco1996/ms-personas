package com.bootcamp.person.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "persons")
public class Person {
    @Id
    private String id;
    private String name;
    private String lastName;
    private String typePerson;
    private String mobile;
    private String email;
    private String documentNumber;
    private String documentType;
    private String address;
    private String birthdate;
    private String customerId;
}