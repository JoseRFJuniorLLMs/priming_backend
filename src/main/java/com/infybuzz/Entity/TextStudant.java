package com.infybuzz.Entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

@Node("textstudant")
@EntityScan("com.infybuzz.entity")
public class TextStudant {
    @Id
    @GeneratedValue
    private Long id;
    @Property
    private Long pk_student;
    @Property
    private Long pk_wordstudent;
    @Property
    private Long pk_textstudent;
}
