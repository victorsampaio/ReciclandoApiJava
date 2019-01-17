package br.com.reciclandoapi.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public @Data class Profile {

    @Id
    private String id;
    private String name;
    private String lastName;
    private int age;
    private String email;
    private String phoneA;
    private String phoneB;
    private String address;
    private String addressNumber;
    private String neighborhood;
    private String zipcode;

}
