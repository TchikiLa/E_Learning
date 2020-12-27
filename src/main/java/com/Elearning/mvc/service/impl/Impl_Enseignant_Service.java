package com.Elearning.mvc.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.Elearning.mvc.dao.I_enseignantDAO;
import com.Elearning.mvc.entites.enseignant;
import com.Elearning.mvc.service.I_Enseignant_Service;


@Transactional
public class Impl_Enseignant_Service implements I_Enseignant_Service{

	
	I_enseignantDAO dao;
	
	
	public void setDao(I_enseignantDAO dao) {
		this.dao = dao;
	}

	@Override
	public enseignant save(enseignant entity) {
		return dao.save(entity);
	}

	@Override
	public enseignant update(enseignant entity) {
		return dao.update(entity);
	}

	@Override
	public List<enseignant> selectALL() {
		return dao.selectALL();
	}

	@Override
	public List<enseignant> selectALL(String sortfield, String sort) {
		return dao.selectALL(sortfield, sort);
	}

	@Override
	public enseignant getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public enseignant findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public enseignant findOne(String[] paramName, Object[] paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public int findCountBy(String paramName, Object paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
