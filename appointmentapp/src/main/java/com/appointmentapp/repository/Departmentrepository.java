package com.appointmentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appointmentapp.entities.Department;

@Repository
public interface Departmentrepository extends JpaRepository<Department, Integer>{

}
