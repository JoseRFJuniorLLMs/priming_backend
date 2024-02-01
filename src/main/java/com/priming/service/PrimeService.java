package com.priming.service;

import com.priming.entity.Prime;
import com.priming.repository.PrimeRepository;
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

}
