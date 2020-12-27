package com.Elearning.mvc.entites;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnore;

@Entity
@Table
public class examain implements Serializable{
	@Id
	@GeneratedValue
	private long id_examain;
	private Date date_examain;
	private float Note_examain;
	
	@ManyToOne
	@JoinColumn(name= "id_cours")
	private cours idCours;
	
	@OneToMany(mappedBy = "idExamain")
	private List<questions> idQuestion;
	
	public examain() {
		super();
	}

	public long getId_examain() {
		return id_examain;
	}

	public void setId_examain(long id_examain) {
		this.id_examain = id_examain;
	}

	public Date getDate_examain() {
		return date_examain;
	}

	public void setDate_examain(Date date_examain) {
		this.date_examain = date_examain;
	}

	public float getNote_examain() {
		return Note_examain;
	}

	public void setNote_examain(float note_examain) {
		Note_examain = note_examain;
	}

	public cours getIdCours() {
		return idCours;
	}

	public void setIdCours(cours idCours) {
		this.idCours = idCours;
	}
	@JsonIgnore
	public List<questions> getIdQuestion() {
		return idQuestion;
	}

	public void setIdQuestion(List<questions> idQuestion) {
		this.idQuestion = idQuestion;
	}


}
