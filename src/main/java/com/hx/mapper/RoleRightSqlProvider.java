package com.hx.mapper;

import com.hx.model.RoleRight;
import org.apache.ibatis.jdbc.SQL;

public class RoleRightSqlProvider {

    public String insertSelective(RoleRight record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("role_rights");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getRoleId() != null) {
            sql.VALUES("role_id", "#{roleId,jdbcType=INTEGER}");
        }
        
        if (record.getRightId() != null) {
            sql.VALUES("right_id", "#{rightId,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(RoleRight record) {
        SQL sql = new SQL();
        sql.UPDATE("role_rights");
        
        if (record.getRoleId() != null) {
            sql.SET("role_id = #{roleId,jdbcType=INTEGER}");
        }
        
        if (record.getRightId() != null) {
            sql.SET("right_id = #{rightId,jdbcType=INTEGER}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}