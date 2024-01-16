package com.infybuzz.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.infybuzz.Entity.Student;
import com.infybuzz.Service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {

	@Autowired
	StudentService studentService;

	@GetMapping("/students")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}

	@GetMapping("/{id}")
	public StudentDTO getStudentById(@PathVariable long id) {
		return studentService.getStudentById(id);
	}

	@PostMapping("/create")
	public Student createStudent(@RequestBody CreateStudentRequest createStudentRequest) {
		return studentService.createStudent(createStudentRequest);
	}

	@PatchMapping("/update")
	public Student updateStudent(@RequestBody UpdateStudentRequest updateStudentRequest) {
		return studentService.updateStudent(updateStudentRequest);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable long id) {
		return studentService.deleteStudent(id);
	}
}
