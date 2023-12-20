package com.msb.mapper;

import com.msb.pojo.Emp;
import com.msb.pojo.YggMybatis01;

import java.util.List;

/**
* @author yanggao
* @description 针对表【ygg_mybatis_01】的数据库操作Mapper
* @createDate 2023-12-18 16:59:10
* @Entity com.msb.pojo.YggMybatis01
*/
public interface YggMybatis01Mapper {

    int deleteByPrimaryKey(Long id);

    int insert(YggMybatis01 record);

    int insertSelective(YggMybatis01 record);

    YggMybatis01 selectByPrimaryKey(Long id);

    List<YggMybatis01> selectByPrimaryKeyAll(Long [] empnos);

    List<YggMybatis01> selectByPrimaryKeyDX(List<Integer> empnos);



    int updateByPrimaryKeySelective(YggMybatis01 record);

    int updateByPrimaryKey(YggMybatis01 record);

}
