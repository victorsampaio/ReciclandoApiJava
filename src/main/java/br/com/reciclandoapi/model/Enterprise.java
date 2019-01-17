package br.com.reciclandoapi.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.Generated;

@Document
public @Data
class Enterprise {

    @Id
    private String id;
    private String name, lastName, cnpj, email, phone, address, addressNumber, neighborhood, zipCode;
    private boolean statusActivity;

}
