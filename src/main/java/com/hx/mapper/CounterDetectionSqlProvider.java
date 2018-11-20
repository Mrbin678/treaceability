package com.hx.mapper;

import com.hx.model.CounterDetection;
import org.apache.ibatis.jdbc.SQL;

public class CounterDetectionSqlProvider {

    public String insertSelective(CounterDetection record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("counter_detections");
        
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
        
        if (record.getCounterCode() != null) {
            sql.VALUES("counter_code", "#{counterCode,jdbcType=VARCHAR}");
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
        
        if (record.getLockTest() != null) {
            sql.VALUES("lock_test", "#{lockTest,jdbcType=VARCHAR}");
        }
        
        if (record.getCountTest() != null) {
            sql.VALUES("count_test", "#{countTest,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(CounterDetection record) {
        SQL sql = new SQL();
        sql.UPDATE("counter_detections");
        
        if (record.getOrderCode() != null) {
            sql.SET("order_code = #{orderCode,jdbcType=VARCHAR}");
        }
        
        if (record.getOperatorId() != null) {
            sql.SET("operator_id = #{operatorId,jdbcType=INTEGER}");
        }
        
        if (record.getOperator() != null) {
            sql.SET("operator = #{operator,jdbcType=VARCHAR}");
        }
        
        if (record.getCounterCode() != null) {
            sql.SET("counter_code = #{counterCode,jdbcType=VARCHAR}");
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
        
        if (record.getLockTest() != null) {
            sql.SET("lock_test = #{lockTest,jdbcType=VARCHAR}");
        }
        
        if (record.getCountTest() != null) {
            sql.SET("count_test = #{countTest,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}