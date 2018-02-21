package com.rs.command;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

public class Student {
	@NotNull
	@NotEmpty
	private String studentName;
	@NotNull
	private String gender;
	@NotNull
	@NotEmpty
	private List<String> technologies;
	@NotNull
	@NotBlank
	private String city;
	@NotNull
	private Long phone;
	@NotNull
	//@Future(message="Invalid Date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dob;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<String> getTechnologies() {
		return technologies;
	}
	public void setTechnologies(List<String> technologies) {
		this.technologies = technologies;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", gender=" + gender + ", technologies=" + technologies
				+ ", city=" + city + ", phone=" + phone + ", dob=" + dob + "]";
	}
	
}