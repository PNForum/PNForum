package com.pnv.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pnv.dao.ForumDao;
import com.pnv.models.BaiDangHoacTraoDoi;

@Controller
public class ForumControllers {
	
	@Autowired
	private ForumDao traoDoiDao;
	
	 public ForumControllers() {
	 }
    
	 @RequestMapping(value = "/forum", method = RequestMethod.GET)
	 public String viewForumPage(ModelMap map){
		 List<BaiDangHoacTraoDoi> traodoiList =traoDoiDao.findAll();
		 map.put("traodoiList", traodoiList);
		 
		 return "forum";
	 
		 

	 }
	 
	 }
