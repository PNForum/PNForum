package com.pnv.models;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "employees")

public class dinhKem implements Serializable{

	@Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_bai_dang_hoac_trao_doi", referencedColumnName = "id", nullable = false)
    @JsonIgnore
    private baiDangHoacTraoDoi bai_dang_hoac_trao_doi;

	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_loai_tep_tin", referencedColumnName = "id", nullable = false)
    @JsonIgnore
    private loaiTepTin loai_tep_tin;
	
	@Column(name = "address", length = 100)
	@NotEmpty
    private String tep_tin;

	public dinhKem(Integer id, baiDangHoacTraoDoi bai_dang_hoac_trao_doi, loaiTepTin loai_tep_tin, String tep_tin) {
		super();
		this.id = id;
		this.bai_dang_hoac_trao_doi = bai_dang_hoac_trao_doi;
		this.loai_tep_tin = loai_tep_tin;
		this.tep_tin = tep_tin;
	}

	public dinhKem() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public baiDangHoacTraoDoi getBai_dang_hoac_trao_doi() {
		return bai_dang_hoac_trao_doi;
	}

	public void setBai_dang_hoac_trao_doi(baiDangHoacTraoDoi bai_dang_hoac_trao_doi) {
		this.bai_dang_hoac_trao_doi = bai_dang_hoac_trao_doi;
	}

	public loaiTepTin getLoai_tep_tin() {
		return loai_tep_tin;
	}

	public void setLoai_tep_tin(loaiTepTin loai_tep_tin) {
		this.loai_tep_tin = loai_tep_tin;
	}

	public String getTep_tin() {
		return tep_tin;
	}

	public void setTep_tin(String tep_tin) {
		this.tep_tin = tep_tin;
	}
	
	
	
}
