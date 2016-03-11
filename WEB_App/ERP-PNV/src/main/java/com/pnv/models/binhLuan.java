package com.pnv.models;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.DateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "binh_luan")



public class binhLuan implements java.io.Serializable{
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_thong_tin_ca_nhan", referencedColumnName = "id", nullable = false)
	@JsonIgnore
	private thongTinCaNhan thong_tin_ca_nhan;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_bai_dang_hoac_trao_doi", referencedColumnName = "id", nullable = false)
	@JsonIgnore
	private baiDangHoacTraoDoi  bai_dang_hoac_trao_doi;
	
	@Column(name = "noi_dung", nullable = false, length = 1000)
	@NotEmpty
	private String noi_dung;
	
	@Column(name = "ten_nguoi_binh_luan", nullable = false, length = 45)
	@NotEmpty
	private String ten_nguoi_binh_luan;
	
	@Column(name = "binh_luan_con", nullable = false)
	@NotEmpty
	private Boolean binh_luan_con;
	
	@Column(name = "ngay", nullable = false)
	@NotEmpty
	private DateTime ngay;
	
	@Column(name = "spam", nullable = false)
	@NotEmpty
	private Integer spam;
	
	@Column(name = "is_active", nullable = false)
	@NotEmpty
	private Integer is_active;

	public binhLuan() {
		super();
	}

	public binhLuan(Integer id, thongTinCaNhan thong_tin_ca_nhan, baiDangHoacTraoDoi bai_dang_hoac_trao_doi,
			String noi_dung, String ten_nguoi_binh_luan, Boolean binh_luan_con, DateTime ngay, Integer spam,
			Integer is_active) {
		super();
		this.id = id;
		this.thong_tin_ca_nhan = thong_tin_ca_nhan;
		this.bai_dang_hoac_trao_doi = bai_dang_hoac_trao_doi;
		this.noi_dung = noi_dung;
		this.ten_nguoi_binh_luan = ten_nguoi_binh_luan;
		this.binh_luan_con = binh_luan_con;
		this.ngay = ngay;
		this.spam = spam;
		this.is_active = is_active;
	}
	
	
	
	
	

}
