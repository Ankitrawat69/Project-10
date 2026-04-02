package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_subscription")
public class SubscriptionDTO extends BaseDTO {
	
	@Column(name = "planId", length = 50)
	private String planId;
	
	@Column(name = "planName", length = 50)
	private String planName;
	
	@Column(name = "price", length = 50)
	private String price;
	
	@Column(name = "validityDays", length = 50)
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
	public String getValue() {
		return planId;
	}

	@Override
	public String getUniqueKey() {
		return "planId";
	}

	@Override
	public String getUniqueValue() {
		return planId;
	}

	@Override
	public String getLabel() {
		return "Plan Id";
	}

	@Override
	public String getTableName() {
		return "Subscription";
	}
}
