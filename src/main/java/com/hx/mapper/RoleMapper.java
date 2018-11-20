package com.hx.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

import com.hx.model.Role;
import com.hx.model.RoleRight;

public interface RoleMapper {
    @Delete({
        "delete from roles",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into roles (id, name, ",
        "status)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=VARCHAR})"
    })
    int insert(Role record);

    @InsertProvider(type=RoleSqlProvider.class, method="insertSelective")
    int insertSelective(Role record);

    @Select({
        "select",
        "id, name, status",
        "from roles",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),	
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR)
    })
    Role selectByPrimaryKey(Integer id);

    @UpdateProvider(type=RoleSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Role record);

    @Update({
        "update roles",
        "set name = #{name,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Role record);
    
    @Insert({
        "insert into roles (name, status) values (#{name,jdbcType=VARCHAR},#{status,jdbcType=VARCHAR})"
    })
	int addRole(Role role);
    
    @Select({
        "select id, name, status from roles"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR)
    })
	List<Role> findAll();
    
    @Delete({
        "delete from role_rights where role_id = #{role_id,jdbcType=INTEGER}"
    })
	int deleteRights(@Param(value = "role_id") Integer roleId);
    
    //添加权限
    @Insert({
        "insert into role_rights (role_id, right_id) values (#{roleId,jdbcType=VARCHAR},#{rightId,jdbcType=VARCHAR})"
    })
	void addRights(RoleRight rr);
    
    @Select({
        "select name from roles where id = #{id,jdbcType=INTEGER}"
    })
	String getRoleName(@Param(value = "id")Integer roleId);
    
}

