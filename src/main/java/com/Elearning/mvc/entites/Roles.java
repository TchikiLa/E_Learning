package com.Elearning.mvc.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Roles {

	@Id
	@GeneratedValue
	private Long id_role;
	private String rolename;
	@ManyToOne
	@JoinColumn(name="id_tilisateur")
	private utilisateur utilisateur;
	
	public Roles() {
		super();
	}

	public Long getId_role() {
		return id_role;
	}

	public void setId_role(Long id_role) {
		this.id_role = id_role;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	
		
}
