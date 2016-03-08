/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pnv.controllers;

import com.pnv.dao.DepartmentDao;
import com.pnv.dao.EmployeeDao;
import com.pnv.dao.TitlesDao;
import com.pnv.models.Departments;
import com.pnv.models.Employees;
import com.pnv.models.Titles;
import com.pnv.utils.Constant;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Administrator
 */
@Controller
@RequestMapping(value = "/employee")
public class EmployeeControllers {

    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private DepartmentDao departmentDao;
    @Autowired
    private TitlesDao titlesDao;

    @RequestMapping(method = RequestMethod.GET)
    public String viewEmployeePage(@RequestParam(value = "titleId", required = false) Integer titleId, @RequestParam(value = "departmentId", required = false) Integer departmentId, ModelMap map) {

        List<Employees> employees_list;

        if (titleId != null) {
            employees_list = titlesDao.findByTitleId(titleId).getEmployees();
        } else if (departmentId != null) {
            employees_list = departmentDao.findByDepartmentId(departmentId).getEmployees();
        } else {
            employees_list = employeeDao.findAll();
        }

        map.put("employees_list", employees_list);
        return "employee";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String viewAddNewPage(ModelMap map) {

        List<Titles> title_lst = titlesDao.findAll();
        map.addAttribute("titles_lst", title_lst);
        List<Departments> departmentForm = departmentDao.findAll();
        map.addAttribute("departments_lst", departmentForm);

        map.addAttribute("employeeForm", new Employees());

        return "employee-add";

    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String doAddNew(@Valid @ModelAttribute("employeeForm") Employees employeeForm,
            BindingResult result, ModelMap map) {

        if (result.hasErrors()) {
            List<Titles> title_lst = titlesDao.findAll();
            map.addAttribute("titles_lst", title_lst);
            List<Departments> departmentForm = departmentDao.findAll();
            map.addAttribute("departments_lst", departmentForm);
            map.addAttribute("employeeForm", employeeForm);

            return "employee-add";
        }
        employeeDao.saveOrUpdate(employeeForm);

        /**
         * Get all titles
         */
        List<Employees> employees_list = employeeDao.findAll();
        map.put("employees_list", employees_list);
        map.addAttribute("add_success", "ok");

        return "employee";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String viewEditTitlePage(@RequestParam(value = "id", required = true) int id, ModelMap map) {
        List<Titles> title_lst = titlesDao.findAll();
        map.addAttribute("titles_lst", title_lst);
        List<Departments> departmentForm = departmentDao.findAll();
        map.addAttribute("departments_lst", departmentForm);
        Employees employeeForm = employeeDao.findByEmployeeId(id);
        map.addAttribute("employeeForm", employeeForm);
        return "employee-add";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String doDeleteTitle(@RequestParam(value = "id", required = true) int id, ModelMap map) {

        employeeDao.delete(employeeDao.findByEmployeeId(id));

        return Constant.REDIRECT + "/employee";

    }
}
