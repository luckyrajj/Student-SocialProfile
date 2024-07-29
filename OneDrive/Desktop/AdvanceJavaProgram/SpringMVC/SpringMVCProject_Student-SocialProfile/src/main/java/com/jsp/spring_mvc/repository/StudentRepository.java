package com.jsp.spring_mvc.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.jsp.spring_mvc.entity.Student;

@Repository
public class StudentRepository {

	public static EntityManager getEntityManager() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("mysql-config");
		EntityManager em=emf.createEntityManager();
		return em;
	}
	
	public void addStudent(Student student) {
		EntityManager em=getEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(student);
		et.commit();
		em.close();
		
	}
	
	public Student findStudent(int studentId) {
		EntityManager em=getEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		Student student=em.find(Student.class,studentId);
		et.commit();
		em.close();
		return student;
	}
	public void updateStudent(Student student) {
		EntityManager em=getEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.merge(student);
		et.commit();
		em.close();
		
	}
	public void deleteStudent(int studentId) {
		EntityManager em=getEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		Student student=em.find(Student.class, studentId);
		em.remove(student);
		et.commit();
		em.close();
		
	}
	public List<Student> findAllStudents() {
		EntityManager em=getEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		Query query= em.createQuery("From Student");
		List<Student>students=query.getResultList();
		et.commit();
		em.close();
		return students;
	}
}
