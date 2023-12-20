package com.msb.ceshi;

import com.msb.mapper.EmpMapperProxy;
import com.msb.mapper.YggEmpMapperIf;
import com.msb.mapper.YggMybatis01Mapper;
import com.msb.pojo.Emp;
import com.msb.pojo.YggMybatis01;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Auther: TcYgg
 * @Date: 2023/12/18 - 12 - 18 - 17:18
 * @Description: com.msb.ceshi
 * @version: 1.0
 */
public class TestMybatis01 {


    private SqlSession sqlSession;

    @BeforeEach
    public void init() {
        SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
        InputStream resourceAsStream = null;
        try {
            resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory factory = ssfb.build(resourceAsStream);
        sqlSession = factory.openSession();
    }

    @Test
    public void findByCondition() throws ParseException {
        YggEmpMapperIf empMapper = sqlSession.getMapper(YggEmpMapperIf.class);
        Emp emp1 = new Emp();
        emp1.setEname("L");
//        emp1.setEmpno(7934);
//        emp1.setHiredate(new java.sql.Date(81,1,22));
        emp1.setHiredate(new SimpleDateFormat("yyyy-MM-dd").parse("1981-5-1 10:52:12"));

        List<Emp> byDeptnoAndSal = empMapper.findByCondition(emp1);
        for (Emp emp : byDeptnoAndSal) {
            System.out.println(emp);
        }

    }



    @Test
    public void findByCondition2() throws ParseException {
        YggEmpMapperIf empMapper = sqlSession.getMapper(YggEmpMapperIf.class);
        Emp emp1 = new Emp();
//        emp1.setEname("L");
//        emp1.setEmpno(7934);
//        emp1.setHiredate(new java.sql.Date(81,1,22));
        emp1.setHiredate(new SimpleDateFormat("yyyy-MM-dd").parse("1981-4-2 10:52:12"));

        List<Emp> byDeptnoAndSal = empMapper.findByCondition2(emp1);
        for (Emp emp : byDeptnoAndSal) {
            System.out.println(emp);
        }

    }

    @Test
    public void updateEmpByCondtion() {
        YggEmpMapperIf empMapper = sqlSession.getMapper(YggEmpMapperIf.class);
        Emp emp1 = new Emp();
        emp1.setEname("L");
        emp1.setEmpno(7940);
//        emp1.setHiredate(new java.sql.Date(81,1,22));

        empMapper.updateEmpByCondtion(emp1);
        sqlSession.commit();

    }


    @Test
    public void findEmpDongTai1() throws ParseException {
        YggEmpMapperIf empMapper = sqlSession.getMapper(YggEmpMapperIf.class);
//        Emp emp1 = new Emp();
//        emp1.setEname("L");
//        emp1.setEmpno(7934);
//        emp1.setHiredate(new java.sql.Date(81,1,22));
//        emp1.setHiredate(new SimpleDateFormat("yyyy-MM-dd").parse("1981-4-2 10:52:12"));

//        List<Emp> empDongTai2 = empMapper.findEmpDongTai1(new int[]{7934, 7940, 7902});
        int[] ints = {7934, 7940, 7902};
        System.out.println(ints[1]);


        List<Integer> empnos = new ArrayList<>();
       /* Emp emp1 = new Emp();
        emp1.setEname("KING");
        emp1.setEmpno(7839);
        Emp emp2 = new Emp();
        emp2.setEname("JONES");
        emp2.setEmpno(7566);
*/

        Collections.addAll(empnos, 7934, 7940, 7902);
        System.out.println(empnos);
        List<Emp> empDongTai1 = empMapper.findEmpDongTai2(empnos);


        for (Emp emp : empDongTai1) {
            System.out.println(emp);
        }

    }


    @AfterEach
    public void release() {
        // 关闭SQLSession
        sqlSession.close();
    }


}
