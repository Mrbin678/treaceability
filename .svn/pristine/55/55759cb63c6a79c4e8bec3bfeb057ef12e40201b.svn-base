package com.hx.mapper;

import com.hx.model.Meter;
import org.apache.ibatis.jdbc.SQL;

public class MeterSqlProvider {

    public String insertSelective(Meter record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("meters");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getCode() != null) {
            sql.VALUES("code", "#{code,jdbcType=VARCHAR}");
        }
        
        if (record.getFactoryCode() != null) {
            sql.VALUES("factory_code", "#{factoryCode,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderCode() != null) {
            sql.VALUES("order_code", "#{orderCode,jdbcType=VARCHAR}");
        }
        
        if (record.getWorkId() != null) {
            sql.VALUES("work_id", "#{workId,jdbcType=INTEGER}");
        }
        
        if (record.getTypes() != null) {
            sql.VALUES("types", "#{types,jdbcType=VARCHAR}");
        }
        
        if (record.getMeterType() != null) {
            sql.VALUES("meter_type", "#{meterType,jdbcType=VARCHAR}");
        }
        
        if (record.getHeaderCode() != null) {
            sql.VALUES("header_code", "#{headerCode,jdbcType=VARCHAR}");
        }
        
        if (record.getCounterCode() != null) {
            sql.VALUES("counter_code", "#{counterCode,jdbcType=VARCHAR}");
        }
        
        if (record.getInstallResult() != null) {
            sql.VALUES("install_result", "#{installResult,jdbcType=VARCHAR}");
        }
        
        if (record.getNote() != null) {
            sql.VALUES("note", "#{note,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.VALUES("created_at", "#{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getShellCode() != null) {
            sql.VALUES("shell_code", "#{shellCode,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Meter record) {
        SQL sql = new SQL();
        sql.UPDATE("meters");
        
        if (record.getCode() != null) {
            sql.SET("code = #{code,jdbcType=VARCHAR}");
        }
        
        if (record.getFactoryCode() != null) {
            sql.SET("factory_code = #{factoryCode,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderCode() != null) {
            sql.SET("order_code = #{orderCode,jdbcType=VARCHAR}");
        }
        
        if (record.getWorkId() != null) {
            sql.SET("work_id = #{workId,jdbcType=INTEGER}");
        }
        
        if (record.getTypes() != null) {
            sql.SET("types = #{types,jdbcType=VARCHAR}");
        }
        
        if (record.getMeterType() != null) {
            sql.SET("meter_type = #{meterType,jdbcType=VARCHAR}");
        }
        
        if (record.getHeaderCode() != null) {
            sql.SET("header_code = #{headerCode,jdbcType=VARCHAR}");
        }
        
        if (record.getCounterCode() != null) {
            sql.SET("counter_code = #{counterCode,jdbcType=VARCHAR}");
        }
        
        if (record.getInstallResult() != null) {
            sql.SET("install_result = #{installResult,jdbcType=VARCHAR}");
        }
        
        if (record.getNote() != null) {
            sql.SET("note = #{note,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getShellCode() != null) {
            sql.SET("shell_code = #{shellCode,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}