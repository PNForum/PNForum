package com.pnv.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pnv.models.BaiDangHoacTraoDoi;
import com.pnv.models.ChuDe;

@Service
@Transactional
public class BaiDangHoacTraoDoiDAOImpl implements BaiDangHoacTraoDoiDAO{

	@Autowired
	private SessionFactory sessionFactory;

	public void saveOrUpdate(BaiDangHoacTraoDoi bdhtd) {
		sessionFactory.getCurrentSession().saveOrUpdate(bdhtd);
		
	}

	public void delete(BaiDangHoacTraoDoi bdhtd) {
		sessionFactory.getCurrentSession().delete(bdhtd);
		
	}

	public BaiDangHoacTraoDoi findByDepartmentId(int id) {
		BaiDangHoacTraoDoi bdhtd = null;
	      
		bdhtd = (BaiDangHoacTraoDoi) sessionFactory.getCurrentSession().get(BaiDangHoacTraoDoi.class, id);
   
    return bdhtd;
	}

	public List<BaiDangHoacTraoDoi> findAll() {
		List<BaiDangHoacTraoDoi> bdhtdList = sessionFactory.getCurrentSession().createQuery("from BaiDangHoacTraoDoi").list();

	       return bdhtdList;
	}

	
	 
}
