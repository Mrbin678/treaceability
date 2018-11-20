package com.hx.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
//订单表
public class Order {
	
    private Integer id;//自增ID

    private String code;//编号/条码，年份+数字序号，唯一索引

    private Integer meterCount;//基表数量

    private String customer;//客户简称
    
    private String meterType;//基表类型，系统参数，有线表，无线表，短信表

    private String factory;//基表厂家，系统参数

    private String types;//规格型号，系统参数

    private String valve;//阀门信息，系统参数

    private String address;//发往地

    private String note;//描述

    private String status;//状态，新建，生产中，已发货，已作废
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdAt;//创建日期(下单日期)
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date orderDate;//交货日期(与客户约定的交货时间)

    public Order() {
		super();
		// TODO Auto-generated constructor stub
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

    public Integer getMeterCount() {
        return meterCount;
    }

    public void setMeterCount(Integer meterCount) {
        this.meterCount = meterCount;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer == null ? null : customer.trim();
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory == null ? null : factory.trim();
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types == null ? null : types.trim();
    }

    public String getValve() {
        return valve;
    }

    public void setValve(String valve) {
        this.valve = valve == null ? null : valve.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getMeterType() {
		return meterType;
	}

	public void setMeterType(String meterType) {
		this.meterType = meterType == null ? null : meterType.trim();
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", code=" + code + ", meterCount="
				+ meterCount + ", customer=" + customer + ", meterType="
				+ meterType + ", factory=" + factory + ", types=" + types
				+ ", valve=" + valve + ", address=" + address + ", note="
				+ note + ", status=" + status + ", createdAt=" + createdAt
				+ ", orderDate=" + orderDate + "]";
	}
    
}