package fr.lacnet.munchkin;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.Arrays;

@EnableMongoRepositories(basePackageClasses = PersonRepository.class)
@Configuration
public class MongoConfig {
    @Bean
    CommandLineRunner commandLineRunner(PersonRepository personRepository) {
        return strings -> {
            personRepository.saveAll(Arrays.asList(
                    new Person("1", "firstName", "Ryan"),
                    new Person("2", "Bilbo", "Sacquet"),
                    new Person("2", "Bilbo", "Sacquet"),
                    new Person("2", "Bilbo", "Sacquet")
            ));
        };
    }
}