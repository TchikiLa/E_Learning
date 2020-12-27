package com.Elearning.mvc.service;

import java.util.List;

import com.Elearning.mvc.entites.examain;

public interface I_Examain_Service {
	public examain save(examain entity);
	public examain update(examain entity);
	public List<examain> selectALL();
	public List<examain> selectALL(String sortfield,String sort);
	public examain getById(Long id);
	public void remove(Long id);
	public examain findOne(String paramName, Object paramValue);
	public examain findOne(String[] paramName, Object[] paramValue);
	public int findCountBy(String paramName, Object paramValue);
	
}
