package fr.lacnet.mcm.people;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PeopleRepository extends MongoRepository<People, String> {

	List<People> findByLastName(@Param("name") String name);

}
