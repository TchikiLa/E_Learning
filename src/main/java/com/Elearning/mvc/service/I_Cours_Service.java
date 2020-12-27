package com.Elearning.mvc.service;

import java.util.List;

import com.Elearning.mvc.entites.cours;

public interface I_Cours_Service {
	public cours save(cours entity);
	public cours update(cours entity);
	public List<cours> selectALL();
	public List<cours> selectALL(String sortfield,String sort);
	public cours getById(Long id);
	public void remove(Long id);
	public cours findOne(String paramName, Object paramValue);
	public cours findOne(String[] paramName, Object[] paramValue);
	public int findCountBy(String paramName, Object paramValue);
	
}
