package br.upe.summerweek.model;

import java.io.Serializable;
import java.sql.Date;
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
@Table (name = "activity")
public class Activity implements Serializable{

	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "type")
	private String type;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

	@Column(name = "speakername")
	private String speakername; /*Palestrante*/

	@Column(name = "date")
	@Temporal(TemporalType.DATE)
	private Calendar date;

	@Column(name = "hours")
	private float hours;

	protected Activity() {

	}
	
	public Activity(String pType, String pTitle, String pDescription, String pSpeakerName, Calendar pDate, float pHours) {
		this.type = pType;
		this.title = pTitle;
		this.description = pDescription;
		this. speakername = pSpeakerName;
		this.date = pDate;
		this.hours = pHours;
	}
	
	public long getID() {
		return this.id;
	}

	public void setName(String pSpeakerName){
		this.speakername = pSpeakerName;
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

	public void setDate(Calendar pDate){
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

	public String getSpeakerName(){
		return this.speakername;
	}

	public Calendar getDate(){
		return this.date;
	}

	public float getHours(){
		return this.hours;
	}
} 