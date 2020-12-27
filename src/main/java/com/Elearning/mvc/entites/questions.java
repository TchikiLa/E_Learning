package com.Elearning.mvc.entites;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table
public class questions implements Serializable{
	@Id
	@GeneratedValue
	private long id_question;
	private float Note_question;
	private String description_question;
	

	
	@ManyToOne
	@JoinColumn(name= "id_examain")
	private examain idExamain;

	public questions() {
		super();
	}

	public long getId_question() {
		return id_question;
	}

	public void setId_question(long id_question) {
		this.id_question = id_question;
	}

	public float getNote_question() {
		return Note_question;
	}

	public void setNote_question(float note_question) {
		Note_question = note_question;
	}

	public String getDescription_question() {
		return description_question;
	}

	public void setDescription_question(String description_question) {
		this.description_question = description_question;
	}

	public examain getIdExamain() {
		return idExamain;
	}

	public void setIdExamain(examain idExamain) {
		this.idExamain = idExamain;
	}
	
}
