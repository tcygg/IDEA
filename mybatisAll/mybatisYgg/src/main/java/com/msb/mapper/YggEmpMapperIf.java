package com.msb.mapper;

import com.msb.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Auther: TcYgg
 * @Date: 2023/11/28 - 11 - 28 - 11:23
 * @Description: com.msb.mapper
 * @version: 1.0
 */
public interface YggEmpMapperIf {
    /**
     * 根据传入的参数动态觉得
     * @param emp
     * @return
     */
    List<Emp> findByCondition(Emp emp);


    List<Emp> findByCondition2(Emp emp);
    int updateEmpByCondtion(Emp emp);

    List<Emp> findEmpDongTai1(int [] empnos);

    List<Emp> findEmpDongTai2(List<Integer> empnos);


    List<Emp> findEmpDongTai33(@Param("ename") String ename, List<Emp> empnos);




}
