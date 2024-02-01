package com.priming.app;

import com.priming.entity.PrimeTargetTextCollection;
import com.priming.repository.PrimeTargetTextRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MongoDBTestApplication {

    private final PrimeTargetTextRepository repository;

    public MongoDBTestApplication(PrimeTargetTextRepository repository) {
        this.repository = repository;
    }

    public static void main(String[] args) {
        SpringApplication.run(MongoDBTestApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo() {
        return (args) -> {
            // Save a document
            PrimeTargetTextCollection document = new PrimeTargetTextCollection("1", "prime1", "target1", "text1");
            repository.save(document);
            System.out.println("Document saved: " + document);

            // Find documents by target text
            System.out.println("Documents found by target text:");
            repository.findByTarget("target1").forEach(System.out::println);
        };
    }
}
