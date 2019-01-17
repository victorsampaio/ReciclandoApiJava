package br.com.reciclandoapi.repository;

import br.com.reciclandoapi.model.Materials;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MaterialsRepository extends MongoRepository<Materials, String> {

}
