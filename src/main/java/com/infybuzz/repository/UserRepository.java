package com.infybuzz.repository;

import com.infybuzz.entity.User;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends Neo4jRepository<User, Long> {

    @Query("match (us:User) where us.name = $name and "
            + "us.password = $password return us")
    List<User> getByNameAndPassword(String name,
                                        @Param("password") String password);
}
