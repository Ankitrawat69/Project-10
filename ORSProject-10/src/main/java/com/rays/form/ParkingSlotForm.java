package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ParkingSlotDTO;

public class ParkingSlotForm extends BaseForm {

	@NotEmpty(message = "vehicleNumber is required")
	private String vehicleNumber;

	@NotEmpty(message = "Slotno is required")
	private String slotNo;

	@NotNull(message = "entrytime is required")
	private Date entrytime;

	@NotNull(message = "exitTime is required")
	private Date exitTime;

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getSlotNo() {
		return slotNo;
	}

	public void setSlotNo(String slotNo) {
		this.slotNo = slotNo;
	}

	public Date getEntrytime() {
		return entrytime;
	}

	public void setEntrytime(Date entrytime) {
		this.entrytime = entrytime;
	}

	public Date getExitTime() {
		return exitTime;
	}

	public void setExitTime(Date exitTime) {
		this.exitTime = exitTime;
	}

	@Override
	public BaseDTO getDto() {

		ParkingSlotDTO dto = initDTO(new ParkingSlotDTO());
		dto.setVehicleNumber(vehicleNumber);
		dto.setSlotNo(slotNo);
		dto.setEntrytime(entrytime);
		dto.setExitTime(exitTime);
		return dto;
	}

}
