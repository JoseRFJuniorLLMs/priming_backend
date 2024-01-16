package com.infybuzz.Entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.neo4j.core.schema.*;

//@Node(labels = {"Prime"})
@Node("priming")
@EntityScan("com.infybuzz.entity")
public class Prime {

    @Id
    @GeneratedValue
    private Long id;
    //@Property
    //private Long pk_student;
    @Property
    private String prime;
    @Property
    private String target;

    //@Relationship(type = "HAS_PRIME", direction = Direction.INCOMING)
    //private Student student;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /*public Long getPk_student() {
        return pk_student;
    }

    public void setPk_student(Long pk_student) {
        this.pk_student = pk_student;
    }*/

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

    /*public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }*/

    private String list;
}
