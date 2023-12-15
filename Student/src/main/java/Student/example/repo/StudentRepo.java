package Student.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import Student.example.model.StudentModel;

public interface StudentRepo extends JpaRepository<StudentModel,Integer> {

}
