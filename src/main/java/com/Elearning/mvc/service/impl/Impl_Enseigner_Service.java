package com.Elearning.mvc.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.Elearning.mvc.dao.I_ensegnerDAO;
import com.Elearning.mvc.entites.enseigner;
import com.Elearning.mvc.service.I_Enseigner_Service;

@Transactional
public class Impl_Enseigner_Service implements I_Enseigner_Service{

	
	I_ensegnerDAO dao;
	
	
	public void setDao(I_ensegnerDAO dao) {
		this.dao = dao;
	}

	@Override
	public enseigner save(enseigner entity) {
		return dao.save(entity);
	}

	@Override
	public enseigner update(enseigner entity) {
		return dao.update(entity);
	}

	@Override
	public List<enseigner> selectALL() {
		return dao.selectALL();
	}

	@Override
	public List<enseigner> selectALL(String sortfield, String sort) {
		return dao.selectALL(sortfield, sort);
	}

	@Override
	public enseigner getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public enseigner findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public enseigner findOne(String[] paramName, Object[] paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public int findCountBy(String paramName, Object paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
