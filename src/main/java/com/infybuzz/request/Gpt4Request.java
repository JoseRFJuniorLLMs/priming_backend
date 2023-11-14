package com.infybuzz.request;

public class Gpt4Request {

    private String primeWord;
    private String[] targetWords;

    public Gpt4Request() {
    }

    public Gpt4Request(String primeWord, String[] targetWords) {
        this.primeWord = primeWord;
        this.targetWords = targetWords;
    }

    public String getPrimeWord() {
        return primeWord;
    }

    public void setPrimeWord(String primeWord) {
        this.primeWord = primeWord;
    }

    public String[] getTargetWords() {
        return targetWords;
    }

    public void setTargetWords(String[] targetWords) {
        this.targetWords = targetWords;
    }
}
