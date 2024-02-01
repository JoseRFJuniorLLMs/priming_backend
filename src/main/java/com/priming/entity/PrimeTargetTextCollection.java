package com.priming.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document(collection = "primeTargetTextCollection")
public class PrimeTargetTextCollection {
    private String _id; // MongoDB doesn't use Long for IDs
    private String prime;
    private String target;
    private String text;

    public PrimeTargetTextCollection(String _id, String prime, String target, String text) {
        this._id = _id;
        this.prime = prime;
        this.target = target;
        this.text = text;
    }

    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrimeTargetTextCollection that = (PrimeTargetTextCollection) o;
        return Objects.equals(_id, that._id) && Objects.equals(prime, that.prime) && Objects.equals(target, that.target) && Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_id, prime, target, text);
    }
}
