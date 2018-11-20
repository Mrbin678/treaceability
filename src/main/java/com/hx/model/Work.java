package com.hx.model;

import java.util.Date;
/**
 * 上工信息表
 * @author Mr-BIN
 *
 */
public class Work {
   
	private Integer id;//自增ID

    private String orderCode;//订单编号

    private String content;//工作内容

    private String operator1;//工序1的员工ID

    private String operator2;//工序2的员工ID

    private String operator3;//工序3的员工ID

    private String operator4;//工序4的员工ID

    private String operator5;//工序5的员工ID

    private String operator6;//工序6的员工ID

    private String operator7;//工序7的员工ID

    private String operator8;//工序8的员工ID

    private String operator9;//工序9的员工ID

    private String operator10;//工序10的员工ID

    private String operator11;//工序11的员工ID

    private String operator12;//工序12的员工ID

    private String operator13;//工序13的员工ID

    private String operator14;//工序14的员工ID

    private String operator15;//工序15的员工ID

    private String status;//状态  默认"新建"

    private Date createdAt;//创建日期

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getOperator1() {
        return operator1;
    }

    public void setOperator1(String operator1) {
        this.operator1 = operator1 == null ? null : operator1.trim();
    }

    public String getOperator2() {
        return operator2;
    }

    public void setOperator2(String operator2) {
        this.operator2 = operator2 == null ? null : operator2.trim();
    }

    public String getOperator3() {
        return operator3;
    }

    public void setOperator3(String operator3) {
        this.operator3 = operator3 == null ? null : operator3.trim();
    }

    public String getOperator4() {
        return operator4;
    }

    public void setOperator4(String operator4) {
        this.operator4 = operator4 == null ? null : operator4.trim();
    }

    public String getOperator5() {
        return operator5;
    }

    public void setOperator5(String operator5) {
        this.operator5 = operator5 == null ? null : operator5.trim();
    }

    public String getOperator6() {
        return operator6;
    }

    public void setOperator6(String operator6) {
        this.operator6 = operator6 == null ? null : operator6.trim();
    }

    public String getOperator7() {
        return operator7;
    }

    public void setOperator7(String operator7) {
        this.operator7 = operator7 == null ? null : operator7.trim();
    }

    public String getOperator8() {
        return operator8;
    }

    public void setOperator8(String operator8) {
        this.operator8 = operator8 == null ? null : operator8.trim();
    }

    public String getOperator9() {
        return operator9;
    }

    public void setOperator9(String operator9) {
        this.operator9 = operator9 == null ? null : operator9.trim();
    }

    public String getOperator10() {
        return operator10;
    }

    public void setOperator10(String operator10) {
        this.operator10 = operator10 == null ? null : operator10.trim();
    }

    public String getOperator11() {
        return operator11;
    }

    public void setOperator11(String operator11) {
        this.operator11 = operator11 == null ? null : operator11.trim();
    }

    public String getOperator12() {
        return operator12;
    }

    public void setOperator12(String operator12) {
        this.operator12 = operator12 == null ? null : operator12.trim();
    }

    public String getOperator13() {
        return operator13;
    }

    public void setOperator13(String operator13) {
        this.operator13 = operator13 == null ? null : operator13.trim();
    }

    public String getOperator14() {
        return operator14;
    }

    public void setOperator14(String operator14) {
        this.operator14 = operator14 == null ? null : operator14.trim();
    }

    public String getOperator15() {
        return operator15;
    }

    public void setOperator15(String operator15) {
        this.operator15 = operator15 == null ? null : operator15.trim();
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
}