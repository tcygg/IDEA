package com.msb.ceshi;

import com.msb.mapper.EmpMapperProxy;
import com.msb.pojo.Dept;
import com.msb.pojo.Emp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * @Auther: TcYgg
 * @Date: 2023/11/25 - 11 - 25 - 11:13
 * @Description: com.msb.ceshi
 * @version: 1.0
 */
public class TestProxy {

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
    public void testFindAllEmp(){
        // 调用SQL语句
        List<Emp> list1 = sqlSession.selectList("findAllEmp");
        for (Emp emp : list1) {
            System.out.println(emp);
        }
    }
    @Test
    public void testFindOne(){
        // 调用SQL语句
        Emp findOne = sqlSession.selectOne("findOne");

        System.out.println(findOne);
    }

    @Test
    public void testSelectMap(){
        // 查询多个对象的Map集合,key建需要和数据库表名一致,该大写就大写
        System.out.println("sqlSession查询对象Map集合");
        Map<Integer, Emp> empMap = sqlSession.selectMap("findEmpMap", "EMPNO");

        Set<Integer> empnos = empMap.keySet();
        for (Integer empno : empnos) {
            System.out.println(empno+" :" +empMap.get(empno));
        }
    }


    @Test
    public void findAllEmpTable(){
        EmpMapperProxy mapper = sqlSession.getMapper(EmpMapperProxy.class);
        List<Emp> allEmp = mapper.findAllEmp();


        for (Object aa : allEmp) {
            System.out.println(aa);
//            System.out.println(aa.getClass());


        }

    }

    @Test
    public void findAllEmp(){
        List<Object> tt1 = sqlSession.selectList("findAllEmpTable");

        for (Object aa : tt1) {
            System.out.println(aa);
            System.out.println(aa.getClass());


        }

    }

    @Test
    public void findByEmpno(){
        EmpMapperProxy empMapper = sqlSession.getMapper(EmpMapperProxy.class);
        Emp byEmpno = empMapper.findByEmpno(786644);
        System.out.println(byEmpno);

    }

    @Test
    public void findByDeptnoAndSal(){
        EmpMapperProxy empMapper = sqlSession.getMapper(EmpMapperProxy.class);
        List<Emp> byDeptnoAndSal = empMapper.findByDeptnoAndSal(20, 3000);
        for (Emp emp : byDeptnoAndSal) {
            System.out.println(emp);

        }

    }
    @Test
    public void findByDeptnoAndSal2(){
        EmpMapperProxy empMapper = sqlSession.getMapper(EmpMapperProxy.class);
        Map<String, Object> stringObjectMap = new HashMap<>();
        stringObjectMap.put("deptno",20);
//        stringObjectMap.put("deptno1",30);

        stringObjectMap.put("sal",3000);
        System.out.println(stringObjectMap);


        List<Emp> byDeptnoAndSal = empMapper.findByDeptnoAndSal2(stringObjectMap);
        for (Emp emp : byDeptnoAndSal) {
            System.out.println(emp);

        }

    }

    @Test
    public void findByDeptnoAndSal3(){
        EmpMapperProxy empMapper = sqlSession.getMapper(EmpMapperProxy.class);
      /*  Map<String, Object> stringObjectMap = new HashMap<>();
        stringObjectMap.put("deptno",20);
//        stringObjectMap.put("deptno1",30);

        stringObjectMap.put("sal",3000);
        System.out.println(stringObjectMap);*/
        Emp xiaohong = new Emp();
        xiaohong.setSal(3000.0);
        xiaohong.setDeptno(20);


        List<Emp> byDeptnoAndSal = empMapper.findByDeptnoAndSal3(xiaohong);
        for (Emp emp : byDeptnoAndSal) {
            System.out.println(emp);

        }

    }

    @Test
    public void findByDeptnoAndSal4(){
        EmpMapperProxy empMapper = sqlSession.getMapper(EmpMapperProxy.class);
      /*  Map<String, Object> stringObjectMap = new HashMap<>();
        stringObjectMap.put("deptno",20);
//        stringObjectMap.put("deptno1",30);

        stringObjectMap.put("sal",3000);
        System.out.println(stringObjectMap);*/
        Emp empa = new Emp();
        empa.setDeptno(20);

        Emp empb = new Emp();

        empb.setSal(3000.0);



        List<Emp> byDeptnoAndSal = empMapper.findByDeptnoAndSal4(empa,empb);
        for (Emp emp : byDeptnoAndSal) {
            System.out.println(emp);

        }

    }

    @Test
    public void findByEname(){
        EmpMapperProxy empMapper = sqlSession.getMapper(EmpMapperProxy.class);


        String name = "L";



        List<Emp> byDeptnoAndSal = empMapper.findByEname(name);
        for (Emp emp : byDeptnoAndSal) {
            System.out.println(emp);

        }

    }


    @Test
    public void testinsertEmp(){
        EmpMapperProxy mapper = sqlSession.getMapper(EmpMapperProxy.class);
        mapper.insertEmp(new Emp(null, "TOM", "SALESMAN", 7521, new Date(), 2314.0, 100.0, 10));
        sqlSession.commit();
    }

    @Test
    public void testUpdateEnameByEmpno(){
        EmpMapperProxy mapper = sqlSession.getMapper(EmpMapperProxy.class);
        mapper.updateEnameByEmpno(7941, "TOM");
        sqlSession.commit();
    }

    @Test
    public void testDeletByEmpno(){
        EmpMapperProxy mapper = sqlSession.getMapper(EmpMapperProxy.class);
        mapper.deleteByEmpno(7941);
        sqlSession.commit();

        ThreadLocal s;
    }


    @AfterEach
    public void release(){
        // 关闭SQLSession
        sqlSession.close();
    }
}
