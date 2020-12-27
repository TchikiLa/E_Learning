package com.Elearning.mvc.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.Elearning.mvc.dao.I_ElearningDAO;


@SuppressWarnings("unchecked")
public class ElearningDAO_impl<E> implements I_ElearningDAO<E> {

	
	@PersistenceContext
	EntityManager em;
	
	public Class<E> type;
	
	
	public Class<E> getType() {
		return type;
	}

	public ElearningDAO_impl() {
		// TODO Auto-generated constructor stub
		Type t = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) t;
		type = (Class<E>) pt.getActualTypeArguments()[0];
	}
	
	@Override
	public E save(E entity) {
		em.persist(entity);
		return entity;
	}

	@Override
	public E update(E entity) {
		return em.merge(entity);
	}

	@Override
	public List<E> selectALL() {
		Query query = em.createQuery("select t from " + type.getSimpleName() + " t");
		return query.getResultList();
	}
	
	@Override
	public List<E> selectALL(String sortfield,String sort) {
		Query query = em.createQuery("select t from " + type.getSimpleName() + " t order by " + sortfield + " " + sort);
		return query.getResultList();
	}
	
	@Override
	public E getById(Long id) {
		return em.find(type, id);
	}

	@Override
	public void remove(Long id) {
		E tab = em.getReference(type, id);
		em.remove(tab);
	}

	@Override
	public E findOne(String paramName, Object paramValue) {
		//setlect t == select *   // :x c'est pour passer des parametres dans le langage jpql 
		Query query = em.createQuery("select t from " + type.getSimpleName() + " t where " + paramName + " = :x");
		query.setParameter(paramName, paramValue);
		//c'est comme si if(query.getResultList().size() > 0){ return query.getResultList().get(0) } else { return null }
		return query.getResultList().size() > 0 ? (E) query.getResultList().get(0) : null;
	}

	@Override
	public E findOne(String[] paramName, Object[] paramValue) {
		//tester si la longeur des deux tableaux est diff
		if(paramName.length != paramValue.length) {
			return null;
		}
		
		String queryString = "select e from " + type.getSimpleName() + " e where ";
		int len = paramName.length;
		for(int i=0; i<len;i++) {
			queryString += " e." + paramName[i] + "= :x" +i;
			if((i + 1) < len) {
				queryString += " and ";
			}
		}
		Query query =em.createQuery(queryString);
		for(int i = 0;i<paramValue.length;i++) {
			query.setParameter("x" + i,paramValue[i]);
		}
		return query.getResultList().size() > 0 ? (E) query.getResultList().get(0) : null;
	}

	@Override
	public int findCountBy(String paramName, Object paramValue) {
		Query query = em.createQuery("select t from " + type.getSimpleName() + " t where " + paramName + " = :x");
		query.setParameter(paramName, paramValue);
		return query.getResultList().size() > 0 ? ((Long) query.getSingleResult()).intValue() : 0;
	}

}
