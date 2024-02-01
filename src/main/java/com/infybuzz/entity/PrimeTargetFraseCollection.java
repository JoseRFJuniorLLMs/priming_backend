package com.infybuzz.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "primeTargetFraseCollection")
public class primeTargetFraseCollection {
    private String id; // MongoDB doesn't use Long for IDs
    private String prime;
    private String target;
    private String frase1;
    private String frase2;
    private String frase3;
    private String frase4;
    private String frase5;
    private String frase6;
    private String frase7;
    private String frase8;
    private String frase19;
    private String frase10;
}
