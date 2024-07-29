package com.jsp.spring_mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.spring_mvc.entity.SocialProfile;
import com.jsp.spring_mvc.entity.Student;
import com.jsp.spring_mvc.repository.SocialProfileRepository;
import com.jsp.spring_mvc.repository.StudentRepository;

import net.bytebuddy.matcher.ModifierMatcher.Mode;

@Service
public class SocialProfileService {

	@Autowired
	private SocialProfileRepository socialProfileRepository;

	@Autowired
	private StudentRepository studentRepository;

	public ModelAndView addSocialProfile(int studentId, SocialProfile socialProfile) {
		Student student = studentRepository.findStudent(studentId);
		socialProfile.setStudent(student);
		socialProfileRepository.addSocialProfile(socialProfile);
		student.getProfiles().add(socialProfile);
		studentRepository.updateStudent(student);

		List<SocialProfile> profiles = student.getProfiles();
		ModelAndView mvc = new ModelAndView();
		mvc.setViewName("DisplayAllSocialProfiles.jsp");
		mvc.addObject("profilelist", profiles);
		mvc.addObject("studentId", studentId);

		return mvc;

	}

	public ModelAndView findAllSocialProfiles(int studentId) {
		Student student = studentRepository.findStudent(studentId);
		List<SocialProfile> profiles = student.getProfiles();
		ModelAndView mvc = new ModelAndView();
		mvc.setViewName("DisplayAllSocialProfiles.jsp");
		mvc.addObject("profilelist", profiles);
		mvc.addObject("studentId", studentId);
		return mvc;
	}

	public ModelAndView findSocialProfileById(int socialProfileId, int studentId) {
		SocialProfile sProfile = socialProfileRepository.findSocialProfileById(socialProfileId);
		ModelAndView mvc = new ModelAndView();
		mvc.setViewName("UpdateSocialProfiles.jsp");
		mvc.addObject("socialProfile", sProfile);
		mvc.addObject("studentId", studentId);
		return mvc;
	}

//	public ModelAndView updateSocialProfile(SocialProfile socialProfile,int studentId) {
//		socialProfileRepository.updateSocialProfile(socialProfile);
//		Student student = studentRepository.findStudent(studentId);
//		socialProfile.setStudent(student);
//		List<SocialProfile> profiles=student.getProfiles();
//		ModelAndView mvc=new ModelAndView();
//		mvc.setViewName("DisplayAllSocialProfiles.jsp");
//		mvc.addObject("profilelist", profiles);
//		mvc.addObject("studentId", studentId);
//		return mvc;
//		
//	}
	public ModelAndView updateSocialProfile(SocialProfile socialProfile, int studentId) {
		Student student = studentRepository.findStudent(studentId);
		socialProfile.setStudent(student);
		socialProfileRepository.updateSocialProfile(socialProfile);
		student.getProfiles().add(socialProfile);
		studentRepository.updateStudent(student);
		List<SocialProfile> profiles = student.getProfiles();
		ModelAndView mvc = new ModelAndView();
		mvc.setViewName("DisplayAllSocialProfiles.jsp");
		mvc.addObject("profilelist", profiles);
		mvc.addObject("studentId", studentId);
		return mvc;
	}

	public ModelAndView deleteSocialProfile(int socialProfileId, int studentId) {
		socialProfileRepository.deleteSocialProfile(socialProfileId);
		Student student = studentRepository.findStudent(studentId);
		List<SocialProfile> profiles = student.getProfiles();
		ModelAndView mvc = new ModelAndView();
		mvc.setViewName("DisplayAllSocialProfiles.jsp");
		mvc.addObject("profilelist", profiles);
		mvc.addObject("studentId", studentId);
		return mvc;
	}
}
