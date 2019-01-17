package br.com.reciclandoapi.repository;

import br.com.reciclandoapi.model.Enterprise;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EnterpriseRepository extends MongoRepository<Enterprise, Long> {
}
