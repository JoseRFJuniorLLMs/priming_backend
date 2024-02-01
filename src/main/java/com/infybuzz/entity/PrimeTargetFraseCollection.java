package com.infybuzz.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document(collection = "primeTargetFraseCollection")
public class PrimeTargetFraseCollection {
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

    public PrimeTargetFraseCollection(String id, String prime, String target, String frase1, String frase2, String frase3, String frase4, String frase5, String frase6, String frase7, String frase8, String frase19, String frase10) {
        this.id = id;
        this.prime = prime;
        this.target = target;
        this.frase1 = frase1;
        this.frase2 = frase2;
        this.frase3 = frase3;
        this.frase4 = frase4;
        this.frase5 = frase5;
        this.frase6 = frase6;
        this.frase7 = frase7;
        this.frase8 = frase8;
        this.frase19 = frase19;
        this.frase10 = frase10;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrime() {
        return prime;
    }

    public void setPrime(String prime) {
        this.prime = prime;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getFrase1() {
        return frase1;
    }

    public void setFrase1(String frase1) {
        this.frase1 = frase1;
    }

    public String getFrase2() {
        return frase2;
    }

    public void setFrase2(String frase2) {
        this.frase2 = frase2;
    }

    public String getFrase3() {
        return frase3;
    }

    public void setFrase3(String frase3) {
        this.frase3 = frase3;
    }

    public String getFrase4() {
        return frase4;
    }

    public void setFrase4(String frase4) {
        this.frase4 = frase4;
    }

    public String getFrase5() {
        return frase5;
    }

    public void setFrase5(String frase5) {
        this.frase5 = frase5;
    }

    public String getFrase6() {
        return frase6;
    }

    public void setFrase6(String frase6) {
        this.frase6 = frase6;
    }

    public String getFrase7() {
        return frase7;
    }

    public void setFrase7(String frase7) {
        this.frase7 = frase7;
    }

    public String getFrase8() {
        return frase8;
    }

    public void setFrase8(String frase8) {
        this.frase8 = frase8;
    }

    public String getFrase19() {
        return frase19;
    }

    public void setFrase19(String frase19) {
        this.frase19 = frase19;
    }

    public String getFrase10() {
        return frase10;
    }

    public void setFrase10(String frase10) {
        this.frase10 = frase10;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrimeTargetFraseCollection that = (PrimeTargetFraseCollection) o;
        return Objects.equals(id, that.id) && Objects.equals(prime, that.prime) && Objects.equals(target, that.target) && Objects.equals(frase1, that.frase1) && Objects.equals(frase2, that.frase2) && Objects.equals(frase3, that.frase3) && Objects.equals(frase4, that.frase4) && Objects.equals(frase5, that.frase5) && Objects.equals(frase6, that.frase6) && Objects.equals(frase7, that.frase7) && Objects.equals(frase8, that.frase8) && Objects.equals(frase19, that.frase19) && Objects.equals(frase10, that.frase10);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, prime, target, frase1, frase2, frase3, frase4, frase5, frase6, frase7, frase8, frase19, frase10);
    }
}
