package com.pnv.dao;

import java.util.List;

import com.pnv.models.LoaiTepTin;

public interface LoaiTepTinDao {

	public void saveOrUpdate(LoaiTepTin ltt);

    public void delete(LoaiTepTin ltt);

    public List<LoaiTepTin> findAll();

    public LoaiTepTin findByDepartmentId(int id);
}
