package com.nicordesigns.insurance.admin.utils;

public class Administrator {
	
	private String adminName;
	private String adminPassword;
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	@Override
	public String toString() {
		return "Administrator [adminName=" + adminName + ", adminPassword=" + adminPassword + "]";
	}
	
	

}
