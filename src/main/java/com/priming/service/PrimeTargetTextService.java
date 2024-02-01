package com.priming.service;

import com.priming.entity.PrimeTargetCollection;
import com.priming.entity.PrimeTargetTextCollection;
import com.priming.repository.PrimeTargetTextRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrimeTargetTextService {

    @Autowired
    private PrimeTargetTextRepository primeTargetTextRepository;

    public List<PrimeTargetTextCollection> findByPrimeTargetText(String prime, String target) {
        return primeTargetTextRepository.findByPrimeTargetText(prime, target);
    }

    public List<PrimeTargetTextCollection> findByTarget(String target) {
        return primeTargetTextRepository.findByTarget(target);
    }
}
