package com.pnv.models;
// Generated Apr 24, 2015 4:37:16 PM by Hibernate Tools 4.3.1

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Departments generated by hbm2java
 */
@Entity
@Table(name = "departments"
)
public class Departments implements Serializable  {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    @Column(name = "dep_code", length = 45)
    @NotEmpty
    private String depCode;
    @Column(name = "dep_name", length = 45)
    @NotEmpty
    private String depName;
    @Column(name = "description", length = 65535)
    private String description;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "departments")
    private List<Employees> employees;

    @Column(name = "image", length = 255)
    private String image;


    public Departments() {
    }

    public Departments(String depCode, String depName, String description, List<Employees> employees) {
        this.depCode = depCode;
        this.depName = depName;
        this.description = description;
        this.employees = employees;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepCode() {
        return this.depCode;
    }

    public void setDepCode(String depCode) {
        this.depCode = depCode;
    }

    public String getDepName() {
        return this.depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @JsonIgnore
    public List<Employees> getEmployees() {
        return this.employees;
    }

    public void setEmployees(List<Employees> employees) {
        this.employees = employees;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}