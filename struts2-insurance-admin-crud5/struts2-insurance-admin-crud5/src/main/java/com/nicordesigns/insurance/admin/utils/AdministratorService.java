package com.nicordesigns.insurance.admin.utils;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AdministratorService {

	private static Map<String, Administrator> admins = new HashMap<String, Administrator>();
	private static final Logger logger = LogManager.getLogger(AdministratorService.class);

	static {
		Administrator admin = new Administrator();
		admin.setAdminName("insurance");
		admin.setAdminPassword("admin");
		admins.put(admin.getAdminName(), admin);
	}

	public boolean adminExists(String adminName) {

		return admins.containsKey(adminName);

	}

	public Administrator authenticateAdministrator(String administratorname, String administratorPassword) {

		logger.debug("Authenticating: Administrator Name = " + administratorname);

		Administrator persistedAdmin = (Administrator) admins.get(administratorname);
		Administrator adminModel = null;

		if (persistedAdmin != null && persistedAdmin.getAdminPassword()!= null && persistedAdmin.getAdminPassword().equals(administratorPassword)) {

			adminModel = getModelCopy(persistedAdmin);
		}

		return adminModel;
	}

	private Administrator getModelCopy(Administrator persistedUser) {
		Administrator copy = new Administrator();

		copy.setAdminName(persistedUser.getAdminName());
		copy.setAdminPassword(persistedUser.getAdminPassword());

		return copy;
	}

}
