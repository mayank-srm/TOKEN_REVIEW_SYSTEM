package com.TokenReviewSystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Entity
public class DoctorTokenData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int t_id;
    private String emailID;
	private String gender;
    private String doctorTypeToken;
    private String messageToDoctor;

	private static final Pattern emailPattern = Pattern.compile("^*@}$");


    public DoctorTokenData() {
		super();
	}

	public DoctorTokenData(int t_id, String emailID, String gender, String doctorTypeToken, String messageToDoctor) {
		super();
		this.t_id = t_id;
		this.emailID = emailID;
		this.gender = gender;
		this.doctorTypeToken = doctorTypeToken;
		this.messageToDoctor = messageToDoctor;
	}
	public int getT_id() {
		return t_id;
	}

	public static boolean isValidEmail(String name)
	{
		return name.contains("@");
	}

	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDoctorTypeToken() {
		return doctorTypeToken;
	}
	public void setDoctorTypeToken(String doctorTypeToken) {
		this.doctorTypeToken = doctorTypeToken;
	}
	public String getMessageToDoctor() {
		return messageToDoctor;
	}
	public void setMessageToDoctor(String messageToDoctor) {
		this.messageToDoctor = messageToDoctor;
	}



}
