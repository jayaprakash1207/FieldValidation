package com.jp.FieldValidation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.jp.FieldValidation.enity.Student;
import com.jp.FieldValidation.service.StudentService;


@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

    @GetMapping("/")
	public String index(Model model) {
		model.addAttribute("studentForm", new Student());
		return "input";
	}

    @PostMapping(path = "/register",
	consumes = {org.springframework.http.MediaType.APPLICATION_FORM_URLENCODED_VALUE})
	public String registerStudent(@RequestBody Student student, Model model) {
		studentService.saveStudent(student);
		model.addAttribute("firstName", student.getFirstName());
		model.addAttribute("lastName", student.getLastName());
		model.addAttribute("email", student.getEmail());
		model.addAttribute("mobileNumber", student.getMobileNumber());
		model.addAttribute("dateOfBirth", student.getDob());
		model.addAttribute("addressLine1", student.getAddressLine1());
		model.addAttribute("addressLine2", student.getAddressLine2());
		model.addAttribute("city", student.getCity());
		model.addAttribute("state", student.getState());
		model.addAttribute("postalCode", student.getPostalCode());
		model.addAttribute("country", student.getCountry());
		return "view";
	}
}
