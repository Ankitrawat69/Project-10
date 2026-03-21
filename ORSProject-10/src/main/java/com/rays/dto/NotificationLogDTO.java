package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "nt_notification_log")
public class NotificationLogDTO extends BaseDTO {

    @Column(name = "log_code", length = 50, unique = true)
    private String logCode;

    @Column(name = "notification_type", length = 50)
    private String notificationType;

    @Column(name = "sent_time")
    private Date sentTime;

    @Column(name = "log_status", length = 20)
    private String logStatus;

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
    public String getUniqueKey() {
        return "logCode";
    }

    @Override
    public String getUniqueValue() {
        return logCode;
    }

    @Override
    public String getLabel() {
        return "Log Code";
    }

    @Override
    public String getTableName() {
        return "Notification Log";
    }

    @Override
    public String getValue() {
        return logCode + " - " + notificationType;
    }
}