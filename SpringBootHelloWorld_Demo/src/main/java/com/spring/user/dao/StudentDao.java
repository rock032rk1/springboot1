package com.spring.user.dao;

import java.util.List;

import com.spring.user.model.Student;

public interface StudentDao {

	   int save(Student book);
	   Student get(int id);
	   List<Student> list();
	   void update(int id, Student book);
	   void delete(int id);
}
