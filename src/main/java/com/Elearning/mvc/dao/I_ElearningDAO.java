package com.Elearning.mvc.dao;

import java.util.List;

public interface I_ElearningDAO<E> {
	
	public E save(E entity);
	public E update(E entity);
	public List<E> selectALL();
	public List<E> selectALL(String sortfield,String sort);
	public E getById(Long id);
	public void remove(Long id);
	public E findOne(String paramName, Object paramValue);
	public E findOne(String[] paramName, Object[] paramValue);
	public int findCountBy(String paramName, Object paramValue);
}
