package com.pnv.dao;

import java.util.List;
import com.pnv.models.BaiDangHoacTraoDoi;

public interface BaiDangHoacTraoDoiDAO {

	 public void saveOrUpdate(BaiDangHoacTraoDoi baiDangHoacTraoDoi);

	    public void delete(BaiDangHoacTraoDoi baiDangHoacTraoDoi);

	    public List<BaiDangHoacTraoDoi> findAll();

	    public BaiDangHoacTraoDoi findBybaiDangHoacTraoDoiId(int id);

	    public BaiDangHoacTraoDoi findBybaiDangHoacTraoDoiTitle(String tieu_de);
}
