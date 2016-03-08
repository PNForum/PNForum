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
import com.pnv.models.Employees;

/**
 *
 * @author Administrator
 */
@Service
@Transactional
public class EmployeeDaoIml implements EmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void saveOrUpdate(Employees employee) {

		sessionFactory.getCurrentSession().saveOrUpdate(employee);

	}

	public void delete(Employees employee) {

		sessionFactory.getCurrentSession().delete(employee);
	}

	public List<Employees> findAll() {

		List<Employees> employeesList = sessionFactory.getCurrentSession().createQuery("from Employees").list();
		return employeesList;
	}

	public Employees findByEmployeeId(int id) {
		Employees employee = null;

		employee = (Employees) sessionFactory.getCurrentSession().get(Employees.class, id);

		return employee;
	}

	public List<Employees> findByEmployeeName(String employeeName) {
		Departments department = null;
		String strQuery = "from Employees WHERE employeeName LIKE :employeeName ";
		Query query = sessionFactory.getCurrentSession().createQuery(strQuery);
		query.setParameter("employeeName", "%" + employeeName + "%");
		List<Employees> employeesList = query.list();
		return employeesList;
	}

}
