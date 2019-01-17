package br.com.reciclandoapi.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public @Data
class SocialContact {

    @Id
    private String id;
    private String name, lastName, cnpj, email, phone, address, addressNumber,
                   neighborhood, zipCode, description, latitude, longitude;
    private boolean statusActivity;

}
