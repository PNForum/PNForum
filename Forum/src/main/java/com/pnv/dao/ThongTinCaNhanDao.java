/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pnv.dao;
import com.pnv.models.ThongTinCaNhan;

import java.util.List;

/**
 *
 * @author Administrator
 */
public interface ThongTinCaNhanDao {

    public void saveOrUpdate(ThongTinCaNhan ttcn);

    public void delete(ThongTinCaNhan ttcn);

    public List<ThongTinCaNhan> findAll();

    public ThongTinCaNhan findByDepartmentId(int id);
    
}
