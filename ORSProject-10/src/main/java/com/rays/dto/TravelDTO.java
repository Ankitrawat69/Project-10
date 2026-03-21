package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_travel")
public class TravelDTO extends BaseDTO {
	
	@Column(name = "travelerName",length = 50)
	private String travelerName;
	
	@Column(name = "destination",length = 50)
	private String destination;
	
	@Column(name = "startDate")
	private Date startDate;
	
	@Column(name = "endDate")
	private Date endDate;

	public String getTravelerName() {
		return travelerName;
	}

	public void setTravelerName(String travelerName) {
		this.travelerName = travelerName;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Override
	public String getValue() {
		return travelerName;
	}

	@Override
	public String getUniqueKey() {
		return "travelerName";
	}

	@Override
	public String getUniqueValue() {
		return travelerName;
	}

	@Override
	public String getLabel() {
		return "Traveler Name";
	}

	@Override
	public String getTableName() {
		return "Travel";
	}
	
	

}
