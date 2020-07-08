ALTER TABLE `INSURANCE_AGENTS` DROP INDEX `PK_AGENTS`;

ALTER TABLE `INSURANCE_AGENTS` DROP FOREIGN KEY `FK_AGENT_STATE`;

DROP TABLE `INSURANCE_AGENTS`;

CREATE TABLE `INSURANCE_AGENTS` (
		`AGENT_ID` MEDIUMINT NOT NULL AUTO_INCREMENT,
		`AGENT_FIRST_NAME` VARCHAR(100),
		`AGENT_LAST_NAME` VARCHAR(100),
		`AGENT_MIDDLE_INITIAL` VARCHAR(5),
		`AGENT_ADDRESS_LINE1` VARCHAR(50),
		`AGENT_ADDRESS_LINE2` VARCHAR(50),
		`AGENT_CITY` VARCHAR(50),
		`AGENT_STATE_ID` MEDIUMINT,
		`AGENT_POSTALCODE` VARCHAR(10),
		`AGENT_EMAIL` VARCHAR(50),
		`AGENT_ACTIVE_YESNO` VARCHAR(1),
		`AGENT_EXPENSE_ENABLED_YESNO` VARCHAR(1),
		`COMPANY` VARCHAR(10),
		PRIMARY KEY (`AGENT_ID`)
	);

CREATE UNIQUE INDEX `PK_AGENTS` ON `INSURANCE_AGENTS` (`AGENT_ID` ASC);

ALTER TABLE `INSURANCE_AGENTS` ADD CONSTRAINT `FK_AGENT_STATE` FOREIGN KEY (`AGENT_STATE_ID`)
	REFERENCES `STATES` (`STATE_ID`) #
	ON DELETE RESTRICT
	ON UPDATE CASCADE;
	
SELECT * FROM INSURANCE_AGENTS;	
