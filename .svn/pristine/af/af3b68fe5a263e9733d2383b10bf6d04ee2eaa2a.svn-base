package com.hx.mapper;

import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

import com.hx.model.Right;

public interface RightMapper {
    @Delete({
        "delete from rights",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into rights (id, name, ",
        "url)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{url,jdbcType=VARCHAR})"
    })
    int insert(Right record);

    @InsertProvider(type=RightSqlProvider.class, method="insertSelective")
    int insertSelective(Right record);

    @Select({
        "select",
        "id, name, url",
        "from rights",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR)
    })
    Right selectByPrimaryKey(Integer id);

    @UpdateProvider(type=RightSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Right record);

    @Update({
        "update rights",
        "set name = #{name,jdbcType=VARCHAR},",
          "url = #{url,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Right record);
    @Select({
        "select id, name, url from rights"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR)
    })
	List<Right> findAll();
    
    @Insert({
        "insert into rights (name, url) values (#{name,jdbcType=VARCHAR},#{url,jdbcType=VARCHAR})"
    })
	int addRight(Right right);
    //通过id查找
    @Select({
    	"select name from rights where id in(select b.right_id from roles a,role_rights b where a.id=b.role_id and a.id=#{id,jdbcType=INTEGER})"
    })
    @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR)
	Set<String> selectRightName(Integer id);
}