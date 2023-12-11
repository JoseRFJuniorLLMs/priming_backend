package com.infybuzz.service;

import com.infybuzz.entity.Prime;
import com.infybuzz.repository.PrimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrimeService {

    @Autowired
    PrimeRepository primeRepository;

    public List<Prime> getPrime(String prime) {
       // return primeRepository.findByPrimeCypherList(prime);
        return primeRepository.findByPrimeCypherListPrimeOne(prime);
    }

    public List<Prime> getPrimeOne(String prime) {
        return primeRepository.findByPrimeCypherListPrimeOne(prime);
    }

    public List<Prime> getTargetOne(String target) {
        return primeRepository.findByTargetListOne(target);
    }

}
