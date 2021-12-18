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
@Table (name = "Wards")
public class Wards {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int wardID;
	private String Wardname;

//relationship
//	@JsonIgnore
@OneToMany (mappedBy = "ward",cascade = CascadeType.ALL)
private Set<Customers> customers=new HashSet<>();

public Wards() {
		super();
		// TODO Auto-generated constructor stub
	}

public Wards(int wardID, String wardname, Set<Customers> customers) {
	super();
	this.wardID = wardID;
	Wardname = wardname;
	this.customers = customers;
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

public Set<Customers> getCustomers() {
	return customers;
}

public void setCustomers(Set<Customers> customers) {
	this.customers = customers;
}




}
