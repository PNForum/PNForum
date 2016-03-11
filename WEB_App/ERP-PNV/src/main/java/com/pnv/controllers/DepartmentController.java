/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pnv.controllers;

import com.pnv.dao.DepartmentDao;
import com.pnv.models.Departments;
import com.pnv.utils.Constant;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Administrator
 */
@Controller
@RequestMapping(value = "/department")
public class DepartmentController {

    @Autowired
    private DepartmentDao departmentDao;

    public DepartmentController() {
    }

    @RequestMapping(method = RequestMethod.GET)
    public String viewDepartmentPage(ModelMap map) {
        /**
         * Get all titles
         */
        List<Departments> departments_list = departmentDao.findAll();
        map.put("departments_list", departments_list);
        return "about_us";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String viewEditTitlePage(@RequestParam(value = "id", required = true) int id, ModelMap map) {

        Departments departmentForm = departmentDao.findByDepartmentId(id);
        map.addAttribute("departmentForm", departmentForm);
        return "department-add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String viewAddNewPage(ModelMap map) {

        Departments departmentForm = new Departments();
        map.addAttribute("departmentForm", departmentForm);
        return "department-add";

    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String doAddNew(@Valid @ModelAttribute("departmentForm") Departments departmentForm,
            BindingResult result, ModelMap map, @RequestParam("file") MultipartFile file, HttpServletRequest request) throws IOException {

        if (result.hasErrors()) {
            map.addAttribute("departmentForm", departmentForm);
            return "department-add";
        }

        if (!file.isEmpty()) {
            HttpSession session = request.getSession();
            ServletContext sc = session.getServletContext();
            String imagePath = sc.getRealPath("/") + "resources/deparment-images/";

            File theDir = new File(imagePath);

                // if the directory does not exist, create it
            if (!theDir.exists()) {
                System.out.println("creating directory: " + imagePath);
                boolean isCreated = false;

                try {
                    theDir.mkdir();
                    isCreated = true;
                } catch (SecurityException se) {
                    //handle it
                }
                if (isCreated) {
                    System.out.println("DIR created");
                }
            }

            System.out.println("====imagePath=========");
            System.out.println(imagePath);
            System.out.println("=============");
            InputStream inputStream = null;
            OutputStream outputStream = null;
            if (file.getSize() > 0) {
                inputStream = file.getInputStream();
                File newFile = new File(imagePath + file.getOriginalFilename());
                if (!newFile.exists()) {
                    newFile.createNewFile();
                }
                // File realUpload = new File("C:/");
                outputStream = new FileOutputStream(imagePath
                        + file.getOriginalFilename());
                System.out.println("====22=========");
                System.out.println(file.getOriginalFilename());
                System.out.println("=============");
                int readBytes = 0;
                byte[] buffer = new byte[8192];
                while ((readBytes = inputStream.read(buffer, 0, 8192)) != -1) {
                    System.out.println("===ddd=======");
                    outputStream.write(buffer, 0, readBytes);
                }
                outputStream.close();
                inputStream.close();
                
                /**
                 * 
                    set image to model
                */
                departmentForm.setImage(file.getOriginalFilename());
            }
        }
        departmentDao.saveOrUpdate(departmentForm);

        /**
         * Get all titles
         */
        List<Departments> departments_list = departmentDao.findAll();
        map.put("departments_list", departments_list);
        map.addAttribute("add_success", "ok");

        return "department";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String doDeleteTitle(@RequestParam(value = "id", required = true) int id, ModelMap map
    ) {

        departmentDao.delete(departmentDao.findByDepartmentId(id));

        return Constant.REDIRECT + "/department";

    }

}
