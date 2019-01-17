package br.com.reciclandoapi.repository;

import br.com.reciclandoapi.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
