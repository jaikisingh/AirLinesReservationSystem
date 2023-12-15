package Student.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import Student.example.model.StudentModel;
import Student.example.repo.StudentRepo;

@Service

public class StudentService {
	@Autowired
	StudentRepo studentRepo;

	public String addStudent(StudentModel studentModel) {
		
		studentRepo.save(studentModel);
		return "Student detail added";
	}

	public List<StudentModel> getAllStudent() {
		
		return studentRepo.findAll();
	}

}
