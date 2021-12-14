package com.appointmentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appointmentapp.entities.Maindepartment;

@Repository
public interface MainDeptrepository extends JpaRepository<Maindepartment, Integer> {

}
