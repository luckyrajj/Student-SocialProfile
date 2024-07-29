package com.jsp.spring_mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.spring_mvc.entity.Student;
import com.jsp.spring_mvc.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public ModelAndView addStudent(Student student) {
		studentRepository.addStudent(student);
		ModelAndView mvc=new ModelAndView();
		mvc.setViewName("index.jsp");
		return mvc;
	}
	
	public ModelAndView findAllStudents() {
		List<Student> students=studentRepository.findAllStudents();
		ModelAndView mvc=new ModelAndView();
		mvc.setViewName("DisplayAllStudent.jsp");
		mvc.addObject("studentlist",students);
		return mvc;
	}
	
	public ModelAndView findStudent(int studentId) {
		
		Student student =studentRepository.findStudent(studentId);
		ModelAndView mvc=new ModelAndView();
		mvc.setViewName("UpdateStudent.jsp");
		mvc.addObject("s", student);
		return mvc;
		
	}
	public ModelAndView updateStudent(Student student) {
		
		studentRepository.updateStudent(student);
		ModelAndView mvc=new ModelAndView();
		mvc.setViewName("displayAllStudents");
		return mvc;
	}
	public ModelAndView deleteStudent(int studentId) {
		
		studentRepository.deleteStudent(studentId);
		ModelAndView mvc=new ModelAndView();
		mvc.setViewName("displayAllStudents");
		return mvc;
	}
}
