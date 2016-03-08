/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pnv.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pnv.dao.EmployeeDao;
import com.pnv.models.Employees;

/**
 *
 * @author Administrator
 */
@Controller
@RequestMapping(value = "api/employee")
public class EmployeeApiController {

    @Autowired
    private EmployeeDao employeeDao;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    List<Employees> viewEmployeePage() {

        List<Employees> employees_list;

        employees_list = employeeDao.findAll();

        return employees_list;
    }
}
