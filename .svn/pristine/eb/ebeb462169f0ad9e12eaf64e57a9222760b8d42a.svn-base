package com.hx.mapper;

import java.util.List;

import com.hx.model.MeterDetection;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface MeterDetectionMapper {
	@Delete({
        "delete from meter_detections",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into meter_detections (id, order_code, ",
        "factory_code, detection, ",
        "note, created_at, ",
        "operator_id, operator, ",
        "meter_type, valve_test, ",
        "count_test, write_test, ",
        "code_test, time_test, ",
        "electricity_test, nopower_test, ",
        "display_test, channel_test, ",
        "communication_test, reset_test, ",
        "onpower_test, signal_test)",
        "values (#{id,jdbcType=INTEGER}, #{orderCode,jdbcType=VARCHAR}, ",
        "#{factoryCode,jdbcType=VARCHAR}, #{detection,jdbcType=VARCHAR}, ",
        "#{note,jdbcType=VARCHAR}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{operatorId,jdbcType=INTEGER}, #{operator,jdbcType=VARCHAR}, ",
        "#{meterType,jdbcType=VARCHAR}, #{valveTest,jdbcType=VARCHAR}, ",
        "#{countTest,jdbcType=VARCHAR}, #{writeTest,jdbcType=VARCHAR}, ",
        "#{codeTest,jdbcType=VARCHAR}, #{timeTest,jdbcType=VARCHAR}, ",
        "#{electricityTest,jdbcType=VARCHAR}, #{nopowerTest,jdbcType=VARCHAR}, ",
        "#{displayTest,jdbcType=VARCHAR}, #{channelTest,jdbcType=VARCHAR}, ",
        "#{communicationTest,jdbcType=VARCHAR}, #{resetTest,jdbcType=VARCHAR}, ",
        "#{onpowerTest,jdbcType=VARCHAR}, #{signalTest,jdbcType=VARCHAR})"
    })
    int insert(MeterDetection record);

    @InsertProvider(type=MeterDetectionSqlProvider.class, method="insertSelective")
    int insertSelective(MeterDetection record);

    @Select({
        "select",
        "id, order_code, factory_code, detection, note, created_at, operator_id, operator, ",
        "meter_type, valve_test, count_test, write_test, code_test, time_test, electricity_test, ",
        "nopower_test, display_test, channel_test, communication_test, reset_test, onpower_test, ",
        "signal_test",
        "from meter_detections",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="order_code", property="orderCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="factory_code", property="factoryCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="detection", property="detection", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="operator_id", property="operatorId", jdbcType=JdbcType.INTEGER),
        @Result(column="operator", property="operator", jdbcType=JdbcType.VARCHAR),
        @Result(column="meter_type", property="meterType", jdbcType=JdbcType.VARCHAR),
        @Result(column="valve_test", property="valveTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="count_test", property="countTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="write_test", property="writeTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="code_test", property="codeTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="time_test", property="timeTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="electricity_test", property="electricityTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="nopower_test", property="nopowerTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="display_test", property="displayTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="channel_test", property="channelTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="communication_test", property="communicationTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="reset_test", property="resetTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="onpower_test", property="onpowerTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="signal_test", property="signalTest", jdbcType=JdbcType.VARCHAR)
    })
    MeterDetection selectByPrimaryKey(Integer id);

    @UpdateProvider(type=MeterDetectionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MeterDetection record);

    @Update({
        "update meter_detections",
        "set order_code = #{orderCode,jdbcType=VARCHAR},",
          "factory_code = #{factoryCode,jdbcType=VARCHAR},",
          "detection = #{detection,jdbcType=VARCHAR},",
          "note = #{note,jdbcType=VARCHAR},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "operator_id = #{operatorId,jdbcType=INTEGER},",
          "operator = #{operator,jdbcType=VARCHAR},",
          "meter_type = #{meterType,jdbcType=VARCHAR},",
          "valve_test = #{valveTest,jdbcType=VARCHAR},",
          "count_test = #{countTest,jdbcType=VARCHAR},",
          "write_test = #{writeTest,jdbcType=VARCHAR},",
          "code_test = #{codeTest,jdbcType=VARCHAR},",
          "time_test = #{timeTest,jdbcType=VARCHAR},",
          "electricity_test = #{electricityTest,jdbcType=VARCHAR},",
          "nopower_test = #{nopowerTest,jdbcType=VARCHAR},",
          "display_test = #{displayTest,jdbcType=VARCHAR},",
          "channel_test = #{channelTest,jdbcType=VARCHAR},",
          "communication_test = #{communicationTest,jdbcType=VARCHAR},",
          "reset_test = #{resetTest,jdbcType=VARCHAR},",
          "onpower_test = #{onpowerTest,jdbcType=VARCHAR},",
          "signal_test = #{signalTest,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(MeterDetection record);
    
    ///////////////////////////
    @Insert({
        "insert into meter_detections (order_code, ",
        "factory_code, detection, ",
        "note, created_at, ",
        "operator_id, operator, ",
        "meter_type, valve_test, ",
        "count_test, write_test, ",
        "code_test, time_test, ",
        "electricity_test, nopower_test, ",
        "display_test, channel_test, ",
        "communication_test, reset_test, ",
        "onpower_test, signal_test)",
        "values (#{orderCode,jdbcType=VARCHAR}, ",
        "#{factoryCode,jdbcType=VARCHAR}, #{detection,jdbcType=VARCHAR}, ",
        "#{note,jdbcType=VARCHAR}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{operatorId,jdbcType=INTEGER}, #{operator,jdbcType=VARCHAR}, ",
        "#{meterType,jdbcType=VARCHAR}, #{valveTest,jdbcType=VARCHAR}, ",
        "#{countTest,jdbcType=VARCHAR}, #{writeTest,jdbcType=VARCHAR}, ",
        "#{codeTest,jdbcType=VARCHAR}, #{timeTest,jdbcType=VARCHAR}, ",
        "#{electricityTest,jdbcType=VARCHAR}, #{nopowerTest,jdbcType=VARCHAR}, ",
        "#{displayTest,jdbcType=VARCHAR}, #{channelTest,jdbcType=VARCHAR}, ",
        "#{communicationTest,jdbcType=VARCHAR}, #{resetTest,jdbcType=VARCHAR}, ",
        "#{onpowerTest,jdbcType=VARCHAR}, #{signalTest,jdbcType=VARCHAR})"
    })
    int add(MeterDetection record);
    
    @Select({
        "select * from meter_detections order by id desc"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="order_code", property="orderCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="factory_code", property="factoryCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="detection", property="detection", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="operator_id", property="operatorId", jdbcType=JdbcType.INTEGER),
        @Result(column="operator", property="operator", jdbcType=JdbcType.VARCHAR),
        @Result(column="meter_type", property="meterType", jdbcType=JdbcType.VARCHAR),
        @Result(column="valve_test", property="valveTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="count_test", property="countTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="write_test", property="writeTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="code_test", property="codeTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="time_test", property="timeTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="electricity_test", property="electricityTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="nopower_test", property="nopowerTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="display_test", property="displayTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="channel_test", property="channelTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="communication_test", property="communicationTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="reset_test", property="resetTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="onpower_test", property="onpowerTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="signal_test", property="signalTest", jdbcType=JdbcType.VARCHAR)
    })
    List<MeterDetection> findAll();
    
    @Select({
        "select",
        "id, order_code, factory_code, detection, note, created_at, operator_id, operator, ",
        "meter_type, valve_test, count_test, write_test, code_test, time_test, electricity_test, ",
        "nopower_test, display_test, channel_test, communication_test, reset_test, onpower_test, ",
        "signal_test",
        "from meter_detections",
        "where factory_code = #{meterCodeNum,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="order_code", property="orderCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="factory_code", property="factoryCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="detection", property="detection", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="operator_id", property="operatorId", jdbcType=JdbcType.INTEGER),
        @Result(column="operator", property="operator", jdbcType=JdbcType.VARCHAR),
        @Result(column="meter_type", property="meterType", jdbcType=JdbcType.VARCHAR),
        @Result(column="valve_test", property="valveTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="count_test", property="countTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="write_test", property="writeTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="code_test", property="codeTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="time_test", property="timeTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="electricity_test", property="electricityTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="nopower_test", property="nopowerTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="display_test", property="displayTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="channel_test", property="channelTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="communication_test", property="communicationTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="reset_test", property="resetTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="onpower_test", property="onpowerTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="signal_test", property="signalTest", jdbcType=JdbcType.VARCHAR)
    })
    List<MeterDetection> findByMeterCode(String meterCodeNum);
    
    @Select({
        "select",
        "id, order_code, factory_code, detection, note, created_at, operator_id, operator, ",
        "meter_type, valve_test, count_test, write_test, code_test, time_test, electricity_test, ",
        "nopower_test, display_test, channel_test, communication_test, reset_test, onpower_test, ",
        "signal_test",
        "from meter_detections",
        "where factory_code = #{meterCodeNum,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="order_code", property="orderCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="factory_code", property="factoryCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="detection", property="detection", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="operator_id", property="operatorId", jdbcType=JdbcType.INTEGER),
        @Result(column="operator", property="operator", jdbcType=JdbcType.VARCHAR),
        @Result(column="meter_type", property="meterType", jdbcType=JdbcType.VARCHAR),
        @Result(column="valve_test", property="valveTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="count_test", property="countTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="write_test", property="writeTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="code_test", property="codeTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="time_test", property="timeTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="electricity_test", property="electricityTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="nopower_test", property="nopowerTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="display_test", property="displayTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="channel_test", property="channelTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="communication_test", property="communicationTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="reset_test", property="resetTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="onpower_test", property="onpowerTest", jdbcType=JdbcType.VARCHAR),
        @Result(column="signal_test", property="signalTest", jdbcType=JdbcType.VARCHAR)
    })
	MeterDetection findByCode(String factoryCode);
}