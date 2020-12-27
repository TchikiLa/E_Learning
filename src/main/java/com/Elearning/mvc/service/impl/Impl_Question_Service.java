package com.Elearning.mvc.service.impl;

import java.util.List;

import com.Elearning.mvc.dao.I_questionsDAO;
import com.Elearning.mvc.entites.questions;
import com.Elearning.mvc.service.I_Question_Service;

public class Impl_Question_Service implements I_Question_Service{
	I_questionsDAO dao;



	public void setDao(I_questionsDAO dao) {
		this.dao = dao;
	}

	@Override
	public questions save(questions entity) {
		return dao.save(entity);
	}

	@Override
	public questions update(questions entity) {
		return dao.update(entity);
	}

	@Override
	public List<questions> selectALL() {
		return dao.selectALL();
	}

	@Override
	public List<questions> selectALL(String sortfield, String sort) {
		return dao.selectALL(sortfield, sort);
	}

	@Override
	public questions getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

	@Override
	public questions findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public questions findOne(String[] paramName, Object[] paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public int findCountBy(String paramName, Object paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}
}
