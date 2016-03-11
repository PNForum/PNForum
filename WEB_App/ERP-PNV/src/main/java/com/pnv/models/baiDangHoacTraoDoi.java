package com.pnv.models;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.DateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "bai_dang_hoac_trao_doi")

public class baiDangHoacTraoDoi implements java.io.Serializable{
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "bai_dang_hoac_trao_doi")
	private List<binhLuan> binh_luan;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "bai_dang_hoac_trao_doi")
	private List<dinhKem> dinh_kem;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_chu_de", referencedColumnName = "id", nullable = false)
	@JsonIgnore
	private chuDe chu_de;
	
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
	private DateTime ngay_dang_bai;
	
	@Column(name ="spam", nullable = false)
	@NotEmpty
	private Integer spam;
	
	@Column(name ="isActive", nullable = false)
	@NotEmpty
	private Integer isActive;
	
	

	public baiDangHoacTraoDoi() {
		super();
	}

	
	
	public baiDangHoacTraoDoi(Integer id, chuDe chu_de, String tieu_de, Integer the_loai_bai, String noi_dung,
			Integer luot_thich, DateTime ngay_dang_bai, Integer spam, Integer isActive) {
		super();
		this.id = id;
		this.chu_de = chu_de;
		this.tieu_de = tieu_de;
		this.the_loai_bai = the_loai_bai;
		this.noi_dung = noi_dung;
		this.luot_thich = luot_thich;
		this.ngay_dang_bai = ngay_dang_bai;
		this.spam = spam;
		this.isActive = isActive;
	}



	public baiDangHoacTraoDoi(Integer id, List<binhLuan> binh_luan, List<dinhKem> dinh_kem, chuDe chu_de,
			String tieu_de, Integer the_loai_bai, String noi_dung, Integer luot_thich, DateTime ngay_dang_bai,
			Integer spam, Integer isActive) {
		super();
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



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<binhLuan> getBinh_luan() {
		return binh_luan;
	}

	public void setBinh_luan(List<binhLuan> binh_luan) {
		this.binh_luan = binh_luan;
	}

	public List<dinhKem> getDinh_kem() {
		return dinh_kem;
	}

	public void setDinh_kem(List<dinhKem> dinh_kem) {
		this.dinh_kem = dinh_kem;
	}

	public chuDe getChu_de() {
		return chu_de;
	}

	public void setChu_de(chuDe chu_de) {
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

	public DateTime getNgay_dang_bai() {
		return ngay_dang_bai;
	}

	public void setNgay_dang_bai(DateTime ngay_dang_bai) {
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
