package com.pnv.models;

import java.util.List;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "loai_tep_tin")
public class LoaiTepTin {
		@Id
	    @GeneratedValue(strategy = IDENTITY)
	    @Column(name = "id", unique = true, nullable = false)
	    private Integer id;
		
		@OneToMany(fetch = FetchType.EAGER, mappedBy = "loai_tep_tin")
	    private List<DinhKem> dinh_kem;
	    
	    @Column(name = "ten_loai_tep", length = 45)
	    @NotEmpty
	    private String ten_loai_tep;

		public LoaiTepTin(Integer id, List<DinhKem> dinh_kem, String ten_loai_tep) {
			this.id = id;
			this.dinh_kem = dinh_kem;
			this.ten_loai_tep = ten_loai_tep;
		}

		public LoaiTepTin() {
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public List<DinhKem> getDinh_kem() {
			return dinh_kem;
		}

		public void setDinh_kem(List<DinhKem> dinh_kem) {
			this.dinh_kem = dinh_kem;
		}

		public String getTen_loai_tep() {
			return ten_loai_tep;
		}

		public void setTen_loai_tep(String ten_loai_tep) {
			this.ten_loai_tep = ten_loai_tep;
		}
	    
	    
}
