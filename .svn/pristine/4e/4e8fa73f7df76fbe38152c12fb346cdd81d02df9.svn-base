package com.hx.mapper;

import java.util.List;

import com.hx.model.Counter;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface CounterMapper {
    @Delete({
        "delete from counters",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into counters (id, code, ",
        "order_code, work_id, ",
        "types, meter_type, ",
        "note, created_at)",
        "values (#{id,jdbcType=INTEGER}, #{code,jdbcType=VARCHAR}, ",
        "#{orderCode,jdbcType=VARCHAR}, #{workId,jdbcType=INTEGER}, ",
        "#{types,jdbcType=VARCHAR}, #{meterType,jdbcType=VARCHAR}, ",
        "#{note,jdbcType=VARCHAR}, #{createdAt,jdbcType=TIMESTAMP})"
    })
    int insert(Counter record);

    @InsertProvider(type=CounterSqlProvider.class, method="insertSelective")
    int insertSelective(Counter record);

    @Select({
        "select",
        "id, code, order_code, work_id, types, meter_type, note, created_at",
        "from counters",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_code", property="orderCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="work_id", property="workId", jdbcType=JdbcType.INTEGER),
        @Result(column="types", property="types", jdbcType=JdbcType.VARCHAR),
        @Result(column="meter_type", property="meterType", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    Counter selectByPrimaryKey(Integer id);

    @UpdateProvider(type=CounterSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Counter record);

    @Update({
        "update counters",
        "set code = #{code,jdbcType=VARCHAR},",
          "order_code = #{orderCode,jdbcType=VARCHAR},",
          "work_id = #{workId,jdbcType=INTEGER},",
          "types = #{types,jdbcType=VARCHAR},",
          "meter_type = #{meterType,jdbcType=VARCHAR},",
          "note = #{note,jdbcType=VARCHAR},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Counter record);
    
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_code", property="orderCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="work_id", property="workId", jdbcType=JdbcType.INTEGER),
        @Result(column="types", property="types", jdbcType=JdbcType.VARCHAR),
        @Result(column="meter_type", property="meterType", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    @Select({
        "select",
        "id, code, order_code, work_id, types, meter_type, note, created_at",
        "from counters order by id desc"
    })
    List<Counter> findAll();
    
    @Select({
        "select",
        "id, code, order_code, work_id, types, meter_type, note, created_at",
        "from counters",
        "where code = #{counterNum,jdbcType=VARCHAR} order by id"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_code", property="orderCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="work_id", property="workId", jdbcType=JdbcType.INTEGER),
        @Result(column="types", property="types", jdbcType=JdbcType.VARCHAR),
        @Result(column="meter_type", property="meterType", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Counter> findByCounterCode(String counterNum);
    @Select({
        "select",
        "id, code, order_code, work_id, types, meter_type, note, created_at",
        "from counters",
        "where code = #{code,jdbcType=VARCHAR} order by id"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_code", property="orderCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="work_id", property="workId", jdbcType=JdbcType.INTEGER),
        @Result(column="types", property="types", jdbcType=JdbcType.VARCHAR),
        @Result(column="meter_type", property="meterType", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
	Counter findByCode(String code);
}