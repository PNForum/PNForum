/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pnv.dao;

import com.pnv.models.ChuDe;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface ChuDeDao {

    public void saveOrUpdate(ChuDe c);

    public void delete(ChuDe c);

    public List<ChuDe> findAll();

    public ChuDe findByDepartmentId(int id);
    
}
