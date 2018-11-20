package com.hx.mapper;

import com.hx.model.Work;
import org.apache.ibatis.jdbc.SQL;

public class WorkSqlProvider {

    public String insertSelective(Work record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("works");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getOrderCode() != null) {
            sql.VALUES("order_code", "#{orderCode,jdbcType=VARCHAR}");
        }
        
        if (record.getContent() != null) {
            sql.VALUES("content", "#{content,jdbcType=VARCHAR}");
        }
        
        if (record.getOperator1() != null) {
            sql.VALUES("operator1", "#{operator1,jdbcType=VARCHAR}");
        }
        
        if (record.getOperator2() != null) {
            sql.VALUES("operator2", "#{operator2,jdbcType=VARCHAR}");
        }
        
        if (record.getOperator3() != null) {
            sql.VALUES("operator3", "#{operator3,jdbcType=VARCHAR}");
        }
        
        if (record.getOperator4() != null) {
            sql.VALUES("operator4", "#{operator4,jdbcType=VARCHAR}");
        }
        
        if (record.getOperator5() != null) {
            sql.VALUES("operator5", "#{operator5,jdbcType=VARCHAR}");
        }
        
        if (record.getOperator6() != null) {
            sql.VALUES("operator6", "#{operator6,jdbcType=VARCHAR}");
        }
        
        if (record.getOperator7() != null) {
            sql.VALUES("operator7", "#{operator7,jdbcType=VARCHAR}");
        }
        
        if (record.getOperator8() != null) {
            sql.VALUES("operator8", "#{operator8,jdbcType=VARCHAR}");
        }
        
        if (record.getOperator9() != null) {
            sql.VALUES("operator9", "#{operator9,jdbcType=VARCHAR}");
        }
        
        if (record.getOperator10() != null) {
            sql.VALUES("operator10", "#{operator10,jdbcType=VARCHAR}");
        }
        
        if (record.getOperator11() != null) {
            sql.VALUES("operator11", "#{operator11,jdbcType=VARCHAR}");
        }
        
        if (record.getOperator12() != null) {
            sql.VALUES("operator12", "#{operator12,jdbcType=VARCHAR}");
        }
        
        if (record.getOperator13() != null) {
            sql.VALUES("operator13", "#{operator13,jdbcType=VARCHAR}");
        }
        
        if (record.getOperator14() != null) {
            sql.VALUES("operator14", "#{operator14,jdbcType=VARCHAR}");
        }
        
        if (record.getOperator15() != null) {
            sql.VALUES("operator15", "#{operator15,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.VALUES("created_at", "#{createdAt,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Work record) {
        SQL sql = new SQL();
        sql.UPDATE("works");
        
        if (record.getOrderCode() != null) {
            sql.SET("order_code = #{orderCode,jdbcType=VARCHAR}");
        }
        
        if (record.getContent() != null) {
            sql.SET("content = #{content,jdbcType=VARCHAR}");
        }
        
        if (record.getOperator1() != null) {
            sql.SET("operator1 = #{operator1,jdbcType=VARCHAR}");
        }
        
        if (record.getOperator2() != null) {
            sql.SET("operator2 = #{operator2,jdbcType=VARCHAR}");
        }
        
        if (record.getOperator3() != null) {
            sql.SET("operator3 = #{operator3,jdbcType=VARCHAR}");
        }
        
        if (record.getOperator4() != null) {
            sql.SET("operator4 = #{operator4,jdbcType=VARCHAR}");
        }
        
        if (record.getOperator5() != null) {
            sql.SET("operator5 = #{operator5,jdbcType=VARCHAR}");
        }
        
        if (record.getOperator6() != null) {
            sql.SET("operator6 = #{operator6,jdbcType=VARCHAR}");
        }
        
        if (record.getOperator7() != null) {
            sql.SET("operator7 = #{operator7,jdbcType=VARCHAR}");
        }
        
        if (record.getOperator8() != null) {
            sql.SET("operator8 = #{operator8,jdbcType=VARCHAR}");
        }
        
        if (record.getOperator9() != null) {
            sql.SET("operator9 = #{operator9,jdbcType=VARCHAR}");
        }
        
        if (record.getOperator10() != null) {
            sql.SET("operator10 = #{operator10,jdbcType=VARCHAR}");
        }
        
        if (record.getOperator11() != null) {
            sql.SET("operator11 = #{operator11,jdbcType=VARCHAR}");
        }
        
        if (record.getOperator12() != null) {
            sql.SET("operator12 = #{operator12,jdbcType=VARCHAR}");
        }
        
        if (record.getOperator13() != null) {
            sql.SET("operator13 = #{operator13,jdbcType=VARCHAR}");
        }
        
        if (record.getOperator14() != null) {
            sql.SET("operator14 = #{operator14,jdbcType=VARCHAR}");
        }
        
        if (record.getOperator15() != null) {
            sql.SET("operator15 = #{operator15,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{createdAt,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}