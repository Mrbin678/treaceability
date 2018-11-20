package com.hx.mapper;

import com.hx.model.Shell;

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

public interface ShellMapper {
    @Delete({
        "delete from shells",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into shells (id, code, work_id",
        "factory, valve_factory, ",
        "valve_type, types, ",
        "note, created_at)",
        "values (#{id,jdbcType=INTEGER}, #{code,jdbcType=VARCHAR}, #{work_id,jdbcType=INTEGER},",
        "#{factory,jdbcType=VARCHAR}, #{valveFactory,jdbcType=VARCHAR}, ",
        "#{valveType,jdbcType=VARCHAR}, #{types,jdbcType=VARCHAR}, ",
        "#{note,jdbcType=VARCHAR}, #{createdAt,jdbcType=TIMESTAMP})"
    })
    int insert(Shell record);

    @InsertProvider(type=ShellSqlProvider.class, method="insertSelective")
    int insertSelective(Shell record);

    @Select({
        "select",
        "id, code, work_id, factory, valve_factory, valve_type, types, note, created_at",
        "from shells",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="work_id", property="workId", jdbcType=JdbcType.INTEGER),
        @Result(column="factory", property="factory", jdbcType=JdbcType.VARCHAR),
        @Result(column="valve_factory", property="valveFactory", jdbcType=JdbcType.VARCHAR),
        @Result(column="valve_type", property="valveType", jdbcType=JdbcType.VARCHAR),
        @Result(column="types", property="types", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    Shell selectByPrimaryKey(Integer id);

    @UpdateProvider(type=ShellSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Shell record);

    @Update({
        "update shells",
        "set code = #{code,jdbcType=VARCHAR},",
          "work_id = #{workId,jdbcType=INTEGER}",
          "factory = #{factory,jdbcType=VARCHAR},",
          "valve_factory = #{valveFactory,jdbcType=VARCHAR},",
          "valve_type = #{valveType,jdbcType=VARCHAR},",
          "types = #{types,jdbcType=VARCHAR},",
          "note = #{note,jdbcType=VARCHAR},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Shell record);
    
    //查找所有记录
    @Select({
        "select",
        "id, code, work_id, factory, valve_factory, valve_type, types, note, created_at",
        "from shells order by id desc"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="work_id", property="workId", jdbcType=JdbcType.INTEGER),
        @Result(column="factory", property="factory", jdbcType=JdbcType.VARCHAR),
        @Result(column="valve_factory", property="valveFactory", jdbcType=JdbcType.VARCHAR),
        @Result(column="valve_type", property="valveType", jdbcType=JdbcType.VARCHAR),
        @Result(column="types", property="types", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Shell> findAll();
    
    //通过code查找记录
    @Select({
        "select",
        "id, code, work_id, factory, valve_factory, valve_type, types, note, created_at",
        "from shells",
        "where code = #{code,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="work_id", property="workId", jdbcType=JdbcType.INTEGER),
        @Result(column="factory", property="factory", jdbcType=JdbcType.VARCHAR),
        @Result(column="valve_factory", property="valveFactory", jdbcType=JdbcType.VARCHAR),
        @Result(column="valve_type", property="valveType", jdbcType=JdbcType.VARCHAR),
        @Result(column="types", property="types", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Shell> findByCode(@Param(value="code") String code);
    
    //通过id查找
    @Select({
        "select",
        "id, code, work_id, factory, valve_factory, valve_type, types, note, created_at",
        "from shells",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="work_id", property="workId", jdbcType=JdbcType.INTEGER),
        @Result(column="factory", property="factory", jdbcType=JdbcType.VARCHAR),
        @Result(column="valve_factory", property="valveFactory", jdbcType=JdbcType.VARCHAR),
        @Result(column="valve_type", property="valveType", jdbcType=JdbcType.VARCHAR),
        @Result(column="types", property="types", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    Shell findById(Integer id);
    
    //添加记录
    @Insert({
        "insert into shells (code, work_id",
        "factory, valve_factory, ",
        "valve_type, types, ",
        "note, created_at)",
        "values (#{code,jdbcType=VARCHAR}, #{workId,jdbcType=INTEGER}, ",
        "#{factory,jdbcType=VARCHAR}, #{valveFactory,jdbcType=VARCHAR}, ",
        "#{valveType,jdbcType=VARCHAR}, #{types,jdbcType=VARCHAR}, ",
        "#{note,jdbcType=VARCHAR}, #{createdAt,jdbcType=TIMESTAMP})"
    })
    int addShell(Shell shell);
    
    //删除记录
    @Delete({
        "delete from shells",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int delShell(Integer id);

    @Select({
        "select",
        "id, code, work_id, factory, valve_factory, valve_type, types, note, created_at",
        "from shells",
        "where code = #{code,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="work_id", property="workId", jdbcType=JdbcType.INTEGER),
        @Result(column="factory", property="factory", jdbcType=JdbcType.VARCHAR),
        @Result(column="valve_factory", property="valveFactory", jdbcType=JdbcType.VARCHAR),
        @Result(column="valve_type", property="valveType", jdbcType=JdbcType.VARCHAR),
        @Result(column="types", property="types", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })	
	Shell selectByCode(String code);
    
}