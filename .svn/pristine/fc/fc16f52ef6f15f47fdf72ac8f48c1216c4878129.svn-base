package com.hx.mapper;

import com.hx.model.Shipment;
import org.apache.ibatis.jdbc.SQL;

public class ShipmentSqlProvider {

    public String insertSelective(Shipment record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("shipments");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getShipCode() != null) {
            sql.VALUES("ship_code", "#{shipCode,jdbcType=VARCHAR}");
        }
        
        if (record.getOperator() != null) {
            sql.VALUES("operator", "#{operator,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsInfo() != null) {
            sql.VALUES("goods_info", "#{goodsInfo,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.VALUES("created_at", "#{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMeterCount() != null) {
            sql.VALUES("meter_count", "#{meterCount,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Shipment record) {
        SQL sql = new SQL();
        sql.UPDATE("shipments");
        
        if (record.getShipCode() != null) {
            sql.SET("ship_code = #{shipCode,jdbcType=VARCHAR}");
        }
        
        if (record.getOperator() != null) {
            sql.SET("operator = #{operator,jdbcType=VARCHAR}");
        }
        
        if (record.getGoodsInfo() != null) {
            sql.SET("goods_info = #{goodsInfo,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMeterCount() != null) {
            sql.SET("meter_count = #{meterCount,jdbcType=INTEGER}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}