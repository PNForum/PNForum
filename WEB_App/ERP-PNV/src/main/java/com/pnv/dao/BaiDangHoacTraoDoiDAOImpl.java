package com.pnv.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.pnv.models.BaiDangHoacTraoDoi;

public class BaiDangHoacTraoDoiDAOImpl implements BaiDangHoacTraoDoiDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveOrUpdate(BaiDangHoacTraoDoi baiDangHoacTraoDoi) {
		sessionFactory.getCurrentSession().saveOrUpdate(baiDangHoacTraoDoi);
	}

	public void delete(BaiDangHoacTraoDoi baiDangHoacTraoDoi) {
		sessionFactory.getCurrentSession().delete(baiDangHoacTraoDoi);
		
	}

	public List<BaiDangHoacTraoDoi> findAll() {
		List<BaiDangHoacTraoDoiDAO> baiDangHoacTraoDoiList = 
				sessionFactory.getCurrentSession().createQuery("from BaiDangHoacTraoDoi").list();
		return null;
	}

	public BaiDangHoacTraoDoi findBybaiDangHoacTraoDoiId(int id) {
		BaiDangHoacTraoDoiDAO findById;
		findById = null;
		findById = (BaiDangHoacTraoDoiDAO) sessionFactory.getCurrentSession()
				.get(BaiDangHoacTraoDoi.class, id);
		return null;
	}

	public BaiDangHoacTraoDoi findBybaiDangHoacTraoDoiTitle(String tieu_de) {
		BaiDangHoacTraoDoi findByTitle = null;
		String finTitleQuery = "from BaiDangHoacTraoDoi WHERE tieu_de = :tieu_de";
		Query query = sessionFactory.getCurrentSession().createQuery(finTitleQuery);
		query.setParameter("tieu_de", tieu_de);
		findByTitle = (BaiDangHoacTraoDoi) query.uniqueResult();
		return null;
	}

}
