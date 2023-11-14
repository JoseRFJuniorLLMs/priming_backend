package com.infybuzz.repository;

import com.infybuzz.entity.Prime;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrimeRepository extends Neo4jRepository<Prime, Long> {
}
