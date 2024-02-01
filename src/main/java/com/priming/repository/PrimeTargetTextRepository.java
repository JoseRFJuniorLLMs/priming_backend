package com.priming.repository;

import com.priming.entity.PrimeTargetTextCollection;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrimeTargetTextRepository extends MongoRepository<PrimeTargetTextCollection, String> {
    List<PrimeTargetTextCollection> findByPrimeAndText(String prime, String text);
    List<PrimeTargetTextCollection> findByTarget(String target);
}
