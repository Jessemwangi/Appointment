package com.appointmentapp.controller;
import java.util.Date;

import org.hibernate.hql.internal.ast.tree.IsNullLogicOperatorNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.appointmentapp.entities.Appointmentbooking;
import com.appointmentapp.entities.Customers;
import com.appointmentapp.entities.Department;
import com.appointmentapp.entities.Deptschedule;
import com.appointmentapp.entities.Maindepartment;
import com.appointmentapp.entities.timeslot;
import com.appointmentapp.repository.CustomerRepository;
import com.appointmentapp.services.Service_;

@RestController
public class Controller_ {
	
	@Autowired
	private Service_ service;
	
	
	@GetMapping("/findall")
	public String findAll() {
		return "Hello world";
	}
	
	@PostMapping("/newcustomer")
	public Customers newCustomer(@RequestBody Customers customer) {
		return service.newCustomer(customer);
	}
	@PostMapping ("/bookappointment")
public Appointmentbooking newAppbook(@RequestBody Appointmentbooking appointbooking) {
	// TODO Auto-generated method stub
		appointbooking.setDatecreated(new Date());
//		appointbooking.setAppointid(0);
//		String appo;
//		appo=appointbooking.getAppcode();
//		if (appo.length()<0) {
//			return service.newAppointmentbooking("Null value found");
//		}
//		else
//		{
return service.newAppointmentbooking(appointbooking);
//		}
}
	@PostMapping("/newschedule")
	public Deptschedule  newdeptschedule(@RequestBody Deptschedule deptschedule_)
	{
		return service.newdeptschedule(deptschedule_);
	}
	@PostMapping("/newtimeslot")
	public timeslot newtimeslot(@RequestBody timeslot  timeslot_)
	{
		return service.newtimeslot(timeslot_);
	}
	
	@PostMapping("/newmaindepartment")
	public Maindepartment newmaindepartment(@RequestBody Maindepartment  timeslot_)
	{
		return service.newmaindepartment(timeslot_);
	}
	
	@PostMapping("/newdepartment")
	public Department newdepartment(@RequestBody Department  timeslot_)
	{
		return service.newdepartment(timeslot_);
	}
	
}
