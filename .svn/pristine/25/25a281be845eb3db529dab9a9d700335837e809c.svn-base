package com.hx.mapper;

import java.util.List;

import com.hx.model.Echart;
import com.hx.model.Meter;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface MeterMapper {
	@Delete({
        "delete from meters",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into meters (id, code, ",
        "factory_code, order_code, ",
        "work_id, types, meter_type, ",
        "header_code, counter_code, ",
        "install_result, note, ",
        "created_at, shell_code)",
        "values (#{id,jdbcType=INTEGER}, #{code,jdbcType=VARCHAR}, ",
        "#{factoryCode,jdbcType=VARCHAR}, #{orderCode,jdbcType=VARCHAR}, ",
        "#{workId,jdbcType=INTEGER}, #{types,jdbcType=VARCHAR}, #{meterType,jdbcType=VARCHAR}, ",
        "#{headerCode,jdbcType=VARCHAR}, #{counterCode,jdbcType=VARCHAR}, ",
        "#{installResult,jdbcType=VARCHAR}, #{note,jdbcType=VARCHAR}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{shellCode,jdbcType=VARCHAR})"
    })
    int insert(Meter record);

    @InsertProvider(type=MeterSqlProvider.class, method="insertSelective")
    int insertSelective(Meter record);

    @Select({
        "select",
        "id, code, factory_code, order_code, work_id, types, meter_type, header_code, ",
        "counter_code, install_result, note, created_at, shell_code",
        "from meters",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="factory_code", property="factoryCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_code", property="orderCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="work_id", property="workId", jdbcType=JdbcType.INTEGER),
        @Result(column="types", property="types", jdbcType=JdbcType.VARCHAR),
        @Result(column="meter_type", property="meterType", jdbcType=JdbcType.VARCHAR),
        @Result(column="header_code", property="headerCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="counter_code", property="counterCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="install_result", property="installResult", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="shell_code", property="shellCode", jdbcType=JdbcType.VARCHAR)
    })
    Meter selectByPrimaryKey(Integer id);

    @UpdateProvider(type=MeterSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Meter record);

    @Update({
        "update meters",
        "set code = #{code,jdbcType=VARCHAR},",
          "factory_code = #{factoryCode,jdbcType=VARCHAR},",
          "order_code = #{orderCode,jdbcType=VARCHAR},",
          "work_id = #{workId,jdbcType=INTEGER},",
          "types = #{types,jdbcType=VARCHAR},",
          "meter_type = #{meterType,jdbcType=VARCHAR},",
          "header_code = #{headerCode,jdbcType=VARCHAR},",
          "counter_code = #{counterCode,jdbcType=VARCHAR},",
          "install_result = #{installResult,jdbcType=VARCHAR},",
          "note = #{note,jdbcType=VARCHAR},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "shell_code = #{shellCode,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Meter record);
    
//-----------------------------------------------------------------
    @Select({
        "select",
        "id, code, factory_code, order_code, work_id, types, meter_type, header_code, ",
        "counter_code, install_result, note, created_at, shell_code",
        "from meters order by id desc"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="factory_code", property="factoryCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_code", property="orderCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="work_id", property="workId", jdbcType=JdbcType.INTEGER),
        @Result(column="types", property="types", jdbcType=JdbcType.VARCHAR),
        @Result(column="meter_type", property="meterType", jdbcType=JdbcType.VARCHAR),
        @Result(column="header_code", property="headerCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="counter_code", property="counterCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="install_result", property="installResult", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="shell_code", property="shellCode", jdbcType=JdbcType.VARCHAR)
    })
    List<Meter> findAll();
    
    @Select({
        "select",
        "id, code, factory_code, order_code, work_id, types, meter_type, header_code, ",
        "counter_code, install_result, note, created_at, shell_code",
        "from meters",
        "where factory_code = #{meterNum,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="factory_code", property="factoryCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_code", property="orderCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="work_id", property="workId", jdbcType=JdbcType.INTEGER),
        @Result(column="types", property="types", jdbcType=JdbcType.VARCHAR),
        @Result(column="meter_type", property="meterType", jdbcType=JdbcType.VARCHAR),
        @Result(column="header_code", property="headerCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="counter_code", property="counterCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="install_result", property="installResult", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="shell_code", property="shellCode", jdbcType=JdbcType.VARCHAR)
    })
    List<Meter> findByMeterCode(String meterNum);
    
    @Select({
        "select",
        "id, code, factory_code, order_code, work_id, types, meter_type, header_code, ",
        "counter_code, install_result, note, created_at, shell_code",
        "from meters",
        "where header_code = #{headerNum,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="factory_code", property="factoryCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_code", property="orderCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="work_id", property="workId", jdbcType=JdbcType.INTEGER),
        @Result(column="types", property="types", jdbcType=JdbcType.VARCHAR),
        @Result(column="meter_type", property="meterType", jdbcType=JdbcType.VARCHAR),
        @Result(column="header_code", property="headerCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="counter_code", property="counterCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="install_result", property="installResult", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="shell_code", property="shellCode", jdbcType=JdbcType.VARCHAR)
    })
    List<Meter> findByHeaderCode(String headerNum);
    
    @Select({
        "select",
        "id, code, factory_code, order_code, work_id, types, meter_type, header_code, ",
        "counter_code, install_result, note, created_at, shell_code",
        "from meters",
        "where counter_code = #{counterNum,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="factory_code", property="factoryCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_code", property="orderCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="work_id", property="workId", jdbcType=JdbcType.INTEGER),
        @Result(column="types", property="types", jdbcType=JdbcType.VARCHAR),
        @Result(column="meter_type", property="meterType", jdbcType=JdbcType.VARCHAR),
        @Result(column="header_code", property="headerCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="counter_code", property="counterCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="install_result", property="installResult", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="shell_code", property="shellCode", jdbcType=JdbcType.VARCHAR)
    })
    List<Meter> findByCounterCode(String counterNum);
    
    
    @Select({
        "select",
        "id, code, factory_code, order_code, work_id, types, meter_type, header_code, ",
        "counter_code, install_result, note, created_at, shell_code",
        "from meters",
        "where order_code = #{code,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="factory_code", property="factoryCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_code", property="orderCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="work_id", property="workId", jdbcType=JdbcType.INTEGER),
        @Result(column="types", property="types", jdbcType=JdbcType.VARCHAR),
        @Result(column="meter_type", property="meterType", jdbcType=JdbcType.VARCHAR),
        @Result(column="header_code", property="headerCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="counter_code", property="counterCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="install_result", property="installResult", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="shell_code", property="shellCode", jdbcType=JdbcType.VARCHAR)
    })
    Meter slelectByOrderCode(String code);
    @Select({
        "select",
        "id, code, factory_code, order_code, work_id, types, meter_type, header_code, ",
        "counter_code, install_result, note, created_at, shell_code",
        "from meters",
        "where factory_code = #{code,jdbcType=VARCHAR} limit 1"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="factory_code", property="factoryCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_code", property="orderCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="work_id", property="workId", jdbcType=JdbcType.INTEGER),
        @Result(column="types", property="types", jdbcType=JdbcType.VARCHAR),
        @Result(column="meter_type", property="meterType", jdbcType=JdbcType.VARCHAR),
        @Result(column="header_code", property="headerCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="counter_code", property="counterCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="install_result", property="installResult", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="shell_code", property="shellCode", jdbcType=JdbcType.VARCHAR)
    })
	Meter slelectByMeterCode(String code);
    
    @Select({
        "select",
        "id, code, factory_code, order_code, work_id, types, meter_type, header_code, ",
        "counter_code, install_result, note, created_at, shell_code",
        "from meters",
        "where counter_code = #{code,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="factory_code", property="factoryCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_code", property="orderCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="work_id", property="workId", jdbcType=JdbcType.INTEGER),
        @Result(column="types", property="types", jdbcType=JdbcType.VARCHAR),
        @Result(column="meter_type", property="meterType", jdbcType=JdbcType.VARCHAR),
        @Result(column="header_code", property="headerCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="counter_code", property="counterCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="install_result", property="installResult", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="shell_code", property="shellCode", jdbcType=JdbcType.VARCHAR)
    })
	Meter slelectByCounterCode(String code);

    @Select({
        "select",
        "id, code, factory_code, order_code, work_id, types, meter_type, header_code, ",
        "counter_code, install_result, note, created_at, shell_code",
        "from meters",
        "where header_code = #{code,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="factory_code", property="factoryCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_code", property="orderCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="work_id", property="workId", jdbcType=JdbcType.INTEGER),
        @Result(column="types", property="types", jdbcType=JdbcType.VARCHAR),
        @Result(column="meter_type", property="meterType", jdbcType=JdbcType.VARCHAR),
        @Result(column="header_code", property="headerCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="counter_code", property="counterCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="install_result", property="installResult", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="shell_code", property="shellCode", jdbcType=JdbcType.VARCHAR)
    })
	Meter slelectByHeaderCode(String code);

    @Select({
        "select",
        "id, code, factory_code, order_code, work_id, types, meter_type, header_code, ",
        "counter_code, install_result, note, created_at, shell_code",
        "from meters",
        "where shell_code = #{code,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="factory_code", property="factoryCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_code", property="orderCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="work_id", property="workId", jdbcType=JdbcType.INTEGER),
        @Result(column="types", property="types", jdbcType=JdbcType.VARCHAR),
        @Result(column="meter_type", property="meterType", jdbcType=JdbcType.VARCHAR),
        @Result(column="header_code", property="headerCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="counter_code", property="counterCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="install_result", property="installResult", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="shell_code", property="shellCode", jdbcType=JdbcType.VARCHAR)
    })
	Meter slelectByShellCode(String code);

    @Select({
        "select",
        "id, code, factory_code, order_code, work_id, types, meter_type, header_code, ",
        "counter_code, install_result, note, created_at, shell_code",
        "from meters",
        "where shell_code = #{shellCodeNum,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="factory_code", property="factoryCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_code", property="orderCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="work_id", property="workId", jdbcType=JdbcType.INTEGER),
        @Result(column="types", property="types", jdbcType=JdbcType.VARCHAR),
        @Result(column="meter_type", property="meterType", jdbcType=JdbcType.VARCHAR),
        @Result(column="header_code", property="headerCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="counter_code", property="counterCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="install_result", property="installResult", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="shell_code", property="shellCode", jdbcType=JdbcType.VARCHAR)
    })
	List<Meter> findByShellCode(String shellCodeNum);
    
    
    @Select({
    	"SELECT to_char(a.created_at, 'YY年MM月') AS label, count(DISTINCT(id)) AS value  FROM meters a",
    	"where TO_CHAR((current_timestamp - interval '6 month'),'yyyy-MM')=TO_CHAR(a.created_at,'yyyy-MM')",
    	"or TO_CHAR((current_timestamp - interval '5 month'),'yyyy-MM')=TO_CHAR(a.created_at,'yyyy-MM')",
    	"or TO_CHAR((current_timestamp - interval '4 month'),'yyyy-MM')=TO_CHAR(a.created_at,'yyyy-MM')",
    	"or TO_CHAR((current_timestamp - interval '3 month'),'yyyy-MM')=TO_CHAR(a.created_at,'yyyy-MM')",
    	"or TO_CHAR((current_timestamp - interval '2 month'),'yyyy-MM')=TO_CHAR(a.created_at,'yyyy-MM')",
    	"or TO_CHAR((current_timestamp - interval '1 month'),'yyyy-MM')=TO_CHAR(a.created_at,'yyyy-MM')",
    	"or TO_CHAR((current_timestamp - interval '0 month'),'yyyy-MM')=TO_CHAR(a.created_at,'yyyy-MM')",
    	"GROUP BY EXTRACT(MONTH from created_at),label",
    	"order by label"
    })
    @Results({
        @Result(column="label", property="label", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="value", property="value", jdbcType=JdbcType.VARCHAR)
    })
	List<Echart> chat();
    
    @Select({
    	"select count(id) as meterCount from meters"
    })
    @Result(column="meterCount", property="meterCount", jdbcType=JdbcType.INTEGER)
	Integer meterCount();
}