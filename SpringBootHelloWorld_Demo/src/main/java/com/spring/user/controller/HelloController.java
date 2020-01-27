package com.spring.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.user.model.Student;
import com.spring.user.service.StudentService;

@Controller
public class HelloController {

	@Autowired
	private StudentService std;
	
	@GetMapping("/")
	public String getIndexPage() {
		
		return "index";
	}
	
	@GetMapping("/registra")
	public String getRegistraPage() {
		
		return "registra";
	}
	
	@PostMapping("/save")
	public String getPage(Model model,Student s) {
		
		model.addAttribute("stu",new Student());
		std.save(s);
		List<Student> slist=std.list();
		model.addAttribute("stud",slist);
		
		return "view";
		
		//return std.list();
		
	}
	@GetMapping("/list")
	public String getList(Model model) {
		
		List<Student> slist=std.list();
		
		//slist.forEach(a->System.out.println(a));
		for(Student s:slist) {
			System.out.println(s.getSid());
			System.out.println(s.getName());
			System.out.println(s.getMobile());
			System.out.println(s.getEmail());
		}
		model.addAttribute("stud",slist);
		
		return "view";
	}
	
}
