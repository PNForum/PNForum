package com.pnv.dao;

import java.util.List;
import com.pnv.models.TaiKhoan;

public interface TaiKhoanDao {

	public void saveOrUpdate(TaiKhoan tk);

    public void delete(TaiKhoan tk);

    public List<TaiKhoan> findAll();

    public TaiKhoan findByDepartmentId(int id);
}
