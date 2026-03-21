package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.NotificationLogDTO;

public class NotificationLogForm extends BaseForm {

    @NotEmpty(message = "Log Code is required")
    private String logCode;

    @NotEmpty(message = "Notification Type is required")
    private String notificationType;

    @NotNull(message = "Sent Time is required")
    private Date sentTime;

    @NotEmpty(message = "Log Status is required")
    private String logStatus;

    // Getters & Setters

    public String getLogCode() {
        return logCode;
    }

    public void setLogCode(String logCode) {
        this.logCode = logCode;
    }

    public String getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    public Date getSentTime() {
        return sentTime;
    }

    public void setSentTime(Date sentTime) {
        this.sentTime = sentTime;
    }

    public String getLogStatus() {
        return logStatus;
    }

    public void setLogStatus(String logStatus) {
        this.logStatus = logStatus;
    }

    @Override
    public BaseDTO getDto() {

        NotificationLogDTO dto = initDTO(new NotificationLogDTO());

        dto.setLogCode(logCode);
        dto.setNotificationType(notificationType);
        dto.setSentTime(sentTime);
        dto.setLogStatus(logStatus);

        return dto;
    }
}