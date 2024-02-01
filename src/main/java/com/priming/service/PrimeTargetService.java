package com.priming.service;

import com.priming.entity.PrimeTargetCollection;
import com.priming.repository.PrimeTargetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrimeTargetService {

    @Autowired
    private PrimeTargetRepository primeTargetRepository;

    public List<PrimeTargetCollection> findByPrimeAndTarget(String prime, String target) {
        return primeTargetRepository.findByPrimeAndTarget(prime, target);
    }

    public List<PrimeTargetCollection> findByTarget(String target) {
        return primeTargetRepository.findByTarget(target);
    }
}
