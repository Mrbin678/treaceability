package com.hx.mapper;

import java.util.List;

import com.hx.model.Repair;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface RepairMapper {
    @Delete({
        "delete from repairs",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into repairs (id, device_code, ",
        "operator, types, ",
        "content, source, ",
        "created_at, operator_id)",
        "values (#{id,jdbcType=INTEGER}, #{deviceCode,jdbcType=VARCHAR}, ",
        "#{operator,jdbcType=VARCHAR}, #{types,jdbcType=VARCHAR}, ",
        "#{content,jdbcType=VARCHAR}, #{source,jdbcType=VARCHAR}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{operatorId,jdbcType=INTEGER})"
    })
    int insert(Repair record);

    @InsertProvider(type=RepairSqlProvider.class, method="insertSelective")
    int insertSelective(Repair record);

    @Select({
        "select",
        "id, device_code, operator, types, content, source, created_at, operator_id",
        "from repairs",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="device_code", property="deviceCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator", property="operator", jdbcType=JdbcType.VARCHAR),
        @Result(column="types", property="types", jdbcType=JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="source", property="source", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="operator_id", property="operatorId", jdbcType=JdbcType.INTEGER)
    })
    Repair selectByPrimaryKey(Integer id);

    @UpdateProvider(type=RepairSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Repair record);

    @Update({
        "update repairs",
        "set device_code = #{deviceCode,jdbcType=VARCHAR},",
          "operator = #{operator,jdbcType=VARCHAR},",
          "types = #{types,jdbcType=VARCHAR},",
          "content = #{content,jdbcType=VARCHAR},",
          "source = #{source,jdbcType=VARCHAR},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "operator_id = #{operatorId,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Repair record);
    @Select({
        "select",
        "id, device_code, operator, types, content, source, created_at, operator_id",
        "from repairs"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="device_code", property="deviceCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator", property="operator", jdbcType=JdbcType.VARCHAR),
        @Result(column="types", property="types", jdbcType=JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="source", property="source", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="operator_id", property="operatorId", jdbcType=JdbcType.INTEGER)
    })
    List<Repair> findAll();
    @Select({
        "select",
        "id, device_code, operator, types, content, source, created_at, operator_id",
        "from repairs",
        "where device_code = #{repairNum,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="device_code", property="deviceCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator", property="operator", jdbcType=JdbcType.VARCHAR),
        @Result(column="types", property="types", jdbcType=JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="source", property="source", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="operator_id", property="operatorId", jdbcType=JdbcType.INTEGER)
    })
	List<Repair> findByDeviceCode(String repairNum);
}