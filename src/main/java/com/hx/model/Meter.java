package com.hx.model;

import java.util.Date;
//基表信息表
public class Meter {
    private Integer id;//自增ID

    private String code;//编号？	字段保留

    private String factoryCode;//基表出厂编号

    private String orderCode;//订单编号条码

    private Integer workId;//上工信息ID

    private String types;//基表规格型号

    private String meterType;//基表类型：系统参数，有线表，无线表，短信表

    private String headerCode;//表头板编号条码

    private String counterCode;//计数器编号条码
    
    private String shellCode;	//++表壳编号条码

    private String installResult;//装配调试结果

    private String note;//描述

    private Date createdAt;//创建日期

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getFactoryCode() {
        return factoryCode;
    }

    public void setFactoryCode(String factoryCode) {
        this.factoryCode = factoryCode == null ? null : factoryCode.trim();
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public Integer getWorkId() {
        return workId;
    }

    public void setWorkId(Integer workId) {
        this.workId = workId;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types == null ? null : types.trim();
    }

    public String getMeterType() {
        return meterType;
    }

    public void setMeterType(String meterType) {
        this.meterType = meterType == null ? null : meterType.trim();
    }

    public String getHeaderCode() {
        return headerCode;
    }

    public void setHeaderCode(String headerCode) {
        this.headerCode = headerCode == null ? null : headerCode.trim();
    }

    public String getCounterCode() {
        return counterCode;
    }

    public void setCounterCode(String counterCode) {
        this.counterCode = counterCode == null ? null : counterCode.trim();
    }

    public String getShellCode() {
		return shellCode;
	}

	public void setShellCode(String shellCode) {
		this.shellCode = shellCode;
	}

	public String getInstallResult() {
        return installResult;
    }

    public void setInstallResult(String installResult) {
        this.installResult = installResult == null ? null : installResult.trim();
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
}