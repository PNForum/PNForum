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

import com.fasterxml.jackson.annotation.JsonIgnore;;

@Entity
@Table(name = "binh_luan")
public class BinhLuan{

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	
	@ManyToOne(fetch = FetchType.EAGER, targetEntity = ThongTinCaNhan.class)
	@JoinColumn(name = "id_thong_tin_ca_nhan", referencedColumnName = "id", nullable = false)
	@JsonIgnore
	private ThongTinCaNhan thong_tin_ca_nhan;
	
	@ManyToOne(fetch = FetchType.EAGER, targetEntity = BaiDangHoacTraoDoi.class)
	@JoinColumn(name = "id_bai_dang_hoac_trao_doi", referencedColumnName = "id" )
	@JsonIgnore
	private BaiDangHoacTraoDoi  bai_dang_hoac_trao_doi;

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
	private String ngay;
	
	@Column(name = "spam", nullable = false)
	@NotEmpty
	private Integer spam;
	
	@Column(name = "is_active", nullable = false)
	@NotEmpty
	private Integer is_active;

	public BinhLuan(Integer id, ThongTinCaNhan thong_tin_ca_nhan, BaiDangHoacTraoDoi bai_dang_hoac_trao_doi,
			String noi_dung, String ten_nguoi_binh_luan, Boolean binh_luan_con, String ngay, Integer spam,
			Integer is_active) {
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

	public BinhLuan() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ThongTinCaNhan getThong_tin_ca_nhan() {
		return thong_tin_ca_nhan;
	}

	public void setThong_tin_ca_nhan(ThongTinCaNhan thong_tin_ca_nhan) {
		this.thong_tin_ca_nhan = thong_tin_ca_nhan;
	}

	public BaiDangHoacTraoDoi getBai_dang_hoac_trao_doi() {
		return bai_dang_hoac_trao_doi;
	}

	public void setBai_dang_hoac_trao_doi(BaiDangHoacTraoDoi bai_dang_hoac_trao_doi) {
		this.bai_dang_hoac_trao_doi = bai_dang_hoac_trao_doi;
	}

	public String getNoi_dung() {
		return noi_dung;
	}

	public void setNoi_dung(String noi_dung) {
		this.noi_dung = noi_dung;
	}

	public String getTen_nguoi_binh_luan() {
		return ten_nguoi_binh_luan;
	}

	public void setTen_nguoi_binh_luan(String ten_nguoi_binh_luan) {
		this.ten_nguoi_binh_luan = ten_nguoi_binh_luan;
	}

	public Boolean getBinh_luan_con() {
		return binh_luan_con;
	}

	public void setBinh_luan_con(Boolean binh_luan_con) {
		this.binh_luan_con = binh_luan_con;
	}

	public String getNgay() {
		return ngay;
	}

	public void setNgay(String ngay) {
		this.ngay = ngay;
	}

	public Integer getSpam() {
		return spam;
	}

	public void setSpam(Integer spam) {
		this.spam = spam;
	}

	public Integer getIs_active() {
		return is_active;
	}

	public void setIs_active(Integer is_active) {
		this.is_active = is_active;
	}
	
	
}
