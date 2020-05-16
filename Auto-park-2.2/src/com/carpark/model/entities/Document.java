package com.carpark.model.entities;

import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.carpark.metamodel.AbstractEntity;

@SuppressWarnings("serial")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
public class Document extends AbstractEntity {
	
	//TODO
	//add the Work Unit attribute (String)

	@Temporal(value = TemporalType.DATE)
	private Date releaseDate;
	@Temporal(value = TemporalType.TIMESTAMP)
	private LocalDateTime operatingDate;

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public LocalDateTime getOperatingDate() {
		return operatingDate;
	}

	public void setOperatingDate(LocalDateTime localDateTime) {
		this.operatingDate = localDateTime;
	}
}
