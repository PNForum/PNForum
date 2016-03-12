/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pnv.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Administrator
 */
@Controller
public class AdministratorController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String viewWelcomePage(ModelMap map) {
        return "index";
    }
    
    
    @RequestMapping(value = "/discuss", method = RequestMethod.GET)
    public String viewDisscussPage(ModelMap map) {

        //Departments departmentForm = departmentDao.findByDepartmentId(id);
       // map.addAttribute("departmentForm", departmentForm);
        return "discuss";
    }
    
    @RequestMapping(value = "/forum", method = RequestMethod.GET)
    public String viewForumPages(ModelMap map) {
        return "forum";
    }
    
    @RequestMapping(value = "/about_us", method = RequestMethod.GET)
    public String viewAboutUsPages(ModelMap map) {
        return "about_us";
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String viewLoginPages(ModelMap map) {
        return "login";
    }
    
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String viewRegisterPages(ModelMap map) {
        return "register";
    }
    
    @RequestMapping(value = "/edit_profile", method = RequestMethod.GET)
    public String viewEditProfilePages(ModelMap map) {
        return "edit_profile";
    }
    
    @RequestMapping(value = "/view_profile", method = RequestMethod.GET)
    public String viewViewProfilePages(ModelMap map) {
        return "view_profile";
    }
    
    @RequestMapping(value = "/post", method = RequestMethod.GET)
    public String viewPostPages(ModelMap map) {
        return "post";
    }
}
