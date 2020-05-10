package com.carpark.model.entities;

import javax.persistence.Entity;
import com.carpark.metamodel.AbstractEntity;

@SuppressWarnings("serial")
@Entity
public class Driver extends AbstractEntity {

	private String position;
	private String fullName;
	private boolean active;
	private String Telephone;
	private String DriverLicence;

	private Driver() {
		/*
		 * this.position = position; this.fullName = fullName; this.active = active;
		 * this.Telephone = Telephone; this.DriverLicence = DriverLicence;
		 */
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getTelephone() {
		return Telephone;
	}

	public void setTelephone(String Telephone) {
		this.Telephone = Telephone;
	}

	public String getDriverLicence() {
		return DriverLicence;
	}

	public void setDriverLicence(String DriverLicence) {
		this.DriverLicence = DriverLicence;
	}
}
