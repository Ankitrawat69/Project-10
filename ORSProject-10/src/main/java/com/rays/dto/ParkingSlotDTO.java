package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_parking")
public class ParkingSlotDTO extends BaseDTO {

	@Column(name = "vehicleNumber", length = 50, unique = true)
	private String vehicleNumber;

	@Column(name = "Slotno", length = 50)
	private String slotNo;

	@Column(name = "entrytime")
	private Date entrytime;

	@Column(name = "exitTime")
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
	public String getUniqueKey() {
		return "vehicleNumber";
	}

	@Override
	public String getUniqueValue() {
		return vehicleNumber;
	}

	@Override
	public String getLabel() {
		return "Vehicle Number";
	}

	@Override
	public String getTableName() {
		return "Parking";
	}

	@Override
	public String getValue() {
		return vehicleNumber;
	}
}
