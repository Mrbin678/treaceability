package com.hx.mapper;

import com.hx.model.PackageDetail;
import org.apache.ibatis.jdbc.SQL;

public class PackageDetailSqlProvider {

    public String insertSelective(PackageDetail record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("package_details");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getPackageCode() != null) {
            sql.VALUES("package_code", "#{packageCode,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderCode() != null) {
            sql.VALUES("order_code", "#{orderCode,jdbcType=VARCHAR}");
        }
        
        if (record.getFactoryCode() != null) {
            sql.VALUES("factory_code", "#{factoryCode,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.VALUES("created_at", "#{createdAt,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(PackageDetail record) {
        SQL sql = new SQL();
        sql.UPDATE("package_details");
        
        if (record.getPackageCode() != null) {
            sql.SET("package_code = #{packageCode,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderCode() != null) {
            sql.SET("order_code = #{orderCode,jdbcType=VARCHAR}");
        }
        
        if (record.getFactoryCode() != null) {
            sql.SET("factory_code = #{factoryCode,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{createdAt,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}