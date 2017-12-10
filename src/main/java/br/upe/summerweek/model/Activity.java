package br.upe.summerweek.model;

import java.util.Date;

public class Activity {
	private String type;
	private String title;
	private String description;
	private String name; /*Palestrante*/
	private Date date;
	private float hours;
	
	public Activity(String pType, String pTitle, String pDescription, 
			String pName, Date pDate, float pHours) {
		this.type = pType;
		this.title = pTitle;
		this.description = pDescription;
		this.name = pName;
		this.hours = pHours;
	}

	public void setName(String pName){
		this.name = pName;
	}
	
	public void setType(String pType){
		this.type = pType;
	}

	public void setTitle(String pTitle){
		this.title = pTitle;
	}
	
	public void setDescription(String pDescription){
		this.description = pDescription;
	}
	
	public void setDate(Date pDate){
		this.date = pDate;
	}
	
	public void setHours(float pHours){
		this.hours = pHours;
	}

	public String getType(){
		return this.type;
	}
	
	public String getTitle(){
		return this.title;
	}	

	public String getDescription(){
		return this.description;
	}

	public String getName(){
		return this.name;
	}

	public Date getDate(){
		return this.date;
	}

	public float getHours(){
		return this.hours;
	}
} 