package com.jsp.spring_mvc.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class SocialProfile {

	@Id
	private int socialProfileId;
	private String socialProfileName;
	private String url;
	
	@ManyToOne
	private Student student;

	public int getSocialProfileId() {
		return socialProfileId;
	}

	public void setSocialProfileId(int socialProfileId) {
		this.socialProfileId = socialProfileId;
	}

	public String getSocialProfileName() {
		return socialProfileName;
	}

	public void setSocialProfileName(String socialProfileName) {
		this.socialProfileName = socialProfileName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	
}
