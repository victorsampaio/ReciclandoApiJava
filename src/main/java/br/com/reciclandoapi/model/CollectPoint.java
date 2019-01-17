package br.com.reciclandoapi.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public @Data class CollectPoint {

    @Id
    private String id;
    private String  Name;
    private String  lastName;
    private String  address;
    private String  addressNumber;
    private String  neighborhood;
    private String  zipCode;
    private Long latitude;
    private Long longitude;
    private String description;

}
