package com.jsp.spring_mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.spring_mvc.entity.SocialProfile;
import com.jsp.spring_mvc.service.SocialProfileService;

@Controller
public class SocialProfileController {

	@Autowired
	private SocialProfileService socialProfileService;

	@RequestMapping(value = "/viewSocialProfiles", method = RequestMethod.GET)
	public ModelAndView viewSocialProfile(int studentId) {
		return socialProfileService.findAllSocialProfiles(studentId);
	}

	@RequestMapping(value = "/addNewProfile", method = RequestMethod.POST)
	public ModelAndView addNewProfile(@RequestParam int studentId, SocialProfile socialProfile) {
		return socialProfileService.addSocialProfile(studentId, socialProfile);
	}

	@RequestMapping(value = "/updateProfile")
	public ModelAndView findSocialProfileById(int socialProfileId, int studentId) {
		return socialProfileService.findSocialProfileById(socialProfileId, studentId);
	}

//	@RequestMapping( value = "/saveUpdateSocialProfile")
//	public ModelAndView updateSocialProfile(SocialProfile socialProfile,int studentId) {
//		return socialProfileService.updateSocialProfile(socialProfile,studentId);
//	}
	@RequestMapping(value = "/saveUpdateSocialProfile")
	public ModelAndView updateSocialProfile(SocialProfile socialProfile, @RequestParam int studentId) {
		return socialProfileService.updateSocialProfile(socialProfile, studentId);
	}

	@RequestMapping(value = "/deleteProfile")
	public ModelAndView deleteSocialProfile(int socialProfileId, int studentId) {
		return socialProfileService.deleteSocialProfile(socialProfileId, studentId);
	}
}
