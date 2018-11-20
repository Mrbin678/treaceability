package com.hx.mapper;

import com.hx.model.MeterDetection;
import org.apache.ibatis.jdbc.SQL;

public class MeterDetectionSqlProvider {

    public String insertSelective(MeterDetection record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("meter_detections");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getOrderCode() != null) {
            sql.VALUES("order_code", "#{orderCode,jdbcType=VARCHAR}");
        }
        
        if (record.getFactoryCode() != null) {
            sql.VALUES("factory_code", "#{factoryCode,jdbcType=VARCHAR}");
        }
        
        if (record.getDetection() != null) {
            sql.VALUES("detection", "#{detection,jdbcType=VARCHAR}");
        }
        
        if (record.getNote() != null) {
            sql.VALUES("note", "#{note,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.VALUES("created_at", "#{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOperatorId() != null) {
            sql.VALUES("operator_id", "#{operatorId,jdbcType=INTEGER}");
        }
        
        if (record.getOperator() != null) {
            sql.VALUES("operator", "#{operator,jdbcType=VARCHAR}");
        }
        
        if (record.getMeterType() != null) {
            sql.VALUES("meter_type", "#{meterType,jdbcType=VARCHAR}");
        }
        
        if (record.getValveTest() != null) {
            sql.VALUES("valve_test", "#{valveTest,jdbcType=VARCHAR}");
        }
        
        if (record.getCountTest() != null) {
            sql.VALUES("count_test", "#{countTest,jdbcType=VARCHAR}");
        }
        
        if (record.getWriteTest() != null) {
            sql.VALUES("write_test", "#{writeTest,jdbcType=VARCHAR}");
        }
        
        if (record.getCodeTest() != null) {
            sql.VALUES("code_test", "#{codeTest,jdbcType=VARCHAR}");
        }
        
        if (record.getTimeTest() != null) {
            sql.VALUES("time_test", "#{timeTest,jdbcType=VARCHAR}");
        }
        
        if (record.getElectricityTest() != null) {
            sql.VALUES("electricity_test", "#{electricityTest,jdbcType=VARCHAR}");
        }
        
        if (record.getNopowerTest() != null) {
            sql.VALUES("nopower_test", "#{nopowerTest,jdbcType=VARCHAR}");
        }
        
        if (record.getDisplayTest() != null) {
            sql.VALUES("display_test", "#{displayTest,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelTest() != null) {
            sql.VALUES("channel_test", "#{channelTest,jdbcType=VARCHAR}");
        }
        
        if (record.getCommunicationTest() != null) {
            sql.VALUES("communication_test", "#{communicationTest,jdbcType=VARCHAR}");
        }
        
        if (record.getResetTest() != null) {
            sql.VALUES("reset_test", "#{resetTest,jdbcType=VARCHAR}");
        }
        
        if (record.getOnpowerTest() != null) {
            sql.VALUES("onpower_test", "#{onpowerTest,jdbcType=VARCHAR}");
        }
        
        if (record.getSignalTest() != null) {
            sql.VALUES("signal_test", "#{signalTest,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(MeterDetection record) {
        SQL sql = new SQL();
        sql.UPDATE("meter_detections");
        
        if (record.getOrderCode() != null) {
            sql.SET("order_code = #{orderCode,jdbcType=VARCHAR}");
        }
        
        if (record.getFactoryCode() != null) {
            sql.SET("factory_code = #{factoryCode,jdbcType=VARCHAR}");
        }
        
        if (record.getDetection() != null) {
            sql.SET("detection = #{detection,jdbcType=VARCHAR}");
        }
        
        if (record.getNote() != null) {
            sql.SET("note = #{note,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOperatorId() != null) {
            sql.SET("operator_id = #{operatorId,jdbcType=INTEGER}");
        }
        
        if (record.getOperator() != null) {
            sql.SET("operator = #{operator,jdbcType=VARCHAR}");
        }
        
        if (record.getMeterType() != null) {
            sql.SET("meter_type = #{meterType,jdbcType=VARCHAR}");
        }
        
        if (record.getValveTest() != null) {
            sql.SET("valve_test = #{valveTest,jdbcType=VARCHAR}");
        }
        
        if (record.getCountTest() != null) {
            sql.SET("count_test = #{countTest,jdbcType=VARCHAR}");
        }
        
        if (record.getWriteTest() != null) {
            sql.SET("write_test = #{writeTest,jdbcType=VARCHAR}");
        }
        
        if (record.getCodeTest() != null) {
            sql.SET("code_test = #{codeTest,jdbcType=VARCHAR}");
        }
        
        if (record.getTimeTest() != null) {
            sql.SET("time_test = #{timeTest,jdbcType=VARCHAR}");
        }
        
        if (record.getElectricityTest() != null) {
            sql.SET("electricity_test = #{electricityTest,jdbcType=VARCHAR}");
        }
        
        if (record.getNopowerTest() != null) {
            sql.SET("nopower_test = #{nopowerTest,jdbcType=VARCHAR}");
        }
        
        if (record.getDisplayTest() != null) {
            sql.SET("display_test = #{displayTest,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelTest() != null) {
            sql.SET("channel_test = #{channelTest,jdbcType=VARCHAR}");
        }
        
        if (record.getCommunicationTest() != null) {
            sql.SET("communication_test = #{communicationTest,jdbcType=VARCHAR}");
        }
        
        if (record.getResetTest() != null) {
            sql.SET("reset_test = #{resetTest,jdbcType=VARCHAR}");
        }
        
        if (record.getOnpowerTest() != null) {
            sql.SET("onpower_test = #{onpowerTest,jdbcType=VARCHAR}");
        }
        
        if (record.getSignalTest() != null) {
            sql.SET("signal_test = #{signalTest,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}