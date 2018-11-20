package com.hx.mapper;

import com.hx.model.Package;

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

public interface PackageMapper {
    @Delete({
        "delete from packages",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into packages (id, code, ",
        "order_code, operator_id, ",
        "meter_count, note, ",
        "created_at, operator)",
        "values (#{id,jdbcType=INTEGER}, #{code,jdbcType=VARCHAR}, ",
        "#{orderCode,jdbcType=VARCHAR}, #{operatorId,jdbcType=INTEGER}, ",
        "#{meterCount,jdbcType=INTEGER}, #{note,jdbcType=VARCHAR}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{operator,jdbcType=VARCHAR})"
    })
    int insert(Package record);

    @InsertProvider(type=PackageSqlProvider.class, method="insertSelective")
    int insertSelective(Package record);

    @Select({
        "select",
        "id, code, order_code, operator_id, meter_count, note, created_at, operator",
        "from packages",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_code", property="orderCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator_id", property="operatorId", jdbcType=JdbcType.INTEGER),
        @Result(column="meter_count", property="meterCount", jdbcType=JdbcType.INTEGER),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="operator", property="operator", jdbcType=JdbcType.VARCHAR)
    })
    Package selectByPrimaryKey(Integer id);

    @UpdateProvider(type=PackageSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Package record);

    @Update({
        "update packages",
        "set code = #{code,jdbcType=VARCHAR},",
          "order_code = #{orderCode,jdbcType=VARCHAR},",
          "operator_id = #{operatorId,jdbcType=INTEGER},",
          "meter_count = #{meterCount,jdbcType=INTEGER},",
          "note = #{note,jdbcType=VARCHAR},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "operator = #{operator,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Package record);
    
    
    @Select({
        "select * from packages order by id desc"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_code", property="orderCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator_id", property="operatorId", jdbcType=JdbcType.INTEGER),
        @Result(column="meter_count", property="meterCount", jdbcType=JdbcType.INTEGER),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="operator", property="operator", jdbcType=JdbcType.VARCHAR)
    })
	List<Package> findAll();
    
    @Select({
        "select",
        "id, code, order_code, operator_id, meter_count, note, created_at, operator",
        "from packages",
        "where code = #{code,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_code", property="orderCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator_id", property="operatorId", jdbcType=JdbcType.INTEGER),
        @Result(column="meter_count", property="meterCount", jdbcType=JdbcType.INTEGER),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="operator", property="operator", jdbcType=JdbcType.VARCHAR)
    })
	List<Package> findByCode(String code);
}