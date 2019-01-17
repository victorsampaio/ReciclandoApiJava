package br.com.reciclandoapi.repository;

import br.com.reciclandoapi.model.SocialContact;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SocialContactRepository extends MongoRepository<SocialContact, String> {
}
