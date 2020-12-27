package com.Elearning.mvc.entites;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table
public class enseignant implements Serializable{

	@Id
	@GeneratedValue
	private long id_enseignant;
	
	private String nom_enseignant;
	private String prenom_enseignant;
	private String email_enseignant;
	
	@OneToMany(mappedBy = "idEnseignant")
	private List<enseigner> idEnseigner;

	public enseignant() {
		super();
	}

	public long getId_enseignant() {
		return id_enseignant;
	}

	public void setId_enseignant(long id_enseignant) {
		this.id_enseignant = id_enseignant;
	}

	public String getNom_enseignant() {
		return nom_enseignant;
	}

	public void setNom_enseignant(String nom_enseignant) {
		this.nom_enseignant = nom_enseignant;
	}

	public String getPrenom_enseignant() {
		return prenom_enseignant;
	}

	public void setPrenom_enseignant(String prenom_enseignant) {
		this.prenom_enseignant = prenom_enseignant;
	}

	public String getEmail_enseignant() {
		return email_enseignant;
	}

	public void setEmail_enseignant(String email_enseignant) {
		this.email_enseignant = email_enseignant;
	}

	public List<enseigner> getIdEnseigner() {
		return idEnseigner;
	}

	public void setIdEnseigner(List<enseigner> idEnseigner) {
		this.idEnseigner = idEnseigner;
	}

	
}
