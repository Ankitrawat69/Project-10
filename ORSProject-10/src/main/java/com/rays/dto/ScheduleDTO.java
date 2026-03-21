package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_schedule")
public class ScheduleDTO extends BaseDTO {
	
	@Column(name = "ScheduleCode", length = 50)
	private String scheduleCode;
	
	@Column(name = "ScheduleName",length = 50)
	private String scheduleName;
	
	@Column(name = "ScheduledTime")
	private Date scheduledTime;
	
	@Column(name = "ScheduleStatus", length = 50)
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
	public String getValue() {
		return scheduleCode;
	}

	@Override
	public String getUniqueKey() {
		return "scheduleCode";
	}

	@Override
	public String getUniqueValue() {
		return scheduleCode;
	}

	@Override
	public String getLabel() {
		return "Schedule Code";
	}

	@Override
	public String getTableName() {
		return "schedule";
	}

}
