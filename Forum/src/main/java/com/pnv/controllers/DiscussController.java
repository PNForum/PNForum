package com.pnv.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.pnv.dao.BaiDangHoacTraoDoiDAO;
import com.pnv.models.BaiDangHoacTraoDoi;


@Controller
public class DiscussController {

	@Autowired
	private BaiDangHoacTraoDoiDAO baiDangDao;
	
	public DiscussController() {
    }
	
	@RequestMapping(value = "/discuss", method = RequestMethod.GET)
    public String viewDiscussPage(ModelMap map) {
		List<BaiDangHoacTraoDoi> baidangList = baiDangDao.findAll();
        map.put("baidangList", baidangList);
        return "discuss";
    }
}
