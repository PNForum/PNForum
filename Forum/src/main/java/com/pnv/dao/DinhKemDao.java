/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pnv.dao;

import com.pnv.models.DinhKem;

import java.util.List;

/**
 *
 * @author Administrator
 */
public interface DinhKemDao {

    public void saveOrUpdate(DinhKem dk);

    public void delete(DinhKem dk);

    public List<DinhKem> findAll();

    public DinhKem findByDepartmentId(int id);
    
}
