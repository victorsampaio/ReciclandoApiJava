package br.com.reciclandoapi.repository;

import br.com.reciclandoapi.model.CollectPoint;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CollectPointRepository extends MongoRepository<CollectPoint, String> {
}
