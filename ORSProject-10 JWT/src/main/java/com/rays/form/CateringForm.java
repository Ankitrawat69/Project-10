package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.CateringDTO;

public class CateringForm extends BaseForm {
	
	@NotEmpty(message = "cateringId is required")
    private String cateringId;
	
	@NotEmpty(message = "vendorName is required")
	private String vendorName;
	
	@NotEmpty(message = "menuType is required")
	private String menuType;
	
	@NotEmpty(message = "cost is required")
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
	public BaseDTO getDto() {
		
		CateringDTO dto = initDTO(new CateringDTO());
		            dto.setCateringId(cateringId);
		            dto.setVendorName(vendorName);
		            dto.setMenuType(menuType);
		            dto.setCost(cost);
		     return dto;
	}
}
