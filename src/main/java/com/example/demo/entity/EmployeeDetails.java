package com.example.demo.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="canddetails")
public class EmployeeDetails {
	
	@Id
	@Column(name="candId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long candId;
	
	@Column(name="address")
	private String address;
	
	@Column(name="education")
	private String education;
	
	@Column(name="skills")
	private String skills;
	
	@Column(name="id")
	private long id;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCandId() {
		return candId;
	}

	public void setCandId(long candId) {
		this.candId = candId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

}
