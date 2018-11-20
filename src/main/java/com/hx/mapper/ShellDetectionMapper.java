package com.hx.mapper;

import com.hx.model.ShellDetection;

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

public interface ShellDetectionMapper {
    @Delete({
        "delete from shell_detections",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into shell_detections (id, order_code, ",
        "operator_id, operator, ",
        "shell_code, detection, ",
        "note, created_at, ",
        "leakage_test, water_test)",
        "values (#{id,jdbcType=INTEGER}, #{orderCode,jdbcType=VARCHAR}, ",
        "#{operatorId,jdbcType=INTEGER}, #{operator,jdbcType=VARCHAR}, ",
        "#{shellCode,jdbcType=VARCHAR}, #{detection,jdbcType=VARCHAR}, ",
        "#{note,jdbcType=VARCHAR}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{leakageTest,jdbcType=VARCHAR}, #{waterTest,jdbcType=VARCHAR})"
    })
    int insert(ShellDetection record);

    @InsertProvider(type=ShellDetectionSqlProvider.class, method="insertSelective")
    int insertSelective(ShellDetection record);

    @Select({
        "select",
        "id, order_code, operator_id, operator, shell_code, detection, note, created_at, ",
        "leakage_test, water_test",
        "from shell_detections",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="order_code", property="orderCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator_id", property="operatorId", jdbcType=JdbcType.INTEGER),
        @Result(column="operator", property="operator", jdbcType=JdbcType.VARCHAR),
        @Result(column="shell_code", property="shellCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="detection", property="detection", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="leakage_test", property="leakageTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="water_test", property="waterTest", jdbcType=JdbcType.VARCHAR)
    })
    ShellDetection selectByPrimaryKey(Integer id);

    @UpdateProvider(type=ShellDetectionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ShellDetection record);

    @Update({
        "update shell_detections",
        "set order_code = #{orderCode,jdbcType=VARCHAR},",
          "operator_id = #{operatorId,jdbcType=INTEGER},",
          "operator = #{operator,jdbcType=VARCHAR},",
          "shell_code = #{shellCode,jdbcType=VARCHAR},",
          "detection = #{detection,jdbcType=VARCHAR},",
          "note = #{note,jdbcType=VARCHAR},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "leakage_test = #{leakageTest,jdbcType=VARCHAR},",
          "water_test = #{waterTest,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ShellDetection record);
    
    @Insert({
        "insert into shell_detections (order_code, ",
        "operator_id, operator, ",
        "shell_code, detection, ",
        "note, created_at, ",
        "leakage_test, water_test)",
        "values (#{orderCode,jdbcType=VARCHAR}, ",
        "#{operatorId,jdbcType=INTEGER}, #{operator,jdbcType=VARCHAR}, ",
        "#{shellCode,jdbcType=VARCHAR}, #{detection,jdbcType=VARCHAR}, ",
        "#{note,jdbcType=VARCHAR}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{leakageTest,jdbcType=VARCHAR}, #{waterTest,jdbcType=VARCHAR})"
    })
	int add(ShellDetection s);
    
    @Select({
        "select",
        "id, order_code, operator_id, operator, shell_code, detection, note, created_at, ",
        "leakage_test, water_test",
        "from shell_detections",
        "where shell_code = #{shellCode,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="order_code", property="orderCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator_id", property="operatorId", jdbcType=JdbcType.INTEGER),
        @Result(column="operator", property="operator", jdbcType=JdbcType.VARCHAR),
        @Result(column="shell_code", property="shellCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="detection", property="detection", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="leakage_test", property="leakageTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="water_test", property="waterTest", jdbcType=JdbcType.VARCHAR)
    })
	ShellDetection findByCode(String shellCode);
    
    @Select({
        "select",
        "id, order_code, operator_id, operator, shell_code, detection, note, created_at, ",
        "leakage_test, water_test",
        "from shell_detections",
        "where shell_code = #{code,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="order_code", property="orderCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator_id", property="operatorId", jdbcType=JdbcType.INTEGER),
        @Result(column="operator", property="operator", jdbcType=JdbcType.VARCHAR),
        @Result(column="shell_code", property="shellCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="detection", property="detection", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="leakage_test", property="leakageTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="water_test", property="waterTest", jdbcType=JdbcType.VARCHAR)
    })
	List<ShellDetection> findByShellCode(String code);

    @Select({
        "select",
        "id, order_code, operator_id, operator, shell_code, detection, note, created_at, ",
        "leakage_test, water_test",
        "from shell_detections order by id desc"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="order_code", property="orderCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator_id", property="operatorId", jdbcType=JdbcType.INTEGER),
        @Result(column="operator", property="operator", jdbcType=JdbcType.VARCHAR),
        @Result(column="shell_code", property="shellCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="detection", property="detection", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="leakage_test", property="leakageTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="water_test", property="waterTest", jdbcType=JdbcType.VARCHAR)
    })
	List<ShellDetection> findAll();
}