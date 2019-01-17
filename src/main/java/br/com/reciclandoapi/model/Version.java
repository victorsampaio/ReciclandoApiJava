package br.com.reciclandoapi.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public @Data class Version {

    @Id
    private String id;
    private String nameSystem;
    private String version;

}
