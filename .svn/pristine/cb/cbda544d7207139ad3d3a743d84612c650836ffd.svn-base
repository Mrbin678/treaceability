package com.hx.mapper;

import com.hx.model.HeaderDetection;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface HeaderDetectionMapper {
    @Delete({
        "delete from header_detections",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into header_detections (id, order_code, ",
        "operator_id, operator, ",
        "header_code, detection, ",
        "note, created_at, ",
        "voltage_test, high_temperature_test)",
        "values (#{id,jdbcType=INTEGER}, #{orderCode,jdbcType=VARCHAR}, ",
        "#{operatorId,jdbcType=INTEGER}, #{operator,jdbcType=VARCHAR}, ",
        "#{headerCode,jdbcType=VARCHAR}, #{detection,jdbcType=VARCHAR}, ",
        "#{note,jdbcType=VARCHAR}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{voltageTest,jdbcType=VARCHAR}, #{highTemperatureTest,jdbcType=VARCHAR})"
    })
    int insert(HeaderDetection record);

    @InsertProvider(type=HeaderDetectionSqlProvider.class, method="insertSelective")
    int insertSelective(HeaderDetection record);

    @Select({
        "select",
        "id, order_code, operator_id, operator, header_code, detection, note, created_at, ",
        "voltage_test, high_temperature_test",
        "from header_detections",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="order_code", property="orderCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator_id", property="operatorId", jdbcType=JdbcType.INTEGER),
        @Result(column="operator", property="operator", jdbcType=JdbcType.VARCHAR),
        @Result(column="header_code", property="headerCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="detection", property="detection", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="voltage_test", property="voltageTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="high_temperature_test", property="highTemperatureTest", jdbcType=JdbcType.VARCHAR)
    })
    HeaderDetection selectByPrimaryKey(Integer id);

    @UpdateProvider(type=HeaderDetectionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(HeaderDetection record);

    @Update({
        "update header_detections",
        "set order_code = #{orderCode,jdbcType=VARCHAR},",
          "operator_id = #{operatorId,jdbcType=INTEGER},",
          "operator = #{operator,jdbcType=VARCHAR},",
          "header_code = #{headerCode,jdbcType=VARCHAR},",
          "detection = #{detection,jdbcType=VARCHAR},",
          "note = #{note,jdbcType=VARCHAR},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "voltage_test = #{voltageTest,jdbcType=VARCHAR},",
          "high_temperature_test = #{highTemperatureTest,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(HeaderDetection record);
    
    //
    @Select({
        "select",
        "id, order_code, operator_id, operator, header_code, detection, note, created_at, ",
        "voltage_test, high_temperature_test",
        "from header_detections",
        "where header_code = #{code,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="order_code", property="orderCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator_id", property="operatorId", jdbcType=JdbcType.INTEGER),
        @Result(column="operator", property="operator", jdbcType=JdbcType.VARCHAR),
        @Result(column="header_code", property="headerCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="detection", property="detection", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="voltage_test", property="voltageTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="high_temperature_test", property="highTemperatureTest", jdbcType=JdbcType.VARCHAR)
    })
	HeaderDetection findByCode(String code);

    @Select({
        "select",
        "id, order_code, operator_id, operator, header_code, detection, note, created_at, ",
        "voltage_test, high_temperature_test",
        "from header_detections order by id desc"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="order_code", property="orderCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator_id", property="operatorId", jdbcType=JdbcType.INTEGER),
        @Result(column="operator", property="operator", jdbcType=JdbcType.VARCHAR),
        @Result(column="header_code", property="headerCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="detection", property="detection", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="voltage_test", property="voltageTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="high_temperature_test", property="highTemperatureTest", jdbcType=JdbcType.VARCHAR)
    })
	List<HeaderDetection> findAll();
    
    @Select({
        "select",
        "id, order_code, operator_id, operator, header_code, detection, note, created_at, ",
        "voltage_test, high_temperature_test",
        "from header_detections",
        "where header_code = #{code,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="order_code", property="orderCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator_id", property="operatorId", jdbcType=JdbcType.INTEGER),
        @Result(column="operator", property="operator", jdbcType=JdbcType.VARCHAR),
        @Result(column="header_code", property="headerCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="detection", property="detection", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="voltage_test", property="voltageTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="high_temperature_test", property="highTemperatureTest", jdbcType=JdbcType.VARCHAR)
    })
	List<HeaderDetection> findByHeaderCode(String searchName);
}