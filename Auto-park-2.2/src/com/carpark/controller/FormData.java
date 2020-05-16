package com.carpark.controller;

import java.util.List;
import com.carpark.model.entities.Document;
import com.carpark.model.entities.Partner;
import com.carpark.model.entities.RoadMap;
import com.carpark.model.entities.RoadMapRow;
import com.carpark.model.entities.Vehicle;
import com.carpark.model.repository.DocumentRepository;
import com.carpark.model.repository.MasterRepository;

public class FormData {
	
	private List<Vehicle> vehiclesList;
	private List<Partner> clientsList;
	private Vehicle vehicle;
	private RoadMap roadMap; 
	String transportType;
	String fuelType;
	public static final String PEOPLE = "People";
	public static final String CARGO = "Cargo";
	public static final String BENZIN = "Benzin";
	public static final String DIESEL = "Diesel";
	private MasterRepository masterRepository = new MasterRepository();
	private DocumentRepository documentRepository= new DocumentRepository();
	
	public FormData() {
		super();
	}

	public List<Vehicle> getVehiclesList() {
		if(this.vehiclesList == null) {
			this.vehiclesList = this.masterRepository.getAllVehicles();
		}
		return vehiclesList;
	}
	public void setVehiclesList(List<Vehicle> vehiclesList) {
		this.vehiclesList = vehiclesList;
	}
	public RoadMap getRoadMap() {
		return roadMap;
	}

	public void setRoadMap(RoadMap roadMap) {
		this.roadMap = roadMap;
	}
	public MasterRepository getMasterRepository() {
		return masterRepository;
	}
	
	public DocumentRepository getDocumentRepository() {
		return documentRepository;
	}

}
	
