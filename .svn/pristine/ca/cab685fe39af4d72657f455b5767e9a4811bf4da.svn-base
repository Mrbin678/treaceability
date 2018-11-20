package com.hx.mapper;

import com.hx.model.SystemParam;
import org.apache.ibatis.jdbc.SQL;

public class SystemParamSqlProvider {

    public String insertSelective(SystemParam record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("system_params");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getParamTypes() != null) {
            sql.VALUES("param_types", "#{paramTypes,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getParamValue() != null) {
            sql.VALUES("param_value", "#{paramValue,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(SystemParam record) {
        SQL sql = new SQL();
        sql.UPDATE("system_params");
        
        if (record.getParamTypes() != null) {
            sql.SET("param_types = #{paramTypes,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getParamValue() != null) {
            sql.SET("param_value = #{paramValue,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}