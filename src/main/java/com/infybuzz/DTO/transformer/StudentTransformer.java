package com.infybuzz.DTO.transformer;

import com.infybuzz.entity.Student;
import com.infybuzz.DTO.StudentDTO;

public class StudentTransformer {

    public StudentDTO toDto(Student student) {
        StudentDTO studentDto = new StudentDTO();
        studentDto.setId(student.getId());
        studentDto.setName(student.getName());
        studentDto.setCountry(student.getCountry());
        studentDto.setBirthYear(student.getBirthYear());
        return studentDto;
    }
    
    public Student toEntity(StudentDTO studentDto) {
        Student student = new Student();
        student.setId(studentDto.getId());
        student.setName(studentDto.getName());
        student.setCountry(studentDto.getCountry());
        student.setBirthYear(studentDto.getBirthYear());
        return student;
    }
}