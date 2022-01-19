package com.appointmentapp.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table (name = "Wards")
public class Wards implements Serializable{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int wardID;
	private String Wardname;

//relationship
//	@JsonIgnore
@OneToMany (mappedBy = "wards",cascade = CascadeType.ALL)
private Set<Customers> Ward_Customer=new HashSet<Customers>();

public Wards() {
		super();
		// TODO Auto-generated constructor stub
	}

public Wards(int wardID, String wardname, Set<Customers> ward_Customer) {
	super();
	this.wardID = wardID;
	Wardname = wardname;
}


public int getWardID() {
	return wardID;
}

public void setWardID(int wardID) {
	this.wardID = wardID;
}

public String getWardname() {
	return Wardname;
}

public void setWardname(String wardname) {
	Wardname = wardname;
}

@Override
public String toString() {
	return "Wards [wardID=" + wardID + ", Wardname=" + Wardname + ", getWardID()=" + getWardID() + ", getWardname()="
			+ getWardname() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}


}
