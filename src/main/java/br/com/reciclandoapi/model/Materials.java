package br.com.reciclandoapi.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public @Data class Materials {

    @Id
    private String id;
    private String name, type, description, text, color;

}
