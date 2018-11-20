package com.hx.mapper;

import com.hx.model.HeaderDetection;
import org.apache.ibatis.jdbc.SQL;

public class HeaderDetectionSqlProvider {

    public String insertSelective(HeaderDetection record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("header_detections");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getOrderCode() != null) {
            sql.VALUES("order_code", "#{orderCode,jdbcType=VARCHAR}");
        }
        
        if (record.getOperatorId() != null) {
            sql.VALUES("operator_id", "#{operatorId,jdbcType=INTEGER}");
        }
        
        if (record.getOperator() != null) {
            sql.VALUES("operator", "#{operator,jdbcType=VARCHAR}");
        }
        
        if (record.getHeaderCode() != null) {
            sql.VALUES("header_code", "#{headerCode,jdbcType=VARCHAR}");
        }
        
        if (record.getDetection() != null) {
            sql.VALUES("detection", "#{detection,jdbcType=VARCHAR}");
        }
        
        if (record.getNote() != null) {
            sql.VALUES("note", "#{note,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.VALUES("created_at", "#{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getVoltageTest() != null) {
            sql.VALUES("voltage_test", "#{voltageTest,jdbcType=VARCHAR}");
        }
        
        if (record.getHighTemperatureTest() != null) {
            sql.VALUES("high_temperature_test", "#{highTemperatureTest,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(HeaderDetection record) {
        SQL sql = new SQL();
        sql.UPDATE("header_detections");
        
        if (record.getOrderCode() != null) {
            sql.SET("order_code = #{orderCode,jdbcType=VARCHAR}");
        }
        
        if (record.getOperatorId() != null) {
            sql.SET("operator_id = #{operatorId,jdbcType=INTEGER}");
        }
        
        if (record.getOperator() != null) {
            sql.SET("operator = #{operator,jdbcType=VARCHAR}");
        }
        
        if (record.getHeaderCode() != null) {
            sql.SET("header_code = #{headerCode,jdbcType=VARCHAR}");
        }
        
        if (record.getDetection() != null) {
            sql.SET("detection = #{detection,jdbcType=VARCHAR}");
        }
        
        if (record.getNote() != null) {
            sql.SET("note = #{note,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getVoltageTest() != null) {
            sql.SET("voltage_test = #{voltageTest,jdbcType=VARCHAR}");
        }
        
        if (record.getHighTemperatureTest() != null) {
            sql.SET("high_temperature_test = #{highTemperatureTest,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}