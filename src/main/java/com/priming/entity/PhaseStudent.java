package com.priming.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

import java.util.List;

@Node("phasesstudent")
@EntityScan("com.infybuzz.entity")
public class PhaseStudent {
    @Id
    @GeneratedValue
    private Long id;
    @Property
    private Long pk_student;
    @Property
    private List phasestudent;

    public PhaseStudent() {
    }
}
