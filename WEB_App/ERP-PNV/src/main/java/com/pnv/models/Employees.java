package com.pnv.models;
// Generated Apr 24, 2015 4:37:16 PM by Hibernate Tools 4.3.1

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

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Employees generated by hbm2java
 */
@Entity
@Table(name = "employees"
)
public class Employees implements java.io.Serializable {

@Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "department_id", referencedColumnName = "id", nullable = false)
    @JsonIgnore
    private Departments departments;

@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "title_id", referencedColumnName = "id", nullable = false)
    @JsonIgnore
    private Titles titles;

@Column(name = "emp_name")
    @NotEmpty
    private String empName;

@Column(name = "address", length = 50)
    private String address;
    
    @Column(name = "department_id", insertable = false, updatable = false)
    private Integer department_id;
    
     @Column(name = "title_id", insertable = false, updatable = false)
    private Integer title_id;
    
    public Employees() {
    }

    public Employees(Departments departments, Titles titles, String empName, String address) {
        this.departments = departments;
        this.titles = titles;
        this.empName = empName;
        this.address = address;
    }

        public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    
        public Departments getDepartments() {
        return this.departments;
    }

    public void setDepartments(Departments departments) {
        this.departments = departments;
    }

    
        public Titles getTitles() {
        return this.titles;
    }

    public void setTitles(Titles titles) {
        this.titles = titles;
    }

        public String getEmpName() {
        return this.empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

        public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public Integer getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Integer department_id) {
        this.department_id = department_id;
    }

    public Integer getTitle_id() {
        return title_id;
    }

    public void setTitle_id(Integer title_id) {
        this.title_id = title_id;
    }
}