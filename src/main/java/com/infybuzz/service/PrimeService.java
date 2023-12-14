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

    public List<Prime> getPrimeList(String prime) {
        return primeRepository.findtoPrimeList(prime);
    }

    public List<Prime> getTargetList(String target) {
        return primeRepository.findtoTargetList(target);
    }

    public List<Prime> getPrimeOne(String prime) {
        return primeRepository.findByPrimeCypherListPrimeOne(prime);
    }

    public List<Prime> getTargetOne(String target) {
        return primeRepository.findtoTargetList(target);
    }

}
