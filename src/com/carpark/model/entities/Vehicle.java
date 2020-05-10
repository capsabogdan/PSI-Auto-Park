package com.carpark.model.entities;

import javax.persistence.Entity;
import com.carpark.metamodel.AbstractEntity;

@SuppressWarnings("serial")
@Entity
public class Vehicle extends AbstractEntity {

	private String registrationNumber;
	private String brandAndModel;
	private String ChassisSeries;
	private String kmOnBoard;
	private String fuelType;

	public Vehicle() {
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getBrandAndModel() {
		return brandAndModel;
	}

	public void setBrandAndModel(String brandAndModel) {
		this.brandAndModel = brandAndModel;
	}

	public String getChassisSeries() {
		return ChassisSeries;
	}

	public void setChassisSeries(String ChassisSeries) {
		this.ChassisSeries = ChassisSeries;
	}

	public String getKmOnBoard() {
		return kmOnBoard;
	}

	public void setKmOnBoard(String kmOnBoard) {
		this.kmOnBoard = kmOnBoard;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
}
