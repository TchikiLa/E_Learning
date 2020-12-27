package com.Elearning.mvc.entites;


import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class cours implements Serializable{
	@Id
	@GeneratedValue
	private long id_cours;
	private String titre_cours;
	
	@OneToMany(mappedBy = "idCours")
	private List<enseigner> idEnseigner;
	
	@OneToMany(mappedBy = "idCours")
	private List<assister> idAssister;
	
	@OneToMany(mappedBy = "idCours")
	private List<examain> idExamain;
	

	public cours() {
		super();
	}


	public long getId_cours() {
		return id_cours;
	}


	public void setId_cours(long id_cours) {
		this.id_cours = id_cours;
	}


	public String getTitre_cours() {
		return titre_cours;
	}


	public void setTitre_cours(String titre_cours) {
		this.titre_cours = titre_cours;
	}


	public List<enseigner> getIdEnseigner() {
		return idEnseigner;
	}


	public void setIdEnseigner(List<enseigner> idEnseigner) {
		this.idEnseigner = idEnseigner;
	}


	public List<assister> getIdAssister() {
		return idAssister;
	}


	public void setIdAssister(List<assister> idAssister) {
		this.idAssister = idAssister;
	}


	public List<examain> getIdExamain() {
		return idExamain;
	}


	public void setIdExamain(List<examain> idExamain) {
		this.idExamain = idExamain;
	}




	

}
