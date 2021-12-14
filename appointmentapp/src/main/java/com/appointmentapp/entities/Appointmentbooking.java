package com.appointmentapp.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table (name = "appointmentbooking")
public class Appointmentbooking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int appointid;
	
	private String comment;
	//	private int CustID;
	private int appstatus;
		private String appcode;
	private Date dateofappointment;
	private Date datecreated;
	
	//relationship

	@ManyToOne(fetch = FetchType.EAGER,optional = false)
	@JoinColumn(name = "deptid")
	private Department Department_Appoint;
	
	@ManyToOne(fetch = FetchType.EAGER,optional = false)
	@JoinColumn(name = "CustID")
	private Customers CustomersProf;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "timeslotid",referencedColumnName = "timeslotid")
private timeslot timeslot_appointment;
	
	
	public Appointmentbooking(int appointid, String comment, int appstatus, String appcode, Date dateofappointment,
			Date datecreated, Department department_Appoint, Customers customersProf, timeslot timeslot_appointment) {
		super();
		this.appointid = appointid;
		this.comment = comment;
		this.appstatus = appstatus;
		this.appcode = appcode;
		this.dateofappointment = dateofappointment;
		this.datecreated = datecreated;
		Department_Appoint = department_Appoint;
		CustomersProf = customersProf;
		this.timeslot_appointment = timeslot_appointment;
	}

	public Appointmentbooking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAppointid() {
		return appointid;
	}

	public timeslot getTimeslot_appointment() {
		return timeslot_appointment;
	}

	public void setTimeslot_appointment(timeslot timeslot_appointment) {
		this.timeslot_appointment = timeslot_appointment;
	}

	public void setAppointid(int appointid) {
		this.appointid = appointid;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getAppstatus() {
		return appstatus;
	}

	public void setAppstatus(int appstatus) {
		this.appstatus = appstatus;
	}

	public String getAppcode() {
		return appcode;
	}

	public void setAppcode(String appcode) {
		this.appcode = appcode;
	}

	public Date getDateofappointment() {
		return dateofappointment;
	}

	public void setDateofappointment(Date dateofappointment) {
		this.dateofappointment = dateofappointment;
	}

	public Date getDatecreated() {
		return datecreated;
	}

	public void setDatecreated(Date datecreated) {
		this.datecreated = datecreated;
	}

	public Department getDepartment_Appoint() {
		return Department_Appoint;
	}

	public void setDepartment_Appoint(Department department_Appoint) {
		Department_Appoint = department_Appoint;
	}

	public Customers getCustomersProf() {
		return CustomersProf;
	}

	public void setCustomersProf(Customers customersProf) {
		CustomersProf = customersProf;
	}
	
	
	
}
