package com.Elearning.mvc.service.impl;

import java.util.List;

import com.Elearning.mvc.dao.I_utilisateurDAO;
import com.Elearning.mvc.entites.utilisateur;
import com.Elearning.mvc.service.I_Utilisateur_Service;

public class Impl_Utilisateur_Service implements I_Utilisateur_Service{
	
	I_utilisateurDAO dao;
	
	
	public void setDao(I_utilisateurDAO dao) {
		this.dao = dao;
	}

	@Override
	public utilisateur save(utilisateur entity) {
		return dao.save(entity);
	}

	@Override
	public utilisateur update(utilisateur entity) {
		return dao.update(entity);
	}

	@Override
	public List<utilisateur> selectALL() {
		return dao.selectALL();
	}

	@Override
	public List<utilisateur> selectALL(String sortfield, String sort) {
		return dao.selectALL(sortfield, sort);
	}

	@Override
	public utilisateur getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public utilisateur findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public utilisateur findOne(String[] paramName, Object[] paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public int findCountBy(String paramName, Object paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
