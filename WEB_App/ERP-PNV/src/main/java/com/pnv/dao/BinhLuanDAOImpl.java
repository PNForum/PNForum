package com.pnv.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.pnv.models.BinhLuan;

public class BinhLuanDAOImpl implements BinhLuanDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveOrUpdate(BinhLuan binhLuan) {
		sessionFactory.getCurrentSession().saveOrUpdate(binhLuan);
		
	}

	public void delete(BinhLuan binhLuan) {
		sessionFactory.getCurrentSession().delete(binhLuan);
		
	}

	public List<BinhLuan> findAll() {
		List<BinhLuan> binhLuan = sessionFactory.getCurrentSession().createQuery("from BinhLuan").list();
		return null;
	}

}
