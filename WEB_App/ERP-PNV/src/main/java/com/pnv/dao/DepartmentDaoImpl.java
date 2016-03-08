/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pnv.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pnv.models.Departments;

/**
 *
 * @author Administrator
 */
@Service
@Transactional
public class DepartmentDaoImpl implements DepartmentDao {

	@Autowired
	private SessionFactory sessionFactory;
	
    public void saveOrUpdate(Departments department) {

        	sessionFactory.getCurrentSession().saveOrUpdate(department);
  
    }

   

    public void delete(Departments department) {
       
        	sessionFactory.getCurrentSession().delete(department);
    
    }

    public List<Departments> findAll() {
       
        List<Departments> departmentsList = sessionFactory.getCurrentSession().createQuery("from Departments").list();

        return departmentsList;
    }

    public Departments findByDepartmentId(int id) {
        Departments department = null;
      
            department = (Departments) sessionFactory.getCurrentSession().get(Departments.class, id);
       
        return department;
    }

    public Departments findByDepartmentCode(String departmentsCode) {
        Departments department = null;
        String strQuery = "from Departments WHERE depCode = :depCode ";
        Query query = sessionFactory.getCurrentSession().createQuery(strQuery);
        query.setParameter("depCode", departmentsCode);
        department = (Departments) query.uniqueResult();
        return department;
    }

}
