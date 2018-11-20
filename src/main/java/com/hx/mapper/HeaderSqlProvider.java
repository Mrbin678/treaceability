package com.hx.mapper;

import com.hx.model.Header;
import org.apache.ibatis.jdbc.SQL;

public class HeaderSqlProvider {

    public String insertSelective(Header record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("headers");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getCode() != null) {
            sql.VALUES("code", "#{code,jdbcType=VARCHAR}");
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
        
        if (record.getVersion() != null) {
            sql.VALUES("version", "#{version,jdbcType=VARCHAR}");
        }
        
        if (record.getNote() != null) {
            sql.VALUES("note", "#{note,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.VALUES("created_at", "#{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getValveTest() != null) {
            sql.VALUES("valve_test", "#{valveTest,jdbcType=VARCHAR}");
        }
        
        if (record.getElectricityTest() != null) {
            sql.VALUES("electricity_test", "#{electricityTest,jdbcType=VARCHAR}");
        }
        
        if (record.getProgramTest() != null) {
            sql.VALUES("program_test", "#{programTest,jdbcType=VARCHAR}");
        }
        
        if (record.getReadingTest() != null) {
            sql.VALUES("reading_test", "#{readingTest,jdbcType=VARCHAR}");
        }
        
        if (record.getTimeTest() != null) {
            sql.VALUES("time_test", "#{timeTest,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Header record) {
        SQL sql = new SQL();
        sql.UPDATE("headers");
        
        if (record.getCode() != null) {
            sql.SET("code = #{code,jdbcType=VARCHAR}");
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
        
        if (record.getVersion() != null) {
            sql.SET("version = #{version,jdbcType=VARCHAR}");
        }
        
        if (record.getNote() != null) {
            sql.SET("note = #{note,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getValveTest() != null) {
            sql.SET("valve_test = #{valveTest,jdbcType=VARCHAR}");
        }
        
        if (record.getElectricityTest() != null) {
            sql.SET("electricity_test = #{electricityTest,jdbcType=VARCHAR}");
        }
        
        if (record.getProgramTest() != null) {
            sql.SET("program_test = #{programTest,jdbcType=VARCHAR}");
        }
        
        if (record.getReadingTest() != null) {
            sql.SET("reading_test = #{readingTest,jdbcType=VARCHAR}");
        }
        
        if (record.getTimeTest() != null) {
            sql.SET("time_test = #{timeTest,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}