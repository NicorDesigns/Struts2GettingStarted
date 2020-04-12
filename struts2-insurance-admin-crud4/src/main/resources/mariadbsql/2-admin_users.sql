ALTER TABLE INSURANCE_ADMIN.`admin_user` DROP PRIMARY KEY;

DROP INDEX `PK_admin_user` ON INSURANCE_ADMIN.`admin_user`;

DROP TABLE INSURANCE_ADMIN.`admin_user`;

CREATE TABLE INSURANCE_ADMIN.`admin_user` (
	`id` INT NOT NULL,
	`first_name` VARCHAR(45),
	`last_name` VARCHAR(45),
	`email` VARCHAR(45),
	`password` VARCHAR(50),
	 PRIMARY KEY (`id`)
) ENGINE=InnoDB;

CREATE UNIQUE INDEX `PK_admin_user` ON INSURANCE_ADMIN.`admin_user` (`ID` ASC);


