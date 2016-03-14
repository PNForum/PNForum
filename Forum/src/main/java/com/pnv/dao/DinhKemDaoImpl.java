package com.pnv.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pnv.models.ChuDe;
import com.pnv.models.DinhKem;

@Service
@Transactional
public class DinhKemDaoImpl implements DinhKemDao{

	@Autowired
	private SessionFactory sessionFactory;

	public void saveOrUpdate(DinhKem dk) {
		sessionFactory.getCurrentSession().saveOrUpdate(dk);
		
	}

	public void delete(DinhKem dk) {
		sessionFactory.getCurrentSession().delete(dk);
		
	}

	public List<DinhKem> findAll() {
		List<DinhKem> dkList = sessionFactory.getCurrentSession().createQuery("from DinhKem").list();

        return dkList;
	}

	public DinhKem findByDepartmentId(int id) {
		DinhKem dk = null;
	      
        dk = (DinhKem) sessionFactory.getCurrentSession().get(DinhKem.class, id);
   
        return dk;
	}
	

}
