package com.Elearning.mvc.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.Elearning.mvc.dao.I_assisterDAO;
import com.Elearning.mvc.entites.assister;
import com.Elearning.mvc.service.I_Assister_Service;

@Transactional
public class Impl_Assister_Service implements I_Assister_Service{

	
	I_assisterDAO dao;
	
	
	public void setDao(I_assisterDAO dao) {
		this.dao = dao;
	}

	@Override
	public assister save(assister entity) {
		return dao.save(entity);
	}

	@Override
	public assister update(assister entity) {
		return dao.update(entity);
	}

	@Override
	public List<assister> selectALL() {
		return dao.selectALL();
	}

	@Override
	public List<assister> selectALL(String sortfield, String sort) {
		return dao.selectALL(sortfield, sort);
	}

	@Override
	public assister getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public assister findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public assister findOne(String[] paramName, Object[] paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public int findCountBy(String paramName, Object paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
