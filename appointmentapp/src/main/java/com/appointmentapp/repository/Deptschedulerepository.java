package com.appointmentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appointmentapp.entities.Deptschedule;

@Repository
public interface Deptschedulerepository extends JpaRepository<Deptschedule, Integer> {

}
