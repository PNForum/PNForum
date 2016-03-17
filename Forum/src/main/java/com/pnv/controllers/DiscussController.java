package com.pnv.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pnv.dao.BaiDangHoacTraoDoiDAO;
import com.pnv.dao.BinhLuanDao;
import com.pnv.dao.ChuDeDao;
import com.pnv.models.BaiDangHoacTraoDoi;
import com.pnv.models.BinhLuan;
import com.pnv.models.ChuDe;

@Controller
public class DiscussController {

	@Autowired
	private BaiDangHoacTraoDoiDAO baiDangDao;
	
	@Autowired
	private ChuDeDao chudeDao;
	
	@Autowired
	private BinhLuanDao binhLuanDao;
	
	public DiscussController() {
    }
	
	@RequestMapping(value = "/discuss", method = RequestMethod.GET)
    public String viewDiscussPage(ModelMap map) {
		List<BaiDangHoacTraoDoi> baidangList = baiDangDao.displayByBestView();
        map.put("baidangList", baidangList);
        
        List<BaiDangHoacTraoDoi> diplayByLike = baiDangDao.displayByBestLikee();
        map.put("diplayByLike", diplayByLike);
        
        List<BaiDangHoacTraoDoi> diplaybyDate = baiDangDao.displayByBestLikee();
        map.put("diplaybyDate", diplaybyDate);
        return "discuss";
    }
	
	public String viewDetailPage(@RequestParam(value = "id", required = true) int id_chu_de, ModelMap map) {
        List<BaiDangHoacTraoDoi> ByLike = baiDangDao.displayByBestLikee();
        map.put("ByLike", ByLike);
        
        List<BaiDangHoacTraoDoi> byDate = baiDangDao.displayPostLatest();
        map.put("byDate", byDate);
        
        List<BaiDangHoacTraoDoi> similarPost = baiDangDao.PostSimilar(id_chu_de);
        map.put("similarPost", similarPost);
        return "detail_pages";
    }
	
	@RequestMapping(value = "/getbyId", method = RequestMethod.GET)
    public String getProductByType(@RequestParam(value = "id", required = true) int id, ModelMap map) {
        BaiDangHoacTraoDoi baiDangListById = baiDangDao.findByBaiDangId(id);
        map.addAttribute("baiDangListById", baiDangListById);

        List<BinhLuan> blList = binhLuanDao.getBinhLuan(id);
        map.put("blList", blList);
        return "detail_pages";
    }

	@RequestMapping(value = "/post", method = RequestMethod.GET)
    public String viewWelcomePage(ModelMap map) {
        return "post";
    }
}
