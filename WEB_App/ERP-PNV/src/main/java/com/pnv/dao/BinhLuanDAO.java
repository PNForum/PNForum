package com.pnv.dao;

import java.util.List;

import com.pnv.models.BinhLuan;

public interface BinhLuanDAO {

	public void saveOrUpdate(BinhLuan binhLuan);
	
	public void delete(BinhLuan binhLuan);
	
	public List<BinhLuan> findAll();
}
