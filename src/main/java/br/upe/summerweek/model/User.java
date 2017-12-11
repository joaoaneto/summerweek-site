package br.upe.summerweek.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table (name = "usersm")
public class User implements Serializable {
	
	private static final long serialVersionUID = -183920472242241606L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userID;
	
	@Column(name = "isAdmin")
	private boolean isAdmin;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "sex")
	private String sex;
	
	//@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "birthday")
	@Temporal(TemporalType.DATE)
	private Calendar birthday;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "university")
	private String university;
	
	@Column(name = "course")
	private String course;
	
	@Column(name = "listActivities")
	private ArrayList<Integer> listActivities;
	
	public User(){}
	
	public User(boolean pIsAdmin, String pName, String pPassword, String pSex, Calendar pBirthday, String pEmail, String pUniversity, String pCourse) {
		this.isAdmin = pIsAdmin;
		this.name = pName;
		this.password = pPassword;
		this.sex = pSex;
		this.birthday = pBirthday;
		this.email = pEmail;
		this.university = pUniversity;
		this.course = pCourse;
	}
	
	public long userID() {
		return this.userID;
	}
	
	public void setName(String pName){
		name = pName;
	}
	
	public void setPassword(String pPassword){
		password = pPassword;
	}
	
	public void setSex(String pSex){
		sex = pSex;
	}
	
	public void setBirthday(Calendar pBirthday){
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
	
	public Calendar getBirthday(){
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
