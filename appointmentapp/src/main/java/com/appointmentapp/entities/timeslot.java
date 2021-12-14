package com.appointmentapp.entities;

import java.util.Date;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table (name = "bookingtimeslots")
public class timeslot {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY )
private int timeslotid;

private int deptid;
private Date starthour;
private Date endhour;
private Date datecreated;
private int timeslotstatus;
//relation start here

@ManyToOne(fetch = FetchType.EAGER,optional = false)
@JoinColumn(name = "deptschid")
private Deptschedule scheduler_To_Timeslot;

@OneToOne(mappedBy = "timeslot_appointment")
private Appointmentbooking timeslot_appointment;



public timeslot() {
	super();
	// TODO Auto-generated constructor stub
}

public timeslot(int timeslotid, int deptid, Date starthour, Date endhour, Date datecreated, int timeslotstatus,
		Deptschedule scheduler_To_Timeslot, Appointmentbooking timeslot_appointment) {
	super();
	this.timeslotid = timeslotid;
	this.deptid = deptid;
	this.starthour = starthour;
	this.endhour = endhour;
	this.datecreated = datecreated;
	this.timeslotstatus = timeslotstatus;
	this.scheduler_To_Timeslot = scheduler_To_Timeslot;
	this.timeslot_appointment = timeslot_appointment;
}

public int getTimeslotid() {
	return timeslotid;
}

public Appointmentbooking getTimeslot_appointment() {
	return timeslot_appointment;
}

public void setTimeslot_appointment(Appointmentbooking timeslot_appointment) {
	this.timeslot_appointment = timeslot_appointment;
}

public void setTimeslotid(int timeslotid) {
	this.timeslotid = timeslotid;
}

public int getDeptid() {
	return deptid;
}

public void setDeptid(int deptid) {
	this.deptid = deptid;
}

public Date getStarthour() {
	return starthour;
}

public void setStarthour(Date starthour) {
	this.starthour = starthour;
}

public Date getEndhour() {
	return endhour;
}

public void setEndhour(Date endhour) {
	this.endhour = endhour;
}

public Date getDatecreated() {
	return datecreated;
}

public void setDatecreated(Date datecreated) {
	this.datecreated = datecreated;
}

public int getTimeslotstatus() {
	return timeslotstatus;
}

public void setTimeslotstatus(int timeslotstatus) {
	this.timeslotstatus = timeslotstatus;
}

public Deptschedule getScheduler_To_Timeslot() {
	return scheduler_To_Timeslot;
}

public void setScheduler_To_Timeslot(Deptschedule scheduler_To_Timeslot) {
	this.scheduler_To_Timeslot = scheduler_To_Timeslot;
}





}
