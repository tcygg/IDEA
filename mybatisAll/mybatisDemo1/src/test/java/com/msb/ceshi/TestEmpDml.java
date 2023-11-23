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
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @Auther: TcYgg
 * @Date: 2023/11/20 - 11 - 20 - 18:23
 * @Description: com.msb.ceshi
 * @version: 1.0
 * 这个类就是可以对emp表进行增删改
 */
public class TestEmpDml {
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
    public void testInsert(){
        Emp emp =new Emp(null,"按住啦Baby","SALESMAN",7839,new Date(),3100.0, 200.0,10 );
        int rows = sqlSession.insert("addEmp", emp);
        System.out.println(rows);

//        增删改 要提交事务,手动提交事务
         sqlSession.commit();
//        设置事务自动提交
//         sqlSession=factory.openSession(true);

    }
    @Test
    public void testUpdate(){
        Emp emp =new Emp( );
        emp.setEname("晓明");
        emp.setEmpno(7939);
        int rows = sqlSession.update("updateEmp", emp);
        System.out.println(rows);
        sqlSession.commit();

    }
    @Test
    public void testDelete(){
        int rows = sqlSession.delete("deleteEmp", 7937);
        System.out.println(rows);
        sqlSession.commit();

    }


        @AfterEach
        public void release () {
            // 关闭SQLSession
            sqlSession.close();
        }

    }
