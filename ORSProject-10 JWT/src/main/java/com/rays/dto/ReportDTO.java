package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_report")
public class ReportDTO extends BaseDTO {
	
	@Column(name = "reportId", length = 50)
	private String reportId;
	
	@Column(name = "reportType", length = 50)
	private String reportType;
	
	@Column(name = "generatedDate", length = 50)
	private Date generatedDate;
	
	@Column(name = "remarks", length = 50)
	private String remarks;

	public String getReportId() {
		return reportId;
	}

	public void setReportId(String reportId) {
		this.reportId = reportId;
	}

	public String getReportType() {
		return reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public Date getGeneratedDate() {
		return generatedDate;
	}

	public void setGeneratedDate(Date generatedDate) {
		this.generatedDate = generatedDate;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String getValue() {
		return reportId;
	}

	@Override
	public String getUniqueKey() {
		return "reportId";
	}

	@Override
	public String getUniqueValue() {
		return reportId;
	}

	@Override
	public String getLabel() {
		return "Report Id";
	}

	@Override
	public String getTableName() {
		return "Report";
	}

}
