package com.infybuzz.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.w3c.dom.Text;
@Node("wordstudant")
@EntityScan("com.infybuzz.entity")
public class WordStudent {

    @Id
    @GeneratedValue
    private Long id;
    @Property
    private Long pk_student;
    @Property
    private Text word;

}
