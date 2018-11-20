package com.hx.model;

import java.util.Date;

public class HeaderDetection {
    private Integer id;

    private String orderCode;

    private Integer operatorId;

    private String operator;

    private String headerCode;

    private String detection;

    private String note;

    private Date createdAt;

    private String voltageTest;

    private String highTemperatureTest;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getHeaderCode() {
        return headerCode;
    }

    public void setHeaderCode(String headerCode) {
        this.headerCode = headerCode == null ? null : headerCode.trim();
    }

    public String getDetection() {
        return detection;
    }

    public void setDetection(String detection) {
        this.detection = detection == null ? null : detection.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getVoltageTest() {
        return voltageTest;
    }

    public void setVoltageTest(String voltageTest) {
        this.voltageTest = voltageTest == null ? null : voltageTest.trim();
    }

    public String getHighTemperatureTest() {
        return highTemperatureTest;
    }

    public void setHighTemperatureTest(String highTemperatureTest) {
        this.highTemperatureTest = highTemperatureTest == null ? null : highTemperatureTest.trim();
    }
}