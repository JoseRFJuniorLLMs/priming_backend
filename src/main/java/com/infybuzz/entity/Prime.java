package com.infybuzz.entity;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Relationship.Direction;

@Node(labels = {"Prime"})
public class Prime {

    @Id
    @GeneratedValue
    private Long id;

    private Long pk_student;
    private String prime;
    private String target;

    @Relationship(type = "HAS_PRIME", direction = Direction.INCOMING)
    private Student student;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPk_student() {
        return pk_student;
    }

    public void setPk_student(Long pk_student) {
        this.pk_student = pk_student;
    }

    public String getPrime() {
        return prime;
    }

    public void setPrime(String prime) {
        this.prime = prime;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
