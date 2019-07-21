package com.infy.bank;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class EmployeeEntity {
	@Id
	@GeneratedValue
	@Column(name="E_Id")
	private String eId;
	@Column(name="First_Name")
	private String firstName;
	@Column(name="Last_Name")
	private String lastName;
	@Column(name="Password")
	private String password;
	public String geteId() {
		return eId;
	}
	public void seteId(String eId) {
		this.eId = eId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "EmployeeEntity [eId=" + eId + ", firstName=" + firstName + ", lastName=" + lastName + ", password="
				+ password + "]";
	}
	public EmployeeEntity(String eId, String firstName, String lastName, String password) {
		super();
		this.eId = eId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
	}
	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
