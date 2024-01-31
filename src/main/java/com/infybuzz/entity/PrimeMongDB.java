package com.infybuzz.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "prime_cores")
public class PrimeCore {
    private String id; // MongoDB doesn't use Long for IDs
    private String prime;
    private String target;
    private String texto;
    private String imagemtexto;
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
    private String imagem1;
    private String imagem2;
    private String imagem3;
    private String imagem4;
    private String imagem5;
    private String imagem6;
    private String imagem7;
    private String imagem8;
    private String imagem9;
    private String imagem10;
    
        
}
