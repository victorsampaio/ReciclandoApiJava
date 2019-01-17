package br.com.reciclandoapi.repository;

import br.com.reciclandoapi.model.Version;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VersionRepository extends MongoRepository<Version, String> {

    //Version findByName (String nameSystem);

}
