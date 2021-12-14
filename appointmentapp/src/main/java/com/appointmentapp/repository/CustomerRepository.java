package com.appointmentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appointmentapp.entities.Customers;

@Repository
public interface CustomerRepository extends JpaRepository<Customers, Integer> {
	
}