package com.pnv.models;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "tai_khoan")
public class TaiKhoan{
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name ="id", unique = true, nullable = false)
	 private Integer id;
	 
	 @Column(name ="user_name", length = 45)
	 private String user_name;
	 
	 @Column(name = "password", nullable = false, length = 45)
	 @NotEmpty
	 private String password;
	 
	 @Column(name = "quyen", nullable = false)
	 private Integer quyen;
	 
	 @Column(name = "is_active", nullable = false)
	 private Integer is_active;

	 @OneToOne(fetch = FetchType.LAZY, mappedBy = "tk", cascade = CascadeType.ALL)
	 private ThongTinCaNhan ttcn;

	 public TaiKhoan() {
	 }

	public TaiKhoan(Integer id, String user_name, String password, Integer quyen, Integer is_active,
			ThongTinCaNhan ttcn) {
		this.id = id;
		this.user_name = user_name;
		this.password = password;
		this.quyen = quyen;
		this.is_active = is_active;
		this.ttcn = ttcn;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getQuyen() {
		return quyen;
	}

	public void setQuyen(Integer quyen) {
		this.quyen = quyen;
	}

	public Integer getIs_active() {
		return is_active;
	}

	public void setIs_active(Integer is_active) {
		this.is_active = is_active;
	}

	public ThongTinCaNhan getTtcn() {
		return ttcn;
	}

	public void setTtcn(ThongTinCaNhan ttcn) {
		this.ttcn = ttcn;
	}

	
	 
	}

	
