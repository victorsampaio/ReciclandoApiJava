package br.com.reciclandoapi.repository;

import br.com.reciclandoapi.model.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProfileRepository extends MongoRepository<Profile, String> {
}
