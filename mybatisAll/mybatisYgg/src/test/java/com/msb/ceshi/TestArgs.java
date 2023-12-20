package com.msb.ceshi;

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

/**
 * @Auther: TcYgg
 * @Date: 2023/11/20 - 11 - 20 - 18:23
 * @Description: com.msb.ceshi
 * @version: 1.0
 * 这个类就是可以对emp表多个变量进行传参,集合,对象
 */
public class TestArgs {
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
    public void testOneArgs() {
//        测试单个数据类型变量

        Emp empArgs = sqlSession.selectOne("findByEmpno", 7900);
        System.out.println(empArgs);
    }

    @Test
    public void testMoreArgs() {
//        装参数的集合,测试多个参数的集合,及测试Map作为集合传参
        HashMap<String, Object> args = new HashMap<>();
        args.put("deptno",20);
        args.put("sal",1500.0);



//        测试集合多个数据类型变量
        List<Emp> objects = sqlSession.selectList("findEmpByDeptnoAndSal", args);
        for (Emp object : objects) {
            System.out.println(object);
        }


    }

    @Test
    public void testMoreArgsObj() {
//        对象传参
        Emp arg =new Emp();
        arg.setDeptno(10);
        arg.setSal(2000.0);
        List<Emp> emps = sqlSession.selectList("findEmpByDeptnoAndSal2", arg);
        emps.forEach(System.out::println);



    }


        @AfterEach
        public void release () {
            // 关闭SQLSession
            sqlSession.close();
        }

    }
