package com.pnv.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "thong_tin_ca_nhan")
public class ThongTinCaNhan{
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "id", unique = true, nullable = false)
	 private Integer id;
	 
	 @Column(name = "ten", nullable = false, length = 45)
	 @NotEmpty
	 private String ten;
	 
	 @Column(name = "tuoi", nullable = false, length = 11)
	 private Integer tuoi;
	 
	 @Column(name = "lop", nullable = false, length = 45)
	 @NotEmpty
	 private String lop;
	 
	 @Column(name = "dia_chi", nullable = false, length = 80)
	 @NotEmpty
	 private String dia_chi;
	 
	 @Column(name ="email", nullable = false, length= 60)
	 @NotEmpty
	 private String email;
	 
	 @Column(name = "avatar", nullable = false, length = 100)
	 @NotEmpty
	 private String avatar;
	 
	 @OneToOne(fetch = FetchType.LAZY)
	 @PrimaryKeyJoinColumn
	 TaiKhoan tk;
	 
	 @OneToMany(fetch = FetchType.EAGER, mappedBy = "thong_tin_ca_nhan")
	 private List<BinhLuan> binh_luan;

	

	public ThongTinCaNhan(Integer id, String ten, Integer tuoi, String lop, String dia_chi, String email, String avatar,
			TaiKhoan tk, List<BinhLuan> binh_luan) {
		super();
		this.id = id;
		this.ten = ten;
		this.tuoi = tuoi;
		this.lop = lop;
		this.dia_chi = dia_chi;
		this.email = email;
		this.avatar = avatar;
		this.tk = tk;
		this.binh_luan = binh_luan;
	}

	public ThongTinCaNhan() {
	}

	
	public List<BinhLuan> getBinh_luan() {
		return binh_luan;
	}

	public void setBinh_luan(List<BinhLuan> binh_luan) {
		this.binh_luan = binh_luan;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public Integer getTuoi() {
		return tuoi;
	}

	public void setTuoi(Integer tuoi) {
		this.tuoi = tuoi;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public String getDia_chi() {
		return dia_chi;
	}

	public void setDia_chi(String dia_chi) {
		this.dia_chi = dia_chi;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public TaiKhoan getTk() {
		return tk;
	}

	public void setTk(TaiKhoan tk) {
		this.tk = tk;
	}
	 
	 
}
