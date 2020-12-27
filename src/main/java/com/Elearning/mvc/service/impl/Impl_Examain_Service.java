package com.Elearning.mvc.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.Elearning.mvc.dao.I_examainDAO;
import com.Elearning.mvc.entites.examain;
import com.Elearning.mvc.service.I_Examain_Service;



@Transactional
public class Impl_Examain_Service implements I_Examain_Service{

	
	I_examainDAO dao;
	
	
	public void setDao(I_examainDAO dao) {
		this.dao = dao;
	}

	@Override
	public examain save(examain entity) {
		return dao.save(entity);
	}

	@Override
	public examain update(examain entity) {
		return dao.update(entity);
	}

	@Override
	public List<examain> selectALL() {
		return dao.selectALL();
	}

	@Override
	public List<examain> selectALL(String sortfield, String sort) {
		return dao.selectALL(sortfield, sort);
	}

	@Override
	public examain getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public examain findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public examain findOne(String[] paramName, Object[] paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public int findCountBy(String paramName, Object paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
