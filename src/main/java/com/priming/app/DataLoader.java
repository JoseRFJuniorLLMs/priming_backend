package com.priming.app;

import com.priming.entity.Department;
import com.priming.entity.IsLearningRelation;
import com.priming.entity.Student;
import com.priming.entity.Subject;
import com.priming.repository.DepartmentRepository;
import com.priming.repository.StudentRepository;
import com.priming.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataLoader {

    private final StudentRepository studentRepository;
    private final DepartmentRepository departmentRepository;
    private final SubjectRepository subjectRepository;

    @Autowired
    public DataLoader(StudentRepository studentRepository, DepartmentRepository departmentRepository, SubjectRepository subjectRepository) {
        this.studentRepository = studentRepository;
        this.departmentRepository = departmentRepository;
        this.subjectRepository = subjectRepository;
    }

    public void loadSampleData() {
        // Código existente para carregar dados
        // ...
    }

    public void manualDataLoad() {
        // Lógica adicional para a carga manual de dados
        // Exemplo: Carregar mais dados, modificar existentes, etc.

        // Crie alguns departamentos
        Department department3 = new Department();
        department3.setDepName("Physics");
        departmentRepository.save(department3);

        // Crie alguns alunos adicionais
        Student student3 = new Student();
        student3.setName("Jane Smith");
        student3.setCountry("UK");
        student3.setBirthYear(1990);
        student3.setDepartment(department3);

        studentRepository.save(student3);

        // Crie algumas disciplinas adicionais
        Subject subject3 = new Subject();
        subject3.setSubName("Quantum Mechanics");
        subjectRepository.save(subject3);

        // Crie algumas relações de aprendizado adicionais
        IsLearningRelation learningRelation3 = new IsLearningRelation();
        learningRelation3.setMarks(88L);
        learningRelation3.setSubject(subject3);

        List<IsLearningRelation> learningRelationsStudent3 = new ArrayList<>();
        learningRelationsStudent3.add(learningRelation3);
        student3.setIsLearningRelationList(learningRelationsStudent3);

        studentRepository.save(student3);
    }
}

