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
public class etudiant implements Serializable{
	@Id
	@GeneratedValue
	private long id_etudiant;
	
	private String nom_etudiant;
	private String prenom_etudiant;
	private String email_etudiant;
	
	@OneToMany(mappedBy = "idEtudiant")
	private List<assister> idAssister;
	
	public etudiant() {
		super();
	}

	public long getId_etudiant() {
		return id_etudiant;
	}

	public void setId_etudiant(long id_etudiant) {
		this.id_etudiant = id_etudiant;
	}

	public String getNom_etudiant() {
		return nom_etudiant;
	}

	public void setNom_etudiant(String nom_etudiant) {
		this.nom_etudiant = nom_etudiant;
	}

	public String getPrenom_etudiant() {
		return prenom_etudiant;
	}

	public void setPrenom_etudiant(String prenom_etudiant) {
		this.prenom_etudiant = prenom_etudiant;
	}

	public String getEmail_etudiant() {
		return email_etudiant;
	}

	public void setEmail_etudiant(String email_etudiant) {
		this.email_etudiant = email_etudiant;
	}

	public List<assister> getIdAssister() {
		return idAssister;
	}

	public void setIdAssister(List<assister> idAssister) {
		this.idAssister = idAssister;
	}


	
}
