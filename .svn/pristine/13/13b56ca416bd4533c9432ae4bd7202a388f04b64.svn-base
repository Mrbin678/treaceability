package com.hx.mapper;

import com.hx.model.Echart;
import com.hx.model.Order;

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

public interface OrderMapper {
    @Delete({
        "delete from orders",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into orders (id, code, ",
        "meter_count, customer, ",
        "factory, types, ",
        "valve, address, ",
        "note, status, created_at,order_date, ",
        "meter_type)",
        "values (#{id,jdbcType=INTEGER}, #{code,jdbcType=VARCHAR}, ",
        "#{meterCount,jdbcType=INTEGER}, #{customer,jdbcType=VARCHAR}, ",
        "#{factory,jdbcType=VARCHAR}, #{types,jdbcType=VARCHAR}, ",
        "#{valve,jdbcType=VARCHAR}, #{address,jdbcType=VARCHAR}, ",
        "#{note,jdbcType=VARCHAR}, #{status,jdbcType=VARCHAR}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{orderDate,jdbcType=TIMESTAMP},#{meterType,jdbcType=VARCHAR})"
    })
    int insert(Order record);

    @InsertProvider(type=OrderSqlProvider.class, method="insertSelective")
    int insertSelective(Order record);

    @Select({
        "select",
        "id, code, meter_count, customer, factory, types, valve, address, note, status, ",
        "created_at,order_date, meter_type",
        "from orders",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="meter_count", property="meterCount", jdbcType=JdbcType.INTEGER),
        @Result(column="customer", property="customer", jdbcType=JdbcType.VARCHAR),
        @Result(column="factory", property="factory", jdbcType=JdbcType.VARCHAR),
        @Result(column="types", property="types", jdbcType=JdbcType.VARCHAR),
        @Result(column="valve", property="valve", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="order_date", property="orderDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="meter_type", property="meterType", jdbcType=JdbcType.VARCHAR)
    })
    Order selectByPrimaryKey(Integer id);

    @UpdateProvider(type=OrderSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Order record);

    @Update({
        "update orders",
        "set code = #{code,jdbcType=VARCHAR},",
          "meter_count = #{meterCount,jdbcType=INTEGER},",
          "customer = #{customer,jdbcType=VARCHAR},",
          "factory = #{factory,jdbcType=VARCHAR},",
          "types = #{types,jdbcType=VARCHAR},",
          "valve = #{valve,jdbcType=VARCHAR},",
          "address = #{address,jdbcType=VARCHAR},",
          "note = #{note,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=VARCHAR},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "order_date = #{orderDate,jdbcType=TIMESTAMP},",
          "meter_type = #{meterType,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Order record);
    @Select({
        "select",
        "id, code, meter_count, customer, factory, types, valve, address, note, status, ",
        "created_at, order_date,meter_type",
        "from orders order by id  desc"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="meter_count", property="meterCount", jdbcType=JdbcType.INTEGER),
        @Result(column="customer", property="customer", jdbcType=JdbcType.VARCHAR),
        @Result(column="factory", property="factory", jdbcType=JdbcType.VARCHAR),
        @Result(column="types", property="types", jdbcType=JdbcType.VARCHAR),
        @Result(column="valve", property="valve", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="order_date", property="orderDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="meter_type", property="meterType", jdbcType=JdbcType.VARCHAR)
    })
    List<Order> findAll();
    @Select({
    	"select *",
        "from orders",
        "where code = #{orderNum,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="meter_count", property="meterCount", jdbcType=JdbcType.INTEGER),
        @Result(column="customer", property="customer", jdbcType=JdbcType.VARCHAR),
        @Result(column="factory", property="factory", jdbcType=JdbcType.VARCHAR),
        @Result(column="types", property="types", jdbcType=JdbcType.VARCHAR),
        @Result(column="valve", property="valve", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="order_date", property="orderDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="meter_type", property="meterType", jdbcType=JdbcType.VARCHAR)
    })
	List<Order> findByOrderCode(String orderNum);
    @Select({
        "select",
        "id, code, meter_count, customer, factory, types, valve, address, note, status, ",
        "created_at,order_date, meter_type",
        "from orders",
        "where code = #{code,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="meter_count", property="meterCount", jdbcType=JdbcType.INTEGER),
        @Result(column="customer", property="customer", jdbcType=JdbcType.VARCHAR),
        @Result(column="factory", property="factory", jdbcType=JdbcType.VARCHAR),
        @Result(column="types", property="types", jdbcType=JdbcType.VARCHAR),
        @Result(column="valve", property="valve", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="order_date", property="orderDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="meter_type", property="meterType", jdbcType=JdbcType.VARCHAR)
    })
	Order findByCode(String code);
    
    @Select({
        "select count(*) from orders"
    })
	Integer orderCount();
    
    @Select({
    	"SELECT  to_char(a.order_date, 'YY年MM月') AS label, count(DISTINCT(id)) AS value  FROM orders a GROUP BY EXTRACT(MONTH from order_date),label"
    })
    @Results({
        @Result(column="label", property="label", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="value", property="value", jdbcType=JdbcType.VARCHAR)
    })
    List<Echart> orderChart();
    @Select({
    	"select department AS label, count(id) AS value from users group by department"
    })
    @Results({
        @Result(column="label", property="label", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="value", property="value", jdbcType=JdbcType.VARCHAR)
    })
    List<Echart> userChart();
}