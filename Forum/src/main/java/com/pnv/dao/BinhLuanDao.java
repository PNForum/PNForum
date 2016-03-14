package com.pnv.dao;

import java.util.List;

import com.pnv.models.BinhLuan;


public interface BinhLuanDao {

	public void saveOrUpdate(BinhLuan bl);

    public void delete(BinhLuan bl);

    public List<BinhLuan> findAll();

    public BinhLuan findByDepartmentId(int id);
}
