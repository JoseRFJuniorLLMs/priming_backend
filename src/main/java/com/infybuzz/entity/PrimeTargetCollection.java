package com.infybuzz.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "primeColection")
public class PrimeTargetCollection {
    private String id; // MongoDB doesn't use Long for IDs
    private String prime;
    private String target;

}
