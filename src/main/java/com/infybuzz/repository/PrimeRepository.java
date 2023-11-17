package com.infybuzz.repository;

import com.infybuzz.DTO.PrimeDTO;
import com.infybuzz.entity.Prime;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrimeRepository extends Neo4jRepository<Prime, Long> {
    @Query("MATCH (n:priming) " +
            "WHERE n.Prime = $prime OR n.Target = $prime " +
            "WITH n, COALESCE(n.Prime, 'defaultPrime') AS Prime, COALESCE(n.Target, 'defaultTarget') AS Target " +
            "RETURN n AS id, Prime AS prime, Target AS target")
    List<Prime> findByPrimeCypherList(@Param("prime") String prime);


    @Query("MATCH (n:priming) " +
            "WHERE n.Prime = $prime OR n.Target = $prime " +
            "OPTIONAL MATCH (n)-[:RELATIONSHIP]->(relatedNode) " +
            "WITH n, COALESCE(n.Prime, 'defaultPrime') AS Prime, COALESCE(n.Target, 'defaultTarget') AS Target " +
            "RETURN n, Prime, Target")
    List<Prime> findByPrimeWord(@Param("prime") String prime);

    @Query("MATCH (n:priming) " +
            "WHERE n.Prime = $prime OR n.Target = $prime " +
            "OPTIONAL MATCH (n)-[:RELATIONSHIP]->(relatedNode) " +
            "WITH n, COALESCE(n.Prime, 'defaultPrime') AS Prime, COALESCE(n.Target, 'defaultTarget') AS Target, relatedNode " +
            "RETURN ID(n) AS id, Prime, Target")
    List<PrimeDTO> findByPrimeWordDTO(@Param("prime") String prime);

    @Query("MATCH (n:priming) " +
            "WHERE n.Prime = $prime " +
            "WITH n, COALESCE(n.Prime, 'defaultPrime') AS Prime, COALESCE(n.Target, 'defaultTarget') AS Target " +
            "RETURN n AS id, Prime AS prime, Target AS target")
    List<Prime> findByPrimeCypherListPrime(@Param("prime") String prime);


}

