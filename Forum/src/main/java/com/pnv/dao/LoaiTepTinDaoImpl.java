package com.pnv.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pnv.models.LoaiTepTin;

@Service
@Transactional
public class LoaiTepTinDaoImpl implements LoaiTepTinDao{

	@Autowired
	private SessionFactory sessionFactory;

	public void saveOrUpdate(LoaiTepTin ltt) {
		sessionFactory.getCurrentSession().saveOrUpdate(ltt);
		
	}

	public void delete(LoaiTepTin ltt) {
		sessionFactory.getCurrentSession().delete(ltt);
		
	}

	public List<LoaiTepTin> findAll() {
		List<LoaiTepTin> lttList = sessionFactory.getCurrentSession().createQuery("from LoaiTepTin").list();

        return lttList;
	}

	public LoaiTepTin findByDepartmentId(int id) {
		 LoaiTepTin ltt = null;
	      
         ltt = (LoaiTepTin) sessionFactory.getCurrentSession().get(LoaiTepTin.class, id);
    
         return ltt;
	}
	
	

}
