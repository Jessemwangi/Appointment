package com.appointmentapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appointmentapp.entities.Appointmentbooking;
import com.appointmentapp.entities.Customers;
import com.appointmentapp.entities.Department;
import com.appointmentapp.entities.Deptschedule;
import com.appointmentapp.entities.Maindepartment;
import com.appointmentapp.entities.Wards;
import com.appointmentapp.entities.timeslot;
import com.appointmentapp.repository.CustomerRepository;
import com.appointmentapp.repository.Departmentrepository;
import com.appointmentapp.repository.Deptschedulerepository;
import com.appointmentapp.repository.MainDeptrepository;
import com.appointmentapp.repository.WardsRepository;
import com.appointmentapp.repository.bookingrepository;
import com.appointmentapp.repository.timeslotrepository;


@Service
public class Service_ {
@Autowired
	private MainDeptrepository mainDeptrepository;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private bookingrepository Bookingrepository;
	@Autowired
	private Deptschedulerepository deptschedulerepository;
	@Autowired
	private timeslotrepository timeslotrepository_;
	@Autowired
	public Departmentrepository departmentrepository;
	@Autowired
	public WardsRepository wardsRepository;
	
	public Customers newCustomer(Customers customer) {

		return customerRepository.save(customer);
	}
	
	public Appointmentbooking newAppointmentbooking(Appointmentbooking appointmentbooking) {
		
		return Bookingrepository.save(appointmentbooking);
		
	}
	public Deptschedule newdeptschedule(Deptschedule deptmntschedule)
	{
		return deptschedulerepository.save(deptmntschedule);
	}
	public timeslot newtimeslot(timeslot timeslot_)
	{
		return timeslotrepository_.save(timeslot_);
	}
	public Maindepartment newmaindepartment(Maindepartment maindepartment)
	{
		return mainDeptrepository.save(maindepartment);
	}
	public Department newdepartment(Department department)
	{
		return departmentrepository.save(department);
	}
	public Wards newwards(Wards wards)
	{
		return wardsRepository.save(wards);
	}
	public List<Wards> findAll()
	{
		return wardsRepository.findAll();
	}
	public List<Customers> findAllCustomers()
	{
		return customerRepository.findAll();
	}
}

