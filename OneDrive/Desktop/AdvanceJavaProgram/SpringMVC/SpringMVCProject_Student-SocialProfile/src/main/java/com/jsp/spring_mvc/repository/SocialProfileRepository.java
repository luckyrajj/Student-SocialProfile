package com.jsp.spring_mvc.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.jsp.spring_mvc.entity.SocialProfile;
import com.jsp.spring_mvc.entity.Student;

@Repository
public class SocialProfileRepository {

	public static EntityManager getEntityManager() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-config");
		EntityManager em = emf.createEntityManager();
		return em;
	}

	public void addSocialProfile(SocialProfile socialprofile) {
		EntityManager em = getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(socialprofile);
		et.commit();
		em.close();
	}
	public SocialProfile findSocialProfileById(int socialProfileId) {
		EntityManager em = getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		SocialProfile sProfile=em.find(SocialProfile.class, socialProfileId);
		return sProfile;
	}
	public void updateSocialProfile(SocialProfile socialProfile) {
		EntityManager em = getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.merge(socialProfile);
		et.commit();
		em.close();
	
	}
	public void deleteSocialProfile(int socialProfileId) {
		EntityManager em=getEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		SocialProfile socialProfile=em.find(SocialProfile.class, socialProfileId);
		em.remove(socialProfile);
		et.commit();
		em.close();
		
	}

}
