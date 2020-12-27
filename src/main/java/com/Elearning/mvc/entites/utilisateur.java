package com.Elearning.mvc.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class utilisateur implements Serializable{
	
	@Id
	@GeneratedValue
	private Long id_tilisateur;
	private String Username;
	private String mot_pass;
	@OneToMany(mappedBy = "utilisateur")
	List<Roles> roles;

	private boolean actived;
	
	public utilisateur() {
		super();
	}

	public Long getId_tilisateur() {
		return id_tilisateur;
	}

	public void setId_tilisateur(Long id_tilisateur) {
		this.id_tilisateur = id_tilisateur;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getMot_pass() {
		return mot_pass;
	}

	public void setMot_pass(String mot_pass) {
		this.mot_pass = mot_pass;
	}

	public List<Roles> getRoles() {
		return roles;
	}

	public void setRoles(List<Roles> roles) {
		this.roles = roles;
	}

	public boolean isActived() {
		return actived;
	}

	public void setActived(boolean actived) {
		this.actived = actived;
	}
}
