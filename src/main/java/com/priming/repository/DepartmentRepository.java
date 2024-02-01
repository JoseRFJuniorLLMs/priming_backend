package com.priming.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import com.priming.entity.Department;

@Repository
public interface DepartmentRepository extends Neo4jRepository<Department, Long> {

}
