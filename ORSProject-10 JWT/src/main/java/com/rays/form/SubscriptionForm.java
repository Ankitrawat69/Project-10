package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.SubscriptionDTO;

public class SubscriptionForm extends BaseForm {
	
	@NotEmpty(message = "plan Id is required")
    private String planId;
	
	@NotEmpty(message = "plan Name is required")
	private String planName;
	
	@NotEmpty(message = "price is required")
	private String price;
	
	@NotEmpty(message = "validity Days is required")
	private String  validityDays;

	public String getPlanId() {
		return planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getValidityDays() {
		return validityDays;
	}

	public void setValidityDays(String validityDays) {
		this.validityDays = validityDays;
	}

	@Override
	public BaseDTO getDto() {
	    
		SubscriptionDTO dto = initDTO(new SubscriptionDTO());
		                dto.setPlanId(planId);
		                dto.setPlanName(planName);
		                dto.setPrice(price);
		                dto.setValidityDays(validityDays);
		         return dto;
	}
	
}
