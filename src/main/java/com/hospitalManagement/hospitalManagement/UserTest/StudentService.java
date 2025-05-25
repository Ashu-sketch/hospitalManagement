package com.hospitalManagement.hospitalManagement.UserTest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
    @Autowired
	private StudentRepository studentRepo;
    
    public Student 	createStudent(Student student) {
    	return studentRepo.save(student);
    }
    public List<Student> createStudentList(List<Student> studentList) {
    	return studentRepo.saveAll(studentList);   	
    }
    
    public 	Student getStudentById(Long sId) {
    	return studentRepo.findById(sId).orElse(null);
    }
    
    public List<Student>getStudentList(){
    	return studentRepo.findAll();
    }
    
    public Student updateStudent(Student student) {
    	Optional<Student>  optionalStudent=studentRepo.findById(student.getsId());
    	Student oldStudent=null;
    	if(optionalStudent.isPresent()) {
    		Student oldStudnet=optionalStudent.get();
    		oldStudnet.setsName(student.getsName());
    		oldStudnet.setsClass(student.getsClass());
    		oldStudnet.setsSubjects(student.getsSubjects());
    		studentRepo.save(oldStudnet);
    	}else {
    		return new Student();
    	}
		return oldStudent;
    };
    
    public String deletStudentById(Long id) {
    	studentRepo.deleteById(id);
    	return "User got deleted";
    }
}
