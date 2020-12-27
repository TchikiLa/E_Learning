package com.Elearning.mvc.service;

import java.util.List;

import com.Elearning.mvc.entites.utilisateur;

public interface I_Utilisateur_Service {
	public utilisateur save(utilisateur entity);
	public utilisateur update(utilisateur entity);
	public List<utilisateur> selectALL();
	public List<utilisateur> selectALL(String sortfield,String sort);
	public utilisateur getById(Long id);
	public void remove(Long id);
	public utilisateur findOne(String paramName, Object paramValue);
	public utilisateur findOne(String[] paramName, Object[] paramValue);
	public int findCountBy(String paramName, Object paramValue);
}
