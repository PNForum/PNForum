package com.pnv.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pnv.dao.BaiDangHoacTraoDoiDAO;
import com.pnv.dao.ChuDeDao;
import com.pnv.models.BaiDangHoacTraoDoi;
import com.pnv.models.ChuDe;

@Controller
public class DiscussController {

	@Autowired
	private BaiDangHoacTraoDoiDAO baiDangDao;
	private ChuDeDao chudeDao;
	
	public DiscussController() {
    }
	
	@RequestMapping(value = "/discuss", method = RequestMethod.GET)
    public String viewDiscussPage(ModelMap map) {
		List<BaiDangHoacTraoDoi> baidangList = baiDangDao.displayByBestView();
        map.put("baidangList", baidangList);
        
        List<BaiDangHoacTraoDoi> diplayByLike = baiDangDao.displayByBestLikee();
        map.put("diplayByLike", diplayByLike);
        
        List<BaiDangHoacTraoDoi> diplaybyDate = baiDangDao.displayByBestLikee();
        map.put("diplaybyDate", diplayByLike);
        return "discuss";
    }
	
	@RequestMapping(value = "/getbyId", method = RequestMethod.GET)
    public String getProductByType(@RequestParam(value = "id", required = true) int id, ModelMap map) {
        BaiDangHoacTraoDoi baiDangListById = baiDangDao.findByBaiDangId(id);
        map.addAttribute("baiDangListById", baiDangListById);
        return "detail_pages";
    }

	@RequestMapping(value = "/post", method = RequestMethod.GET)
    public String viewWelcomePage(ModelMap map) {
        return "post";
    }
}
