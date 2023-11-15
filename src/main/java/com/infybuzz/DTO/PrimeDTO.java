package com.infybuzz.DTO;

public class PrimeDTO {
    private Long id;
    private String prime;
    private String target;

    // Construtores
    public PrimeDTO() {
        // Construtor padrão vazio necessário para o Spring Data Neo4j
    }

    public PrimeDTO(Long id, String prime, String target) {
        this.id = id;
        this.prime = prime;
        this.target = target;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getPrime() {
        return prime;
    }

    public String getTarget() {
        return target;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setPrime(String prime) {
        this.prime = prime;
    }

    public void setTarget(String target) {
        this.target = target;
    }

}

