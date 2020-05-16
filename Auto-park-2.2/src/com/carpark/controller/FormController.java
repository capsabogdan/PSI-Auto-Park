package com.carpark.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.carpark.model.entities.Document;
import com.carpark.model.entities.Partner;
import com.carpark.model.entities.RoadMap;
import com.carpark.model.entities.Vehicle;

@ManagedBean @SessionScoped
public class FormController {

	/**Events
	 * 1.load data for Car Reg DropDownList  ----//> fillAllRegNums() (line 34)
	 * 2.btnAddRoadMap.click() => loads all clients in the grid ----> fillPartnersGrid() (line 29)
	 * 3.selectCarRegNum => loads all Vehicle Data ----> getVehicleData()
	 * 4.BtnSave.click() => saves RoadMap in DB ----> saveRoadMap() (line 41)
	 */

	private List<String> regNumList;
	private String regNum;
	private FormData formData= new FormData();
	public static final String PEOPLE = "People";
	public static final String CARGO = "Cargo";
	public static final String BENZIN = "Benzin";
	public static final String DIESEL = "Diesel";
	public static final String IS_10_PSI ="IS-10-PSI"; 
	public static final String IS_11_PSI ="IS-11-PSI"; 
	public static final String IS_12_PSI ="IS-12-PSI"; 	
	
	public Vehicle getVehicleData(String regNum) {
		return this.getFormData().getMasterRepository().getVehicleByRegistrationNumber(regNum);
	}
	
	public String getBrandModel(String regNum) {
		return this.getVehicleData(regNum).getBrandAndModel();
	}	 
	
	public String getFuelType(String regNum) {
		return this.getVehicleData(regNum).getFuelType();
	}
	
	public Double getKmOnBoard(String regNum) {
		return this.getVehicleData(regNum).getKmOnBoard();
	}
	public String getDriverName() {
		return this.getVehicleData(regNum).getDriver().getFullName();
	}
	public void createRoadMap(String transportTypeSelected, String workUnit) {
		RoadMap roadMap= new RoadMap();
		// how shall we do RoadMap no.???????????
		if(transportTypeSelected.equals(CARGO)) {
			roadMap.setTransportType(CARGO);
		} else if (transportTypeSelected.equals(PEOPLE)) {
			roadMap.setTransportType(PEOPLE);
		}
		roadMap.setRoadMapNumber(new Random().nextLong());
		roadMap.setOperatingDate(LocalDateTime.now()); 
		this.formData.getMasterRepository().create(roadMap);
		
	}
	
	public RoadMap getRoadMap() {
		return this.getRoadMap();
	}
	
	public List<Partner> fillPartnersGrid(){
		return this.getFormData().getMasterRepository().getAllPartners();
	}
	
	public List<String>fillAllRegNums(){
		List<String> registrationNumbers = new ArrayList<String>();
		for (Vehicle v : this.getFormData().getMasterRepository().getAllVehicles()) {
			registrationNumbers.add(v.getRegistrationNumber());
		}
		return registrationNumbers;
	}
	
	public void saveRoadMap() {
		this.getFormData().getDocumentRepository().beginTransaction();
		this.getFormData().getDocumentRepository().saveDocument(this.getFormData().getRoadMap());
		this.getFormData().getDocumentRepository().commitTransaction();
	}
	
	public String getRegNum() {
		return regNum;
	}

	public void setRegNum(String regNum) {
		this.regNum = regNum;
	}
	public List<String> getRegNumList() {
		return regNumList;
	}

	public void setRegNumList(List<String> regNumList) {
		this.regNumList = regNumList;
	}
	
	public FormData getFormData() {
		return formData;
	}
	
	@PostConstruct
	public void init() {
		regNumList = new ArrayList<String>();
		regNumList.add(IS_10_PSI);
		regNumList.add(IS_11_PSI);
		regNumList.add(IS_12_PSI);
	}

}