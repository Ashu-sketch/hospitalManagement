package com.hospitalManagement.hospitalManagement.UserTest;

import java.util.ArrayList;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue
	private Long sId;
	private String sName;
	private String sClass;
	private ArrayList<String> sSubjects;
public Student() {

	}
public Student(Long sId, String sName, String sClass, ArrayList<String> sSubjects) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sClass = sClass;
		this.sSubjects = sSubjects;
	}

public Long getsId() {
	return sId;
}
public void setsId(Long sId) {
	this.sId = sId;
}
public String getsName() {
	return sName;
}
public void setsName(String sName) {
	this.sName = sName;
}
public String getsClass() {
	return sClass;
}
public void setsClass(String sClass) {
	this.sClass = sClass;
}
public ArrayList<String> getsSubjects() {
	return sSubjects;
}
public void setsSubjects(ArrayList<String> sSubjects) {
	this.sSubjects = sSubjects;
}
@Override
public String toString() {
	return "Student [sId=" + sId + ", sName=" + sName + ", sClass=" + sClass + ", sSubjects=" + sSubjects + "]";
}
}
