package com.pnv.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.pnv.models.TaiKhoan;

@Service
@Transactional
public class TaiKhoanDaoImpl implements TaiKhoanDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveOrUpdate(TaiKhoan tk) {
		sessionFactory.getCurrentSession().saveOrUpdate(tk);
		
	}

	public void delete(TaiKhoan tk) {
		sessionFactory.getCurrentSession().delete(tk);
		
	}

	public List<TaiKhoan> findAll() {
		List<TaiKhoan> tkList = sessionFactory.getCurrentSession().createQuery("from TaiKhoan").list();

        return tkList;
	}

	public TaiKhoan findByDepartmentId(int id) {
		TaiKhoan tkById = null;
	      
		tkById = (TaiKhoan) sessionFactory.getCurrentSession().get(TaiKhoan.class, id);
   
        return tkById;
	}

}
