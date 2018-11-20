package com.hx.mapper;

import com.hx.model.PackageDetail;

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

public interface PackageDetailMapper {
    @Delete({
        "delete from package_details",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into package_details (id, package_code, ",
        "order_code, factory_code, ",
        "created_at)",
        "values (#{id,jdbcType=INTEGER}, #{packageCode,jdbcType=VARCHAR}, ",
        "#{orderCode,jdbcType=VARCHAR}, #{factoryCode,jdbcType=VARCHAR}, ",
        "#{createdAt,jdbcType=TIMESTAMP})"
    })
    int insert(PackageDetail record);

    @InsertProvider(type=PackageDetailSqlProvider.class, method="insertSelective")
    int insertSelective(PackageDetail record);

    @Select({
        "select",
        "id, package_code, order_code, factory_code, created_at",
        "from package_details",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="package_code", property="packageCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_code", property="orderCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="factory_code", property="factoryCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    PackageDetail selectByPrimaryKey(Integer id);

    @UpdateProvider(type=PackageDetailSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PackageDetail record);

    @Update({
        "update package_details",
        "set package_code = #{packageCode,jdbcType=VARCHAR},",
          "order_code = #{orderCode,jdbcType=VARCHAR},",
          "factory_code = #{factoryCode,jdbcType=VARCHAR},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(PackageDetail record);
    
    
    //
    @Select({
        "select factory_code from package_details where package_code = #{code,jdbcType=INTEGER} order by factory_code"
    })
    @Result(column="factory_code", property="factoryCode", jdbcType=JdbcType.VARCHAR)
	List<String> findByPackageCode(@Param(value="code")String code);
}