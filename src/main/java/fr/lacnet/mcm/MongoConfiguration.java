package fr.lacnet.mcm;

import fr.lacnet.mcm.people.People;
import fr.lacnet.mcm.people.PeopleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.Arrays;

@EnableMongoRepositories(basePackageClasses = PeopleRepository.class)
@Configuration
public class MongoConfiguration {
    @Bean
    CommandLineRunner commandLineRunner(PeopleRepository personRepository) {
        return strings -> {
            personRepository.saveAll(Arrays.asList(
                    new People("1", "firstName", "Ryan"),
                    new People("2", "Bilbo", "Sacquet"),
                    new People("2", "Bilbo", "Sacquet"),
                    new People("2", "Bilbo", "Sacquet")
            ));
        };
    }
}