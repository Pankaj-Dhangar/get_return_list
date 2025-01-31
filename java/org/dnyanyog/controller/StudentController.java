package org.dnyanyog.controller;

import java.util.List;

import org.dnyanyog.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Student")
public class StudentController {
	
	@GetMapping(path = "/FirstName", produces ={"application/json"})
	public List<String> getFirstNames() {
		return new StudentService().getFirstNames();
		
	}
	@GetMapping(path ="/Email", produces = {"application/json"})
	public List<String> getEmails(){
		return new StudentService().getEmails();
	}

}
