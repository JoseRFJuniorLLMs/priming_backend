package com.priming.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import com.priming.entity.Subject;

@Repository
public interface SubjectRepository extends Neo4jRepository<Subject, Long> {

}
