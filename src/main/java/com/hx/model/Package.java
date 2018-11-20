package com.hx.model;

import java.util.Date;
import java.util.List;
//装箱信息
public class Package {
    private Integer id;//自增ID

    private String code;//装箱的编号/条码

    private String orderCode;//订单编号条码

    private Integer operatorId;//包装员工ID

    private Integer meterCount;//基表数量

    private String note;//描述

    private Date createdAt;//创建日期

    private String operator;//包装员工
    
    private List<PackageDetail> details;

    
    public List<PackageDetail> getDetails() {
		return details;
	}

	public void setDetails(List<PackageDetail> details) {
		this.details = details;
	}

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

    public Integer getMeterCount() {
        return meterCount;
    }

    public void setMeterCount(Integer meterCount) {
        this.meterCount = meterCount;
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

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }
}