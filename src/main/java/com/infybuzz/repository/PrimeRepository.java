package com.infybuzz.repository;

import com.infybuzz.entity.Prime;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrimeRepository extends Neo4jRepository<Prime, Long> {
    @Query("MATCH (n:priming) " +
            "WHERE n.Prime = $prime " +
            "WITH n, COALESCE(n.Prime, 'defaultPrime') AS Prime, COALESCE(n.Target, 'defaultTarget') AS Target " +
            "RETURN n AS id, Prime AS prime, Target AS target")
    List<Prime> findByPrimeCypherListPrimeOne(@Param("prime") String prime);


    @Query("MATCH (n:priming) " +
            "WHERE n.Target = $target " +
            "WITH n, COALESCE(n.Target, 'defaultTarget') AS Target, COALESCE(n.Prime, 'defaultPrime') AS Prime " +
            "RETURN n AS id, Prime AS prime, Target AS target")
    List<Prime> findtoTargetList(@Param("target") String prime);

@Query("MATCH (n:priming) " +
            "WHERE n.Prime = $prime " +
            "WITH n, COALESCE(n.Prime, 'defaultPrime') AS Prime, COALESCE(n.Target, 'defaultTarget') AS Target " +
            "RETURN n AS id, Prime AS prime, Target AS target")
    List<Prime> findtoPrimeList(@Param("prime") String prime);
}

