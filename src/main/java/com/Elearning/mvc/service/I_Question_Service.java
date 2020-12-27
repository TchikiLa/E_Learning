package com.Elearning.mvc.service;

import java.util.List;

import com.Elearning.mvc.entites.questions;

public interface I_Question_Service {
	public questions save(questions entity);
	public questions update(questions entity);
	public List<questions> selectALL();
	public List<questions> selectALL(String sortfield,String sort);
	public questions getById(Long id);
	public void remove(Long id);
	public questions findOne(String paramName, Object paramValue);
	public questions findOne(String[] paramName, Object[] paramValue);
	public int findCountBy(String paramName, Object paramValue);
}
