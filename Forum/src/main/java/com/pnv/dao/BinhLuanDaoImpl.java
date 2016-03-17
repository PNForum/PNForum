package com.pnv.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pnv.models.BaiDangHoacTraoDoi;
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



	public List<BinhLuan> getBinhLuan(int id) {
		List<BinhLuan> bl = sessionFactory.getCurrentSession().createQuery("from BinhLuan where id_bai_dang_hoac_trao_doi = '"+id+"'").list();
		return bl;
	}

}
