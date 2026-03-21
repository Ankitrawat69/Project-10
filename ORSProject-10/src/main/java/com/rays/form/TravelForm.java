package com.rays.form;

import java.util.Date;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.TravelDTO;

public class TravelForm extends BaseForm{
	
	@NotEmpty(message = "TravelerName is required")
    private String travelerName;
	
	@NotEmpty(message = "Destination is required")
	private String destination;
	
	@NotNull(message = "StartDate is required")
	private Date startDate;
	
	@NotNull(message = "EndDate is required")
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
	public BaseDTO getDto() {
		
		TravelDTO dto = initDTO(new TravelDTO());
		          dto.setTravelerName(travelerName);
		          dto.setDestination(destination);
		          dto.setStartDate(startDate);
		          dto.setEndDate(endDate);
		          return dto;
	}
}
