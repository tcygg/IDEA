package com.msb.ceshi;

import com.msb.mapper.DeptMapperId;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Auther: TcYgg
 * @Date: 2023/11/25 - 11 - 25 - 11:13
 * @Description: com.msb.ceshi
 * @version: 1.0
 */
public class TestDeptId {

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
    public void findByEname(){
        EmpMapperProxy empMapper = sqlSession.getMapper(EmpMapperProxy.class);
        String name = "L";
        List<Emp> byDeptnoAndSal = empMapper.findByEname(name);
        for (Emp emp : byDeptnoAndSal) {
            System.out.println(emp);
        }
    }
    @Test
    public void insertDeptId() {
        // 调用SQL语句
        DeptMapperId deptMapperId = sqlSession.getMapper(DeptMapperId.class);

        Dept dept = new Dept(null,"张三","上海");
     /*   dept.setDname("张三");
        dept.setLoc("北京");*/
//        dept.setDeptno(60);
        System.out.println(dept.getDeptno());
        int i = deptMapperId.insertDeptId(dept);
        sqlSession.commit();
        System.out.println(dept.getDeptno());
    }




        @AfterEach
    public void release(){
        // 关闭SQLSession
        sqlSession.close();
    }
}
