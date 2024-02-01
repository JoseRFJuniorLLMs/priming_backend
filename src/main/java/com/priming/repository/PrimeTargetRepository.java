package com.priming.repository;

import com.priming.entity.PrimeTargetCollection;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrimeTargetRepository extends MongoRepository<PrimeTargetCollection, String> {

       List<PrimeTargetCollection> findByPrimeAndTarget(String prime, String target);
       List<PrimeTargetCollection> findByTarget(String target);
    }

