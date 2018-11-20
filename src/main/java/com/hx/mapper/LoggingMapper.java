package com.hx.mapper;

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

import com.hx.model.Logging;

public interface LoggingMapper {
    @Delete({
        "delete from loggings",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into loggings (id, login_name, ",
        "content, ip, created_at, ",
        "updated_at)",
        "values (#{id,jdbcType=INTEGER}, #{loginName,jdbcType=VARCHAR}, ",
        "#{content,jdbcType=VARCHAR}, #{ip,jdbcType=VARCHAR}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{updatedAt,jdbcType=TIMESTAMP})"
    })
    int insert(Logging record);

    @InsertProvider(type=LoggingSqlProvider.class, method="insertSelective")
    int insertSelective(Logging record);

    @Select({
        "select",
        "id, login_name, content, ip, created_at, updated_at",
        "from loggings",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="login_name", property="loginName", jdbcType=JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    Logging selectByPrimaryKey(Integer id);

    @UpdateProvider(type=LoggingSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Logging record);

    @Update({
        "update loggings",
        "set login_name = #{loginName,jdbcType=VARCHAR},",
          "content = #{content,jdbcType=VARCHAR},",
          "ip = #{ip,jdbcType=VARCHAR},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Logging record);
    
    @Select({
    	"select ",
    	"id, login_name, content, ip, created_at, updated_at",
    	"from loggings"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="login_name", property="loginName", jdbcType=JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Logging> findAll();
    
    @Select({
    	"select count(*) from loggings where content='登陆成功'"
    })
	Integer pageView();
}