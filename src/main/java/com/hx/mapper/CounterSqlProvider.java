package com.hx.mapper;

import com.hx.model.Counter;
import org.apache.ibatis.jdbc.SQL;

public class CounterSqlProvider {

    public String insertSelective(Counter record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("counters");
        
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
        
        if (record.getNote() != null) {
            sql.VALUES("note", "#{note,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.VALUES("created_at", "#{createdAt,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Counter record) {
        SQL sql = new SQL();
        sql.UPDATE("counters");
        
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
        
        if (record.getNote() != null) {
            sql.SET("note = #{note,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{createdAt,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}