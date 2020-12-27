package com.Elearning.mvc.service;

import java.util.List;

import com.Elearning.mvc.entites.assister;

public interface I_Assister_Service {
	public assister save(assister entity);
	public assister update(assister entity);
	public List<assister> selectALL();
	public List<assister> selectALL(String sortfield,String sort);
	public assister getById(Long id);
	public void remove(Long id);
	public assister findOne(String paramName, Object paramValue);
	public assister findOne(String[] paramName, Object[] paramValue);
	public int findCountBy(String paramName, Object paramValue);
}
