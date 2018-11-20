package com.hx.util.common;																																																																																																																																														

public enum AuthCode {
	Allow("0", "Accept", "允许访问"),
	/**客户权限*/
	DeleteOrder("1", "DeleteOrder", "删除订单数据"),
	UpdateOrder("2", "UpdateOrder", "编辑订单数据"),
	DeleteProduction("3", "DeleteProduction", "删除生产数据"),
	UpdateProduction("4", "UpdateProduction", "编辑生产数据"),
	DeleteDetection("5", "DeleteDetection", "删除质检数据"),
	UpdateDetection("6", "UpdateDetection", "编辑质检数据"),
	DeleteRepair("7", "DeleteRepair", "删除维修数据"),
	UpdateRepair("8", "UpdateRepair", "编辑维修数据"),
	DeleteShipment("9", "DeleteShipment", "删除发货数据"),
	UpdateShipment("10", "UpdateShipment", "编辑发货数据"),
	DeleteUser("11", "DeleteUser", "删除用户数据"),
	UpdateUser("12", "UpdateUser", "编辑用户数据"),
	DeleteDepartment("13", "DeleteDepartment", "删除部门数据"),
	UpdateDepartment("14", "UpdateDepartment", "编辑部门数据"),
	DeleteSysParam("15", "DeleteSysParam", "删除系统参数数据"),
	UpdateSysParam("16", "UpdateSysParam", "编辑系统参数数据"),
	DeleteBarcode("17", "DeleteBarcode", "删除条码规则数据"),
	UpdateBarcode("18", "UpdateBarcode", "编辑条码规则数据"),
	AssignRight("19", "AssignRight", "分配权限"), Error("20","Error","禁止");
	
	private String authId;
	private String authCode;
	private String authName;
	private String authDesc;
	
	private AuthCode(String authId, String authCode, String authName) {
		this.authId = authId;
		this.authCode = authCode;
		this.authName = authName;
	}
	private AuthCode(String authId, String authCode, String authName, String authDesc) {
		this.authId = authId;
		this.authCode = authCode;
		this.authName = authName;
		this.authDesc = authDesc;
	}
	public String getAuthId() {
		return authId;
	}
	public void setAuthId(String authId) {
		this.authId = authId;
	}
	public String getAuthCode() {
		return authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}
	public String getAuthName() {
		return authName;
	}
	public void setAuthName(String authName) {
		this.authName = authName;
	}
	public String getAuthDesc() {
		return authDesc;
	}
	public void setAuthDesc(String authDesc) {
		this.authDesc = authDesc;
	}
	
	
}
