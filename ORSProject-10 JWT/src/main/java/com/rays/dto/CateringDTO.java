package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_catering")
public class CateringDTO extends BaseDTO {
	
	@Column(name = "cateringId", length = 50)
	private String cateringId;
	
	@Column(name = "vendorName", length = 50)
	private String vendorName;
	
	@Column(name = "menuType", length = 50)
	private String menuType;
	
	@Column(name = "cost", length = 50)
	private String cost;

	public String getCateringId() {
		return cateringId;
	}

	public void setCateringId(String cateringId) {
		this.cateringId = cateringId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getMenuType() {
		return menuType;
	}

	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	@Override
	public String getValue() {
		return cateringId;
	}

	@Override
	public String getUniqueKey() {
		return "cateringId";
	}

	@Override
	public String getUniqueValue() {
		return cateringId;
	}

	@Override
	public String getLabel() {
		return "Catering Id";
	}

	@Override
	public String getTableName() {
		return "Catering";
	}
}
