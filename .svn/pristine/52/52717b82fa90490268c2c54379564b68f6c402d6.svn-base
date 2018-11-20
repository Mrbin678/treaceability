package com.hx.mapper;

import com.hx.model.Shell;
import org.apache.ibatis.jdbc.SQL;

public class ShellSqlProvider {

    public String insertSelective(Shell record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("shells");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getCode() != null) {
            sql.VALUES("code", "#{code,jdbcType=VARCHAR}");
        }
        
        if (record.getWorkId() != null) {
            sql.VALUES("work_id", "#{workId,jdbcType=INTEGER}");
        }
        
        if (record.getFactory() != null) {
            sql.VALUES("factory", "#{factory,jdbcType=VARCHAR}");
        }
        
        if (record.getValveFactory() != null) {
            sql.VALUES("valve_factory", "#{valveFactory,jdbcType=VARCHAR}");
        }
        
        if (record.getValveType() != null) {
            sql.VALUES("valve_type", "#{valveType,jdbcType=VARCHAR}");
        }
        
        if (record.getTypes() != null) {
            sql.VALUES("types", "#{types,jdbcType=VARCHAR}");
        }
        
        if (record.getNote() != null) {
            sql.VALUES("note", "#{note,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.VALUES("created_at", "#{createdAt,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Shell record) {
        SQL sql = new SQL();
        sql.UPDATE("shells");
        
        if (record.getCode() != null) {
            sql.SET("code = #{code,jdbcType=VARCHAR}");
        }
        
        if (record.getWorkId() != null) {
        	sql.SET("work_id = #{workId,jdbcType=INTEGER}");
        }
        
        if (record.getFactory() != null) {
            sql.SET("factory = #{factory,jdbcType=VARCHAR}");
        }
        
        if (record.getValveFactory() != null) {
            sql.SET("valve_factory = #{valveFactory,jdbcType=VARCHAR}");
        }
        
        if (record.getValveType() != null) {
            sql.SET("valve_type = #{valveType,jdbcType=VARCHAR}");
        }
        
        if (record.getTypes() != null) {
            sql.SET("types = #{types,jdbcType=VARCHAR}");
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