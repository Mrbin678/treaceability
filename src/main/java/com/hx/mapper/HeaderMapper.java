package com.hx.mapper;

import java.util.List;

import com.hx.model.Header;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface HeaderMapper {
	@Delete({
        "delete from headers",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into headers (id, code, ",
        "order_code, work_id, ",
        "types, meter_type, ",
        "version, note, created_at, ",
        "valve_test, electricity_test, ",
        "program_test, reading_test, ",
        "time_test)",
        "values (#{id,jdbcType=INTEGER}, #{code,jdbcType=VARCHAR}, ",
        "#{orderCode,jdbcType=VARCHAR}, #{workId,jdbcType=INTEGER}, ",
        "#{types,jdbcType=VARCHAR}, #{meterType,jdbcType=VARCHAR}, ",
        "#{version,jdbcType=VARCHAR}, #{note,jdbcType=VARCHAR}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{valveTest,jdbcType=VARCHAR}, #{electricityTest,jdbcType=VARCHAR}, ",
        "#{programTest,jdbcType=VARCHAR}, #{readingTest,jdbcType=VARCHAR}, ",
        "#{timeTest,jdbcType=VARCHAR})"
    })
    int insert(Header record);

    @InsertProvider(type=HeaderSqlProvider.class, method="insertSelective")
    int insertSelective(Header record);

    @Select({
        "select",
        "id, code, order_code, work_id, types, meter_type, version, note, created_at, ",
        "valve_test, electricity_test, program_test, reading_test, time_test",
        "from headers",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_code", property="orderCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="work_id", property="workId", jdbcType=JdbcType.INTEGER),
        @Result(column="types", property="types", jdbcType=JdbcType.VARCHAR),
        @Result(column="meter_type", property="meterType", jdbcType=JdbcType.VARCHAR),
        @Result(column="version", property="version", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="valve_test", property="valveTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="electricity_test", property="electricityTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="program_test", property="programTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="reading_test", property="readingTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="time_test", property="timeTest", jdbcType=JdbcType.VARCHAR)
    })
    Header selectByPrimaryKey(Integer id);

    @UpdateProvider(type=HeaderSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Header record);

    @Update({
        "update headers",
        "set code = #{code,jdbcType=VARCHAR},",
          "order_code = #{orderCode,jdbcType=VARCHAR},",
          "work_id = #{workId,jdbcType=INTEGER},",
          "types = #{types,jdbcType=VARCHAR},",
          "meter_type = #{meterType,jdbcType=VARCHAR},",
          "version = #{version,jdbcType=VARCHAR},",
          "note = #{note,jdbcType=VARCHAR},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "valve_test = #{valveTest,jdbcType=VARCHAR},",
          "electricity_test = #{electricityTest,jdbcType=VARCHAR},",
          "program_test = #{programTest,jdbcType=VARCHAR},",
          "reading_test = #{readingTest,jdbcType=VARCHAR},",
          "time_test = #{timeTest,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Header record);
    
    //------------------------------------------------------
    
    @Select({
        "select",
        "id, code, order_code, work_id, types, meter_type, version, note, created_at, ",
        "valve_test, electricity_test, program_test, reading_test, time_test",
        "from headers order by id desc"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_code", property="orderCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="work_id", property="workId", jdbcType=JdbcType.INTEGER),
        @Result(column="types", property="types", jdbcType=JdbcType.VARCHAR),
        @Result(column="meter_type", property="meterType", jdbcType=JdbcType.VARCHAR),
        @Result(column="version", property="version", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="valve_test", property="valveTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="electricity_test", property="electricityTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="program_test", property="programTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="reading_test", property="readingTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="time_test", property="timeTest", jdbcType=JdbcType.VARCHAR)
    })
    List<Header> findAll();
    
    @Select({
        "select",
        "id, code, order_code, work_id, types, meter_type, version, note, created_at, ",
        "valve_test, electricity_test, program_test, reading_test, time_test",
        "from headers",
        "where code = #{headerNum,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_code", property="orderCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="work_id", property="workId", jdbcType=JdbcType.INTEGER),
        @Result(column="types", property="types", jdbcType=JdbcType.VARCHAR),
        @Result(column="meter_type", property="meterType", jdbcType=JdbcType.VARCHAR),
        @Result(column="version", property="version", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="valve_test", property="valveTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="electricity_test", property="electricityTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="program_test", property="programTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="reading_test", property="readingTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="time_test", property="timeTest", jdbcType=JdbcType.VARCHAR)
    })
    List<Header> findByHeaderCode(String headerNum);

    @Select({
        "select",
        "id, code, order_code, work_id, types, meter_type, version, note, created_at, ",
        "valve_test, electricity_test, program_test, reading_test, time_test",
        "from headers",
        "where code = #{code,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_code", property="orderCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="work_id", property="workId", jdbcType=JdbcType.INTEGER),
        @Result(column="types", property="types", jdbcType=JdbcType.VARCHAR),
        @Result(column="meter_type", property="meterType", jdbcType=JdbcType.VARCHAR),
        @Result(column="version", property="version", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="valve_test", property="valveTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="electricity_test", property="electricityTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="program_test", property="programTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="reading_test", property="readingTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="time_test", property="timeTest", jdbcType=JdbcType.VARCHAR)
    })
	Header findByCode(String code);
}