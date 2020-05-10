package com.carpark.model.entities;

import java.util.Date;
import javax.persistence.Entity;
import com.carpark.metamodel.AbstractEntity;

@SuppressWarnings("serial")
@Entity
public class RoadMapRow extends AbstractEntity {

	private String way;
	private Date arrivalTime;
	private Date departureTime;
	private double kmTravelled;
	private String adjacentDocNb;
	private String notes;

	public RoadMapRow() {
	}

	public String getWay() {
		return way;
	}

	public void setWay(String way) {
		this.way = way;
	}

	public Date getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	public double getKmTravelled() {
		return kmTravelled;
	}

	public void setKmTravelled(double kmTravelled) {
		this.kmTravelled = kmTravelled;
	}

	public String getAdjacentDocNb() {
		return adjacentDocNb;
	}

	public void setAdjacentDocNb(String adjacentDocNb) {
		this.adjacentDocNb = adjacentDocNb;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
}
