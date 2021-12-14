package com.appointmentapp.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table (name = "department")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int deptid;
	
	private String Deptname;
	private String Deptlocation;
	
	//relationship
	@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER,optional = false)
	@JoinColumn(name = "maindeptid")
	private Maindepartment maindepartment;
	
	@OneToMany(mappedBy = "Department_Appoint",cascade = CascadeType.ALL)
	private Set<Appointmentbooking> dept_appoint=new HashSet<>();
	
	@OneToMany(mappedBy = "scheduler_To_dept",cascade = CascadeType.ALL)
	private Set<Deptschedule> scheduler_To_dept=new HashSet<>();
	//Department_Appoint

	

	public Department(int deptid, String deptname, String deptlocation, Maindepartment maindepartment,
			Set<Appointmentbooking> dept_appoint, Set<Deptschedule> scheduler_To_dept) {
		super();
		this.deptid = deptid;
		Deptname = deptname;
		Deptlocation = deptlocation;
		this.maindepartment = maindepartment;
		this.dept_appoint = dept_appoint;
		this.scheduler_To_dept = scheduler_To_dept;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getDeptid() {
		return deptid;
	}
	public Set<Deptschedule> getScheduler_To_dept() {
		return scheduler_To_dept;
	}

	public void setScheduler_To_dept(Set<Deptschedule> scheduler_To_dept) {
		this.scheduler_To_dept = scheduler_To_dept;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public String getDeptname() {
		return Deptname;
	}

	public void setDeptname(String deptname) {
		Deptname = deptname;
	}

	public String getDeptlocation() {
		return Deptlocation;
	}

	public void setDeptlocation(String deptlocation) {
		Deptlocation = deptlocation;
	}

	public Maindepartment getMaindepartment() {
		return maindepartment;
	}

	public void setMaindepartment(Maindepartment maindepartment) {
		this.maindepartment = maindepartment;
	}

	public Set<Appointmentbooking> getDept_appoint() {
		return dept_appoint;
	}

	public void setDept_appoint(Set<Appointmentbooking> dept_appoint) {
		this.dept_appoint = dept_appoint;
	}


	

}
