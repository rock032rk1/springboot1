package com.spring.user.dao;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.user.model.Student;
@Repository
public class StudentDaoImpl implements StudentDao {

	   @Autowired
	   private SessionFactory sessionFactory;

	  // @Override
	   @Transactional
	   public int save(Student book) {
	      sessionFactory.getCurrentSession().save(book);
	      return book.getSid();
	   }

	  // @Override
	   @Transactional
	   public Student get(int id) {
	      return sessionFactory.getCurrentSession().get(Student.class, id);
	   }

	   //@Override
	   @Transactional
	   public List<Student> list() {
	      Session session = sessionFactory.getCurrentSession();
//	      CriteriaBuilder cb = session.getCriteriaBuilder();
//	      CriteriaQuery<Student> cq = cb.createQuery(Student.class);
//	      Root<Student> root = cq.from(Student.class);
//	      cq.select(root);
//	      Query<Student> query = session.createQuery(cq);
	      Query<Student> query=session.createQuery("from Student",Student.class);
	      List<Student> slist=query.getResultList();
	    //  return query.getResultList();
	      return slist;
	   }

	  // @Override
	   @Transactional
	   public void update(int id, Student book) {
	      Session session = sessionFactory.getCurrentSession();
	      Student book2 = session.byId(Student.class).load(id);
	      book2.setName(book.getName());
	      book2.setMobile(book.getMobile());
	      book2.setEmail(book.getEmail());
	     
	      session.flush();
	   }

	   //@Override
	   @Transactional
	   public void delete(int id) {
	      Session session = sessionFactory.getCurrentSession();
	      Student book = session.byId(Student.class).load(id);
	      session.delete(book);
	   }
}
