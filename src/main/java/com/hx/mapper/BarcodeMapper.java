package com.hx.mapper;

import com.hx.model.Barcode;

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

public interface BarcodeMapper {
    @Delete({
        "delete from barcodes",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into barcodes (id, name, ",
        "begin_code, end_code, ",
        "code_length, created_at)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{beginCode,jdbcType=VARCHAR}, #{endCode,jdbcType=VARCHAR}, ",
        "#{codeLength,jdbcType=INTEGER}, #{createdAt,jdbcType=TIMESTAMP})"
    })
    int insert(Barcode record);

    @InsertProvider(type=BarcodeSqlProvider.class, method="insertSelective")
    int insertSelective(Barcode record);

    @Select({
        "select",
        "id, name, begin_code, end_code, code_length, created_at",
        "from barcodes",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="begin_code", property="beginCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="end_code", property="endCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="code_length", property="codeLength", jdbcType=JdbcType.INTEGER),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    Barcode selectByPrimaryKey(Integer id);

    @UpdateProvider(type=BarcodeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Barcode record);

    @Update({
        "update barcodes",
        "set name = #{name,jdbcType=VARCHAR},",
          "begin_code = #{beginCode,jdbcType=VARCHAR},",
          "end_code = #{endCode,jdbcType=VARCHAR},",
          "code_length = #{codeLength,jdbcType=INTEGER},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Barcode record);
    @Select({
        "select",
        "id, name, begin_code, end_code, code_length, created_at",
        "from barcodes"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="begin_code", property="beginCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="end_code", property="endCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="code_length", property="codeLength", jdbcType=JdbcType.INTEGER),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
	List<Barcode> findAll();
}