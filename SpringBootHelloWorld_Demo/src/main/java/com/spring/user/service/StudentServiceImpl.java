package com.spring.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.user.dao.StudentDao;
import com.spring.user.model.Student;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao std;
	
	@Transactional
	public int save(Student book) {
		// TODO Auto-generated method stub
		return std.save(book);
	}
	@Transactional
	public Student get(int id) {
		// TODO Auto-generated method stub
		return std.get(id);
	}

	public List<Student> list() {
		// TODO Auto-generated method stub
		return std.list();
	}
	@Transactional
	public void update(int id, Student book) {
		// TODO Auto-generated method stub
		std.update(id, book);
		
	}
	@Transactional
	public void delete(int id) {
		// TODO Auto-generated method stub
		std.delete(id);
		
	}

}
