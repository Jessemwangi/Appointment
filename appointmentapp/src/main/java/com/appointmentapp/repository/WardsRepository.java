package com.appointmentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appointmentapp.entities.Wards;
@Repository
public interface WardsRepository extends JpaRepository<Wards, Integer> {

}
