package com.carpark.model.repository;

import java.util.List;

import com.carpark.metamodel.AbstractRepository;
import com.carpark.model.entities.Driver;
import com.carpark.model.entities.Partner;
import com.carpark.model.entities.Vehicle;

public class MasterRepository extends AbstractRepository {

	/**
	 * Se introduc toate metodele pentru a accesa datele din celelalte entitati mai
	 * putin ierarhia de mostenire document
	 */

	public void addVehicle(Vehicle vehicle) {
		this.create(vehicle);
	}
	public Partner addPartner(Partner partner) {
		return (Partner) this.create(partner);
	}

	public List<Partner> getAllPartners() {
		return this.getEm().createQuery("SELECT p FROM Partner p").getResultList();
	}

	
	public Vehicle getVehicleByRegistrationNumber(String registrationNumber) {
		return (Vehicle) this.getEm().createQuery("SELECT v FROM Vehicle WHERE registrationNumber = registrationNumber")
				.setParameter("registrationNumber", registrationNumber).getSingleResult();
	}
	

//	public String getDriverByRegistrationNumber(Vehicle vehicle) {
//		return (Driver) this.getEm()
//				.createQuery("SELECT d.fullName FROM Driver d WHERE v.registrationNumber = d.registrationNumber ")
//				.getSingleResult();
//	}
	
	public List<Vehicle> getAllVehicles(){
		return this.getEm().createQuery("SELECT v FROM vehicles").getResultList();
	} 

}
