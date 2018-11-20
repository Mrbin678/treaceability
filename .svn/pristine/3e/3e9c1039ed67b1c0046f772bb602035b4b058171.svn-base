package com.hx.mapper;

import com.hx.model.Goods;
import org.apache.ibatis.jdbc.SQL;

public class GoodsSqlProvider {

    public String insertSelective(Goods record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("goods");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getShipCode() != null) {
            sql.VALUES("ship_code", "#{shipCode,jdbcType=VARCHAR}");
        }
        
        if (record.getPackageCode() != null) {
            sql.VALUES("package_code", "#{packageCode,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.VALUES("created_at", "#{createdAt,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Goods record) {
        SQL sql = new SQL();
        sql.UPDATE("goods");
        
        if (record.getShipCode() != null) {
            sql.SET("ship_code = #{shipCode,jdbcType=VARCHAR}");
        }
        
        if (record.getPackageCode() != null) {
            sql.SET("package_code = #{packageCode,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{createdAt,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}