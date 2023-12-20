package com.msb.ceshi;

import com.alibaba.fastjson.JSON;
import com.msb.mapper.YggMybatis01Mapper;
import com.msb.pojo.YggMybatis01;
import lombok.extern.slf4j.Slf4j;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Auther: TcYgg
 * @Date: 2023/12/20 - 12 - 20 - 12:23
 * @Description: com.msb.ceshi
 * @version: 1.0
 */
@Slf4j
public class TestYggMybatis01 {
    private SqlSession sqlSession;
    @BeforeEach
    public void init(){
        SqlSessionFactoryBuilder ssfb =new SqlSessionFactoryBuilder();
        InputStream resourceAsStream = null;
        try {
            resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory factory=ssfb.build(resourceAsStream) ;
        sqlSession=factory.openSession();
    }

    @Test
    public void selectByPrimaryKeyAll01() throws ParseException {
        YggMybatis01Mapper ceshiAll = sqlSession.getMapper(YggMybatis01Mapper.class);
        List<YggMybatis01> yggMybatis01s = ceshiAll.selectByPrimaryKeyAll01();

        for (YggMybatis01 yggMybatis01 : yggMybatis01s) {
            System.out.println(yggMybatis01);
        }

        //集合转json
        Object json = JSON.toJSON(yggMybatis01s);
        System.out.println(json.toString());
//        selectByPrimaryKeyAll01(json);





    }
    @Test
    public void selectByPrimaryKeyDX() throws ParseException {
        YggMybatis01Mapper MybatisMapper = sqlSession.getMapper(YggMybatis01Mapper.class);



        List<Integer> empnos = new ArrayList<>();
       /* Emp emp1 = new Emp();
        emp1.setEname("KING");
        emp1.setEmpno(7839);
        Emp emp2 = new Emp();
        emp2.setEname("JONES");
        emp2.setEmpno(7566);
*/

        Collections.addAll(empnos,35, 105, 106);

//        YggMybatis01 yg01 = new YggMybatis01();
//        yg01.setIdYg(25L);
//        YggMybatis01 yggMybatis01 = MybatisMapper.selectByPrimaryKey(yg01.getIdYg());

//        YggMybatis01 yggMybatis01 = MybatisMapper.selectByPrimaryKey(127L);

//        Long [] empnos =new Long[]{125L,127L};
//        System.out.println(empnos.getClass());

        List<YggMybatis01> yggMybatis01 = MybatisMapper.selectByPrimaryKeyDX(empnos);
        System.out.println(yggMybatis01);
        Object json = JSON.toJSON(yggMybatis01);
        System.out.println(json.toString());
  /*      for (YggMybatis01 mybatis01 : yggMybatis01) {
            System.out.println(mybatis01);

        }*/


//        System.out.println(yggMybatis01);

  /*
        Emp emp1 = new Emp();
        emp1.setEname("L");*/

//        emp1.setEmpno(7934);
//        emp1.setHiredate(new java.sql.Date(81,1,22));
/*        emp1.setHiredate(new SimpleDateFormat("yyyy-MM-dd").parse("1981-5-1 10:52:12"));

        List<Emp> byDeptnoAndSal = empMapper.findByCondition(emp1);
        for (Emp emp : byDeptnoAndSal) {
            System.out.println(emp);
        }*/

    }



    @AfterEach
    public void release(){
        // 关闭SQLSession
        sqlSession.close();
    }


}
