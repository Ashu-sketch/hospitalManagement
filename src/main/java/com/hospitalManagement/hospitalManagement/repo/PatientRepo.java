package com.hospitalManagement.hospitalManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospitalManagement.hospitalManagement.model.Patient;

@Repository
public interface PatientRepo extends JpaRepository<Patient, Long>{

}
