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
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table (name = "Deptscheduler")
public class Deptschedule {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int deptschid;

	private Date scheduledate;
	private Date datecreated;
	private int slotduration;
	private int schedulestatus;
	//Relation with timeslot
	@JsonIgnore
	@OneToMany(mappedBy = "scheduler_To_Timeslot",cascade = CascadeType.ALL)
	private Set<timeslot> scheduler_To_Timeslot=new HashSet<timeslot>();
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER,optional = false)
	@JoinColumn(name = "deptid")
	private Department scheduler_To_dept;


	public Deptschedule() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Deptschedule(int deptschid, Date scheduledate, Date datecreated, int slotduration, int schedulestatus,
			Set<timeslot> scheduler_To_Timeslot, Department scheduler_To_dept) {
		super();
		this.deptschid = deptschid;
		this.scheduledate = scheduledate;
		this.datecreated = datecreated;
		this.slotduration = slotduration;
		this.schedulestatus = schedulestatus;
		this.scheduler_To_Timeslot = scheduler_To_Timeslot;
		this.scheduler_To_dept = scheduler_To_dept;
	}


	public int getDeptschid() {
		return deptschid;
	}


	public void setDeptschid(int deptschid) {
		this.deptschid = deptschid;
	}


	public Date getScheduledate() {
		return scheduledate;
	}


	public void setScheduledate(Date scheduledate) {
		this.scheduledate = scheduledate;
	}


	public Date getDatecreated() {
		return datecreated;
	}


	public void setDatecreated(Date datecreated) {
		this.datecreated = datecreated;
	}


	public int getSlotduration() {
		return slotduration;
	}


	public void setSlotduration(int slotduration) {
		this.slotduration = slotduration;
	}


	public int getSchedulestatus() {
		return schedulestatus;
	}


	public void setSchedulestatus(int schedulestatus) {
		this.schedulestatus = schedulestatus;
	}


	public Set<timeslot> getScheduler_To_Timeslot() {
		return scheduler_To_Timeslot;
	}


	public void setScheduler_To_Timeslot(Set<timeslot> scheduler_To_Timeslot) {
		this.scheduler_To_Timeslot = scheduler_To_Timeslot;
	}


	public Department getScheduler_To_dept() {
		return scheduler_To_dept;
	}


	public void setScheduler_To_dept(Department scheduler_To_dept) {
		this.scheduler_To_dept = scheduler_To_dept;
	}
	
	
	
}
