/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pnv.api.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pnv.dao.TitlesDao;
import com.pnv.models.ResponseStatus;
import com.pnv.models.Titles;



/**
 *
 * @author Administrator
 */
@Controller
@RequestMapping(value = "api/title")
public class TitleApiController {

    private static final Logger logger = LoggerFactory.getLogger(TitleApiController.class);
	
    @Autowired
    private TitlesDao titlesDao;
    
    @Autowired
    private ResponseStatus responseStatus;

    public TitleApiController() {
    }

    @RequestMapping(method = RequestMethod.GET )
    public @ResponseBody    List<Titles> getTitles() {

        /**
         * Get all titles
         */ 
        List<Titles> titles_list = titlesDao.findAll();
        
        return titles_list;
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public @ResponseBody    ResponseStatus getTitleByID( @PathVariable(value = "id") Integer id) {        
       
    	
    	try {
        
        	responseStatus.setDataObject(titlesDao.findByTitleId(id));	
        } catch (Exception ex) {
        	responseStatus.setStatus(0);
        	responseStatus.setMessage(ex.getMessage());
     	   System.out.println(ex.getMessage()) ;
     	   
     	   return responseStatus;
        } 
    
    	responseStatus.setStatus(1);
        return responseStatus;
    	
    }
    
    
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public @ResponseBody   ResponseStatus doDeleteTitle(@PathVariable("id") Integer id) {
    
    	try {
        	titlesDao.delete(titlesDao.findByTitleId(id));
        	
        } catch (Exception ex) {
        	responseStatus.setStatus(0);
        	responseStatus.setMessage(ex.getMessage());
     	   System.out.println(ex.getMessage()) ;
     	   
     	   return responseStatus;
        } 
    	responseStatus.setStatus(1);
        return responseStatus;

    }
    
    @RequestMapping(value = "/addnew", method = RequestMethod.POST)
    @ResponseBody
    public ResponseStatus addTitle( @RequestBody Titles title) {
        
    	  logger.debug("I am in the controller and got title name: " + title.toString());
	      try { 
	          titlesDao.saveOrUpdate(title);
	          responseStatus.setDataObject(title);
	       } catch (Exception ex) {
	    	   responseStatus.setStatus(0);
	    	   responseStatus.setMessage(ex.getMessage());
	    	   System.out.println(ex.getMessage()) ;
	    	   
	    	   return responseStatus;
	       } 
	       
	      responseStatus.setStatus(1);
	      return responseStatus;
    }

    
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    @ResponseBody
    public ResponseStatus editTitle( @RequestBody Titles title) {
       
    	logger.debug("I am in the controller and got title name: " + title.toString());
	      try { 
	         titlesDao.saveOrUpdate(title);
	         responseStatus.setDataObject(title);
	       } catch (Exception ex) {
	    	   responseStatus.setStatus(0);
	    	   responseStatus.setMessage(ex.getMessage());
	    	   System.out.println(ex.getMessage()) ;
	    	   
	    	   return responseStatus;
	       } 
       
      responseStatus.setStatus(1);
      return responseStatus;
    }
}
