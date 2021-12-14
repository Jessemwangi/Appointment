package com.appointmentapp.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table (name = "maindepartment")
public class Maindepartment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int maindeptid;
private String maindeptname;
private String maindeptlocation;

//relationship
//@JsonIgnore
@OneToMany(mappedBy = "maindepartment",cascade = CascadeType.ALL)
private Set<Department> dept_mainRl=new HashSet<Department>();


public Maindepartment() {
	super();
	// TODO Auto-generated constructor stub
}
public Maindepartment(int maindeptid, String maindeptname, String maindeptlocation, Set<Department> dept_mainRl) {
	super();
	this.maindeptid = maindeptid;
	this.maindeptname = maindeptname;
	this.maindeptlocation = maindeptlocation;
	this.dept_mainRl = dept_mainRl;
}
public int getMaindeptid() {
	return maindeptid;
}
public void setMaindeptid(int maindeptid) {
	this.maindeptid = maindeptid;
}
public Set<Department> getDept_mainRl() {
	return dept_mainRl;
}
public void setDept_mainRl(Set<Department> dept_mainRl) {
	this.dept_mainRl = dept_mainRl;
}
public String getMaindeptname() {
	return maindeptname;
}
public void setMaindeptname(String maindeptname) {
	this.maindeptname = maindeptname;
}
public String getMaindeptlocation() {
	return maindeptlocation;
}
public void setMaindeptlocation(String maindeptlocation) {
	this.maindeptlocation = maindeptlocation;
}



}
