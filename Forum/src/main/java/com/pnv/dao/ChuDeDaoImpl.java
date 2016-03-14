package com.pnv.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.pnv.models.ChuDe;

@Service
@Transactional
public class ChuDeDaoImpl implements ChuDeDao{

	@Autowired
	private SessionFactory sessionFactory;
	public void saveOrUpdate(ChuDe c) {
		sessionFactory.getCurrentSession().saveOrUpdate(c);
		
	}

	public void delete(ChuDe c) {
		sessionFactory.getCurrentSession().delete(c);
		
	}

	public List<ChuDe> findAll() {
		 List<ChuDe> cList = sessionFactory.getCurrentSession().createQuery("from ChuDe").list();

	        return cList;
	}

	public ChuDe findByDepartmentId(int id) {
		 ChuDe c = null;
	      
         c = (ChuDe) sessionFactory.getCurrentSession().get(ChuDe.class, id);
    
     return c;
	}

}
