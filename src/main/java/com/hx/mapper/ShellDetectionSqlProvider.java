package com.hx.mapper;

import com.hx.model.ShellDetection;
import org.apache.ibatis.jdbc.SQL;

public class ShellDetectionSqlProvider {

    public String insertSelective(ShellDetection record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("shell_detections");
        
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
        
        if (record.getShellCode() != null) {
            sql.VALUES("shell_code", "#{shellCode,jdbcType=VARCHAR}");
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
        
        if (record.getLeakageTest() != null) {
            sql.VALUES("leakage_test", "#{leakageTest,jdbcType=VARCHAR}");
        }
        
        if (record.getWaterTest() != null) {
            sql.VALUES("water_test", "#{waterTest,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(ShellDetection record) {
        SQL sql = new SQL();
        sql.UPDATE("shell_detections");
        
        if (record.getOrderCode() != null) {
            sql.SET("order_code = #{orderCode,jdbcType=VARCHAR}");
        }
        
        if (record.getOperatorId() != null) {
            sql.SET("operator_id = #{operatorId,jdbcType=INTEGER}");
        }
        
        if (record.getOperator() != null) {
            sql.SET("operator = #{operator,jdbcType=VARCHAR}");
        }
        
        if (record.getShellCode() != null) {
            sql.SET("shell_code = #{shellCode,jdbcType=VARCHAR}");
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
        
        if (record.getLeakageTest() != null) {
            sql.SET("leakage_test = #{leakageTest,jdbcType=VARCHAR}");
        }
        
        if (record.getWaterTest() != null) {
            sql.SET("water_test = #{waterTest,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}