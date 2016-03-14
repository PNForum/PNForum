package com.pnv.models;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "chude")
public class ChuDe {
	 @Id
	    @GeneratedValue(strategy = IDENTITY)
	    @Column(name = "id", unique = true, nullable = false)
	    private Integer id;
	 
	 @Column(name = "name", length = 45)
	    @NotEmpty
	    private String chu_de;
		@OneToMany(fetch = FetchType.EAGER, mappedBy = "chu_de")
		private List<BaiDangHoacTraoDoi> bai_dang_trao_doi;

	

	public ChuDe(Integer id, String chu_de, List<BaiDangHoacTraoDoi> bai_dang_trao_doi) {
			this.id = id;
			this.chu_de = chu_de;
			this.bai_dang_trao_doi = bai_dang_trao_doi;
		}

	public ChuDe() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getChu_de() {
		return chu_de;
	}

	public void setChu_de(String chu_de) {
		this.chu_de = chu_de;
	}

	public List<BaiDangHoacTraoDoi> getBai_dang_trao_doi() {
		return bai_dang_trao_doi;
	}

	public void setBai_dang_trao_doi(List<BaiDangHoacTraoDoi> bai_dang_trao_doi) {
		this.bai_dang_trao_doi = bai_dang_trao_doi;
	}
	 
	
	 

}
