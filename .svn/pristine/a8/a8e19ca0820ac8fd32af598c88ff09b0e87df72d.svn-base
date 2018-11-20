package com.hx.mapper;

import java.util.List;

import com.hx.model.Work;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface WorkMapper {
    @Delete({
        "delete from works",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into works (id, order_code, ",
        "content, operator1, ",
        "operator2, operator3, ",
        "operator4, operator5, ",
        "operator6, operator7, ",
        "operator8, operator9, ",
        "operator10, operator11, ",
        "operator12, operator13, ",
        "operator14, operator15, ",
        "status, created_at)",
        "values (#{id,jdbcType=INTEGER}, #{orderCode,jdbcType=VARCHAR}, ",
        "#{content,jdbcType=VARCHAR}, #{operator1,jdbcType=VARCHAR}, ",
        "#{operator2,jdbcType=VARCHAR}, #{operator3,jdbcType=VARCHAR}, ",
        "#{operator4,jdbcType=VARCHAR}, #{operator5,jdbcType=VARCHAR}, ",
        "#{operator6,jdbcType=VARCHAR}, #{operator7,jdbcType=VARCHAR}, ",
        "#{operator8,jdbcType=VARCHAR}, #{operator9,jdbcType=VARCHAR}, ",
        "#{operator10,jdbcType=VARCHAR}, #{operator11,jdbcType=VARCHAR}, ",
        "#{operator12,jdbcType=VARCHAR}, #{operator13,jdbcType=VARCHAR}, ",
        "#{operator14,jdbcType=VARCHAR}, #{operator15,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=VARCHAR}, #{createdAt,jdbcType=TIMESTAMP})"
    })
    int insert(Work record);

    @InsertProvider(type=WorkSqlProvider.class, method="insertSelective")
    @SelectKey(statement = "SELECT currval('works_id_seq')", keyProperty = "id", before = false, resultType = int.class)
    @Options(useGeneratedKeys=true,keyProperty="id")
    int insertSelective(Work record);

    @Select({
        "select",
        "id, order_code, content, operator1, operator2, operator3, operator4, operator5, ",
        "operator6, operator7, operator8, operator9, operator10, operator11, operator12, ",
        "operator13, operator14, operator15, status, created_at",
        "from works",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="order_code", property="orderCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator1", property="operator1", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator2", property="operator2", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator3", property="operator3", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator4", property="operator4", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator5", property="operator5", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator6", property="operator6", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator7", property="operator7", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator8", property="operator8", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator9", property="operator9", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator10", property="operator10", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator11", property="operator11", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator12", property="operator12", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator13", property="operator13", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator14", property="operator14", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator15", property="operator15", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    Work selectByPrimaryKey(Integer id);

    @UpdateProvider(type=WorkSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Work record);

    @Update({
        "update works",
        "set order_code = #{orderCode,jdbcType=VARCHAR},",
          "content = #{content,jdbcType=VARCHAR},",
          "operator1 = #{operator1,jdbcType=VARCHAR},",
          "operator2 = #{operator2,jdbcType=VARCHAR},",
          "operator3 = #{operator3,jdbcType=VARCHAR},",
          "operator4 = #{operator4,jdbcType=VARCHAR},",
          "operator5 = #{operator5,jdbcType=VARCHAR},",
          "operator6 = #{operator6,jdbcType=VARCHAR},",
          "operator7 = #{operator7,jdbcType=VARCHAR},",
          "operator8 = #{operator8,jdbcType=VARCHAR},",
          "operator9 = #{operator9,jdbcType=VARCHAR},",
          "operator10 = #{operator10,jdbcType=VARCHAR},",
          "operator11 = #{operator11,jdbcType=VARCHAR},",
          "operator12 = #{operator12,jdbcType=VARCHAR},",
          "operator13 = #{operator13,jdbcType=VARCHAR},",
          "operator14 = #{operator14,jdbcType=VARCHAR},",
          "operator15 = #{operator15,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=VARCHAR},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Work record);
    @Select({
        "select",
        "id, order_code, content, operator1, operator2, operator3, operator4, operator5, ",
        "operator6, operator7, operator8, operator9, operator10, operator11, operator12, ",
        "operator13, operator14, operator15, status, created_at",
        "from works order by id desc"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="order_code", property="orderCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator1", property="operator1", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator2", property="operator2", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator3", property="operator3", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator4", property="operator4", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator5", property="operator5", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator6", property="operator6", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator7", property="operator7", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator8", property="operator8", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator9", property="operator9", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator10", property="operator10", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator11", property="operator11", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator12", property="operator12", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator13", property="operator13", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator14", property="operator14", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator15", property="operator15", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Work> findAll();
    
    @Select({
        "select",
        "id, order_code, content, operator1, operator2, operator3, operator4, operator5, ",
        "operator6, operator7, operator8, operator9, operator10, operator11, operator12, ",
        "operator13, operator14, operator15, status, created_at",
        "from works",
        "where order_code = #{order_code,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="order_code", property="orderCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator1", property="operator1", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator2", property="operator2", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator3", property="operator3", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator4", property="operator4", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator5", property="operator5", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator6", property="operator6", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator7", property="operator7", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator8", property="operator8", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator9", property="operator9", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator10", property="operator10", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator11", property="operator11", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator12", property="operator12", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator13", property="operator13", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator14", property="operator14", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator15", property="operator15", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Work> findByOrderCode(String orderNum);
}