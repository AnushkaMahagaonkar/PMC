package com.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;


@Entity
@Table(name="Student")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Student_Id")
	private int sid;
	


	public Student(String sname, String sbranch, String scontact, Date dOB, String address) {
		super();
	
		this.sname = sname;
		this.sbranch = sbranch;
		this.scontact = scontact;
		DOB = dOB;
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name="Student_Name")
	private String sname;
	
	@Column(name="Student_Branch")
	private String sbranch;
	
	@Column(name="Student_Contactno")
	private String scontact;
	
	@Column(name="Student_DOB")
	@Type(type="date")
	
	private Date DOB;
	
	@Column(name="Student_Address")
	private String address;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSbranch() {
		return sbranch;
	}

	public void setSbranch(String sbranch) {
		this.sbranch = sbranch;
	}

	public String getScontact() {
		return scontact;
	}

	public void setScontact(String scontact) {
		this.scontact = scontact;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}

