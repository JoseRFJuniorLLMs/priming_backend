package com.infybuzz.service;

import com.infybuzz.DTO.PrimeDTO;
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
        return primeRepository.findByPrimeCypherListPrime(prime);
    }

}
