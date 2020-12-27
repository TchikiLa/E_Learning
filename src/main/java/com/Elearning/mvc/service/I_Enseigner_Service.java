package com.Elearning.mvc.service;

import java.util.List;

import com.Elearning.mvc.entites.enseigner;

public interface I_Enseigner_Service {
	public enseigner save(enseigner entity);
	public enseigner update(enseigner entity);
	public List<enseigner> selectALL();
	public List<enseigner> selectALL(String sortfield,String sort);
	public enseigner getById(Long id);
	public void remove(Long id);
	public enseigner findOne(String paramName, Object paramValue);
	public enseigner findOne(String[] paramName, Object[] paramValue);
	public int findCountBy(String paramName, Object paramValue);
	
}
