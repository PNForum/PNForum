package com.pnv.dao;

import java.util.List;

import org.hibernate.Query;
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
		List<BaiDangHoacTraoDoi> bdhtdList = sessionFactory.getCurrentSession().createQuery("from BaiDangHoacTraoDoi WHERE the_loai_bai = 1").list();

	       return bdhtdList;
	}

	public List<BaiDangHoacTraoDoi> displayByBestView() {
		  String strQuery = "from BaiDangHoacTraoDoi WHERE the_loai_bai = 1 ORDER BY luot_xem DESC";
		  Query query = sessionFactory.getCurrentSession().createQuery(strQuery);
		  query.setFirstResult(0);
		  query.setMaxResults(4);
		  List<BaiDangHoacTraoDoi> pList = query.list();
		  return pList;
	}

	public List<BaiDangHoacTraoDoi> displayByBestLikee() {
		String strQuery = "from BaiDangHoacTraoDoi WHERE the_loai_bai = 1 ORDER BY luot_thich DESC";
		  Query query = sessionFactory.getCurrentSession().createQuery(strQuery);
		  query.setFirstResult(0);
		  query.setMaxResults(3);
		  List<BaiDangHoacTraoDoi> bestLikeList = query.list();
		  return bestLikeList;
	}

	public List<BaiDangHoacTraoDoi> displayPostLatest() {
		  String strQuery = "from BaiDangHoacTraoDoi WHERE the_loai_bai = 1 ORDER BY ngay_dang_bai DESC";
		  Query query = sessionFactory.getCurrentSession().createQuery(strQuery);
		  query.setFirstResult(0);
		  query.setMaxResults(3);
		  List<BaiDangHoacTraoDoi> bestLikeList = query.list();
		  return bestLikeList;
	}

	
	 
}
