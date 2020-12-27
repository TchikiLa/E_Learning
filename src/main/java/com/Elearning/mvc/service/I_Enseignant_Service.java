package com.Elearning.mvc.service;

import java.util.List;

import com.Elearning.mvc.entites.enseignant;

public interface I_Enseignant_Service {
	public enseignant save(enseignant entity);
	public enseignant update(enseignant entity);
	public List<enseignant> selectALL();
	public List<enseignant> selectALL(String sortfield,String sort);
	public enseignant getById(Long id);
	public void remove(Long id);
	public enseignant findOne(String paramName, Object paramValue);
	public enseignant findOne(String[] paramName, Object[] paramValue);
	public int findCountBy(String paramName, Object paramValue);
	
}
