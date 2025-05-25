package com.hospitalManagement.hospitalManagement.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalManagement.hospitalManagement.model.Patient;
import com.hospitalManagement.hospitalManagement.service.PatientService;

@RestController
@RequestMapping("/api/v1/patients")
public class PatientController {

	@Autowired
	PatientService pService;
	
	@PostMapping("/savePatient")
	public ResponseEntity<Patient>savePatient(@RequestBody Patient patient){
		// Logic to save patient
	Patient savedPatient= pService.savePatient(patient);
	return ResponseEntity.status(HttpStatus.CREATED).body(savedPatient);
				
	}
	
	@GetMapping("/getPatientList")
	public ResponseEntity<List<Patient>>getAllPatient(){
		List<Patient> patientList=pService.getAllPatients();
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(patientList);
	}
	
	@GetMapping("/getPatientById/{id}")
	public ResponseEntity<Patient>getPatientById(@PathVariable Long id ){
		Patient patient=pService.getPatientById(id);
		if(patient!=null) {
			return ResponseEntity.status(HttpStatus.OK).body(patient);
			}else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
			}	
	}
	
	@PostMapping("/updatePatient/{id}")
	public ResponseEntity<Patient>updatePatient(@PathVariable Long id, @RequestBody Patient patient){
		Patient updatedPatient=pService.updatePatient(id, patient);
		if(updatedPatient!=null) {
			return ResponseEntity.status(HttpStatus.OK).body(updatedPatient);
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
		
		
	}
}
