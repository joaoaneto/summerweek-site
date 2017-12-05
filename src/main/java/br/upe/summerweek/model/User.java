package br.upe.summerweek.model;

import java.util.ArrayList;
import java.util.Date;

public class User {
	private boolean isAdmin; 
	private String name;
	private String password;
	private String sex;
	private Date birthday;
	private String email;
	private String university;
	private String course;
	private ArrayList<Integer> listActivities;
	
	public void setName(String pName){
		name = pName;
	}
	
	public void setPassword(String pPassword){
		password = pPassword;
	}
	
	public void setSex(String pSex){
		sex = pSex;
	}
	
	public void setBirthday(Date pBirthday){
		birthday = pBirthday;
	}
	
	public void setEmail(String pEmail){
		email = pEmail;
	}
	
	public void setUniversity(String pUniversity){
		university = pUniversity;
	}
	
	public void setCourse(String pCourse){
		course = pCourse;
	}
	
	public void addActivitie(int pID){
		listActivities.add(pID); 
	}
	
	public void setAdmin(boolean pAdmin){
		isAdmin = pAdmin;
	}
	
	public String getName(){
		return name;
	}
	
	public String getPassword(){
		return password;
	}
	
	public String getSex(){
		return sex;
	}
	
	public Date getBirthday(){
		return birthday;
	}
	
	public String getEmail(){
		return email;
	}
	
	public String getUniversity(){
		return university;
	}
	
	public String getCourse(){
		return course;
	}
	
	public ArrayList<Integer> getListActivities(){
		return listActivities;
	}	
	
	public boolean isAdmin(){
		return isAdmin;
	}
}
