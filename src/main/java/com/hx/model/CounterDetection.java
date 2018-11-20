package com.hx.model;

import java.util.Date;
//计数器检验信息表
public class CounterDetection {
    private Integer id;//自增ID 

    private String orderCode;//订单编号条码

    private Integer operatorId;//检验员ID

    private String operator;//检验员

    private String counterCode;//计数器条码

    private String detection;//检验结果

    private String note;//描述

    private Date createdAt;//创建日期
    
    private String lockTest;

    private String countTest;

    public CounterDetection() {
		super();
	}

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

    public String getCounterCode() {
        return counterCode;
    }

    public void setCounterCode(String counterCode) {
        this.counterCode = counterCode == null ? null : counterCode.trim();
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
    
	public String getLockTest() {
		return lockTest;
	}

	public void setLockTest(String lockTest) {
		this.lockTest = lockTest;
	}

	public String getCountTest() {
		return countTest;
	}

	public void setCountTest(String countTest) {
		this.countTest = countTest;
	}

	@Override
	public String toString() {
		return "CounterDetection [id=" + id + ", orderCode=" + orderCode
				+ ", operatorId=" + operatorId + ", operator=" + operator
				+ ", counterCode=" + counterCode + ", detection=" + detection
				+ ", note=" + note + ", createdAt=" + createdAt + "]";
	}
    
}