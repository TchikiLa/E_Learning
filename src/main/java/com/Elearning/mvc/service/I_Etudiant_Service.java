package com.Elearning.mvc.service;

import java.util.List;

import com.Elearning.mvc.entites.etudiant;

public interface I_Etudiant_Service {
	public etudiant save(etudiant entity);
	public etudiant update(etudiant entity);
	public List<etudiant> selectALL();
	public List<etudiant> selectALL(String sortfield,String sort);
	public etudiant getById(Long id);
	public void remove(Long id);
	public etudiant findOne(String paramName, Object paramValue);
	public etudiant findOne(String[] paramName, Object[] paramValue);
	public int findCountBy(String paramName, Object paramValue);
	
}
