package com.pnv.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pnv.dao.BinhLuanDao;
import com.pnv.dao.ForumDao;
import com.pnv.models.BaiDangHoacTraoDoi;
import com.pnv.models.BinhLuan;

@Controller
public class ForumControllers {
	
	@Autowired
	private ForumDao traoDoiDao;
	
	@Autowired
	private BinhLuanDao binhLuanDao;
	
	 public ForumControllers() {
	 }
    
	 @RequestMapping(value = "/forum", method = RequestMethod.GET)
	 public String viewForumPage(ModelMap map){
		 List<BaiDangHoacTraoDoi> traodoiList =traoDoiDao.findAll();
		 map.put("traodoiList", traodoiList);
		 
		 return "forum";
	 		 
	 }
	 	 	        
	 @RequestMapping(value = "/getbyId1", method = RequestMethod.GET)
	    public String getProductByType(@RequestParam(value = "id", required = true) int id, ModelMap map) {
	        BaiDangHoacTraoDoi baiDangListById = traoDoiDao.findByBaiDangId(id);
	        map.addAttribute("baiDangListById", baiDangListById);
	        
	        List<BinhLuan> blList = binhLuanDao.getBinhLuan(id);
	        map.put("blList", blList);	      
	        return "detail_forum";
	    }
	 
	 
	 }
