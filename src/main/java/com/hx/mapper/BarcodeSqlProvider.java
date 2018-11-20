package com.hx.mapper;

import com.hx.model.Barcode;
import org.apache.ibatis.jdbc.SQL;

public class BarcodeSqlProvider {

    public String insertSelective(Barcode record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("barcodes");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getBeginCode() != null) {
            sql.VALUES("begin_code", "#{beginCode,jdbcType=VARCHAR}");
        }
        
        if (record.getEndCode() != null) {
            sql.VALUES("end_code", "#{endCode,jdbcType=VARCHAR}");
        }
        
        if (record.getCodeLength() != null) {
            sql.VALUES("code_length", "#{codeLength,jdbcType=INTEGER}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.VALUES("created_at", "#{createdAt,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Barcode record) {
        SQL sql = new SQL();
        sql.UPDATE("barcodes");
        
        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getBeginCode() != null) {
            sql.SET("begin_code = #{beginCode,jdbcType=VARCHAR}");
        }
        
        if (record.getEndCode() != null) {
            sql.SET("end_code = #{endCode,jdbcType=VARCHAR}");
        }
        
        if (record.getCodeLength() != null) {
            sql.SET("code_length = #{codeLength,jdbcType=INTEGER}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{createdAt,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}