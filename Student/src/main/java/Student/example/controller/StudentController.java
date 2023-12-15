package Student.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Student.example.model.StudentModel;
import Student.example.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studentService;

	@PostMapping("/student")
	public String addStudent(@RequestBody StudentModel studentModel) {
		return studentService.addStudent(studentModel);
	}
	
	@GetMapping("/student")
	public List<StudentModel> getAllStudent(){
		return studentService.getAllStudent();
	}
}
