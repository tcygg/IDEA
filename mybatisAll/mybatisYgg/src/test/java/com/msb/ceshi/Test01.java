package com.msb.ceshi;

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
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Auther: TcYgg
 * @Date: 2023/11/20 - 11 - 20 - 18:23
 * @Description: com.msb.ceshi
 * @version: 1.0
 * 这个类就是可以对emp表单个变量进行传参,集合,对象
 */
public class Test01 {
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
    public void testFindAll(){
        // 调用SQL语句
        List<Dept> list = sqlSession.selectList("findAll");
        for (Dept dept : list) {
            System.out.println(dept);
        }
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
    @AfterEach
    public void release(){
        // 关闭SQLSession
        sqlSession.close();
    }

}
