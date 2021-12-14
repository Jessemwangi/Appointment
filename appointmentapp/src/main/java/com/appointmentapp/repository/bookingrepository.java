package com.appointmentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appointmentapp.entities.Appointmentbooking;
@Repository
public interface bookingrepository extends JpaRepository<Appointmentbooking, Integer> {

}
