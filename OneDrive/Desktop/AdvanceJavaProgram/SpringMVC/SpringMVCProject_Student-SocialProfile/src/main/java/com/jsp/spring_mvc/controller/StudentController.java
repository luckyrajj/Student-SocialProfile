package com.jsp.spring_mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.spring_mvc.entity.Student;
import com.jsp.spring_mvc.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value = "/addStudent",method = RequestMethod.POST)
	public ModelAndView addStudent(Student student) {
		return studentService.addStudent(student);
	}
	
	@RequestMapping(value = "/displayAllStudents")
	public ModelAndView findAllStudents() {
		return studentService.findAllStudents();
	}
	@RequestMapping(value = "/updateStudent")
	public ModelAndView findStudent(@RequestParam int studentId) {
		return studentService.findStudent(studentId);
	}
	
	@RequestMapping(value = "/saveUpdateStudent",method = RequestMethod.POST )
	public ModelAndView updateStudent(Student student) {
		return studentService.updateStudent(student);
	}
	@RequestMapping(value = "/deleteStudent")
	public ModelAndView deleteStudent(@RequestParam int studentId) {
		return studentService.deleteStudent(studentId);
	}
}
