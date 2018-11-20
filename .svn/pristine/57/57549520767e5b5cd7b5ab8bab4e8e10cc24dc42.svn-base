package com.hx.mapper;

import com.hx.model.Order;
import org.apache.ibatis.jdbc.SQL;

public class OrderSqlProvider {

    public String insertSelective(Order record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("orders");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getCode() != null) {
            sql.VALUES("code", "#{code,jdbcType=VARCHAR}");
        }
        
        if (record.getMeterCount() != null) {
            sql.VALUES("meter_count", "#{meterCount,jdbcType=INTEGER}");
        }
        
        if (record.getCustomer() != null) {
            sql.VALUES("customer", "#{customer,jdbcType=VARCHAR}");
        }
        
        if (record.getFactory() != null) {
            sql.VALUES("factory", "#{factory,jdbcType=VARCHAR}");
        }
        
        if (record.getTypes() != null) {
            sql.VALUES("types", "#{types,jdbcType=VARCHAR}");
        }
        
        if (record.getValve() != null) {
            sql.VALUES("valve", "#{valve,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            sql.VALUES("address", "#{address,jdbcType=VARCHAR}");
        }
        
        if (record.getNote() != null) {
            sql.VALUES("note", "#{note,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.VALUES("created_at", "#{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderDate() != null) {
            sql.VALUES("order_date", "#{orderDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMeterType() != null) {
            sql.VALUES("meter_type", "#{meterType,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Order record) {
        SQL sql = new SQL();
        sql.UPDATE("orders");
        
        if (record.getCode() != null) {
            sql.SET("code = #{code,jdbcType=VARCHAR}");
        }
        
        if (record.getMeterCount() != null) {
            sql.SET("meter_count = #{meterCount,jdbcType=INTEGER}");
        }
        
        if (record.getCustomer() != null) {
            sql.SET("customer = #{customer,jdbcType=VARCHAR}");
        }
        
        if (record.getFactory() != null) {
            sql.SET("factory = #{factory,jdbcType=VARCHAR}");
        }
        
        if (record.getTypes() != null) {
            sql.SET("types = #{types,jdbcType=VARCHAR}");
        }
        
        if (record.getValve() != null) {
            sql.SET("valve = #{valve,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            sql.SET("address = #{address,jdbcType=VARCHAR}");
        }
        
        if (record.getNote() != null) {
            sql.SET("note = #{note,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderDate() != null) {
            sql.SET("order_date = #{orderDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMeterType() != null) {
            sql.SET("meter_type = #{meterType,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}