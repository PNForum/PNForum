package com.pnv.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;

@SuppressWarnings("serial")
@Entity
@Table(name = "BAI_DANG_HOAC_TRAO_DOI")
public class BaiDangHoacTraoDoi implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "id", unique = true, nullable = false)
	 private Integer id;
	 
	 @JsonIgnore
	 @OneToMany(fetch = FetchType.EAGER, mappedBy = "bai_dang_hoac_trao_doi")
	 private List<BinhLuan> binh_luan;
	 
	 @JsonIgnore
	 @OneToMany(fetch = FetchType.EAGER, mappedBy = "bai_dang_hoac_trao_doi")
	 private List<DinhKem> dinh_kem;
	 
	 @ManyToOne(fetch = FetchType.EAGER)
	 @JoinColumn(name = "id_chu_de", referencedColumnName = "id", nullable = false)
	 @JsonIgnore
	 private ChuDe chu_de;
	 
	 @Column(name = "tieu_de", nullable = false, length = 255)
	 @NotEmpty
	 private String tieu_de;
	 
	 @Column(name  ="the_loai_bai", nullable  =false)
	 @NotEmpty
	 private Integer the_loai_bai;
	 
	 @Column(name = "noi_dung", nullable = false, length = 20000)
	 @NotEmpty
	 private String noi_dung;
	 
	 @Column(name = "luot_thich", nullable = false)
	 @NotEmpty
	 private Integer luot_thich;
	 
	 @Column(name = "ngay_dang_bai", nullable = false)
	 @NotEmpty
	 private String ngay_dang_bai;
	 
	 @Column(name ="spam", nullable = false)
	 @NotEmpty
	 private Integer spam;
	 
	 @Column(name ="is_active", nullable = false)
	 @NotEmpty
	 private Integer isActive;

	

	public BaiDangHoacTraoDoi(Integer id, List<BinhLuan> binh_luan, List<DinhKem> dinh_kem, ChuDe chu_de,
			String tieu_de, Integer the_loai_bai, String noi_dung, Integer luot_thich, String ngay_dang_bai,
			Integer spam, Integer isActive) {
		this.id = id;
		this.binh_luan = binh_luan;
		this.dinh_kem = dinh_kem;
		this.chu_de = chu_de;
		this.tieu_de = tieu_de;
		this.the_loai_bai = the_loai_bai;
		this.noi_dung = noi_dung;
		this.luot_thich = luot_thich;
		this.ngay_dang_bai = ngay_dang_bai;
		this.spam = spam;
		this.isActive = isActive;
	}

	public BaiDangHoacTraoDoi() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<BinhLuan> getBinh_luan() {
		return binh_luan;
	}

	public void setBinh_luan(List<BinhLuan> binh_luan) {
		this.binh_luan = binh_luan;
	}

	public List<DinhKem> getDinh_kem() {
		return dinh_kem;
	}

	public void setDinh_kem(List<DinhKem> dinh_kem) {
		this.dinh_kem = dinh_kem;
	}

	public ChuDe getChu_de() {
		return chu_de;
	}

	public void setChu_de(ChuDe chu_de) {
		this.chu_de = chu_de;
	}

	public String getTieu_de() {
		return tieu_de;
	}

	public void setTieu_de(String tieu_de) {
		this.tieu_de = tieu_de;
	}

	public Integer getThe_loai_bai() {
		return the_loai_bai;
	}

	public void setThe_loai_bai(Integer the_loai_bai) {
		this.the_loai_bai = the_loai_bai;
	}
	
	public String getNoi_dung() {
		return noi_dung;
	}

	public void setNoi_dung(String noi_dung) {
		this.noi_dung = noi_dung;
	}

	public Integer getLuot_thich() {
		return luot_thich;
	}

	public void setLuot_thich(Integer luot_thich) {
		this.luot_thich = luot_thich;
	}

	public String getNgay_dang_bai() {
		return ngay_dang_bai;
	}

	public void setNgay_dang_bai(String ngay_dang_bai) {
		this.ngay_dang_bai = ngay_dang_bai;
	}

	public Integer getSpam() {
		return spam;
	}

	public void setSpam(Integer spam) {
		this.spam = spam;
	}

	public Integer getIsActive() {
		return isActive;
	}

	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}

	
	 
	 
}
