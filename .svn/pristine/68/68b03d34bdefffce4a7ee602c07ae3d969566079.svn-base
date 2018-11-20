package com.hx.mapper;

import com.hx.model.Shipment;

import java.util.List;

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

public interface ShipmentMapper {
    @Delete({
        "delete from shipments",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into shipments (id, ship_code, ",
        "operator, goods_info, ",
        "created_at, meter_count)",
        "values (#{id,jdbcType=INTEGER}, #{shipCode,jdbcType=VARCHAR}, ",
        "#{operator,jdbcType=VARCHAR}, #{goodsInfo,jdbcType=VARCHAR}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{meterCount,jdbcType=INTEGER})"
    })
    int insert(Shipment record);

    @InsertProvider(type=ShipmentSqlProvider.class, method="insertSelective")
    int insertSelective(Shipment record);

    @Select({
        "select",
        "id, ship_code, operator, goods_info, created_at, meter_count",
        "from shipments",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ship_code", property="shipCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator", property="operator", jdbcType=JdbcType.VARCHAR),
        @Result(column="goods_info", property="goodsInfo", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="meter_count", property="meterCount", jdbcType=JdbcType.INTEGER)
    })
    Shipment selectByPrimaryKey(Integer id);

    @UpdateProvider(type=ShipmentSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Shipment record);

    @Update({
        "update shipments",
        "set ship_code = #{shipCode,jdbcType=VARCHAR},",
          "operator = #{operator,jdbcType=VARCHAR},",
          "goods_info = #{goodsInfo,jdbcType=VARCHAR},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "meter_count = #{meterCount,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Shipment record);
    
    
    //
    @Select({
        "select",
        "id, ship_code, operator, goods_info, created_at, meter_count",
        "from shipments order by id desc"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ship_code", property="shipCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator", property="operator", jdbcType=JdbcType.VARCHAR),
        @Result(column="goods_info", property="goodsInfo", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="meter_count", property="meterCount", jdbcType=JdbcType.INTEGER)
    })
	List<Shipment> findAll();
    
    //
    @Select({
        "select",
        "id, ship_code, operator, goods_info, created_at, meter_count",
        "from shipments",
        "where ship_code = #{searchName,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ship_code", property="shipCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator", property="operator", jdbcType=JdbcType.VARCHAR),
        @Result(column="goods_info", property="goodsInfo", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="meter_count", property="meterCount", jdbcType=JdbcType.INTEGER)
    })
	List<Shipment> findByCode(@Param(value="searchName")String searchName);
}