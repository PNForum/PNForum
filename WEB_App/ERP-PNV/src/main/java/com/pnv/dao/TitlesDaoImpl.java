/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pnv.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pnv.models.Titles;

/**
 *
 * @author Administrator
 */
@Repository("TitlesDao")
@Transactional
public class TitlesDaoImpl implements TitlesDao {

	@Autowired
	private SessionFactory sessionFactory;

	public TitlesDaoImpl() {

	}

	public void saveOrUpdate(Titles title) {

		sessionFactory.getCurrentSession().saveOrUpdate(title);

	}

	public void delete(Titles title) {

		sessionFactory.getCurrentSession().delete(title);

	}

	public Titles findByTitleId(int id) {

		return (Titles) sessionFactory.getCurrentSession().get(Titles.class, id);

	}

	public Titles findByTitleCode(String titleCode) {

		String strQuery = "from Titles WHERE titleCode =:titleCode ";
		Query query = sessionFactory.getCurrentSession().createQuery(strQuery);
		query.setParameter("titleCode", titleCode);
		return (Titles) query.uniqueResult();

	}

	public List<Titles> findAll() {

		List<Titles> titlesList = sessionFactory.getCurrentSession().createQuery("from Titles").list();

		return titlesList;

	}

}
