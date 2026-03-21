package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ScheduleDTO;

public class ScheduleForm extends BaseForm {
	
	@NotEmpty(message = "scheduleCode is required")
	private String scheduleCode;
	
	@NotEmpty(message = "scheduleName is required")
	private String scheduleName;
	
	@NotNull(message = "scheduledTime is required")
	private Date scheduledTime;
	
	@NotEmpty(message = "scheduleStatus is required")
	private String scheduleStatus;

	public String getScheduleCode() {
		return scheduleCode;
	}

	public void setScheduleCode(String scheduleCode) {
		this.scheduleCode = scheduleCode;
	}

	public String getScheduleName() {
		return scheduleName;
	}

	public void setScheduleName(String scheduleName) {
		this.scheduleName = scheduleName;
	}

	public Date getScheduledTime() {
		return scheduledTime;
	}

	public void setScheduledTime(Date scheduledTime) {
		this.scheduledTime = scheduledTime;
	}

	public String getScheduleStatus() {
		return scheduleStatus;
	}

	public void setScheduleStatus(String scheduleStatus) {
		this.scheduleStatus = scheduleStatus;
	}

	@Override
	public BaseDTO getDto() {
		
		ScheduleDTO dto = initDTO(new ScheduleDTO());
		dto.setScheduleCode(scheduleCode);
		dto.setScheduleName(scheduleName);
		dto.setScheduledTime(scheduledTime);
		dto.setScheduleStatus(scheduleStatus);
		return dto;
	}
}
