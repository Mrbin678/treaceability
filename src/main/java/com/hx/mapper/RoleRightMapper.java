package com.hx.mapper;

import com.hx.model.RoleRight;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface RoleRightMapper {
    @Delete({
        "delete from role_rights",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into role_rights (id, role_id, ",
        "right_id)",
        "values (#{id,jdbcType=INTEGER}, #{roleId,jdbcType=INTEGER}, ",
        "#{rightId,jdbcType=INTEGER})"
    })
    int insert(RoleRight record);

    @InsertProvider(type=RoleRightSqlProvider.class, method="insertSelective")
    int insertSelective(RoleRight record);

    @Select({
        "select",
        "id, role_id, right_id",
        "from role_rights",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="role_id", property="roleId", jdbcType=JdbcType.INTEGER),
        @Result(column="right_id", property="rightId", jdbcType=JdbcType.INTEGER)
    })
    RoleRight selectByPrimaryKey(Integer id);

    @UpdateProvider(type=RoleRightSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(RoleRight record);

    @Update({
        "update role_rights",
        "set role_id = #{roleId,jdbcType=INTEGER},",
          "right_id = #{rightId,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(RoleRight record);
}