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

import com.hx.model.SystemParam;

public interface SystemParamMapper {
    @Delete({
        "delete from system_params",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into system_params (id, param_types, ",
        "name, param_value)",
        "values (#{id,jdbcType=INTEGER}, #{paramTypes,jdbcType=VARCHAR}, ",
        "#{name,jdbcType=VARCHAR}, #{paramValue,jdbcType=VARCHAR})"
    })
    int insert(SystemParam record);

    @InsertProvider(type=SystemParamSqlProvider.class, method="insertSelective")
    int insertSelective(SystemParam record);

    @Select({
        "select",
        "id, param_types, name, param_value",
        "from system_params",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="param_types", property="paramTypes", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="param_value", property="paramValue", jdbcType=JdbcType.VARCHAR)
    })
    SystemParam selectByPrimaryKey(Integer id);

    @UpdateProvider(type=SystemParamSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SystemParam record);

    @Update({
        "update system_params",
        "set param_types = #{paramTypes,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "param_value = #{paramValue,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(SystemParam record);
    //查询所有的系统参数
    @Select({
        "select id, param_types, name, param_value from system_params order by id"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="param_types", property="paramTypes", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="param_value", property="paramValue", jdbcType=JdbcType.VARCHAR)
    })
	List<SystemParam> findAll();
    //添加系统参数
    @Insert({
        "insert into system_params (param_types, ",
        "name, param_value)",
        "values (#{paramTypes,jdbcType=VARCHAR}, ",
        "#{name,jdbcType=VARCHAR}, #{paramValue,jdbcType=VARCHAR})"
    })
	int addSystemParam(SystemParam systemParam);
    //更新系统参数
    @Update({
         "update system_params set param_types = #{paramTypes,jdbcType=VARCHAR},",
         "name = #{name,jdbcType=VARCHAR},",
         "param_value = #{paramValue,jdbcType=VARCHAR} where id = #{id,jdbcType=INTEGER}"
    })
	int updateSystemParam(SystemParam systemParam);
    //
    
    @Delete({
        "delete from system_params"
    })
	int deleteAll();
    
    @Select({
        "select param_value from system_params where param_types='燃气表公司代码'"
    })
    @Result(column="param_value", property="paramValue", jdbcType=JdbcType.VARCHAR)
	String getCompanyCode();
    @Select({
        "select param_value from system_params where param_types='计费类型'"
    })
    @Result(column="param_value", property="paramValue", jdbcType=JdbcType.VARCHAR)
	String getMeterType();
    
    @Select({
        "select id, param_types, name, param_value from system_params where param_types= #{paramTypes,jdbcType=VARCHAR} order by id"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="param_types", property="paramTypes", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="param_value", property="paramValue", jdbcType=JdbcType.VARCHAR)
    })
    List<SystemParam> findAllByParamType(String paramType);//通过参数类型查询系统参数(基表类型、规格型号等)

    @Select({
        "select id, param_types, name, param_value from system_params where param_types='基表厂家' order by id"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="param_types", property="paramTypes", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="param_value", property="paramValue", jdbcType=JdbcType.VARCHAR)
    })
    List<SystemParam> queryFactories();
    
    @Select({
        "select id, param_types, name, param_value from system_params where param_types='短信表程序版本' order by id"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="param_types", property="paramTypes", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="param_value", property="paramValue", jdbcType=JdbcType.VARCHAR)
    })
	List<SystemParam> querySMS();
    @Select({
        "select id, param_types, name, param_value from system_params where param_types='无线表程序版本' order by id"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="param_types", property="paramTypes", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="param_value", property="paramValue", jdbcType=JdbcType.VARCHAR)
    })
	List<SystemParam> queryLora();
}