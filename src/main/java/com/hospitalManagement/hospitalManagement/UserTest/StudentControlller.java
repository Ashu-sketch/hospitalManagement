package com.hospitalManagement.hospitalManagement.UserTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class StudentControlller {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student ) {
		return studentService.createStudent(student);
	}
	
	@RequestMapping("/helloView")
	public ModelAndView helloView() {
		ModelAndView modelAndView = new ModelAndView("Hello");
        modelAndView.addObject("message", "Hello, Spring Boot!");
        return modelAndView;
	}
	@RequestMapping("/hello")
	public String helloViewJava() {
		
        return "Hello Jaipur";
	}
}
