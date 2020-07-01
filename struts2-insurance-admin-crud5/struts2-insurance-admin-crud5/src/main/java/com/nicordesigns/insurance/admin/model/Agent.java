package com.nicordesigns.insurance.admin.model;

import java.io.Serializable;

public class Agent implements Serializable, Cloneable {

	private static final long serialVersionUID = 9221059799651225518L;
	
	private Integer id;
	private String firstName;
	private String lastName;
	private String midddleInitial;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private java.math.BigDecimal stateId;
	private String postalCodeZip;
	private String email;
	private String company;
	private boolean isActive;
	private boolean isExpensed;
	

	

	public Agent() {
		super();
	}

	public Agent(Integer id, String firstName, String lastName, String midddleInitial, String addressLine1,
			String addressLine2, String city, java.math.BigDecimal stateId, String postalCodeZip, String email, String company) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.midddleInitial = midddleInitial;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.stateId = stateId;
		this.postalCodeZip = postalCodeZip;
		this.email = email;
		this.company = company;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getMidddleInitial() {
		return midddleInitial;
	}
	public void setMidddleInitial(String midddleInitial) {
		this.midddleInitial = midddleInitial;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public java.math.BigDecimal getStateId() {
		return stateId;
	}
	public void setStateId(java.math.BigDecimal bigDecimal) {
		this.stateId = bigDecimal;
	}
	public String getPostalCodeZip() {
		return postalCodeZip;
	}
	public void setPostalCodeZip(String postalCodeZip) {
		this.postalCodeZip = postalCodeZip;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	public boolean isExpensed() {
		return isExpensed;
	}

	public void setExpensed(boolean isExpensed) {
		this.isExpensed = isExpensed;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	@Override
	public String toString() {
		return "Agent [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", midddleInitial="
				+ midddleInitial + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", city="
				+ city + ", stateId=" + stateId + ", postalCodeZip=" + postalCodeZip + ", email=" + email + ", company="
				+ company + ", isActive=" + isActive + ", isExpensed=" + isExpensed + "]";
	}

}