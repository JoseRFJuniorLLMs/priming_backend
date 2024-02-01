package com.infybuzz.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "primeTargetTextCollection")
public class PrimeTargetTextCollection {
    private String id; // MongoDB doesn't use Long for IDs
    private String prime;
    private String target;
    private String text;

}
