package com.hospitalManagement.hospitalManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalManagement.hospitalManagement.model.Patient;
import com.hospitalManagement.hospitalManagement.repo.PatientRepo;

@Service
public class PatientService {
	
	@Autowired
	PatientRepo pRepo;
	public List<Patient>getAllPatients(){
		return pRepo.findAll();
	}
	
	public Patient savePatient(Patient patient) {
		return pRepo.save(patient);
	}

	public Patient getPatientById(Long id) {
		return pRepo.findById(id).orElse(null);
		
	}

	
	//updating 
	public Patient updatePatient(Long id, Patient patient) {
		Patient existingPatient=pRepo.findById(id).orElse(null);
		if(existingPatient!=null) {
			existingPatient.setpName(patient.getpName());
			existingPatient.setpGender(patient.getpGender());
			existingPatient.setAge(patient.getAge());
			return pRepo.save(existingPatient);
		}
		return null;
	}

}
