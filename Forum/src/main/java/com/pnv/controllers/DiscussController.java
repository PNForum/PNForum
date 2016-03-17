package com.pnv.controllers;

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

import com.pnv.dao.BaiDangHoacTraoDoiDAO;
import com.pnv.dao.BinhLuanDao;
import com.pnv.dao.ChuDeDao;
import com.pnv.models.BaiDangHoacTraoDoi;
import com.pnv.models.BinhLuan;
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
        
        List<BaiDangHoacTraoDoi> diplaybyDate = baiDangDao.displayPostLatest();
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
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
    public String viewWelcomePage(ModelMap map) {
		
		BaiDangHoacTraoDoi postNew = new BaiDangHoacTraoDoi();
		map.addAttribute("postNew",postNew);
		
        return "post";
    }
	
	@RequestMapping(value ="/add", method = RequestMethod.POST)
	public String addNewPost (@Valid @ModelAttribute("postNew") BaiDangHoacTraoDoi postNew,
			BindingResult result, ModelMap map, @RequestParam("file") MultipartFile file, HttpServletRequest request) throws IOException {

        
		
//		if (result.hasErrors()) {
//	        System.out.println("lỗi = "+ result.getErrorCount()); 
//
//	            map.addAttribute("postNew", postNew);
//	            return "post";
//	        }
	        if (!file.isEmpty()) {

	            HttpSession session = request.getSession();
	            ServletContext sc = session.getServletContext();
	            String imagePath = sc.getRealPath("/") + "resources/images/";

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

	                postNew.setAnh(file.getOriginalFilename());
	            }
	        }
	        postNew.setThe_loai_bai(1);
	        baiDangDao.saveOrUpdate(postNew);
	        List<BaiDangHoacTraoDoi> baidangList = baiDangDao.displayByBestView();
	        map.put("baidangList", baidangList);

	        return "post";	
		
	}	


}