package com.carpark.model.repository;

import java.util.List;

import com.carpark.metamodel.AbstractRepository;
import com.carpark.model.entities.Partner;
import com.carpark.model.entities.Vehicle;

public class MasterRepository extends AbstractRepository {

	/**
	 * Se introduc toate metodele pentru a accesa datele din celelalte entitati mai
	 * putin ierarhia de mostenire document
	 */

	public Partner addPartner(Partner partner) {
		return (Partner) this.create(partner);
	}

	public List<?> getAllPartners() {
		return this.getEm().createQuery("SELECT p FROM Partner p").getResultList();
	}

	public Vehicle findVehicleByRegistrationNumber(String registrationNumber) {
		return (Vehicle) this.getEm().createQuery("SELECT v FROM Vehicle WHERE registrationNumber = registrationNumber")
				.setParameter("registrationNumber", registrationNumber).getSingleResult();
	}

	public String getDriverNameByRegistrationNumber(Vehicle vehicle) {
		return (String) this.getEm()
				.createQuery("SELECT d.fullName FROM Driver d WHERE v.registrationNumber = d.registrationNumber ")
				.getSingleResult();
	}
}
