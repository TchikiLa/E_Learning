package com.Elearning.mvc.entites;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class assister implements Serializable{
	@Id
	@GeneratedValue
	private long id_assister;
	
	@ManyToOne
	@JoinColumn(name= "id_cours")
	private cours idCours;
	
	@ManyToOne
	@JoinColumn(name= "id_etudiant")
	private etudiant idEtudiant;	
	
	public assister() {
		super();
	}

	public long getId_assister() {
		return id_assister;
	}

	public void setId_assister(long id_assister) {
		this.id_assister = id_assister;
	}

	public cours getIdCours() {
		return idCours;
	}

	public void setIdCours(cours idCours) {
		this.idCours = idCours;
	}

	public etudiant getIdEtudiant() {
		return idEtudiant;
	}

	public void setIdEtudiant(etudiant idEtudiant) {
		this.idEtudiant = idEtudiant;
	}


	
}
