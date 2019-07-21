package com.infy.bank;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class CustomerEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cId;
	@Column(name="First_Name")
	private String firstName;
	@Column(name="Last_Name")
	private String lastName;
	@Column(name="DOB")
	private String DOB;
	private String savingAccount;
	private List<SavingAccount> savingAccounts=new ArrayList<SavingAccount>();
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
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
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getSavingAccount() {
		return savingAccount;
	}
	public void setSavingAccount(String savingAccount) {
		this.savingAccount = savingAccount;
	}
	public List<SavingAccount> getSavingAccounts() {
		return savingAccounts;
	}
	public void setSavingAccounts(List<SavingAccount> savingAccounts) {
		this.savingAccounts = savingAccounts;
	}
	@Override
	public String toString() {
		return "CustomerEntity [cId=" + cId + ", firstName=" + firstName + ", lastName=" + lastName + ", DOB=" + DOB
				+ ", savingAccount=" + savingAccount + ", savingAccounts=" + savingAccounts + "]";
	}
	public CustomerEntity(int cId, String firstName, String lastName, String dOB, String savingAccount,
			List<SavingAccount> savingAccounts) {
		super();
		this.cId = cId;
		this.firstName = firstName;
		this.lastName = lastName;
		DOB = dOB;
		this.savingAccount = savingAccount;
		this.savingAccounts = savingAccounts;
	}
	public CustomerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
