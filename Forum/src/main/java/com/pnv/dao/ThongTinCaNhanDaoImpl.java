package com.pnv.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.pnv.models.ChuDe;
import com.pnv.models.ThongTinCaNhan;

@Service
@Transactional
public class ThongTinCaNhanDaoImpl implements ThongTinCaNhanDao{

	@Autowired
	private SessionFactory sessionFactory;

	public void saveOrUpdate(ThongTinCaNhan ttcn) {
		sessionFactory.getCurrentSession().saveOrUpdate(ttcn);
		
	}

	public void delete(ThongTinCaNhan ttcn) {
		sessionFactory.getCurrentSession().delete(ttcn);
		
	}

	public List<ThongTinCaNhan> findAll() {
		List<ThongTinCaNhan> thongtinList = sessionFactory.getCurrentSession().createQuery("from ThongTinCaNhan").list();

        return thongtinList;
	}

	public ThongTinCaNhan findByDepartmentId(int id) {
		ThongTinCaNhan ttcnById = null;
	      
		ttcnById = (ThongTinCaNhan) sessionFactory.getCurrentSession().get(ThongTinCaNhan.class, id);
   
    return ttcnById;
	}

}
