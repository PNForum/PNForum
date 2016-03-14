package com.pnv.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pnv.models.BinhLuan;

@Service
@Transactional
public class BinhLuanDaoImpl implements BinhLuanDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveOrUpdate(BinhLuan bl) {
		sessionFactory.getCurrentSession().saveOrUpdate(bl);
		
	}

	public void delete(BinhLuan bl) {
		sessionFactory.getCurrentSession().delete(bl);
		
	}

	public List<BinhLuan> findAll() {
		 List<BinhLuan> blList = sessionFactory.getCurrentSession().createQuery("from BinhLuan").list();

	        return blList;
	}

	public BinhLuan findByDepartmentId(int id) {
		 BinhLuan bl = null;
	      
         bl = (BinhLuan) sessionFactory.getCurrentSession().get(BinhLuan.class, id);
    
     return bl;
	}

}
