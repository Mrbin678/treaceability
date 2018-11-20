package com.hx.mapper;

import java.util.List;

import com.hx.model.CounterDetection;

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

public interface CounterDetectionMapper {
	@Delete({
        "delete from counter_detections",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into counter_detections (id, order_code, ",
        "operator_id, operator, ",
        "counter_code, detection, ",
        "note, created_at, ",
        "lock_test, count_test)",
        "values (#{id,jdbcType=INTEGER}, #{orderCode,jdbcType=VARCHAR}, ",
        "#{operatorId,jdbcType=INTEGER}, #{operator,jdbcType=VARCHAR}, ",
        "#{counterCode,jdbcType=VARCHAR}, #{detection,jdbcType=VARCHAR}, ",
        "#{note,jdbcType=VARCHAR}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{lockTest,jdbcType=VARCHAR}, #{countTest,jdbcType=VARCHAR})"
    })
    int insert(CounterDetection record);

    @InsertProvider(type=CounterDetectionSqlProvider.class, method="insertSelective")
    int insertSelective(CounterDetection record);

    @Select({
        "select",
        "id, order_code, operator_id, operator, counter_code, detection, note, created_at, ",
        "lock_test, count_test",
        "from counter_detections",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="order_code", property="orderCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator_id", property="operatorId", jdbcType=JdbcType.INTEGER),
        @Result(column="operator", property="operator", jdbcType=JdbcType.VARCHAR),
        @Result(column="counter_code", property="counterCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="detection", property="detection", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="lock_test", property="lockTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="count_test", property="countTest", jdbcType=JdbcType.VARCHAR)
    })
    CounterDetection selectByPrimaryKey(Integer id);

    @UpdateProvider(type=CounterDetectionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CounterDetection record);

    @Update({
        "update counter_detections",
        "set order_code = #{orderCode,jdbcType=VARCHAR},",
          "operator_id = #{operatorId,jdbcType=INTEGER},",
          "operator = #{operator,jdbcType=VARCHAR},",
          "counter_code = #{counterCode,jdbcType=VARCHAR},",
          "detection = #{detection,jdbcType=VARCHAR},",
          "note = #{note,jdbcType=VARCHAR},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "lock_test = #{lockTest,jdbcType=VARCHAR},",
          "count_test = #{countTest,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CounterDetection record);
    
//    @Insert({
//        "insert into counter_detections ( order_code, ",
//        "operator_id, operator, ",
//        "counter_code, detection, ",
//        "note, created_at)",
//        "values (#{orderCode,jdbcType=VARCHAR}, ",
//        "#{operatorId,jdbcType=INTEGER}, #{operator,jdbcType=VARCHAR}, ",
//        "#{counterCode,jdbcType=VARCHAR}, #{detection,jdbcType=VARCHAR}, ",
//        "#{note,jdbcType=VARCHAR}, #{createdAt,jdbcType=TIMESTAMP}) RETURNING id"
//    })
//    @Options(useGeneratedKeys = true, keyProperty = "id")
//    @SelectKey(statement = "SELECT currval('counter_detections_id_seq')", keyProperty = "record.id", before = false, resultType = int.class)
//    int add(@Param("record") CounterDetection record);
    
    @Select({
        "select",
        "id, order_code, operator_id, operator, counter_code, detection, note, created_at, ",
        "lock_test, count_test",
        "from counter_detections order by id desc"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="order_code", property="orderCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator_id", property="operatorId", jdbcType=JdbcType.INTEGER),
        @Result(column="operator", property="operator", jdbcType=JdbcType.VARCHAR),
        @Result(column="counter_code", property="counterCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="detection", property="detection", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="lock_test", property="lockTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="count_test", property="countTest", jdbcType=JdbcType.VARCHAR)
    })
    List<CounterDetection> findAll();
    @Select({
        "select",
        "id, order_code, operator_id, operator, counter_code, detection, note, created_at, ",
        "lock_test, count_test",
        "from counter_detections",
        "where counter_code = #{counterCodeNum,jdbcType=VARCHAR} order by id"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="order_code", property="orderCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator_id", property="operatorId", jdbcType=JdbcType.INTEGER),
        @Result(column="operator", property="operator", jdbcType=JdbcType.VARCHAR),
        @Result(column="counter_code", property="counterCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="detection", property="detection", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="lock_test", property="lockTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="count_test", property="countTest", jdbcType=JdbcType.VARCHAR)
    })
    List<CounterDetection> findByCounterCode(String counterCodeNum);
    
    @Select({
        "select",
        "id, order_code, operator_id, operator, counter_code, detection, note, created_at, ",
        "lock_test, count_test",
        "from counter_detections",
        "where counter_code = #{counter_code,jdbcType=VARCHAR} order by id"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="order_code", property="orderCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator_id", property="operatorId", jdbcType=JdbcType.INTEGER),
        @Result(column="operator", property="operator", jdbcType=JdbcType.VARCHAR),
        @Result(column="counter_code", property="counterCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="detection", property="detection", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="lock_test", property="lockTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="count_test", property="countTest", jdbcType=JdbcType.VARCHAR)
    })
	CounterDetection findByCode(@Param(value="counter_code")String code);
}