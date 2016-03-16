package com.pnv.dao;

import java.util.List;

import com.pnv.models.BaiDangHoacTraoDoi;
import com.pnv.models.BinhLuan;

public interface BaiDangHoacTraoDoiDAO {
 
	public void saveOrUpdate(BaiDangHoacTraoDoi bdhtd);

    public void delete(BaiDangHoacTraoDoi bdhtd);

    public BaiDangHoacTraoDoi findByBaiDangId(int id);
    
	public List<BaiDangHoacTraoDoi> findAll();
	 
	public List<BaiDangHoacTraoDoi> displayByBestView();
	
	public List<BaiDangHoacTraoDoi> displayByBestLikee();
	
	public List<BaiDangHoacTraoDoi> displayPostLatest();
	
	public List<BaiDangHoacTraoDoi> PostSimilar(int id_chu_de);

}
